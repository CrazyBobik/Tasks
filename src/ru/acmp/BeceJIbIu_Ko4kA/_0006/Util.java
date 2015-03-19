package ru.acmp.BeceJIbIu_Ko4kA._0006;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 19.03.2015.
 *
 * @author Crazy Bobik
 *         (.)(.)
 *         =)
 */

public class Util {

    public static boolean isCorrect(String s){
        Pattern p = Pattern.compile("^[A-H][1-8]-[A-H][1-8]$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static boolean isRight(String s){
        char[] mass = s.toCharArray();
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char[] ott = {'1', '2', '3', '4', '5', '6', '7', '8'};
        int indexA = 0;
        int indexO = 0;
        for (int i = 0; i < 8; i++) {
            if (abc[i] == mass[0]) {
                indexA = i;
                break;
            }
        }
        for (int i = 0; i < 8; i++) {
            if (ott[i] == mass[1]) {
                indexO = i;
                break;
            }
        }

        try{
            if (mass[3] == abc[indexA - 2] && mass[4] == ott[indexO + 1])
                return true;
        } catch (Exception ignored){}
        try{
            if (mass[3] == abc[indexA - 2] && mass[4] == ott[indexO - 1])
                return true;
        } catch (Exception ignored){}
        try{
            if (mass[3] == abc[indexA + 2] && mass[4] == ott[indexO + 1])
                return true;
        } catch (Exception ignored){}
        try{
            if (mass[3] == abc[indexA + 2] && mass[4] == ott[indexO - 1])
                return true;
        } catch (Exception ignored){}


        try{
            if (mass[3] == abc[indexA - 1] && mass[4] == ott[indexO + 2])
                return true;
        } catch (Exception ignored){}
        try{
            if (mass[3] == abc[indexA - 1] && mass[4] == ott[indexO - 2])
                return true;
        } catch (Exception ignored){}
        try{
            if (mass[3] == abc[indexA + 1] && mass[4] == ott[indexO + 2])
                return true;
        } catch (Exception ignored){}
        try{
            if (mass[3] == abc[indexA + 1] && mass[4] == ott[indexO - 2])
                return true;
        } catch (Exception ignored){}
        return false;
    }
}
