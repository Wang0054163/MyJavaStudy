package Student;

public class cars extends automobiles{
    public cars(){
        System.out.println("A new cars has been created");
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
