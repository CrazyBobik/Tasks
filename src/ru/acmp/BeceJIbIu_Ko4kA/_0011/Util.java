package ru.acmp.BeceJIbIu_Ko4kA._0011;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19.03.2015.
 *
 * @author Crazy Bobik
 *         (.)(.)
 *         =)
 */

public class Util {

    public static int calc(int step, int sum){
        return removeNotValid(permutate(sum, step), sum).size();
    }

    private static List<String> permutate(int length, int step){
        List<String> permutationList = new ArrayList<>();
        if (length == 1){
            for (int i = 0; i <= step; i++) {
                permutationList.add("" + i);
            }
        } else {
            List<String> list = permutate(length - 1, step);
            for (String s : list) {
                for (int i = 0; i <= step; i++) {
                    permutationList.add(s + " " + i);
                }
            }
        }

        return permutationList;
    }

    private static List<String> removeNotValid(List<String> list, int length){
        List<String> correctList = new ArrayList<>();
        for (String s : list) {
            String[] arrString = s.split(" ");
            int sum = 0;
            for (String s1 : arrString) {
                sum += Integer.valueOf(s1);
            }

            if (sum == length){
                String temp = s.replaceAll("0", "").replaceAll(" ", "");
                if (!correctList.contains(temp))
                    correctList.add(temp);
            }
        }

        return correctList;
    }
}
