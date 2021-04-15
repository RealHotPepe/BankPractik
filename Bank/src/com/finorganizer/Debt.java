package com.finorganizer;

import java.util.*;

public class Debt extends Record{
    private double percent;
    private int termDebt;
    private boolean isAnnuity;

    public Debt(String name, double sum, Date date, double percent, int termDebt, boolean isAnnuity) {
        super(name, sum, date);
        this.percent = percent;
        this.termDebt = termDebt;
        this.isAnnuity = isAnnuity;
    }

    public Table generateTable(){
        Table result = new Table();
        Calendar paymentDate = new GregorianCalendar();
        paymentDate.setTime(getDate());
        double k = percent/1200;
        double p;
        if (isAnnuity){
            p = this.getSum() * (k + (k / (Math.pow((k + 1), termDebt) - 1)));
            for (int i = 0; i<termDebt; i++){
                paymentDate.add(Calendar.MONTH, 1);
                result.add(new Record("Выплата по кредиту",-p,paymentDate.getTime()));
            }
        } else {
            double s = getSum();
            double body = s / termDebt;
            for (int i = 0; i<termDebt; i++){
                p = body + s * k;
                s -= body;
                paymentDate.add(Calendar.MONTH, 1);
                result.add(new Record("Выплата по кредиту",-p,paymentDate.getTime()));
            }
        }
        return result;
    }
}
