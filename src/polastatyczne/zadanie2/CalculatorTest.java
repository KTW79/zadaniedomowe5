package polastatyczne.zadanie2;

/**
 * Created by Kasia on 12.01.2017.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10, Math.PI);
        Rectangle rectangle = new Rectangle(5,10);
        Circle circle1 = new Circle(15,Math.PI);
        Rectangle rectangle1 = new Rectangle(6,8);

        System.out.println("Pole koła o promieniu r = 10 wynosi: " + ShapeCalculator.circleArea(circle));
        System.out.println("Obwód koła o promieniu r = 10 wynosi: " + ShapeCalculator.circlePerimeter(circle));
        System.out.println("Pole prostokąta o bokach 5 i 10 wynosi: " + ShapeCalculator.rectangleArea(rectangle));
        System.out.println("Obwód prostokąta o bokach 5 i 10 wynosi: " + ShapeCalculator.rectanglePerimeter(rectangle));
        System.out.println();
        System.out.println("Pole koła o promieniu r = 15 wynosi: " + ShapeCalculator.circleArea(circle1));
        System.out.println("Obwód koła o promieniu r = 15 wynosi: " + ShapeCalculator.circlePerimeter(circle1));
        System.out.println("Pole prostokąta o bokach 6 i 8 wynosi: " + ShapeCalculator.rectangleArea(rectangle1));
        System.out.println("Obwód prostokąta o bokach 6 i 8 wynosi: " + ShapeCalculator.rectanglePerimeter(rectangle1));


    }

}
