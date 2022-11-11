# Laboratorio N°1 - Laboratorio de Taller de Base de Datos
Este repositorio contiene todos los archivos relacionados con el Laboratorio N°1 del
Laboratorio de Taller de Base de Datos (Base de Datos Avanzadas 13317) desarrollado
por el equipo 5. 

* **IMPORTANTE: Para poder conectarse correctamente a la Base de Datos, se deben colocar el username y password con el que se configuró postgresSQL en el archivo aplication.properties dentro de la carpeta resources en Backend**

## Integrantes del equipo 5
* [Vanina Correa](https://github.com/Vanina11)
* [Nícolas Farfán](https://github.com/nic0q)
* [Vicente Muñoz](https://github.com/LeVixo)
* [Xavier Muñoz](https://github.com/iChavy)
* [John Serrano](https://github.com/PodssilDev)
* [Nicolas Venegas](https://github.com/nicovenegas2)

## Descripción
El Laboratorio consiste en desarrollar CRUD utilizando Java y el servicio REST API con Sql2 y crear vistas utilizando VUE.js + Nuxt para poder realizar ciertos requisitos del Laboratorio N°1 del curso. <br>

El repositorio incluye tres carpetas principales:  <br>
* [Carpeta Backend](https://github.com/nic0q/TBD-Lab1-Grupo-5/tree/master/Backend): Contiene todos los archivos del Backend del proyecto y las clases de las entidades del modelo. 
Se distribuyen las clases en los paquetes Services, Repositories y Models
* [Carpeta Database](https://github.com/nic0q/TBD-Lab1-Grupo-5/tree/master/DataBase): Contiene los archivos dbCreate.sql, el cual contiene los scripts necesarios para crear
la Base de Datos y las tablas del modelo, y el archivo loadData.sql, el cual contiene datos dummy para poblar las tablas.
* [Carpeta Frontend](https://github.com/nic0q/TBD-Lab1-Grupo-5/tree/master/Frontend): Contiene todos los archivos del Frontend y las vistas realizas utilizando Vue + Nuxt.JS. 
Principalmente, está el formulario para crear emergencias, el cual es uno de los requisitos solicitados para nuestro equipo.

## Modelo a seguir para el Laboratorio N°1

![image](https://user-images.githubusercontent.com/91446330/194765651-54627927-e275-40c0-9a8f-879d4f50b83a.png)


## Requisitos y herramientas de desarrollo
Para ejecutar correctamente todo el proyecto, además de los archivos del repositorio se requieren las siguientes tecnologías:

* [Postgres SQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) versión 12 o superior. 
* [PgAdmin](https://www.pgadmin.org) versión 4.
* [IntelliJ IDEA Ultimate](https://www.jetbrains.com/es-es/idea/download/#section=windows) versión 2022.2.1, aunque debería funcionar con cualquier versión.
* JDK Versión 17 (Se debe configurar tanto en el proyecto como en Gradle)
* [Nuxt + VUE](https://nuxtjs.org) versión 3.
* [Postman](https://www.postman.com/downloads/) versión 9.4

También, para el desarrollo del proyecto se utilizó:
* [Visual Studio Code](https://code.visualstudio.com) versión 1.72
* [GitKraken](https://www.gitkraken.com) versión 8.9.1

## Instrucciones de instalación
1. Clonar el repositorio: Esto proporcionará las tres carpetas principales para el proyecto de Laboratorio. Para clonarlo, se debe usar el siguiente comando en el directorio deseado:
```sh
git clone https://github.com/nic0q/TBD-Lab1-Grupo-5.git
```
2. Instalar PostgreSQL 12 y PGAdmin 4: Para ello, se puede instalar un pack en conjunto desde el siguiente [link](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads). Se debe seleccionar la versión deseada para el Sistema Operativo deseado y seguir las instrucciones de instalación. Durante la instalación es necesario configurar un **username** y un **password** para utilizar con PostgreSQL. Estos serán luego necesarios para la creación de la Base de Datos junto con sus tablas.
4. Instalar IntelliJ IDEA Ultimate: Ingresar al sitio web oficial de IntelliJ IDEA y seleccionar el instalador dependiendo del Sistema Operativo en uso:
* Para Windows, utilizar el siguiente [link](https://www.jetbrains.com/idea/download/#section=windows).
* Para Linux, utilizar el siguiente [link](https://www.jetbrains.com/es-es/idea/download/#section=linux).
* Para MacOs, utilizar el siguiente [link](https://www.jetbrains.com/es-es/idea/download/#section=mac).
5. Al abrir IntelliJ IDEA Ultimate, abrir un nuevo proyecto y seleccionar la carpeta **Backend**. Debemos esperar a que el proyecto se configure y se instalen los plugins necesarios.
6. Seguir el siguiente orden de carpetas para llegar al archivo **application.properties**: src -> main -> resources . Luego cambiar database.user y database.password al username y password configurados en el paso 2
7. Configurar el JDK: Al abrir una clase IntelliJ nos solicitará configurar un JDK. Debemos asegurarnos de seleccionar JDK versión 17. Si no tenemos JDK 17, IntelliJ nos proporciona una opción para instalarlo automáticamente. 
8. Ir al siguiente [link](https://nodejs.org/en/) e instalar la última versión de Node.js, siguiendo las instrucciones de instalación.
8. Abrir una consola / terminal dentro de la carpeta **Frontend** y aplicar el siguiente comando, el cual instalará todas las dependencias necesarias para el proyecto:
```sh
npm install
```
* Si por algún motivo lo anterior falla, se puede utilizar:
```sh
npm install --force
```
9. Ir al siguiente [link](https://www.postman.com/downloads/) e instalar la última versión de Postman.

Con esto ya estamos listos con todo lo que es la instalación del proyecto y se puede continuar a las instrucciones de uso.

## Instrucciones de uso
1. En PgAdmin, seleccionar la opción "Query tool" y copiar la primera parte del script dbCreate.sql para solo crear la Base de Datos. 
2. Abrir la opción Query tool nuevamente, pero dentro de VoluntariadoDB (La Base de Datos que se crea en el paso 1) y copiar el resto de dbCreate
3. Copiar todo el contenido de loadData.sql y ejecutarlo dentro de Query tool
4. Utilizando IntelliJ IDEA Ultimate, asegurarse de que se detecte correctamente Spring Boot y Gradle. Ejecutar la aplicación haciendo click en la opción "Run" dentro de IntelliJ IDEA.
6. Dentro de la carpeta Frontend, abrir una consola / terminal. Ejecutar el siguiente comando:
```sh
npm run dev
```
7. Con esto ya tenemos levantado FrontEnd y Backend
8. Para probar el CRUD de una tabla, debemos colocar la ruta en Postman (Por ejemplo, **http://127.0.0.1:8000/institutions**). Luego seleccionar uno de los métodos a aplicar, dependiendo de si quieres crear, mostrar, editar o eliminar un elemento.
9. Para ir a la vista de creación de emergencias, se debe ir a localhost:3000/createEmergency
10. Para probar los Triggers, estos se pueden hacer en PgAdmin (más detalles en el video entregado junto con la entrega)
