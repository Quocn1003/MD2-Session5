package session05.entity;

import java.util.Scanner;

public class Book {
    //Mã sách
    private int bookId;
    //Tên sách
    private String bookName;
    //Tác giả
    private String bookAuthor;
    //Giá sách
    private float bookLocation;
    //Tiêu đề
    private String  bookTitle;
    //Số trang
    private int bookPages;
    //Nhà xuất bản
    private String bookPublishing;
    //Trạng thái: true - còn, false - hết
    private Boolean bookStatus;
    //Constructor default
    public Book() {
    }
    //Constructor khởi tạo tất cả thông tin sách
    public Book(int bookId, String bookName, String bookAuthor, float bookLocation, String bookTitle, int bookPages, String bookPublishing, Boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookLocation = bookLocation;
        this.bookTitle = bookTitle;
        this.bookPages = bookPages;
        this.bookPublishing = bookPublishing;
        this.bookStatus = bookStatus;
    }
    //Getter/Setter

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public float getBookLocation() {
        return bookLocation;
    }

    public void setBookLocation(float bookLocation) {
        this.bookLocation = bookLocation;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public String getBookPublishing() {
        return bookPublishing;
    }

    public void setBookPublishing(String bookPublishing) {
        this.bookPublishing = bookPublishing;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
    //Input Method
    public void inputData(Scanner scanner){
        System.out.println("Nhập mã sách: ");
        this.bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập tác giả: ");
        this.bookAuthor = scanner.nextLine();
        System.out.println("Nhập giá sách: ");
        this.bookLocation = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tiêu đề: ");
        this.bookTitle = scanner.nextLine();
        System.out.println("Nhập số trang: ");
        this.bookPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà xuất bản: ");
        this.bookPublishing = scanner.nextLine();
        System.out.println("Nhập trạng thái: ");
        this.bookStatus = Boolean.parseBoolean(scanner.nextLine());
    }
    //Display Method
    public void displayData(){
        System.out.println("Nhập mã sách: "+this.bookId);
        System.out.println("Nhập tên sách: "+this.bookName);
        System.out.println("Nhập tác giả: "+this.bookAuthor);
        System.out.println("Nhập giá sách: "+this.bookLocation);
        System.out.println("Nhập tiêu đề: "+this.bookTitle);
        System.out.println("Nhập số trang: "+this.bookPages);
        System.out.println("Nhập nhà xuất bản: "+this.bookPublishing);
        System.out.println("Nhập trạng thái: "+this.bookStatus);
    }
}
