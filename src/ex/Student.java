package ex;
import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    /*
    -id: String
    -name: String
    -age: int
    -gender: String
    -address: String
    -phoneNumber: String
    +Student()
    +Student(String, String, int, String, String, String)
    +inputData(): void
    +displayData(): void
    +getId(): String
    +setId(String): void
    +getName(): String
    +setName(String): void
    +getAge(): int
    +setAge(int): void
    +getGender(): String
    +setGender(String): void
    +getAddress(): String
    +setAddress(String): void
    +getPhoneNumber(): String
    +setPhoneNumber(String): void
    */

    private String studentId;
    private String studentName;
    private int age;
    private Boolean gender;
    private String address;
    private String phoneNumber;

    // Phương thức khởi tạo không tham số
    public Student() {
    }

    // Phương thức khởi tạo có tham số
    public Student(String studentId, String studentName, int age, Boolean gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter và setter cho các thuộc tính

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã học sinh: ");
        this.studentId = scanner.nextLine();

        System.out.print("Nhập tên học sinh: ");
        this.studentName = scanner.nextLine();

        System.out.print("Nhập tuổi học sinh: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giới tính học sinh: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Nhập địa chỉ học sinh: ");
        this.address = scanner.nextLine();

        System.out.print("Nhập số điện thoại học sinh: ");
        this.phoneNumber = scanner.nextLine();
    }

    // Phương thức displayData() cho phép hiển thị toàn bộ thông tin học sinh
    public void displayData() {
        System.out.println("Mã học sinh: " + this.studentId);
        System.out.println("Tên học sinh: " + this.studentName);
        System.out.println("Tuổi học sinh: " + this.age);
        System.out.println("Giới tính học sinh: " + this.gender);
        System.out.println("Địa chỉ học sinh: " + this.address);
        System.out.println("Số điện thoại học sinh: " + this.phoneNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xóa học sinh dựa vào mã học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            do {
                choice = Integer.parseInt(scanner.nextLine());
                if(choice<1 ||choice>5){
                    System.err.println("Vui lòng nhập từ 1 đến 5: ");
                }else break;
            }while(true);
            switch (choice) {
                case 1:
                    // Hiển thị danh sách tất cả học sinh
                    for (Student student : studentList) {
                        student.displayData();
                    }
                    break;
                case 2:
                    // Thêm mới học sinh
                    Student newStudent = new Student();
                    newStudent.inputData();
                    studentList.add(newStudent);
                    break;
                case 3:
                    // Sửa thông tin học sinh dựa vào mã học sinh
                    System.out.print("Nhập mã học sinh cần sửa: ");
                    String idToEdit = scanner.nextLine();
                    boolean found = false;
                    for (Student student : studentList) {
                        if (student.getStudentId().equals(idToEdit)) {
                            System.out.println("Nhập thông tin mới cho học sinh:");
                            student.inputData();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã này.");
                    }
                    break;
                case 4:
                    // Xóa học sinh dựa vào mã học sinh
                    System.out.print("Nhập mã học sinh cần xóa: ");
                    String idToDelete = scanner.nextLine();
                    found = false;
                    for (Student student : studentList) {
                        if (student.getStudentId().equals(idToDelete)) {
                            studentList.remove(student);
                            System.out.println("Đã xóa học sinh.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã này.");
                    }
                    break;
                case 5:
                    // Thoát
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
