package polastatyczne.zadanie2;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Kasia on 12.01.2017.
 */
public class ShapeCalculator {

    public static double circleArea(Circle circle){
        double area = Math.PI*Math.pow(circle.getR(),2);
        return area;
    }

    public static double circlePerimeter(Circle circle){
        double perimeter = 2*Math.PI*circle.getR();
        return perimeter;
    }

    public static double rectangleArea(Rectangle rectangle){
        double area = rectangle.getA()*rectangle.getB();
        return area;
    }

    public static double rectanglePerimeter(Rectangle rectangle){
        double perimieter = (2*rectangle.getA()) + (2*rectangle.getB());
        return perimieter;
    }
}
