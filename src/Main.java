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
    }
}