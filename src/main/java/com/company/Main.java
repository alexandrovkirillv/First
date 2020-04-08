package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер таблицы: ");//просим ввести число для размера таблицы
        int num = in.nextInt();
        in.close();

        if (num>0) {
        int size=num*num; // вычисляем максимальное число в таблице
        //System.out.println(size); // выводим на печать максимальное число в таблице
        String size1 = String.valueOf(size); // переводим число в строку

        int lenght = size1.length(); //считаем количество разрядов в числе
        //System.out.println(lenght); // выводим на печать количество разрядов в числе

        String str= "-";
        String str1= "+";
        String text=" ";
        String separator = (str.repeat(lenght)+str1);
        String separator1 =separator.repeat(num-1)+str.repeat(lenght); //строка с +-

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++)
            {
                int value = (i+1)*(j+1);
                String tf = "%"+lenght+"d"+"|"; // задаем параметр форматирования для printf
                String tf1 = "%"+lenght+ 'd'+ text;
                if (j<num-1){
                System.out.printf(tf, value); // печатаем отформатированную матрицу
            }
                else System.out.printf(tf1, value); // печатаем отформатированную матрицу
            }
            System.out.println();
            if (i<num-1){
            System.out.println(separator1); // вывод строки с +-
            }}
        }
    else System.out.println("Введите число больше 0");
    }
    }

