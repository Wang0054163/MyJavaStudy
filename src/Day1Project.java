import java.util.Scanner; // 导入扫瞄器工具，用来接收输入
import java.util.StringTokenizer;
public class Day1Project {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //String 适合存储不需要频繁修改的内容，比如：用户名、固定提示语。
        String s1 = "Study";
        String s2 = "Study";
        String S3 = "hard";
        // 1. 打印欢迎语 (输入 sout 按 Tab)
        System.out.println("--- 欢迎来到 7 天 Java 挑战 ---");

        // 2. 创建扫描器
        Scanner scanner = new Scanner(System.in);

//        // 3. 变量与输入实战
//        System.out.print("请输入你的名字：");
//        String name = scanner.nextLine();
//
//        System.out.print("请输入你每天计划学习的小时数：");
//        int hours = scanner.nextInt();
//
//        // 4. 条件判断
//        if (hours >= 8) {
//            System.out.println(name + "，你太拼了！注意保护发际线！");
//        } else {
//            System.out.println(name + "，坚持住，7 天后你就是大神！");
//        }

        // 5. 循环练习：为你加油 3 次,增强型for循环
        for (int i : number) {
            System.out.println("加油第 " + i + " 遍！");
        }
        //  6.二维数组变二维矩阵
        for (int i = 0; i < 3; i++) {
            {
                for (int j = 0; j < 3; j++) {
                    System.out.printf(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        //  7.比较字符串
        System.out.println("s1 compared s2 : " + s1.equals(s2));
        // 8.利用字符串生成器生成新字符 实现字符反转
        StringBuilder INPUT1 = new StringBuilder();
        //  9.append 不仅仅能接字符串，它几乎可以接任何类型的数据。你可以连续“套娃”：
        //  input1.append(" 第").append(1).append("天").append(true);
        //   结果会变成：Hello Java 第1天true
        INPUT1.append(s1);
        INPUT1 = INPUT1.reverse();
        System.out.println("The reverse is = " + INPUT1);
        //10.String的常用用法
        String email = "Gemini_AI@google.com";

        // 检查是否包含某个词.contains
        boolean hasAI = email.contains("AI"); // true

        // 检查后缀.endsWith
        boolean isGoogle = email.endsWith(".com"); // true

        // 转换大小写.toLowerCase每次执行 toLowerCase()，Java 都会在内存里产生一个新字符串，旧的还在那里。
        String lower = email.toLowerCase(); // gemini_ai@google.com
        //  这个 StringTokenizer类专门用来把一长串文字按规则“切开”。虽然现在常用 split()，但在处理超大数据量或学习基础时，它非常经典。
        String data = "Java,Python,C++,JavaScript";
        // 参数1是字符串，参数2是分隔符（逗号）
        StringTokenizer st = new StringTokenizer(data, ",");

        while (st.hasMoreTokens()) {
            System.out.println("学完一个： " + st.nextToken());
        }
        //spit方法切割
        String studentData = "张三,18,计算机系,北京";
        String[] info = studentData.split(",");

        System.out.println("姓名：" + info[0]);
        System.out.println("年龄：" + info[1]);
        System.out.println("专业：" + info[2]);
       //split() 还可以接收第二个参数 limit，用来控制切出多少份。
        String text = "2026-01-29-22-50";
        // 只切成 3 份，剩下的不切了
        String[] parts = text.split("-", 3);
        // 结果：["2026", "01", "29-22-50"]
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }
}
