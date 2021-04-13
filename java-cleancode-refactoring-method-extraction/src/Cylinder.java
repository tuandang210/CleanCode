public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea( int radius);
        double perimeter = getPerimeter( int radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}
