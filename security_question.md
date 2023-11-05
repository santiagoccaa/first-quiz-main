Siguiendo las practicas de OWASP Top 10 para 2021 consideraria los siguientes puntos:

1- Broken Access Control (A01:2021), es necesario implementar un sistema de control de acceso adecuado para garantizar que los empleados solo tengan acceso a las funciones y datos correspondientes a sus roles.

2- Cryptographic Failures (A02:2021), La información del cliente, incluyendo contraseñas, debe ser almacenada de manera cifrada, tambien se debe limitar el acceso a datos sensibles solo a usuarios autorizados.

3- Injection, aplicar validación de entrada en el backend de Python y en la comunicación con la base de datos MySQL para prevenir posibles inyecciones de código malintencionado.

5- Identification and Authentication Failures (A07:2021), fortalecer el proceso de autenticación, así como implementar el bloqueo de cuentas después de múltiples intentos fallidos para prevenir ataques de fuerza bruta.

6- Security Misconfiguration (A05:2021), asegurar que todas las configuraciones de Kubernetes y servicios en la nube estén adecuadamente protegidas y actualizadas para evitar posibles vulnerabilidades.

7- Server-Side Request Forgery(A10:2021), al utilizar Kubernetes en Amazon Web Services, la interfaz web y aplicación móvil podrían necesitar acceder a recursos externos, es importante considerar las amenazas relacionadas con SSRF, como por ejemplo.
	* Validación de URLs: todas las solicitudes a recursos remotos estén limitadas a direcciones URL autorizadas y validadas. 
	* Hosts Permitidos: Mantener una lista blanca de hosts o dominios a los que la aplicación puede acceder, asegurar que las solicitudes salientes estén restringidas a estos hosts permitidos.
