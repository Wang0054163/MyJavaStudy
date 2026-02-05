package Student;
// 混合继承：继承了 automobiles 的血缘，同时签署了 Maintainable 协议
//正如你提到的，Java 类不支持同时继承多个父类（比如不能 extends A, B），所以我们必须结合**接口（Interface）**来完成。extend+implement
// 1. IS-A 关系：cars 是一个 automobiles (继承自父类)
public class cars extends automobiles implements Maintainable {
    // 定义成员变量（属性）
    private String name;
    private String price;
    private String topSpeed;

    // 2. HAS-A 关系：cars 有一个发动机 (作为成员变量)
    private String engineType = "V8";
//    public cars(){
//        System.out.println("A new cars has been created");
//    }

    // 【核心改进】有参构造方法，出生自动执行 在构造对象时要带参数构造
    public cars(String name, String price, String topSpeed) {
        // this.name 代表左侧类定义的成员变量
        // name 代表右侧括号里传进来的局部变量
        this.name = name;      //
        this.price = price;    //
        this.topSpeed = topSpeed; //
        System.out.println("成功创建了一辆名为 " + name + " 的轿车！");
    }

    public void key(){
        System.out.println("Car has been stated with key rotation");
    }

    public void showAccess() {
        // ✅ 可以直接获取：brand 是 public
        System.out.println("品牌: " + brand);

        // ✅ 可以直接获取：tankCapacity 是 protected
        System.out.println("油箱容量: " + tankCapacity);

        // ✅ 可以直接获取：color 是 default，且都在 Student 包下
        System.out.println("颜色: " + color);

        // ❌ 报错：engineSerial 是 private，子类也拿不到
        // System.out.println(engineSerial);
    }

    // 在 cars.java 中重写
    @Override
    public void start() {
        System.out.println("轿车：踩下刹车，按下启动按钮，发动机轰鸣。");
    }
    // 2. 实现父类的抽象方法（必须重写）（继承）
    @Override
    public void fuelUp() {
        System.out.println("正在加油");
    }
    // 3. 实现接口的方法（必须重写）（实现协议）
//    @Override
//    public void checkStatus() {
//        System.out.println("混合继承体现：正在执行接口定义的自检程序...");
//    }
    // 3. 接口实现：cars 拥有了“可维护”的能力
    @Override
    public void checkStatus() {
        System.out.println("正在检查这台 " + engineType + " 发动机的状态...");
    }
}
