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
        System.out.println(table);
    }
}