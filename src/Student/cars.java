package Student;

public class cars extends automobiles{
    // 定义成员变量（属性）
    private String name;
    private String price;
    private String topSpeed;


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
    // 在 cars.java 中重写
    @Override
    public void start() {
        System.out.println("轿车：踩下刹车，按下启动按钮，发动机轰鸣。");
    }
}
