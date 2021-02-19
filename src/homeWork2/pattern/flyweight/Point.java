package homeWork2.pattern.flyweight;

import homeWork1.database.entity.Vehicle;

public class Point {
    private final int x;
    private final int y;
    private final Vehicle vehicle;

    public Point(int x, int y, Vehicle vehicle) {
        this.x = x;
        this.y = y;
        this.vehicle = vehicle;
    }
}
