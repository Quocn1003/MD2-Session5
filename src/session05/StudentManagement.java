package session05;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //Syntax: Classname objectName = new Constructor(Argument)
        //1. Khởi tạo đối tượng sinh viên mà không khởi tạo bất cứ thông tin nào
        Student student1 = new Student();
        //2. Khởi tạo đối tươợng sinh viên với mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002","Nguyễn Văn A");
        //3. Khởi toạ đối tượng sinh viên với đầy đủ thông tin
        Student student3 = new Student("SV003","Nguyễn Văn C",22,true,"HN",true);
        //4. Khởi tạo đối tượng sinh viên với mã sinh viên, tên, tuổi
        Student student4 = new Student("SV004","Nguyễn Văn D",23);
        //5. Nhập toàn b thông tin cho sinh viên 1
        System.out.println("Nhập thông tin sinh viên 1:");
        Scanner sc = new Scanner(System.in);
        student1.inputData(sc);
        //6. Sử dụng các phương set nhập thông tin sinh viên 2: tuổi, giới tính, địa chỉ, trạng thái
        System.out.println("Nhập thông tin sinh viên 2:");
        System.out.println("Nhập vào tuổi sinh viên:");
        student2.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên:");
        student2.setSex(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Nhập vào địa chỉ sinh viên:");
        student2.setAddress(sc.nextLine());
        System.out.println("Nhập vào trạng thái sinh viên:");
        student2.setStatus(Boolean.parseBoolean(sc.nextLine()));
        //7. In ra tổng tuổi của sinh viên 1,2,3
        int sumAge = student1.getAge()+ student2.getAge()+ student3.getAge();
        System.out.println("Tổng tuổi của 3 sinh viên là: "+sumAge);
        //8. in sinh viên 3 chào
        student3.hello();
        //In ra thông tin sinh viên 1,2,3
        //Syntax: objectName.methodName(Argument)
        System.out.println("Thông tin sinh viên 1: ");
        student1.displayData();
        System.out.println("Thông tin sinh viên 2: ");
        student2.displayData();
        System.out.println("Thông tin sinh viên 3: ");
        student3.displayData();
    }
}
