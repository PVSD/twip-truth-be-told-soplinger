package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("the-file-name.txt");
        String aaaa = "pls addada";
        writer.write(aaaa);
        System.out.println("A\t" + "B\t" + "!(A&&B)" );
        System.out.println("T\t" + "T\t" + "F\t");
        writer.close();
        boolean a = true;
        boolean b = false;
        System.out.println(!(a&&b));

    }
}
