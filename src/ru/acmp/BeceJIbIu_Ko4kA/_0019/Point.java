package ru.acmp.BeceJIbIu_Ko4kA._0019;

/**
 * Created on 26.03.2015.
 *
 * @author Crazy Bobik
 *         (.)(.)
 *         =)
 */

public class Point {
    private int i;
    private int j;
    private static final char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    public Point() {
    }

    public Point(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        return i == point.i && j == point.j;

    }

    @Override
    public int hashCode() {
        return 31 * i + j;
    }

    @Override
    public String toString() {
        return "Point{" +
                "i=" + abc[i] +
                ", j=" + (j + 1) +
                '}';
    }
}
