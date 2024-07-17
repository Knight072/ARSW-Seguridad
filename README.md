# Interactive Blackboard

Interactive Blackboard es una aplicación web que permite a los usuarios dibujar en un lienzo compartido en tiempo real. Utiliza WebSockets para la comunicación en tiempo real y está construida con Spring Boot para el backend y React para el frontend.

## Características

- Lienzo compartido en tiempo real
- Autenticación de usuarios
- Interfaz de usuario reactiva
- Comunicación bidireccional mediante WebSockets

## Tecnologías utilizadas

- Backend:
  - Java
  - Spring Boot
  - WebSocket (Jakarta WebSocket)
  - Spring Security
  - Thymeleaf (para plantillas HTML)
- Frontend:
  - React
  - p5.js para el lienzo de dibujo
  - WebSocket para la comunicación en tiempo real
  - HTML y CSS para las páginas estáticas

## Arquitectura

La aplicación sigue una arquitectura cliente-servidor con comunicación en tiempo real:

1. **Backend (Servidor)**:
   - Spring Boot proporciona el marco de trabajo para el servidor.
   - `BBEndpoint` maneja las conexiones WebSocket, recibiendo y transmitiendo mensajes entre clientes.
   - Spring Security gestiona la autenticación y autorización de usuarios.
   - MVC (Model-View-Controller) se utiliza para manejar las solicitudes HTTP y renderizar vistas.
   - Thymeleaf se usa para las plantillas HTML dinámicas.

2. **Frontend (Cliente)**:
   - React se utiliza para crear una interfaz de usuario dinámica y reactiva para el lienzo de dibujo.
   - Los componentes React manejan la lógica de la interfaz de usuario y el estado de la aplicación de dibujo.
   - p5.js se utiliza para crear y manipular el lienzo de dibujo.
   - Una conexión WebSocket permite la comunicación en tiempo real con el servidor.
   - Páginas HTML estáticas (con algo de dinamismo via Thymeleaf) se usan para la página de inicio y login.

3. **Comunicación**:
   - WebSocket proporciona un canal de comunicación bidireccional y full-duplex entre el cliente y el servidor para el lienzo de dibujo.
   - Los mensajes se intercambian en formato JSON, conteniendo las coordenadas de los puntos dibujados.

4. **Flujo de datos**:
   - El usuario dibuja en el lienzo del cliente.
   - Las coordenadas se envían al servidor a través de WebSocket.
   - El servidor reenvía las coordenadas a todos los clientes conectados.
   - Cada cliente recibe las coordenadas y actualiza su lienzo en consecuencia.

Esta arquitectura permite una experiencia de dibujo colaborativo en tiempo real, donde múltiples usuarios pueden ver y contribuir al mismo lienzo simultáneamente.

## Estructura del proyecto

- `BBEndpoint.java`: Maneja las conexiones WebSocket y la distribución de mensajes.
- `MvcConfig.java`: Configuración de las vistas de Spring MVC.
- `WebSecurityConfig.java`: Configuración de seguridad de la aplicación.
- `bbComponents.jsx`: Componentes React para el lienzo de dibujo y la comunicación WebSocket.
- `home.html`: Página de inicio de la aplicación.
- `login.html`: Página de inicio de sesión.

## Páginas HTML

### home.html
La página de inicio contiene un mensaje de bienvenida y un enlace a la página de saludo (index.html).

### login.html
La página de inicio de sesión incluye:
- Un formulario para ingresar nombre de usuario y contraseña.
- Mensajes de alerta para errores de inicio de sesión y cierre de sesión exitoso.

Estas páginas utilizan Thymeleaf para el renderizado del lado del servidor y la integración con Spring Security.

## Configuración y ejecución

1. Asegúrate de tener Java JDK y Node.js instalados en tu sistema.
2. Clona el repositorio.
3. Navega hasta el directorio del proyecto.
4. Ejecuta `mvn spring-boot:run` para iniciar el servidor backend.
5. En otra terminal, navega hasta el directorio frontend y ejecuta `npm install` seguido de `npm start`.
6. Abre un navegador y visita `http://localhost:3000` (o el puerto que se indique).

## Uso

1. Visita la página de inicio y haz clic en el enlace para ver el saludo.
2. Inicia sesión con el usuario predeterminado (usuario: "user", contraseña: "password").
3. Una vez autenticado, serás redirigido al lienzo de dibujo.
4. Haz clic y arrastra el ratón para dibujar en el lienzo.
5. Todos los usuarios conectados verán los dibujos en tiempo real.

## Contribuir

Las contribuciones son bienvenidas. Por favor, abre un issue para discutir los cambios propuestos antes de hacer un pull request.

## Licencia

[MIT](https://choosealicense.com/licenses/mit/)

### Despliegue AWS

![image](https://github.com/Knight072/TableroInt2/assets/116401447/66577cba-68b8-4e03-a3a7-f89f16866639)

---
