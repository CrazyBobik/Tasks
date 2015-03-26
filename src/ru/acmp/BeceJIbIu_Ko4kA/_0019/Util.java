package ru.acmp.BeceJIbIu_Ko4kA._0019;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 26.03.2015.
 *
 * @author Crazy Bobik
 *         (.)(.)
 *         =)
 */

public class Util {

    private static Point getIJ(String str){
        Point p = new Point();
        char[] mass = str.toCharArray();
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char[] ott = {'1', '2','3', '4', '5', '6', '7', '8'};
        for (int i = 0; i < 8; i++) {
            if (abc[i] == mass[0]) {
                p.setI(i);
                break;
            }
        }
        for (int i = 0; i < 8; i++) {
            if (ott[i] == mass[1]) {
                p.setJ(i);
                break;
            }
        }

        return p;
    }

    public static int coutField(String str){
        Set<Point> set = new HashSet<>(64 * 2);

        String[] arr = str.split(" ");

        Point queen = getIJ(arr[0]);
        Point rook = getIJ(arr[1]);
        Point horse = getIJ(arr[2]);

        set.addAll(forHorse(horse));
        set.addAll(forRook(rook));
        set.addAll(forQueen(queen));

        set.remove(queen);
        set.remove(rook);
        set.remove(horse);

        set.forEach(System.out::println);

        return set.size();
    }

    private static Set<Point> forQueen(Point queen) {
        Set<Point> set = new HashSet<>(28 * 2);
        set.addAll(forRook(queen));

        int tempI = queen.getI();
        int tempJ = queen.getJ();

        while (true){
            tempI--;
            tempJ--;
            if (tempI >= 0 && tempJ >= 0){
                set.add(new Point(tempI, tempJ));
            } else {
                tempI = queen.getI();
                tempJ = queen.getJ();
                break;
            }
        }

        while (true){
            tempI++;
            tempJ--;
            if (tempI < 8 && tempJ >= 0){
                set.add(new Point(tempI, tempJ));
            } else {
                tempI = queen.getI();
                tempJ = queen.getJ();
                break;
            }
        }
        while (true){
            tempI++;
            tempJ++;
            if (tempI < 8 && tempJ < 8){
                set.add(new Point(tempI, tempJ));
            } else {
                tempI = queen.getI();
                tempJ = queen.getJ();
                break;
            }
        }
        while (true){
            tempI--;
            tempJ++;
            if (tempI >= 0 && tempJ < 8){
                set.add(new Point(tempI, tempJ));
            } else {
                break;
            }
        }

        return set;
    }

    private static Set<Point> forRook(Point rook) {
        Set<Point> set = new HashSet<>(15 * 2);

        for (int i = 0; i < 8; i++) {
            set.add(new Point(rook.getI(), i));
            set.add(new Point(i, rook.getJ()));
        }

        return set;
    }

    private static Set<Point> forHorse(Point horse){
        Set<Point> set = new HashSet<>(8 * 2);

        int tempI = horse.getI() + 2;
        int tempJ = horse.getJ() + 1;
        if (tempI < 8 && tempJ < 8){
            set.add(new Point(tempI, tempJ));
        }

        tempI = horse.getI() + 2;
        tempJ = horse.getJ() - 1;
        if (tempI < 8 && tempJ >= 0){
            set.add(new Point(tempI, tempJ));
        }

        tempI = horse.getI() + 1;
        tempJ = horse.getJ() - 2;
        if (tempI < 8 && tempJ >= 0){
            set.add(new Point(tempI, tempJ));
        }
        tempI = horse.getI() - 1;
        tempJ = horse.getJ() - 2;
        if (tempI >= 0 && tempJ >= 0){
            set.add(new Point(tempI, tempJ));
        }

        tempI = horse.getI() - 2;
        tempJ = horse.getJ() - 1;
        if (tempI >= 0 && tempJ >= 0){
            set.add(new Point(tempI, tempJ));
        }

        tempI = horse.getI() - 2;
        tempJ = horse.getJ() + 1;
        if (tempI >= 0 && tempJ < 8){
            set.add(new Point(tempI, tempJ));
        }

        tempI = horse.getI() - 1;
        tempJ = horse.getJ() + 2;
        if (tempI >= 0 && tempJ < 8){
            set.add(new Point(tempI, tempJ));
        }

        tempI = horse.getI() + 1;
        tempJ = horse.getJ() + 2;
        if (tempI < 8 && tempJ >= 0){
            set.add(new Point(tempI, tempJ));
        }

        return set;
    }
}
