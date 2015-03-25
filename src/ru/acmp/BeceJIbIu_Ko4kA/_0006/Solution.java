package ru.acmp.BeceJIbIu_Ko4kA._0006;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Совсем недавно Вася занялся программированием и решил реализовать собственную программу для игры в шахматы.
 * Но у него возникла проблема определения правильности хода конем, который делает пользователь. Т.е. если
 * пользователь вводит значение «C7-D5», то программа должна определить это как правильный ход, если же введено
 * «E2-E4», то ход неверный. Так же нужно проверить корректность записи ввода: если например, введено «D9-N5»,
 * то программа должна определить данную запись как ошибочную. Помогите ему осуществить эту проверку!
 *
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записан текст хода, который указал пользователь. Пользователь
 * не может ввести строку, длиннее 5 символов.
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT нужно вывести «YES», если указанный ход конем верный, если же запись корректна
 * (в смысле правильности записи координат), но ход невозможен, то нужно вывести «NO». Если же координаты не
 * определены или заданы некорректно, то вывести сообщение «ERROR».
 *
 * INPUT.TXT | OUTPUT.TXT
 * ----------|------------
 * C7-D5     | YES
 * ----------|------------
 * E2-E4     | NO
 * ----------|------------
 * BSN       | ERROR
 * ----------|------------
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("d:\\input.txt"));
        String line = in.nextLine().trim();
        in.close();

        PrintWriter out = new PrintWriter(new FileOutputStream("d:\\output.txt"));
        if (!Util.isCorrect(line))
            out.println("ERROR");
        else if (Util.isRight(line))
            out.println("YES");
        else
            out.println("NO");
        out.close();
    }
}

/**
 * Решено!
 */