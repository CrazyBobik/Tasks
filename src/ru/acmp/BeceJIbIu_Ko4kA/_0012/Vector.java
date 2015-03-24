package ru.acmp.BeceJIbIu_Ko4kA._0012;

/**
 * Created on 24.03.2015.
 *
 * @author Crazy Bobik
 *         (.)(.)
 *         =)
 */

public class Vector {
    private int X;
    private int Y;

    public Vector(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "{X:" + getX() + " Y:" + getY() + "}";
    }
}
