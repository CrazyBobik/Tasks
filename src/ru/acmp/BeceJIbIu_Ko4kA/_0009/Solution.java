package ru.acmp.BeceJIbIu_Ko4kA._0009;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  Петя успевает по математике лучше всех в классе, поэтому учитель задал ему сложное домашнее задание, в
 *  котором нужно в заданном наборе целых чисел найти сумму всех положительных элементов, затем найти где в
 *  заданной последовательности находятся максимальный и минимальный элемент и вычислить произведение чисел,
 *  расположенных между ними. Так же известно, что минимальный и максимальный элемент встречаются в заданном
 *  множестве чисел только один раз. Поскольку задач такого рода учитель дал Пете около ста, то Петя как сильный
 *  программист смог написать программу, которая по заданному набору чисел самостоятельно находит решение.
 *  А Вам слабо?
 *
 *  Входные данные
 *  В первой строке входного файла INPUT.TXT записано единственное число N – количество элементов массива.
 *  Вторая строка содержит N целых чисел, представляющих заданный массив. Все элементы массива разделены
 *  пробелом. Каждое из чисел во входном файле не превышает 10^2 по абсолютной величине.
 *
 *  Выходные данные
 *  В единственную строку выходного файла OUTPUT.TXT нужно вывести два числа, разделенных пробелом: сумму
 *  положительных элементов и произведение чисел, расположенных между минимальным и максимальным элементами.
 *  Значения суммы и произведения не превышают по модулю 3*104.
 *
 *
 *  Решено!!!
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int[] mass = new int[in.nextInt()];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = in.nextInt();
        }
        in.close();

        int indexMin = 0;
        int indexMax = 0;
        int min = mass[0];
        int max = mass[0];
        int sum = 0;
        int multy = 1;

        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]){
                min = mass[i];
                indexMin = i;
            }
            if (max < mass[i]){
                max = mass[i];
                indexMax = i;
            }
            if (mass[i] > 0)
                sum += mass[i];
        }

        if (indexMax < indexMin){
            int temp = indexMax;
            indexMax = indexMin;
            indexMin = temp;
        }

        for (int i = indexMin + 1; i < indexMax; i++) {
            multy *= mass[i];
        }

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.print(sum + " ");
        out.println(multy);
        out.close();
    }
}
