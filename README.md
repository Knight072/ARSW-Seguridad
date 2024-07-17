# Interactive Blackboard

Interactive Blackboard es una aplicación web que permite a los usuarios dibujar en un lienzo compartido en tiempo real. Utiliza WebSockets para la comunicación en tiempo real y está construida con Spring Boot para el backend y React para el frontend.

## Características

- Lienzo compartido en tiempo real
- Autenticación de usuarios
- Interfaz de usuario reactiva
- Comunicación bidireccional mediante WebSockets
- Conexión segura a través de HTTPS

## Tecnologías utilizadas

- Backend:
  - Java
  - Spring Boot
  - WebSocket (Jakarta WebSocket)
  - Spring Security
  - Thymeleaf (para plantillas HTML)
  - SSL/TLS para conexiones seguras
- Frontend:
  - React
  - p5.js para el lienzo de dibujo
  - WebSocket para la comunicación en tiempo real
  - HTML y CSS para las páginas estáticas

## Arquitectura

La aplicación sigue una arquitectura cliente-servidor con comunicación en tiempo real:

![Arquitectura de Interactive Blackboard](/docs/images/architecture_diagram.png)

*Figura 1: Diagrama de la arquitectura de Interactive Blackboard*

1. **Backend (Servidor)**:
   [... resto del contenido ...]

## Estructura del proyecto

- `BBEndpoint.java`: Maneja las conexiones WebSocket y la distribución de mensajes.
- `MvcConfig.java`: Configuración de las vistas de Spring MVC.
- `WebSecurityConfig.java`: Configuración de seguridad de la aplicación.
- `bbComponents.jsx`: Componentes React para el lienzo de dibujo y la comunicación WebSocket.
- `home.html`: Página de inicio de la aplicación.
- `login.html`: Página de inicio de sesión.
- `application.properties`: Configuración de la aplicación, incluyendo configuración SSL y puertos.

## Configuración

### Puertos
- HTTP: 8080
- HTTPS: 8443

### SSL/TLS
La aplicación está configurada para usar HTTPS:

- Tipo de almacén de claves: PKCS12
- Ubicación del almacén de claves: `classpath:baeldung.p12`
- Contraseña del almacén de claves: 123456
- Alias de la clave: baeldung

### Trust Store
- Ubicación: `classpath:baeldung.p12`
- Contraseña: 123456

## Configuración y ejecución

1. Asegúrate de tener Java JDK y Node.js instalados en tu sistema.
2. Clona el repositorio.
3. Navega hasta el directorio del proyecto.
4. Asegúrate de que el archivo `baeldung.p12` esté en el classpath (generalmente en `src/main/resources`).
5. Ejecuta `mvn spring-boot:run` para iniciar el servidor backend. El servidor estará disponible en `https://localhost:8443`.
6. En otra terminal, navega hasta el directorio frontend y ejecuta `npm install` seguido de `npm start`.
7. Abre un navegador y visita `https://localhost:8443` para acceder a la aplicación de forma segura.

## Uso

1. Visita la página de inicio segura (`https://localhost:8443`) y haz clic en el enlace para ver el saludo.
2. Inicia sesión con el usuario predeterminado (usuario: "user", contraseña: "password").
3. Una vez autenticado, serás redirigido al lienzo de dibujo.
4. Haz clic y arrastra el ratón para dibujar en el lienzo.
5. Todos los usuarios conectados verán los dibujos en tiempo real.

## Seguridad

La aplicación utiliza HTTPS para todas las conexiones, asegurando que toda la comunicación entre el cliente y el servidor esté encriptada. Esto incluye la transmisión de credenciales de inicio de sesión y los datos del dibujo en tiempo real.

## Contribuir

Las contribuciones son bienvenidas. Por favor, abre un issue para discutir los cambios propuestos antes de hacer un pull request.

## Licencia

[MIT](https://choosealicense.com/licenses/mit/)

### Despliegue AWS

![image](https://github.com/Knight072/TableroInt2/assets/116401447/66577cba-68b8-4e03-a3a7-f89f16866639)

---
