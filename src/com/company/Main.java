package com.company;

public class Main {

    public static void main(String[] args) {
        Producer producer = SomeProducerFactory.getProducer();
        Consumer consumer = new Consumer(producer, new DataProcessor());
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration #" + i + " array evaluated in " + String.valueOf(consumer.consume()));
        }
    }
}
