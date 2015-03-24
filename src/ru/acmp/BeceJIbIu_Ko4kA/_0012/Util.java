package ru.acmp.BeceJIbIu_Ko4kA._0012;

/**
 * Created on 24.03.2015.
 *
 * @author Crazy Bobik
 *         (.)(.)
 *         =)
 */

public class Util {

    public static boolean isHome(int userX, int userY,
                                 int X1, int Y1, int X2, int Y2,
                                 int X3, int Y3, int X4, int Y4){

        double sum = deg(userX, userY, X1, Y1, X2, Y2) +
                deg(userX, userY, X2, Y2, X3, Y3) +
                deg(userX, userY, X3, Y3, X4, Y4) +
                deg(userX, userY, X4, Y4, X1, Y1);

        return String.format("%.4f", sum).equals(String.format("%.4f", (2 * Math.PI)));
    }

    private static double deg(int userX, int userY,
                           int X1, int Y1, int X2, int Y2){
        Vector vector1 = new Vector((X1 - userX), (Y1 - userY));
        Vector vector2 = new Vector((X2 - userX), (Y2 - userY));

        double modVector1 = Math.sqrt(((vector1.getX() * vector1.getX()) +
                (vector1.getY() * vector1.getY())));
        double modVector2 = Math.sqrt(((vector2.getX() * vector2.getX()) +
                (vector2.getY() * vector2.getY())));

        double cosDeg = (vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY())/
                        (modVector1 * modVector2);

        return Math.acos(cosDeg);
    }
}
