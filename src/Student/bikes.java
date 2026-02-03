package Student;

public class bikes extends automobiles{
    //new 的那一刻自动执行 必须和类名一模一样 (构造方法) 返回值类型绝对不能写
    public bikes() {
        System.out.println("A new bikes has been created");
    }
    //需要你手动调用 bike.kick();(普通方法) 返回值类型必须写（不返回就写 void）
    public void kick(){
        System.out.println("bikes has been stated with kick");
    }
    // 在 bikes.java 中重写
    @Override
    public void start() {
        System.out.println("自行车：跨上车座，开始蹬踏。");
    }
}
