package com.example;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.BuiltinExchangeType;

public class RabbitMQProducer {

    private final static String EXCHANGE_NAME = "my_exchange";

    public void sendMessage(Message.MyMessage message) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // Asegúrate de que esta es la dirección correcta

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            // Declara el intercambio
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

            byte[] messageBytes = message.toByteArray(); // Serializa el mensaje Protobuf

            // Envía el mensaje a RabbitMQ
            channel.basicPublish(EXCHANGE_NAME, "", null, messageBytes);
            System.out.println(" [x] Sent '" + message + "'");

        } catch (Exception e) {
            System.err.println("Error occurred while sending message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
