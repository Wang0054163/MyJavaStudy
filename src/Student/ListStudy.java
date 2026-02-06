package Student;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        // 1. 创建 (Create) - 声明一个装字符串的列表
        List<String> fruits = new ArrayList<>();

        // 2. 增加 (Add)
        fruits.add("苹果");
        fruits.add("香蕉");
        fruits.add("橘子");
        System.out.println("初始列表: " + fruits);

        // 3. 获取值 (Get) - 通过索引获取，记住是从0开始
        String first = fruits.get(0);
        System.out.println("第一个元素是: " + first);

        // 4. 获取长度 (Size)
        System.out.println("列表大小: " + fruits.size());

        // 5. 修改 (Update) - 把索引为1的“香蕉”改为“西瓜”
        fruits.set(1, "西瓜");
        System.out.println("修改后的列表: " + fruits);

        // 6. 删除 (Delete)
        // 方式A：通过索引删除
        fruits.remove(0);
        // 方式B：通过内容删除
        fruits.remove("橘子");
        System.out.println("删除后的列表: " + fruits);

        // 7. 判断是否存在 (Contains)
        boolean hasWatermelon = fruits.contains("西瓜");
        System.out.println("列表里有西瓜吗？ " + hasWatermelon);

        // 8. 遍历 (Iterate) - 学习阶段最常用的循环方式
        System.out.println("--- 最终遍历结果 ---");
        for (String f : fruits) {
            System.out.println("水果名称: " + f);
        }
    }
}