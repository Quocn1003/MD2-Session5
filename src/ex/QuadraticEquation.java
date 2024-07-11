package ex;

import java.util.Scanner;

public class QuadraticEquation {
    /*
    - a: double
    - b: double
    - c: double
    + QuadraticEquation(a: double, b: double, c: double)
    + getA(): double
    + setA(a: double): void
    + getB(): double
    + setB(b: double): void
    + getC(): double
    + setC(c: double): void
    + getDiscriminant(): double
    + getRoot1(): double
    + getRoot2(): double
     */

    private double a;
    private double b;
    private double c;

    // Constructor có tham số
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter và Setter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Phương thức trả về delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phương thức trả về nghiệm thứ nhất
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    // Phương thức trả về nghiệm thứ hai
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập giá trị b: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập giá trị c: ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm:");
            System.out.println("Nghiệm 1: " + equation.getRoot1());
            System.out.println("Nghiệm 2: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có một nghiệm kép:");
            System.out.println("Nghiệm: " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
