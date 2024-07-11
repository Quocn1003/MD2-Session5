package ex;

public class Fan {
    /*
    -SLOW: int
    -MEDIUM: int
    -FAST: int
    -speed: int
    -on: boolean
    -radius: double
    -color: String
    +Fan()
    +getSpeed(): int
    +setSpeed(int)
    +isOn(): boolean
    +setOn(boolean)
    +getRadius(): double
    +setRadius(double)
    +getColor(): String
    +setColor(String)
    +toString(): String
    * */

    // Hằng số cho các tốc độ quạt
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Các trường dữ liệu
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    // Phương thức khởi tạo không tham số
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    // Getter và setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString() trả về thông tin của quạt
    public String toString() {
        if (on) {
            return "Fan is on: speed = " + this.speed + ", color = " + this.color + ", radius = " + this.radius;
        } else {
            return "Fan is off: color = " + this.color + ", radius = " + this.radius;
        }
    }

    // Chương trình chính để kiểm tra lớp Fan
    public static void main(String[] args) {
        // Tạo đối tượng Fan 1 và thiết lập các giá trị
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Tạo đối tượng Fan 2 và thiết lập các giá trị
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Hiển thị thông tin các đối tượng Fan
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
