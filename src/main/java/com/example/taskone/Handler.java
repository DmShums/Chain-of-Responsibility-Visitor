package com.example.taskone;

import lombok.Setter;

public class Handler {
    @Setter
    private Handler next;

    private final int denominator;
    public Handler(int denominator) {
        this.denominator = denominator;
    }

    public void process(int amount){
        if(next != null) {
            next.process(amount % denominator);
        } else if(amount % denominator != 0) {
            throw new IllegalArgumentException();
        }

        System.out.println("There is " + amount/denominator + " of " + denominator);
    }
}
