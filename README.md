# RabbitMQ Producer with Protobuf

## Descripción

Este proyecto es una herramienta de línea de comandos en Java que envía mensajes en formato Protobuf a un servidor RabbitMQ. El proyecto está configurado para trabajar con RabbitMQ usando la biblioteca `amqp-client` y `protobuf-java`. El código de este proyecto se ha desarrollado en IntelliJ IDEA y está preparado para ser ejecutado y probado en un entorno local o en un contenedor Docker.

## Requisitos

- [Java 22](https://www.oracle.com/java/technologies/javase-jdk22-downloads.html)
- [RabbitMQ](https://www.rabbitmq.com/download.html)
- [Protoc](https://grpc.io/docs/protoc-installation/)
- [Gradle](https://gradle.org/install/)

## Instalación y Configuración

### 1. **Instalación de RabbitMQ**

Se ha tenido que instalar Rabbit en local, para lo que se ha necesitado descargar ubuntu, erlang y rabbitmq. 
El rabbitmq se inicia automaticamente al iniciar mi maquina. Pero en caso de que no uncione se puede inciar con:. 

```sh

sudo service rabbitmq-server start
sudo rabbitmq-plugins enable rabbitmq_management

```

### Configuracion del proyecto de Java

```sh
git clone https://github.com/JoseManuelIO/ProtobufMessage.git
cd ProtobufMessage
```

### Configurar gradle y generar proto

Se han creado todas las dependencias necesarias en en build.gradle y se ha generado el codigo de java de proto a partir del gradle y del mensaje proto que se va a enviar. 

### Compilar programa

Una vez se tenga todo listo se corre el programa y manda un mensaje al servidor de rabbitmq donde se puede ver en: http://localhost:15672

### Problemas en este codigo

El codigo se ha conseguido compilar sin allos pero no se consiguen ver los mensajes en rabbitmq, estoy bastante seguro de que es un problema de dependencias el cual no he tenido tiempo suficiente para resolver. 

