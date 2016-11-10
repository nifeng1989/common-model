package net.fengni.common.model.shape;

/**
 * Created by Administrator on 2016/3/6.
 */
public class Triangle implements Shape {
    private double a, b, c, perimeter,area;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = a + b + c;
        double x = perimeter/2D;
        this.area = Math.sqrt(x*(x-a)*(x-b)*(x-c));
    }

    public double getArea() {
        return area;
    }
}
