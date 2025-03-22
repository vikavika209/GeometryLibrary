package utils;

public class GeometryUtils {

    private static final double INCH_TO_CM = 2.54;
    private static final double CM_TO_INCH = 1 / INCH_TO_CM;

    public static double inchesToCentimeters(double inches) {
        return inches * INCH_TO_CM;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters * CM_TO_INCH;
    }

    public static double cm2ToM2(double cm2) {
        return cm2 / 10_000;
    }

    public static double m2ToCm2(double m2) {
        return m2 * 10_000;
    }

    /**
     * Сравнивает площади двух фигур.
     * @param area1 площадь первой фигуры
     * @param area2 площадь второй фигуры
     * @return -1 если первая меньше второй, 1 если первая больше второй, 0 если равны
     */
    public static int compareAreas(double area1, double area2) {
        final double EPSILON = 1e-6;

        if (Math.abs(area1 - area2) < EPSILON) {
            return 0;
        }
        return area1 > area2 ? 1 : -1;
    }
}

