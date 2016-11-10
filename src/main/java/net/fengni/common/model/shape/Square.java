package net.fengni.common.model.shape;

/**
 * Created by Administrator on 2016/3/6.
 */
public class Square implements Shape {
    private double x;

    public Square(double x) {
        this.x = x;
    }

    public double getArea() {
        return x * x;
    }
}
