package ru.acmp.BeceJIbIu_Ko4kA._0019;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * На шахматной доске 8х8 расположены три фигуры: ферзь, ладья и конь. Требуется определить количество пустых
 * полей доски, которые находятся под боем. Для простоты будем полагать, что фигуры могут «бить» через другие
 * фигуры. Например, в рассмотренной справа ситуации будем считать, что ферзь бьет D5 через ладью.
 *
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записаны через пробел координаты расположения трех фигур:
 * ферзя, ладьи и коня соответственно. Каждая координата состоит из одного латинского символа (от A до H) и
 * одной цифры (от 1 до 8).
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT нужно вывести количество пустых полей, которые бьют указанные во входных данных
 * фигуры.
 *
 * INPUT.TXT | OUTPUT.TXT
 * ----------|-----------
 * D1 D3 E5	 | 29
 * ----------|-----------
 * D4 B7 H8  | 35
 * ----------|-----------
 * A3 G1 E5  | 36
 * ----------|-----------
 *
 *
 * Решено!!
 */

public class Solution {
    public static void main(String[] args) {
        try(
                Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
                PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"))
        ) {
            out.println(Util.coutField(in.nextLine()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
