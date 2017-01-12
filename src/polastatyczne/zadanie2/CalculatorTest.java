package polastatyczne.zadanie2;

/**
 * Created by Kasia on 12.01.2017.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Pole koła o promieniu r = 10 wynosi: " + ShapeCalculator.circleArea(circle));
        System.out.println("Obwód koła o promieniu r = 10 wynosi: " + ShapeCalculator.circlePerimeter(circle));
        System.out.println("Pole prostokąta o bokach 5 i 10 wynosi: " + ShapeCalculator.rectangleArea(rectangle));
        System.out.println("Obwód prostokąta o bokach 5 i 10 wynosi: " + ShapeCalculator.rectanglePerimeter(rectangle));
    }

}
