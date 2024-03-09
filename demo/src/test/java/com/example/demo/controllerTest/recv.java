package com.example.demo.controllerTest;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.nio.charset.StandardCharsets;

public class recv {
    private static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("10.150.190.44");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //String message = "Hello World";
        //channel.basicPublish("",QUEUE_NAME,null,message.getBytes(StandardCharsets.UTF_8));
        System.out.println("[*] Waiting for message. To exit press CTRL+C");
        while (true){

            DeliverCallback deliverCallback = (consumerTag,delivery)->{
                String message = new String(delivery.getBody(),StandardCharsets.UTF_8);
                System.out.println("[x] Recived '" +message+"'");
            };
            channel.basicConsume(QUEUE_NAME,true,deliverCallback,consumerTag->{});
        }


    }
}
