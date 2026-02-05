package Student;

public class Main {
    //Java 定义变量的标准公式：权限修饰符 + 静态修饰符 + 数据类型 + 变量名;
    // 我准备了一个私有的、全类共享的盒子，名字叫 car，这个盒子专门用来装 cars 类型的对象。”
    //   static (静态修饰符)
    //    意思：这个变量属于类本身，而不是属于某个特定的“对象”。通俗理解：无论你创建多少个 Student.Main 页面，car 这个变量在内存里永远只有一份，大家共享。
    //    为什么要用它：因为你的 main 方法（入口）是 static 的，静态方法只能直接访问静态变量。
    //在外面定义是为了“让大家都能看见” 生命周期：因为它加了 static，这个车位在程序一启动时就存在了，直到程序关闭才拆除。
    private static cars car;
    private static bikes bike;
    public static void main(String[] args) {
        //  10.类 对象的使用
        student S = new student();// 创建对象 s
        S.name = "Wang";
        S.age = 18;
        S.id=1;
        System.out.println("Name : " + S.name+"\nAge : " + S.age+"\nid  : "+S.id+"\n");

        //对象初始化：正式买了一辆“车”放进刚才那个盒子里。内层初始化：实例化
        //car这个因为改了初始构造函数 必须得传参才可以，使用有参构造实例化（封装的体现）
        cars car = new cars("奔驰", "50万", "250km/h");
        bikes bike = new bikes();
        //使用方法
        bike.kick();
        car.key();
// 因为将automobiles改为抽象类 无法实例化 所以这点注释掉
// 11.1 测试方法重载
//        automobiles auto = new automobiles();
//        auto.start();           // 调用无参版本
//        auto.start("遥控钥匙");  // 调用带参版本

        System.out.println("---------多态展示---------");

        // 11.2. 多态性：父类引用指向子类对象
        // 虽然类型都是 automobiles，但运行时的表现完全不同
        automobiles myCar = new cars("奔驰", "50万", "250km/h");
        automobiles myBike = new bikes();

        // 11.2.1统一调用 start() 方法
        myCar.start();  // 输出轿车的启动方式
        myBike.start(); // 输出自行车的启动方式

// 'automobiles' 为 abstract；无法实例化
// 11.3. 多态的应用：把不同车放进同一个数组
//        automobiles[] garage = {new cars("奔驰", "50万", "250km/h"), new bikes(), new automobiles()};
//        for (automobiles vehicle : garage) {
//            vehicle.start(); // 自动根据对象实际类型执行对应代码
//        }

        //  12.封装的数据的使用 不能同public的student数据一样设置为S.ID,S.Name,只能通过setter和getter方法
        // 封装的使用：通过 Setter 设值
        myBike.setYears(2);
        myBike.setFuel(0.0); // 自行车没有油，设为0
        // 通过 Getter 取值并打印
        System.out.println("我的自行车车龄是：" + myBike.getYears() + "年");
        // 结合你之前的“多态”练习
        myBike.start();
        // 13.调用抽象类和接口实现的新功能
        myCar.fuelUp();    // 体现抽象类的强制重写
        //当你写 automobiles myCar = new cars(...); 时，你在编译器眼里给这辆车贴了一个 automobiles 的标签。虽然这辆车在内存里真实存在的是 cars（它有接口赋予的 checkStatus 能力），但编译器只看标签。
        ((cars) myCar).checkStatus(); // 体现接口的能力扩展
        //也可以用接口当标签
        Maintainable m = new cars("奔驰", "50万", "250km/h"); // 直接用接口当标签
        m.checkStatus(); // 直接调用，无需转换
        //也可以在原来的抽象父类里 添加checkStatus方法 这样所有子类都可以用 用的时候在子类重写
        myBike.checkStatus();
        myBike.checkStatus();

        //  14.修饰词应用
        // 1. Public: 随便访问
        System.out.println(myCar.brand); // ✅ OK
        // 2. Protected & Default:
        // 如果 Student.Main 在 src/Student 下，可以访问
        // 如果 Student.Main 在 src 根目录下，这两行会报错
        System.out.println(myCar.tankCapacity);
        System.out.println(myCar.color);
        // 3. Private: 绝对报错
        // System.out.println(myCar.engineSerial); // ❌
        System.out.println(myCar.getEngineSerial());
    }
}