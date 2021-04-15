package com.finorganizer;

public class Tax extends Record {
     private String type;
     private int percent;

    public Tax(String name, double sum, String type, int percent) {
        super(name, sum);
        this.type = type;
        this.percent = percent;
    }
    public double tax(){
        double P = (getSum() * percent)/120;
        return P;
    }
}
