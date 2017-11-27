package com.company;

public class Phrase implements Data<String> {
    private String data;

    Phrase(String data) {
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }
}

