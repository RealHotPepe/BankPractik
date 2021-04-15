package com.finorganizer;

public class Deposit extends Record{
    private double percent;
    private int termDeposit;

    public Deposit(String name, double sum, double percent, int termDeposit) {
        super(name, sum);
        this.percent = percent;
        this.termDeposit = termDeposit;
    }

    public double calculate(){
        double P = percent/12;
        double S = Math.pow((1 + (P/100)),termDeposit) * getSum();
        return S;
    }
}
