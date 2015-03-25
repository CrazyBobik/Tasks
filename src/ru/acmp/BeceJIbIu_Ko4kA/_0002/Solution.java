package ru.acmp.BeceJIbIu_Ko4kA._0002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  Требуется посчитать сумму целых чисел от 1 до N.
 *  Входные данные
 *   В единственной строке входного файла INPUT.TXT записано единственное целое число N, не превышающее
 *   по абсолютной величине 10^4.
 *
 *   Выходные данные
 *   В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел от 1 до N.
 *
 *   INPUT.TXT | OUTPUT.TXT
 *   5	       | 15
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int a = in.nextInt();
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        out.println(sum);
        out.close();
    }
}
/**
 * Решено!))
 */