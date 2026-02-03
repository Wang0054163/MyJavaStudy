import Student.student;
import Student.cars;
import Student.bikes;
import Student.automobiles;
public class Main {
    //Java 定义变量的标准公式：权限修饰符 + 静态修饰符 + 数据类型 + 变量名;
    // 我准备了一个私有的、全类共享的盒子，名字叫 car，这个盒子专门用来装 cars 类型的对象。”
    //   static (静态修饰符)
    //    意思：这个变量属于类本身，而不是属于某个特定的“对象”。通俗理解：无论你创建多少个 Main 页面，car 这个变量在内存里永远只有一份，大家共享。
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
        cars car = new cars();
        bikes bike = new bikes();
        //使用方法
        bike.kick();
        car.key();
        // 11.1 测试方法重载
        automobiles auto = new automobiles();
        auto.start();           // 调用无参版本
        auto.start("遥控钥匙");  // 调用带参版本

        System.out.println("---------多态展示---------");

        // 11.2. 多态性：父类引用指向子类对象
        // 虽然类型都是 automobiles，但运行时的表现完全不同
        automobiles myCar = new cars();
        automobiles myBike = new bikes();

        // 11.2.1统一调用 start() 方法
        myCar.start();  // 输出轿车的启动方式
        myBike.start(); // 输出自行车的启动方式

        // 11.3. 多态的应用：把不同车放进同一个数组
        automobiles[] garage = {new cars(), new bikes(), new automobiles()};
        for (automobiles vehicle : garage) {
            vehicle.start(); // 自动根据对象实际类型执行对应代码
        }

        //  12.封装的数据的使用 不能同public的student数据一样设置为S.ID,S.Name,只能通过setter和getter方法
        // 封装的使用：通过 Setter 设值
        myBike.setYears(2);
        myBike.setFuel(0.0); // 自行车没有油，设为0
        // 通过 Getter 取值并打印
        System.out.println("我的自行车车龄是：" + myBike.getYears() + "年");
        // 结合你之前的“多态”练习
        myBike.start();

    }
}