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

        S
            }
        }





            }

