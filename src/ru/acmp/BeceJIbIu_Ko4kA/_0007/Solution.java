package ru.acmp.BeceJIbIu_Ko4kA._0007;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *  Главный вождь племени Абба не умеет считать. В обмен на одну из его земель вождь другого племени предложил
 *  ему выбрать одну из трех куч с золотыми монетами. Но вождю племени Абба хочется получить наибольшее
 *  количество золотых монет. Помогите вождю сделать правильный выбор!
 *
 *  Входные данные
 *  В первой строке входного файла INPUT.TXT записаны три натуральных числа через пробел. Каждое из чисел не
 *  превышает 10^100.
 *
 *  Выходные данные
 *  В выходной файл OUTPUT.TXT нужно вывести одно целое число — максимальное количество монет, которые может
 *  взять вождь.
 *
 * INPUT.TXT                         | OUTPUT.TXT
 * ----------------------------------|-----------------------
 * 5 7 3                             | 7
 * ----------------------------------|-----------------------
 * 987531 234 86364                  | 987531
 * ----------------------------------|-----------------------
 * 189285 283 4958439238923098349024 | 4958439238923098349024
 * ----------------------------------|-----------------------
 *
 *  Решено!!
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        String[] text = in.nextLine().split(" ");
        in.close();

        BigInteger[] golds = new BigInteger[text.length];
        for (int i = 0; i < text.length; i++) {
            golds[i] = new BigInteger(text[i]);
        }

        BigInteger max = new BigInteger("0");
        for (BigInteger bInt : golds) {
            if (bInt.compareTo(max) > 0)
                max = bInt;
        }

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        out.println(max);
        out.close();
    }
}

