<head>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.8.0/dist/leaflet.css"
     integrity="sha512-hoalWLoI8r4UszCkZ5kL8vayOGVae1oxXe/2A4AO6J9+580uKHDO3JdHb7NzwwzK5xr/Fs0W40kiNHxM9vyTtQ=="
     crossorigin=""/>
  </head>
<template>
    <div>
        <Navbar></Navbar>
        <div class="home">
            <h1 style="margin: 70px">Emergencias con menos voluntarios</h1>
            <div class="row">
                <table class="table table-dark" style="width: 1000px">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Emergencia</th>
                            <th scope="col">Tareas</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Terremoto</td>
                            <td>
                                <table class="table table-dark" style="width: 1000px">
                                    <thead>
                                        <tr>
                                            <th scope="col">#ID</th>
                                            <th scope="col">Nombre</th>
                                            <th scope="col">N° Voluntarios</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td>Limpiar escombros</td>
                                            <td>4</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">2</th>
                                            <td>Rescatar afectados</td>
                                            <td>2</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">3</th>
                                            <td>Buscar personas</td>
                                            <td>3</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Tsunami</td>
                            <td>
                                <table class="table table-dark" style="width: 1000px">
                                    <thead>
                                        <tr>
                                            <th scope="col">#ID</th>
                                            <th scope="col">Nombre</th>
                                            <th scope="col">N° Voluntarios</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td>Asistir gente</td>
                                            <td>8</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">2</th>
                                            <td>Hablar con afectados</td>
                                            <td>7</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">3</th>
                                            <td>Buscar personas</td>
                                            <td>5</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Huracan</td>
                            <td>
                                <table class="table table-dark" style="width: 1000px">
                                    <thead>
                                        <tr>
                                            <th scope="col">#ID</th>
                                            <th scope="col">Nombre</th>
                                            <th scope="col">N° Voluntarios</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td>Limpiar escombros</td>
                                            <td>12</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">2</th>
                                            <td>Rescatar afectados</td>
                                            <td>20</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">3</th>
                                            <td>Buscar personas</td>
                                            <td>19</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                    </tbody>
                </table>
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
    name: 'Home',
    data() {
        return {
            latitud: null, //Datos de nuevo punto
            longitud: null,
            regiones: [], //Datos de regiones
            name: '',
            points: [], //colección de puntos cargados de la BD
            message: '',
            mymap: null, //objeto de mapa(DIV)
            id_region: 0
        }
    },
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
</style>