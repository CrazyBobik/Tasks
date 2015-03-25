package ru.acmp.BeceJIbIu_Ko4kA._0015;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *  В галактике «Milky Way» на планете «Snowflake» есть N городов, некоторые из которых соединены дорогами.
 *  Император галактики «Milky Way» решил провести инвентаризацию дорог на планете «Snowflake». Но, как
 *  оказалось, он не силен в математике, поэтому он просит вас сосчитать количество дорог. Требуется написать
 *  программу, помогающую императору сосчитать количество дорог на планете «Snowflake».
 *
 *  Входные данные
 *  В первой строке входного файла INPUT.TXT записано число N (0 ≤ N ≤ 100). В следующих N строках записано
 *  по N чисел, каждое из которых является единичкой или ноликом. Причем, если в позиции (i, j) квадратной
 *  матрицы стоит единичка, то i-ый и j-ый города соединены дорогами, а если нолик, то не соединены.
 *
 *  Выходные данные
 *  В выходной файл OUTPUT.TXT необходимо вывести число, определяющее количество дорог на планете «Snowflake».
 *
 *  INPUT.TXT | OUTPUT.TXT
 *  ----------|-----------
 *  5         | 3
 *  0 1 0 0 0 |
 *  1 0 1 1 0 |
 *  0 1 0 0 0 |
 *  0 1 0 0 0 |
 *  0 0 0 0 0 |
 *  ----------|-----------
 *
 *
 *  Решено!!!
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int size = in.nextInt();
        Set<Point> set = new HashSet<>(2 * size * size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (in.nextInt() == 1)
                    set.add(new Point(i, j));
            }
        }
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.print(set.size());
        out.close();
    }
}
