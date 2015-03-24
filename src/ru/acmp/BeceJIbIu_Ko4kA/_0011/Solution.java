package ru.acmp.BeceJIbIu_Ko4kA._0011;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * В нашем зоопарке появился заяц. Его поместили в клетку, и чтобы ему не было скучно, директор зоопарка
 * распорядился поставить в его клетке лесенку. Теперь наш зайчик может прыгать по лесенке вверх, перепрыгивая
 * через ступеньки. Лестница имеет определенное количество ступенек N. Заяц может одним прыжком преодолеть не
 * более К ступенек. Для разнообразия зайчик пытается каждый раз найти новый путь к вершине лестницы. Директору
 * любопытно, сколько различных способов есть у зайца добраться до вершины лестницы при заданных значениях K и N.
 * Помогите директору написать программу, которая поможет вычислить это количество. Например, если K=3 и N=4, то
 * существуют следующие маршруты: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1. Т.е. при данных значениях у зайца
 * всего 7 различных маршрутов добраться до вершины лестницы.
 *
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записаны два натуральных числа K и N (1 ≤ K ≤ N ≤ 300).
 * К - максимальное количество ступенек, которое может преодолеть заяц одним прыжком, N – общее число ступенек
 * лестницы.
 *
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести количество возможных вариантов различных
 * маршрутов зайца на верхнюю ступеньку лестницы без ведущих нулей.
 *
 *
 * Решено но для небольшого количества ступенекь(примерно до 45).
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        long begin = System.currentTimeMillis();
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        int step = in.nextInt();
        int sum = in.nextInt();
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.println(Util.calc(step, sum));
        out.close();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
