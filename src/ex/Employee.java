package ex;

import java.util.Scanner;

public class Employee {
    /*
    - employeeId: int
    - employeeName: String
    - age: int
    - gen: String
    - rate: double
    - salary: double
    + Employee()
    + Employee(employeeId: int, employeeName: String, age: int, gen: String, rate: double)
    + getEmployeeId(): int
    + setEmployeeId(employeeId: int)
    + getEmployeeName(): String
    + setEmployeeName(employeeName:String)
    + getAge(): int
    + setAge(age: int)
    + getGen(): String
    + setGen(gen: String)
    + getRate(): double
    + setRate(rate: double)
    + getSalary(): double
    + setSalary(salary: double)
    + inputData(): void
    + displayData(): void
    + calSalary(): void
    * */
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    // Constructor không tham số
    public Employee() {
    }

    // Constructor có tham số
    public Employee(int employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    // Getter và Setter


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Phương thức nhập dữ liệu
    public void inputData(Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên nhân viên: ");
        sc.nextLine();  // Consume newline left-over
        this.employeeName = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        sc.nextLine();  // Consume newline left-over
        this.gen = sc.nextLine();

        System.out.print("Nhập hệ số lương: ");
        this.rate = Double.parseDouble(sc.nextLine());
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Mã nhân viên: " + this.employeeId);
        System.out.println("Tên nhân viên: " + this.employeeName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gen);
        System.out.println("Hệ số lương: " + this.rate);
        System.out.println("Lương: " + this.salary);
    }

    // Phương thức tính lương
    public void calSalary() {
        salary = rate * 1300000;
    }
}
