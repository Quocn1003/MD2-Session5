package ex;

import java.util.Scanner;

public class Circle {
    /*
    * - radius: double
    *  - color: String
    *  + Circle()
    *  + Circle(radius: double,
    *  + color: String)
    *  + getRadius(): double
    *  + setColor(color: String):
    *  void
    *  + circumference(): double
    *  + area(): double
    *  + inputData(): void
    *  + displayData(): void
    * */
    private double radius;
    private String color;

    // Constructor không tham số
    public Circle() {
    }

    // Constructor có tham số
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter và Setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và Setter cho color


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính chu vi
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double area() {
        return Math.PI * radius * radius;
    }

    // Phương thức nhập dữ liệu
    public void inputData(Scanner sc) {

        System.out.print("Nhập bán kính: ");
        this.radius = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập màu sắc: ");
        this.color = sc.nextLine();
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Bán kính: " + this.radius);
        System.out.println("Màu sắc: " + this.color);
        System.out.println("Chu vi: " + circumference());
        System.out.println("Diện tích: " + area());
    }
}
