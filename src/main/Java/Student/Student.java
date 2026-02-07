package Student;

import jakarta.persistence.Id;
import jakarta.persistence.*; // ✅ 必须是 jakarta
@Entity
@Table(name = "student_table")
// 这是一个类 (模板)
public class Student {

    public String name;
    public int age;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    private String email;


    void study() { // 行为
        System.out.println(name + " 正在学习 Java...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
