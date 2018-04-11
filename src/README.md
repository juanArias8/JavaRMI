# Java Remote Method Invocation (RMI)
*** 
Invocación de métodos remotos de java es un mecanismo ofrecido por Java para invocar un método de manera remota. Forma parte del entorno estándar de ejecución de Java y proporciona un mecanismo simple para la comunicación de servidores en aplicaciones distribuidas basadas exclusivamente en Java.  
*** 
### Pasos de ejecuçión
* Clonar el repositorio
* Dirigirse a la ./JavaRMI/src
* Abrir la terminal en dicha carpeta
* Compilar los archivos .java en el siguiente orden:
* * javac  RemotaVolumenArea.java
* * javac VolumenArea.java
* * javac ServidorVolumenArea.java
* * javac ClienteAreaVolumen.java
* Registrar el rmi con rmiregistry &
* Ejecutar el servidor con java ServidorVolumenArea
* Ejecutar el cliente con java ClienteAreaVolumen
***