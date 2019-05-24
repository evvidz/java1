/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.util.Scanner;

/**
 *
 * @author 1710510
 */
abstract class GeometricObject {

    
   
    private java.util.Date dateCreated;
    
    protected GeometricObject() {
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated;
    }
    
    public abstract double getArea();
   
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        int p = (int) (getPerimeter() / 2);
        return Math.sqrt(p * ((p - side1) *2 (p - side2) * (p - side3)));
    }

    public String toString() {
        return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
                + " Side 3 = " + side3;
    }
}

public class Lab05 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three sides of the Triangle");

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

             
    
        Triangle triangle = new Triangle(side1, side2, side3);

        boolean filled;

        System.out.println("The Triangle Sides are \n side 1: "
                + triangle.getSide1() + "\n Side 2: " + triangle.getSide2()
                + "\n Side 3: " + triangle.getSide3());

        System.out.println("The Triangle's Area is " + triangle.getArea());
        System.out.println("The Triangle's Perimeter is " + triangle.getPerimeter());

    }
}
