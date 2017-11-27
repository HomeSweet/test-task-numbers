package com.company;

class Consumer {
    private Producer producer;
    private DataProcessor dataProcessor;

    Consumer(Producer producer, DataProcessor dataProcessor) {
        this.producer = producer;
        this.dataProcessor = dataProcessor;
    }

    public int consume() {
        return dataProcessor.processArray(producer.produce());
    }
}
