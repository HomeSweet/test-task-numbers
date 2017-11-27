package com.company;

public class Number implements Data{
    private int data;

    Number(int data) {
        this.data = data;
    }

    @Override
    public Integer getData() {
        return data;
    }
}
