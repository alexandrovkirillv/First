package com.company;
import java.util.Scanner;
import java.io.*;



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер таблицы: ");//просим ввести число для размера таблицы
        int num = in.nextInt();
        in.close();

        int size=num*num; // вычисляем максимальное число в таблице
        System.out.println(size); // выводим на печать
        String size1 = String.valueOf(size); // переводим число в строку

        int lenght = size1.length(); //считаем количество разрядов в числе
        System.out.println(lenght); // выводим на печать количество разрядов в числе


      //  String separator separator = ("-".repeat(cellSize) + "+").repeat(size-1)+"-".repeat(cellSize)
        String str= "-";
        String str1= "+";
        String text=" ";
        String separator = (str.repeat(lenght)+str1);
        String separator1 =separator.repeat(num-1)+str.repeat(lenght);
        System.out.println(separator1); // вывод строки с +-

       // int[][] multiplyTab = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                //multiplyTab[i][j] = (i+1)*(j+1);
                int value = (i+1)*(j+1);
                int indent = lenght -(String.valueOf(value)).length();

                //System.out.printf("%4d|", multiplyTab[i][j]);
                System.out.printf("%3d|", value);
            }

            System.out.println();


        }
    }
}
