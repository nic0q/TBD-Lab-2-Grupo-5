<head>
  <link rel="stylesheet" href="https://unpkg.com/leaflet@1.8.0/dist/leaflet.css"
   integrity="sha512-hoalWLoI8r4UszCkZ5kL8vayOGVae1oxXe/2A4AO6J9+580uKHDO3JdHb7NzwwzK5xr/Fs0W40kiNHxM9vyTtQ=="
   crossorigin=""/>
</head>
<template>
  <div>
    <Navbar></Navbar>
    <div class="home">
      <h1>Emergencias por región</h1>
      <span>Selecciona la región para buscar emergencias</span>
      <div>
        <select class="form-select mb-3" aria-label="Default select example" v-model="id_region">
          <option selected>Seleccione la región</option>
          <option v-for="(region, index) in regiones" :value="region.id_region" :key="index">
            {{ region.nombre }}
          </option>
        </select>
        <p>
          <button class="btn btn-success centrado" v-on:click="get_points()">Buscar</button>
        </p>
      </div>
      <div class="row">
        <div class="col-md-6">
          <h6>Region de </h6>
          <div id="mapita"></div>
        </div>
        <div class="col-md-6">
          <table class="table table-dark" style="width: 1000px">
            <thead>
              <tr>
                <th scope="col">#</th>
                <th scope="col">Detalles</th>
                <th scope="col">Status</th>
                
              </tr>
            </thead>
            <tbody>
              <tr v-for="(emergency, index) in this.emergencies" :value="emergency.id_emergency" :key="index">
                <th scope="row">1</th>
                <td>{{emergency.emergency_details}}</td>
                <td>{{emergency.status}}</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
//Importaciones
import 'leaflet/dist/leaflet'; //librería leaflet
import 'leaflet/dist/leaflet.css'; //css leaflet
var icon = require('leaflet/dist/images/marker-icon-2x.png'); //ícono de marcadores
//Se crea objeto ícono con el marcador
var LeafIcon = L.Icon.extend({
  options: { iconSize: [25, 25], iconAnchor: [25, 25], popupAnchor: [1, -34], }
});
var myIcon = new LeafIcon({ iconUrl: icon });
//librería axios

import axios from 'axios';
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
      id_region: 14 ,
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
        let response = await this.$axios.get("/regiones");
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
    async get_points(id_region) { //función para obtener los puntos de la BD
      this.clearMarkers();
      try {
        // Se obtiene el nombre de la region
        // let region = await this.$axios.get("/regions/" + this.id_region);
        // this.region_name = region.data.nom_reg;
        //se llama el servicio
        let response = await this.$axios.get('/emergencies/region/' + this.id_region);
        console.log(response);
        this.emergencies = response.data;
        console.log(this.emergencies);
        //Se itera por los puntos
        this.emergencies.forEach(point => {
          //Se crea un marcador por cada punto
          let p = [point.latitud, point.longitud]
          let marker = L.marker(p, { icon: myIcon }) //se define el ícono del marcador
          .bindPopup(point.emergency_details); //Se agrega un popup con el nombre
          //Se agrega a la lista
          this.points.push(marker);
        });
        //Los puntos de la lista se agregan al mapa
        console.log(this.points)
        this.points.forEach(p => {
          p.addTo(this.mymap)
        })
      } catch (error) {
        console.log('error', error);
      }
    },
  },
  mounted: function () {
    // this.get_regiones();
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
}

/* Estilos necesarios para definir el objeto de mapa */
#mapita {
  height: 685px;
  width: 1000px;
}

.text_centrado {
  text-align: center;
}

button.centrado {
  width: 110px;
  margin-left: 50%;
  transform: translateX(-50%);
}
</style>