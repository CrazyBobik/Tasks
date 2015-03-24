package ru.acmp.BeceJIbIu_Ko4kA._0011;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    private static Set<String> permutate(int length, int step){
        Set<String> permutationSet = new HashSet<>();
        if (length == 1){
            for (int i = 0; i <= step; i++) {
                permutationSet.add("" + i);
            }
        } else {
            Set<String> set = permutate(length - 1, step);
            for (String s : set) {
                for (int i = 0; i <= step; i++) {
                    permutationSet.add(s + " " + i);
                }
            }
        }

        return permutationSet;
    }

    private static Set<String> removeNotValid(Set<String> set, int length){
        Set<String> correctSet = new HashSet<>();
        for (String s : set) {
            String[] arrString = s.split(" ");
            int sum = 0;
            for (String s1 : arrString) {
                sum += Integer.valueOf(s1);
            }

            if (sum == length){
                String temp = s.replaceAll("0", "").replaceAll(" ", "");
                correctSet.add(temp);
            }
        }

        return correctSet;
    }
}
