package com.finorganizer;

import java.util.*;
import java.io.*;
import com.finorganizer.*;

public class BankConsole {
    public static void main(String[] args)throws IOException{
        Table table = new Table();
        FileReader reader=new FileReader("CroosBook.txt");
        BufferedReader buff=new BufferedReader(reader);
        String list;
        String []temp;
        while ((list=buff.readLine())!=null){
            temp=list.split(" - ");
            table.add(temp[0], Double.parseDouble(temp[1]));
        }
        table.add("Buy new soda ",-120);
        table.delete(2);
        table.change(2,"By new windows ", -2000);
        Debt debt = new Debt("iPhone 12", 100000, new Date(), 25, 12, true);
        table.add(debt);
        table.combine(debt.generateTable());
        Deposit deposit = new Deposit("Overpaid loan ", 5000, 10, 12);
        table.add(deposit);
        Tax tax = new Tax("MacBook", 50000, "NDS", 20);
        table.add(tax);

        //Вывод всего написанного кода
        System.out.println(table);
        System.out.println("You have "+table.getTotal()+" money in the bank");
        System.out.println("Payment of deposits "+deposit.calculate());
        System.out.println("The MacBook tax "+tax.tax());
    }
}