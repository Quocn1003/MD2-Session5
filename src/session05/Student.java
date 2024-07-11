package session05;

import java.util.Scanner;

public class Student {
    /*
    * 1. Có các đặc điểm: mã sinh viên, tên, tổi, giới tính, địa chỉ, trạng thái
    * 2. Có các hàm khởi tạo (constructor)
    * 3. Có các hành vi: tính tổng 2 số, chào giảng viên, nhập và in dữ liệu của đối tượng
    *
    * */
    //1. Fields/Properties/Attribute: thuộc tính của lớp mô tả các đặc điểm của đối tượng trong thế giới lập trình
    //Syntax: Access Modifier (private) + Datatype + attributeName;
    private String studentId; //tính bao đóng
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private boolean status;
    //2. Constructor: Hàm tạo dùng để khởi tạo đối tượng
    //Syntax: Access Modifier (public) + Classname(parameters)
    //Parameter Syntax: Datatype paramName
    //Default: Không có tham số - không khởi tạo bất cứ thông tin gì của sinh viên
    public Student() {
    }
    //Constructor khởi tạo sinh viên với mã sinh viên và tên sinh viên
    public Student(String studentId,String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    //Constructor khởi tạo tất cả thông tin sinh viên

    public Student(String studentId, String studentName, int age, boolean sex, String address, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.status = status;
    }
    //Constructor khởi tạo thông tin sinh viên với mã sinh viên, tên, tuổi

    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    //3. Method: Mô tả hành vi của đối tượng trong thế giới thực
    //Syntax: Access Modifier + Return Data + methodName(parameters)
    //3.1 Getter/Setter

    public String getStudentId() {
        //Cài đặt điều kiện để lấy giá trị thuộc tính mã sinh viên --> Tính bao đóng
        return studentId;
    }

    public void setStudentId(String studentId) {
        //Cài đặt điều kiện để gán giá trị cho thuộc tính mã sinh viên --> Tính bao đóng
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //3.2 Methods: mô tả hành vi
    public int addTwoNumbers(int firstNUmber,int secondNumber){
        int sum = firstNUmber+secondNumber;
        return sum;
    }
    public void hello(){
        System.out.println("Xin chào");
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = sc.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = sc.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        this.address = sc.nextLine();
        System.out.println("Nhập vào trạng thái sinh viên: ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    public void displayData(){
        System.out.printf("Mã sinh viên: %s - Tên SV: %s - Tuổi: %d\n",this.studentId,this.studentName,this.age);
        System.out.printf("Giới tính: %b - Địa chỉ: %s - Trạng thái: %b\n",this.sex,this.address,this.status);
    }
}
