package ru.acmp.BeceJIbIu_Ko4kA._0008;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Вася изучает таблицу умножения чисел от 1 до 100 в десятичной системе счисления, а поскольку запомнить такую
 * таблицу очень сложно, то Васе придется очень долго ее зубрить. Составьте для Васи программу, которая поможет
 * ему проверять свои знания.
 *
 * Входные данные
 * Во входном файле INPUT.TXT записаны три натуральных числа A, B и C через пробел. Числа A и B <= 102,
 * а C <= 106.
 *
 * Выходные данные
 * В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.
 *
 * INPUT.TXT | OUTPUT.TXT
 * ----------|-----------
 * 8 54 432  | YES
 * ----------|-----------
 * 16 19 777 | NO
 * ----------|-----------
 *
 * Решено!!
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int[] mass = new int[3];
        for (int i = 0; i < 3; i++) {
            mass[i] = in.nextInt();
        }
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        if (mass[0] * mass[1] == mass[2])
            out.println("YES");
        else
            out.println("NO");
        out.close();
    }
}
