package net.fengni.common.model.shape;

/**
 * Created by Administrator on 2016/3/6.
 */
public class Rectangle implements Shape {
    private double x, y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return x * y;
    }
}
