package ru.acmp.BeceJIbIu_Ko4kA._0005;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Вася не любит английский язык, но каждый раз старается получить хотя бы четверку за четверть, чтобы
 *  оставаться ударником. В текущей четверти Вася заметил следующую закономерность: по нечетным дням месяца
 *  он получал тройки, а по четным – четверки. Так же он помнит, в какие дни он получал эти оценки. Поэтому
 *  он выписал на бумажке все эти дни для того, чтобы оценить, сколько у него троек и сколько четверок.
 *  Помогите Васе это сделать, расположив четные и нечетные числа в разных строчках. Вася может рассчитывать
 *  на оценку 4, если четверок не меньше, чем троек.
 *
 *  Входные данные
 *  В первой строке входного файла INPUT.TXT записано единственное число N – количество элементов целочисленного
 *  массива (1<=N<=100). Вторая строка содержит N чисел, представляющих заданный массив. Каждый элемент
 *  массива – натуральное число от 1 до 31. Все элементы массива разделены пробелом.
 *
 *  Выходные данные
 *  В первую строку выходного файла OUTPUT.TXT нужно вывести числа, которые соответствуют дням месяцев,
 *  в которые Вася получил тройки, а во второй строке соответственно расположить числа месяца, в которые
 *  Вася получил четверки. В третьей строке нужно вывести «YES», если Вася может рассчитывать на четверку
 *  и «NO» в противном случае. В каждой строчке числа следует выводить в том же порядке, в котором они идут
 *  во входных данных. При выводе, числа отделяются пробелом.
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int n = in.nextInt();

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a % 2 == 0)
                even.add(a);
            else
                odd.add(a);
        }
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        for (int i : odd) {
            out.print(i + " ");
        }
        out.println();
        for (int i : even) {
            out.print(i + " ");
        }
        out.println();

        if (even.size() >= odd.size())
            out.println("YES");
        else
            out.println("NO");

        out.close();
    }
}

/**
 * Решено!!
 */