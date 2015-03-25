package ru.acmp.BeceJIbIu_Ko4kA._0016;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Лесенкой называется набор кубиков, в котором каждый более верхний слой содержит кубиков меньше, чем предыдущий.
 * Требуется написать программу, вычисляющую число лесенок, которое можно построить из N кубиков.
 *
 * Входные данные
 * Во входном файле INPUT.TXT записано натуральное число N (1 ≤ N ≤ 100) – количество кубиков в лесенке.
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT необходимо вывести число лесенок, которые можно построить из N кубиков.
 *
 * INPUT.TXT | OUTPUT.TXT
 * ----------|-----------
 * 3         | 2
 * ----------|-----------
 * 6         | 4
 * ----------|-----------
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int sum = in.nextInt();
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.print(sort(cout(sum, 1), sum).size());
        out.close();
    }

    private static List<String> cout(int sum, int take){
        List<String> list = new LinkedList<>();
        if (sum >= (take + 1)){
            List<String> temp = cout(sum - take, take);
            for (String s : temp) {
                list.add(s +" " + take);
            }
            temp = cout(sum - (take + 1), take + 1);
            for (String s : temp) {
                list.add(s + " " + (take + 1));
            }
        } else {
            list.add(sum + "");
        }

        return list;
    }

    private static List<String> sort(List<String> list, int summa){
        List<String> sortedList = new LinkedList<>();
        for (String s : list) {
            s = s.replaceAll("0 ", "");
            if (s.endsWith("1") && s.charAt(0) >= s.charAt(2)){
                String[] str = s.split(" ");
                int sum = 0;
                for (String s1 : str) {
                    sum += Integer.parseInt(s1);
                }
                if (sum == summa){
                    sortedList.add(s);
                }
            }
        }
        return sortedList;
    }
}
