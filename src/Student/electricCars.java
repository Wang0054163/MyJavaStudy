package Student;

public class electricCars extends cars {
    //继承的是cars类 他需要构造参数 所以这里super父类的构造参数方法
    public electricCars(String name, String price, String topSpeed) {
        super(name, price, topSpeed);
    }

    public void showBattery() {
        System.out.println("这是多层继承：正在检查电池电量...");
    }
}
