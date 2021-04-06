package com.finorganizer;
import java.util.ArrayList;

class Table {
    private ArrayList<Record> records;

    public Table() {
        this.records = new ArrayList<Record>();
    }
    public double getTotal() {
        double bank=0;
        for(Record r: records){
            bank+=r.getSum();
        }
        return bank;
    }
    public void add(String name, double sum){
        this.records.add(new Record(name, sum));
        System.out.println("Создана запись " + (records.size() - 1));
    }
    public void delete(int id){
        try {
            this.records.remove(id);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Некоректный индекс");
        }
    }
    public void change(int id, String newName, double newSum){
        this.records.get(id).setName(newName);
        this.records.get(id).setSum(newSum);
    }
    @Override
    public String toString() {
        String str = "";
        for(Record r : records){
            str = str + r.toString() + "\n";
        }
        return str;
    }
}
