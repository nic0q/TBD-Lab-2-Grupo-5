<head>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.8.0/dist/leaflet.css"
     integrity="sha512-hoalWLoI8r4UszCkZ5kL8vayOGVae1oxXe/2A4AO6J9+580uKHDO3JdHb7NzwwzK5xr/Fs0W40kiNHxM9vyTtQ=="
     crossorigin=""/>
  </head>
<template>
    <div>
        <Navbar></Navbar>
        <div class="home">
            <h2 style="margin: 70px">Ordena tareas de cada emergencia por menos voluntarios</h2>
            <div class="row" style="height: 1000px">
                <div class="col-md-6">
                    <table class="table" style="width: 800px">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Emergencia(s)</th>
                                <th scope="col">Status</th>
                                <th scope="col">Latitud / Longitud</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(emergency, index) in this.emergencies" :value="emergency.id_emergency"   v-on:click="get_tasks(emergency.id_emergency)"
                                :key="index" class="table-light check_button">
                                <td :class="clicked === emergency.id_emergency ? 'bg-primary text-white' : ''">{{ emergency.id_emergency }}</td>
                                <td :class="clicked === emergency.id_emergency ? 'bg-primary text-white' : ''">{{ emergency.name }}</td>
                                <td :class="clicked === emergency.id_emergency ? 'bg-primary text-white' : ''">{{ emergency.status }}</td>
                                <td :class="clicked === emergency.id_emergency ? 'bg-primary text-white' : ''">({{ emergency.latitud }}, {{ emergency.longitud }})</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-6">
                    <table table class="table" style="width: 800px">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Tarea(s)</th>
                                <th scope="col">N° Voluntarios</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(task, index) in this.tasks" :value="task.id_task"
                                :key="index" class="table-light">
                                <td>{{ task.id_task }}</td>
                                <td>{{ task.name_task }}</td>
                                <td>{{ task.quantity }}</td>
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

import Navbar from "../components/Navbar.vue";
export default {
    components: {
        Navbar,
    },
    name: 'Home',
    data() {
        return {
            latitud: null, //Datos de nuevo punto
            longitud: null,
            emergencies: [], //Datos de regiones
            tasks: [],
            clicked: null,
            name: '',
            points: [], //colección de puntos cargados de la BD
            message: '',
            mymap: null, //objeto de mapa(DIV)
            id_region: 0
        }
    },
    methods: {
        async get_emergencies() {
          try {
            let response = await this.$axios.get("/emergencies");
            this.emergencies = response.data;
          } catch (error) {
            console.log("error", error);
          }
        },
        async get_tasks(id_emergency){
            this.clicked = id_emergency;
            try {
            let response = await this.$axios.get("/tasks-for-emergency/"  + id_emergency)
            this.tasks = response.data;
            } catch (error) {
            console.log("error", error);
          }
        }
    },
    mounted: function () {
        this.get_emergencies();
        
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
#mapid {
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
.white{
    background-color: aliceblue;
}
.check_button{
    cursor: pointer;
}
</style>