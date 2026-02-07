package Student;

// 1. 添加 abstract 关键字，表示这是抽象蓝图  我们要把这个类设为“不可直接实例化”的概念，并定义一个强制性的规则：所有的车都必须能启动（start），但启动方式由子类决定。
public  abstract class automobiles {
    //实现数据的封装  只能通过getter 和setter方法来获取数据
    // 1.私有化属性：像胶囊一样把数据封起来
    private double fuel;
    private int years;
    // 1. Private: 只有我自己能看
    private String engineSerial = "SN-998877";

    // 2. Default (不写): 同一个包(Student)的小伙伴能看
    String color = "红色";

    // 3. Protected: 同包的小伙伴能看，远方的儿子(子类)也能看
    protected double tankCapacity = 50.0;

    // 4. Public: 全世界都能看
    public String brand = "通用品牌";
    // 2. 构造方法：出生时初始化数据
    public automobiles() {
        System.out.println("A vehicle has been created.");
    }
    // 3. Getter/Setter：对外开放的受控接口
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        // 封装的好处：可以在这里加限制条件
        if (years > 0) {
            this.years = years;
        } else {
            System.out.println("错误：年份必须大于0");
        }
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

    // 为了让外部能看 private 属性，我们还是得提供一个 Getter
    public String getEngineSerial() {
        return this.engineSerial;
    }
    // 在 automobiles 类中添加
    public void start() {
        System.out.println("车辆启动中...");
    }

    // 这里的 start 方法就是重载，因为参数不同（有一个 String 类型参数）
    public void start(String keyType) {
        System.out.println("使用 " + keyType + " 启动车辆...");
    }

    //   新增：这是一个抽象方法，它没有大括号 {}，只是个声明
    public abstract void fuelUp();
    public  abstract void checkStatus();
}
