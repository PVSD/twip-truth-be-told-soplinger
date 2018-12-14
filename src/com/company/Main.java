package com.company;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class Main {


    public static Boolean stringToBoolean(String eatp) throws java.lang.Exception {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        Boolean shnoober = (Boolean) engine.eval(eatp.toLowerCase());

        return shnoober;
    }


    public static void main(String[] args) throws IOException, java.lang.Exception, java.lang.InterruptedException {

        boolean plskeepgoing = true;
        char array[] = new char[10000];
        String bb, outtie;

        File truthtable = new File("TruthTable.txt");
        truthtable.createNewFile();

        FileWriter writer = new FileWriter("TruthTable.txt");
        FileReader reader = new FileReader("TruthTable.txt");

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Would you like to start?");
        bb = kbInput.next();

        while(plskeepgoing) {

            String a = "true", b = "true", s2 = "yes";

            if (bb.toLowerCase().equals("yes")) {

                System.out.println("Please Input your boolean expression, use a and b as your variables");
                s2 = kbInput.next();
                System.out.println("A" + "\t \t" + "B" + "\t \t" + s2);
                writer.write("A" + "\t \t" + "B" + "\t \t" + s2);
                writer.flush();
                for (int i = 0; i < 4; i++) {
                    if (i < 2) {
                        a = "true";
                        if (i % 2 == 0) {
                            b = "true";
                        } else {
                            b = "false";
                        }
                    }else{
                            a = "false";
                        }
                }
            }

            Boolean spiderman = stringToBoolean(s2.replace("a", a).replace("b", b));

            if (spiderman) {
                System.out.println(a + "\t" + b + "\t" + spiderman);
                writer.write(a + "\t" + b + "\t" + spiderman + "\n");
                writer.flush();
            } else {
                System.out.println(a + "\t" + b + "\t" + spiderman);
                writer.write(a + "\t" + b + "\t" + spiderman + "\n");
                writer.flush();
            }

            System.out.println("Do you want to keep going?");
            outtie = kbInput.next();

            if (outtie.toLowerCase().equals("no"))
                plskeepgoing = false;
            else if (outtie.toLowerCase().equals("yes"))
                System.out.println("Lets a go");
            }
        }





            }

