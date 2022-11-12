<head>
  <link rel="stylesheet" href="https://unpkg.com/leaflet@1.8.0/dist/leaflet.css"
   integrity="sha512-hoalWLoI8r4UszCkZ5kL8vayOGVae1oxXe/2A4AO6J9+580uKHDO3JdHb7NzwwzK5xr/Fs0W40kiNHxM9vyTtQ=="
   crossorigin=""/>
</head>
<template>
  <div>
    <Navbar></Navbar>
    <div class="home">
      <div>
        <div class="row">
          <div class="col-md-5" style="margin-top: 50px; margin-left: 20px;">
            <h1>Emergencias por región</h1>
            <span>Selecciona la región para buscar emergencias</span>
            <div>
              <select class="form-select mb-3" aria-label="Default select example" v-model="id_region">
                <option selected>Seleccione la región</option>
                <option v-for="(region, index) in regiones" :value="region.gid" :key="index">
                  {{ region.nom_reg }}
                </option>
              </select>
              <p>
                <button class="btn btn-success" v-on:click="get_points()">Buscar</button>
              </p>
            </div>
            <table class="table" style="width: 800px">
              <thead class="thead-dark">
                <tr>
                  <th scope="col"></th>
                  <th scope="col">Detalles</th>
                  <th scope="col">Status</th>
                  <th scope="col">Latitud / Longitud</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="(emergency, index) in this.emergencies" :value="emergency.id_emergency" :key="index">
                  <img class="eye_button" v-on:click="goToPoint(emergency.latitud, emergency.longitud)" style="margin-left: 10px"
                    src="../static/eye-solid.svg" alt="Eye" />
                  <td>{{ emergency.emergency_details }}</td>
                  <td>{{ emergency.status }}</td>
                  <td>({{ emergency.latitud }}, {{ emergency.longitud }})</td>
                </tr>
              </tbody>
            </table>
          </div>
          <div class="col-md-6" style="margin-top: 50px">
            <div>
              <h3 v-if="!this.region_name === ''">{{ this.region_name }}</h3>
              <h3 v-else>Chile</h3>
              <div id="mapita"></div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
//Importaciones
import 'leaflet/dist/leaflet'; //librería leaflet
import 'leaflet/dist/leaflet.css'; //css leaflet
const icon = require('leaflet/dist/images/marker-icon-2x.png'); //ícono de marcadores
//Se crea objeto ícono con el marcador
const LeafIcon = L.Icon.extend({
  options: { iconSize: [25, 35], popupAnchor: [1, -34], }
});
const myIcon = new LeafIcon({ iconUrl: icon });
//librería axios

import Navbar from "../components/Navbar.vue";
export default {
  components: {
    Navbar,
  },
  name: 'Emergencias',
  data() {
    return {
      latitud: null, //Datos de nuevo punto
      longitud: null,
      regiones: [], //Datos de regiones
      region_name: '',
      points: [], //colección de puntos cargados de la BD
      message: '',
      mymap: null, //objeto de mapa(DIV)
      id_region: 14,
      emergencies: []
    }
  },
  computed: {
    point() { // función computada para representar el punto seleccionado
      if (this.latitud && this.longitud) {
        let lat = this.latitud.toFixed(5);
        let lon = this.longitud.toFixed(5);
        return `(${lat}, ${lon})`;
      } else {
        return '';
      }
    }
  },
  methods: {
    async get_regiones() {
      try {
        let response = await this.$axios.get("/regions");
        this.regiones = response.data;
      } catch (error) {
        console.log("error", error);
      }
    },
    clearMarkers() { //eliminar marcadores
      this.points.forEach(p => {
        this.mymap.removeLayer(p);
      })
      this.points = [];
    },
    async get_points() { //función para obtener los puntos de la BD
      this.clearMarkers();
      try {
        // Se obtiene el nombre de la region
        let region = await this.$axios.get("/regions/" + this.id_region);
        this.region_name = region.data[0].nom_reg;
        //se llama el servicio
        let response = await this.$axios.get('/emergencies/regions/' + this.id_region);
        this.emergencies = response.data;
        //Se itera por los puntos
        this.emergencies.forEach(point => {
          //Se crea un marcador por cada punto
          let p = [point.latitud, point.longitud]
          let marker = L.marker(p, { icon: myIcon }) //se define el ícono del marcador
            .bindPopup(point.emergency_details, point.latitud); //Se agrega un popup con el nombre
          //Se agrega a la lista
          this.points.push(marker);
        });
        //Los puntos de la lista se agregan al mapa
        this.points.forEach(p => {
          p.addTo(this.mymap)
        })
        this.mymap.flyTo([this.emergencies[0].latitud, this.emergencies[0].longitud], 12);
      } catch (error) {
        console.log('error', error);
      }
    },
    goToPoint(lat, long) {
      this.mymap.flyTo([lat, long], 18);
    }
  },

  mounted: function () {
    this.get_regiones();
    let _this = this;
    //Se asigna el mapa al elemento con id="mapita"
    this.mymap = L.map('mapita').setView([-33.456, -70.648], 7);
    //Se definen los mapas de bits de OSM
    L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {
      attribution: '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors',
      maxZoom: 100
    }).addTo(this.mymap);
    //Evento click obtiene lat y long actual
    this.mymap.on('click', function (e) {
      _this.latitude = e.latlng.lat;
      _this.longitude = e.latlng.lng;
    });
    //Se agregan los puntos mediante llamada al servicio
    //this.getPoints(this.mymap, this.id_voluntario);
  }
}
</script>

<style>
.home {
  display: flex;
  flex-direction: column;
  align-items: center;
  background: #262626;
  color: white;
  overflow-x: hidden;
}

.table {
  background-color: white;
}

/* Estilos necesarios para definir el objeto de mapa */
#mapita {
  height: 781px;
  width: 1070px;
}

.text_centrado {
  text-align: center;
}

.eye_button {
  cursor: pointer;
  color: "red";
  width: 30px;
  height: 50px;
}

button.centrado {
  width: 110px;
  margin-left: 50%;
  transform: translateX(-50%);
}
</style>