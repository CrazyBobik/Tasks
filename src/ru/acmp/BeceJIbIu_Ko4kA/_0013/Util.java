package ru.acmp.BeceJIbIu_Ko4kA._0013;

/**
 * Created on 25.03.2015.
 *
 * @author Crazy Bobik
 *         (.)(.)
 *         =)
 */

public class Util {

    public static int[] count(char[] a, char[] b){
        int cow = 0;
        int bull = 0;
        label:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                if (a[j] == b[i] && j == i){
                    bull++;
                    continue label;
                } else if (a[j] == b[i]){
                    cow++;
                    continue label;
                }
            }
        }

        return new int[]{bull, cow};
    }
}
