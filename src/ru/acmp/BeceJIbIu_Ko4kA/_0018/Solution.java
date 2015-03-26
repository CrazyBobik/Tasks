package ru.acmp.BeceJIbIu_Ko4kA._0018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *  Требуется вычислить факториал целого числа N. Факториал обозначают как N! и вычисляют по формуле:
 *  N! = 1 * 2 * 3 * … * (N-1) * N, причем 0! = 1.
 *  Так же допустимо рекуррентное соотношение: N! = (N-1)! * N
 *
 *  Входные данные
 *  В единственной строке входного файла INPUT.TXT записано одно целое неотрицательное число N (N < 1000).
 *
 *  Выходные данные
 *  В выходной файл OUTPUT.TXT нужно вывести одно целое число — значение N!.
 *
 *
 *  INPUT.TXT | OUTPUT.TXT
 *  ----------|-----------
 *  1         | 1
 *  ----------|-----------
 *  3         | 6
 *  ----------|-----------
 *  5	      | 120
 *  ----------|-----------
 *
 *  Решено!
 */

public class Solution {
    public static void main(String[] args) {
        try(
                Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
                PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"))
        ){
            out.print(factorial(in.nextInt()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static BigInteger factorial(int val){
        BigInteger big = BigInteger.valueOf(val);
        if (val == 0 || val == 1){
            return BigInteger.ONE;
        }
        else {
            return big.multiply(factorial(val - 1));
        }
    }
}
