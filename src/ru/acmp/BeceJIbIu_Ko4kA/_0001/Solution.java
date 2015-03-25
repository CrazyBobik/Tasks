package ru.acmp.BeceJIbIu_Ko4kA._0001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Требуется сложить два целых числа А и В.
 *
 *  Входные данные:
 *  В единственной строке входного файла INPUT.TXT записано два натуральных числа через пробел,
 *  не превышающих 10^9.
 *
 *  Выходные данные:
 *   В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.
 *
 *   	INPUT.TXT | OUTPUT.TXT
 *   	2 3	      | 5
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.println(a + b);
        out.close();
    }
}

/**
 * Решено!=)
 */