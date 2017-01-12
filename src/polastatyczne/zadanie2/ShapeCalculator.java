package polastatyczne.zadanie2;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Kasia on 12.01.2017.
 */
public class ShapeCalculator {

    public static double circleArea(Circle circle){
        double area = Circle.PI*Circle.r*Circle.r;
        return area;
    }

    public static double circlePerimeter(Circle circle){
        double perimeter = 2*Circle.PI*Circle.r;
        return perimeter;
    }

    public static double rectangleArea(Rectangle rectangle){
        double area = Rectangle.a*Rectangle.b;
        return area;
    }

    public static double rectanglePerimeter(Rectangle rectangle){
        double perimieter = (2*Rectangle.a) + (2*Rectangle.b);
        return perimieter;
    }
}
