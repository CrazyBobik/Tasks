package ru.acmp.BeceJIbIu_Ko4kA._0003;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  Вася и Петя учатся в школе в одном классе. Недавно Петя поведал Васе о хитром способе возведения в квадрат
 *  натуральных чисел, оканчивающихся на цифру 5. Теперь Вася может с легкостью возводить в квадрат двузначные
 *  (и даже некоторые трехзначные) числа, оканчивающиеся на 5. Способ заключается в следующем: для возведения в
 *  квадрат числа, оканчивающегося на 5 достаточно умножить число, полученное из исходного вычеркиванием
 *  последней пятерки на следующее по порядку число, затем остается лишь приписать «25» к получившемуся
 *  результату справа. Например, для того, чтобы возвести число 125 в квадрат достаточно 12 умножить на 13 и
 *  приписать 25, т.е. приписывая к числу 12*13=156 число 25, получаем результат 15625, т.е. 1252=15625.
 *  Напишите программу, возводящую число, оканчивающееся на 5, в квадрат для того, чтобы Вася смог проверить
 *  свои навыки.
 *
 *  Входные данные
 *  В единственной строке входного файла INPUT.TXT записано одно натуральное число А, оканчивающееся на цифру 5,
 *  не превышающее 4*10^5.
 *
 *  Выходные данные
 *  В выходной файл OUTPUT.TXT выведите одно натуральное число - A^2 без лидирующих нулей.
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int a = in.nextInt();
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.println(a * a);
        out.close();
    }
}

/**
 * Решено!
 */
