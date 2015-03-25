package ru.acmp.BeceJIbIu_Ko4kA._0014;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  Требуется написать программу, определяющую наименьшее общее кратное (НОК) чисел a и b.
 *
 *  Входные данные
 *  В единственной строке входного файла INPUT.TXT записаны два натуральных числа А и В через пробел, не
 *  превышающих 46340.
 *
 *  Выходные данные
 *  В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — НОК чисел А и В.
 *
 *  INPUT.TXT | OUTPUT.TXT
 *  ----------|-----------
 *  36 27     | 108
 *  ----------|-----------
 *  39 65     | 195
 *  ----------|-----------
 *
 *  Решено!
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.print(findNOK(in.nextInt(), in.nextInt()));
        in.close();
        out.close();
    }

    private static int findNOK(int a, int b){
        int chislo = 1;

        while (true){
            if ((chislo % a == 0) && (chislo % b == 0))
                break;
            else
                chislo++;
        }

        return chislo;
    }
}
