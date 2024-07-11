package session05.run;

import session05.entity.Book;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        do{
            System.out.println("********** MENU **********");
            System.out.println("1. Nhập thông tin đối tượng sách");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. Hiển thị giá sách");
            System.out.println("4. Hiển thị tên tác giả");
            System.out.println("5. Cập nhật số trang sách");
            System.out.println("6. Cập nhật nhà xuất bản");
            System.out.println("7. Thoát");
            System.out.print("--> Nhập lựa chọn của bạn: ");
            int choice;
            do {
                choice = Integer.parseInt(sc.nextLine());
                if(choice<1||choice>7){
                    System.err.println("Vui lòng nhập từ 1 đến 7!!");
                }else break;
            }while (true);
            switch (choice){
                case 1:
                    System.out.println("NHẬP ĐỐI TƯỢNG SÁCH: ");
                    book.inputData(sc);
                    break;
                case 2:
                    System.out.println("THÔNG TIN SÁCH:");
                    book.displayData();
                    break;
                case 3:
                    System.out.printf("GIÁ SÁCH: %f\n",book.getBookLocation());
                    break;
                case 4:
                    System.out.printf("TÊN TÁC GIẢ: %s\n",book.getBookAuthor());
                    break;
                case 5:
                    System.out.println("CẬP NHẬT SỐ TRANG SÁCH: ");
                    System.out.print("Nhập số trang sách: ");
                    book.setBookPages(Integer.parseInt(sc.nextLine()));
                    break;
                case 6:
                    System.out.println("CẬP NHẬT NHÀ XUẤT BẢN: ");
                    System.out.print("Nhập nhà xuất bản: ");
                    book.setBookPublishing(sc.nextLine());
                    break;
                case 7:
                    System.exit(0);
                default:
            }
        }while (true);
    }
}
