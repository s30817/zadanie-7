//zadanie.1
interface Figure{
    double getPerimeter();
    double getArea();
    String getType();
}

//zadanie.2
interface Moveable{
    void start();
    void stop();
}

public class Main {
    public static void Main(String[] args) {
        //zadanie.1
        double radius = 6d;
        Figure circle = new Circle(radius);
        double baseSide = 20d;
        double side = 10d;
        double height = 16d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);
        double sideA = 30d;
        double sideB = 20d;
        Figure rectangle = new Rectangle(sideA, sideB);

        ArrayList<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }

        //zadanie.2
        Cat kotek = new Cat("Kotek");
        kotek.start();
        System.out.println(kotek.getType());
        kotek.stop();

    }

}