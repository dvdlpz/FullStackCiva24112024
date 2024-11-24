# Proyecto de Gestión de Buses

Este proyecto consiste en una aplicación web para gestionar información sobre buses, incluyendo su marca, características, número de bus, placa, y si está activo o inactivo. La aplicación consta de un **backend** desarrollado con **Spring Boot** y un **frontend** con **React.js**.

## Tecnologías utilizadas

### Backend
- **Spring Boot**: Framework Java para crear aplicaciones web robustas.
- **JPA (Java Persistence API)**: Para manejar la persistencia de datos en una base de datos.
- **MySQL**: Base de datos relacional donde se almacenan los datos de los buses y marcas.
- **REST API**: Exposición de datos a través de endpoints RESTful.

### Frontend
- **React.js**: Biblioteca de JavaScript para crear interfaces de usuario.
- **Axios**: Para hacer solicitudes HTTP al backend y obtener datos.

### Base de Datos
- **MySQL**: La base de datos donde se guardan las tablas `Marca` y `Bus`.

## Requisitos

- **Java 17 o superior**.
- **Node.js** y **npm** instalados para el frontend.
- **MySQL** instalado y configurado.

## Instrucciones para ejecutar el proyecto

### 1. Clonar el repositorio
Clona el repositorio en tu máquina local:
git clone https://github.com/tu-usuario/tu-repositorio.git

### 2. Configurar el Backend
Dirígete a la carpeta del backend:
  cd backend
Abre el archivo application.properties y configura las credenciales de tu base de datos MySQL:
  spring.datasource.url=jdbc:mysql://localhost:3306/buses
  spring.datasource.username=tu-usuario
  spring.datasource.password=tu-contraseña
Ejecuta el backend con Maven:
  mvn spring-boot:run
El backend se ejecutará en http://localhost:8080.

### 3. Configurar el Frontend
Dirígete a la carpeta del frontend:
  cd frontend
Instala las dependencias:
  npm install
Ejecuta el frontend con:
  npm start
El frontend se ejecutará en http://localhost:3000.

### 4. Interacción con la aplicación
Accede al frontend en tu navegador en http://localhost:3000.
Verás una lista de buses con su información (ID, Número de bus, Placa, Características, Marca y Estado).
Los datos se obtienen del backend que funciona en http://localhost:8080.

### Estructura del Proyecto
Backend: Carpeta que contiene el proyecto Spring Boot (Java).
Frontend: Carpeta que contiene el proyecto React.js.

Funcionalidades
Mostrar la lista de buses: Se obtiene la información desde el backend y se muestra en una tabla.
Ver detalles de cada bus: Al hacer clic en un bus, puedes ver su información detallada.
Marca de Bus: Se muestra la marca correspondiente a cada bus gracias a la relación entre las tablas Bus y Marca.
