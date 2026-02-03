package Student;

import com.sun.org.apache.xpath.internal.objects.XString;

public class automobiles {
    private double fuel;
    private int years;
    private String brand;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 在 automobiles 类中添加
    public void start() {
        System.out.println("车辆启动中...");
    }

    // 这里的 start 方法就是重载，因为参数不同（有一个 String 类型参数）
    public void start(String keyType) {
        System.out.println("使用 " + keyType + " 启动车辆...");
    }
}
