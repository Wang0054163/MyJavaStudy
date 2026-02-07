package Student;
import jakarta.persistence.*; // 注意：新版 Hibernate 6.x 用 jakarta，不是 javax
// 这是一个类 (模板)
public class student {

    public String name;
    public int age;
    public int id;

    void study() { // 行为
        System.out.println(name + " 正在学习 Java...");
    }




}
