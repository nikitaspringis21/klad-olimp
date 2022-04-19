package com.company;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c.out.txt");
        FileReader fr = new FileReader("c.in.txt");
        Scanner sc = new Scanner(fr);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        double x = 0;
        double y = 0;
        sc.nextLine();
        while(sc.hasNextLine()){
            int virziens = sc.nextInt();
            int stepCount = sc.nextInt();
            switch (virziens) {
                case 1 -> y += stepCount;
                case 2 -> {
                    x += (double) stepCount / Math.sqrt(2);
                    y += (double) stepCount / Math.sqrt(2);
                }
                case 3 -> x += stepCount;
                case 4 -> {
                    x += (double) stepCount / Math.sqrt(2);
                    y -= (double) stepCount / Math.sqrt(2);
                }
                case 5 -> y -= stepCount;
                case 6 -> {
                    x -= (double) stepCount / Math.sqrt(2);
                    y -= (double) stepCount / Math.sqrt(2);
                }
                case 7 -> x -= stepCount;
                case 8 -> {
                    x -= (double) stepCount / Math.sqrt(2);
                    y += (double) stepCount / Math.sqrt(2);
                }
            }
        }

        System.out.println(x);
        System.out.println(y);
        fw.write(String.valueOf(x) + " ");
        fw.write(String.valueOf(y));
        fr.close();
        fw.close();

    }
}
