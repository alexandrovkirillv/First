package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        //-----------
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер таблицы: ");

        int num = in.nextInt();
        in.close();

        if (num > 0) {
            int size = 32 * 32;
            String size1 = String.valueOf(size);

            int lenght = size1.length();

            String str = "-";
            String str1 = "+";
            String separator = (str.repeat(lenght) + str1);
            String separator1 = separator.repeat(num - 1) + str.repeat(lenght);

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    int value = (i + 1) * (j + 1);
                    String tf = "%" + lenght + "d" + "|";
                    String tf1 = "%" + lenght + 'd' + " ";
                    if (j < num - 1) {
                        System.out.printf(tf, value);
                    } else System.out.printf(tf1, value);
                }
                System.out.println();
                if (i < num - 1) {
                    System.out.println(separator1);
                }
            }
        } else System.out.println("Введите число больше 0");
    }
}

