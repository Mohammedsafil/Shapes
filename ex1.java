package Shapes;
import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Shape[] shapes = new Shape[n];
        int choice;
        while(n>0){
            System.out.println("Enter your Choice\n1.Circle \n2.Rectangle \n3.Triangle");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Radius\n");
                    double r = scan.nextDouble();
                   shapes[choice-1] = new Circle(r);
                   break;
                case 2:
                    System.out.print("Enter Length and Breadth\n");
                    double l = scan.nextDouble();
                    double b = scan.nextDouble();
                    shapes[choice-1] = new Rectangle(l, b);
                    break;
                case 3:
                    System.out.print("Enter Base and Height\n");
                    double base = scan.nextDouble();
                    double height = scan.nextDouble();
                    shapes[choice-1] = new Triangle(base, height);
                    break;
            }
            n--;
        }

        for(Shape shape : shapes){
            shape.calculateArea();
        }

    }
}

abstract class Shape{
    abstract void calculateArea();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){this.radius = radius;}

    public void calculateArea(){
        System.out.println("Area of the Circle is : "+ Math.PI*radius*radius);
    }
}

class Rectangle extends Shape{
    private double width, height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        System.out.println("Area of the Rectangle is : "+ width*height);
    }
}

class Triangle extends Shape{
    private double base,height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void calculateArea(){
        System.out.println("Area of the Triangle is : "+0.5*base*height);
    }
}