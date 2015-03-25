package ru.acmp.BeceJIbIu_Ko4kA._0017;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  Для игры в «Поле чудес» используется круглый барабан, разделенный на сектора, и стрелка. В каждом секторе
 *  записано некоторое число. В различных секторах может быть записано одно и то же число. Однажды ведущий игры
 *  решил изменить правила. Он сам стал вращать барабан и называть игроку (который барабана не видел) все числа
 *  подряд в том порядке, в котором на них указывала стрелка в процессе вращения барабана. Получилось так, что
 *  барабан сделал целое число оборотов, то есть последний сектор совпал с первым. После этого, ведущий задал
 *  участнику вопрос: какое наименьшее число секторов может быть на барабане? Требуется написать программу,
 *  отвечающую на этот вопрос ведущего.
 *
 *  Входные данные
 *  В первой строке входного файла INPUT.TXT записано число N – количество чисел, которое назвал ведущий
 *  (2 ≤ N ≤ 30000). Во второй строке записано N чисел, на которые указывала стрелка в процессе вращения
 *  барабана. Первое число всегда совпадает с последним (в конце стрелка указывает на тот же сектор, что и в
 *  начале). Числа, записанные в секторах барабана – натуральные, не превышающие 32000.
 *
 *  Выходные данные
 *  В выходной файл OUTPUT.TXT необходимо вывести одно число – минимальное число секторов, которое может быть на
 *  барабане.
 *
 *  INPUT.TXT                 | OUTPUT.TXT
 *  --------------------------|-------------
 *  13                        | 6
 *  5 3 1 3 5 2 5 3 1 3 5 2 5 |
 *  --------------------------|-------------
 *  4                         | 1
 *  1 1 1 1                   |
 *  --------------------------|-------------
 *  4                         | 3
 *  1 2 3 1                   |
 *  --------------------------|-------------
 *
 *
 *  Решено!))
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.println(findSector(arr));
        out.close();
    }

    private static int findSector(int... arr){
        int sector = 0;
        for (int i = 1; i < arr.length; i++) {
            sector++;
            if (arr[0] == arr[i]){
                if (isTrue(sector, arr)){
                    break;
                }
            }
        }

        return sector;
    }

    private static boolean isTrue(int sector, int... arr){
        boolean b = true;
        for (int i = 0; i < arr.length; i += sector) {
            if (arr[0] != arr[i]){
                b = false;
                break;
            }
        }

        return b;
    }
}
