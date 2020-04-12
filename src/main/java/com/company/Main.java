package com.company;

import java.util.Scanner;
import java.io.*; //зачем этот импорт ?

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер таблицы:");
        if (in.hasNextInt()== false) // посмотри что советует идея 
        {
            System.out.println("Запустите программу еще раз и введите целое положительное число");
        } else {
            int sizetable = in.nextInt();
            in.close();

            if (sizetable > 0) {
                int size = 32 * 32;
                String sizeformat = String.valueOf(size);
                int lenghtformat = sizeformat.length();
                String str = "-"; 
                String str1 = "+";
                String separator = (str.repeat(lenghtformat) + str1).repeat(sizetable - 1)+ str.repeat(lenghtformat);
                for (int i = 0; i < sizetable; i++) {
                    for (int j = 0; j < sizetable; j++) {
                        int value = (i + 1) * (j + 1);
                        String tf = "%" + lenghtformat + "d" + "|";
                        String tf1 = "%" + lenghtformat + 'd' + " ";
                        if (j < sizetable - 1) {
                            System.out.printf(tf, value);
                        } else System.out.printf(tf1, value);
                    }
                    System.out.println();
                    if (i < sizetable - 1) {
                        System.out.println(separator);
                    }
                }
            } else System.out.println("Запустите программу еще раз и введите целое положительное число");
        }
    }
}

