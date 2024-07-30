package com.example;

import com.example.Message.MyMessage;

public class Main {

    public static void main(String[] args) {
        try {
            RabbitMQProducer producer = new RabbitMQProducer();

            // Crea el mensaje Protobuf
            MyMessage message = MyMessage.newBuilder()
                    .setName("Test")
                    .setId(123)
                    .build();

            // Envía el mensaje usando el productor
            producer.sendMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
