package com.finorganizer;
import java.util.*;

class Record {
    private String name;
    private double sum;
    private Date date;
    public Record(String name, double sum) {
        this.name = name;
        this.sum = sum;
        this.date = new Date();
    }
    public Record(String name, double sum, Date date) {
        this.name = name;
        this.sum = sum;
        this.date = date;
    }
    public String getName() {
        return this.name;
    }
    public double getSum() {
        return this.sum;
    }
    public Date getDate(){
        return this.date;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }
    @Override
    public String toString() {
        String str = date.toString()+" "+getName()+" "+getSum();
        return str;
    }
}
