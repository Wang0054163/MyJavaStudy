package Student; // 1. 包声明：表示这个类存放于 Student 文件夹/包下

// --- 导入 Jakarta Persistence API (JPA) ---
// JPA 是规范 (接口)，Hibernate 是实现 (干活的)。
// 注意：新版 Hibernate (6.0+) 必须用 jakarta.*，旧版 (5.x) 用 javax.*
import jakarta.persistence.Id; // 2. 导入 @Id 注解，用于标记主键
import jakarta.persistence.*;  // 3. 导入 jakarta.persistence 包下的所有注解 (如 @Entity, @Table, @GeneratedValue)

// --- 类级别的注解 (告诉 Hibernate 这个类是干嘛的) ---
@Entity // 4. 【核心】标记这个类是一个“实体”。
// 只有加了 @Entity，Hibernate 才会扫描它，并把它当作数据库表来管理。

@Table(name = "student_table") // 5. 【映射】指定数据库里的表名。
// 如果不写这一行，Hibernate 默认会找名为 "Student" 的表。
// 这里强制要求它对应数据库里的 "student_table" 表。

// 这是一个类 (模板)
public class Student { // 6. 类定义开始。类名 Student 对应着概念上的“学生”

    // --- 普通字段 (对应数据库表的列) ---
    // 注意：在规范开发中，字段通常设为 private (私有)，这里用 public 也可以，但不推荐。
    public String name; // 7. 定义 name 字段，对应数据库表里的 varchar 类型列
    public int age;     // 8. 定义 age 字段，对应数据库表里的 int 类型列

    // --- 主键配置 (最关键的部分) ---
    @Id // 9. 【主键标记】告诉 Hibernate：这个 id 字段是这张表的 Primary Key (身份证号)。
    // 每一行数据都必须有一个唯一的 ID。

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 10. 【主键生成策略】
    // GenerationType.IDENTITY 的意思是：利用数据库底层的“自增”功能 (Auto Increment)。
    // 也就是说，当你保存数据时，不用手动填 id，MySQL 会自动生成 1, 2, 3, 4...

    public int id; // 11. 定义 id 字段，用来存放生成的主键值。

    // --- 私有字段 (标准写法) ---
    private String email; // 12. 定义 email 字段。
    // 因为是 private，所以必须通过下面的 get/set 方法来访问。

    // --- 业务方法 (普通的 Java 行为) ---
    // 这个方法不会被存入数据库，它只是 Java 对象的一个行为。
    void study() { // 13. 定义一个 study 方法
        System.out.println(name + " 正在学习 Java..."); // 14. 打印一句话
    }

    // --- Getter 和 Setter 方法 (存取器) ---
    // Hibernate 底层在存取数据时，通常会调用这些方法，而不是直接操作字段。

    public String getName() { // 15. 获取名字
        return name;
    }

    public void setName(String name) { // 16. 设置名字
        this.name = name;              // this.name 指的是上面的成员变量
    }

    public void setEmail(String email) { // 17. 设置邮箱 (这是 private email 的唯一入口)
        this.email = email;
    }

    public String getEmail() { // 18. 获取邮箱
        return email;
    }

    // 注意：通常 ID 只有 Getter，没有 Setter。
    // 因为 ID 是数据库自动生成的，我们不应该手动修改它。
    public int getId() { // 19. 获取 ID
        return id;
    }
} // 20. 类定义结束