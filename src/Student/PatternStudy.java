package Student;

public class PatternStudy {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("--- 1. 等腰三角形 (含有空格逻辑) ---");
        drawPyramid(n);

        System.out.println("\n--- 2. 直角三角形 (不含空格逻辑) ---");
        drawRightTriangle(n);

        System.out.println("\n--- 3. 菱形三角形 (不含空格逻辑) ---");
        drawDiamond(n);
    }

    //    嵌套循环 (Nested Loops)：
//    外层循环负责“行”：跑一次就是一行。
//    内层循环负责“列”：在这一行里横着打印空格或星号。
    // 等腰三角形：先空格，再星号
    public static void drawPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // 第一步：打印前导空格，把星号往右推
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            // 第二步：打印星号（注意这里的 "* " 带一个空格，是等腰的关键）
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // 第三步：换行
            System.out.println();
        }
    }

    // 直角三角形：直接打印星号
    public static void drawRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    public static void drawDiamond(int n) {
        // --- 第一部分：上半层（正三角形） ---
        for (int i = 1; i <= n; i++) {
            // 打印空格，将星号推向中心
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // --- 第二部分：下半层（倒三角形） ---
        // 注意：i 从 n-1 开始，因为最中间那行不重复打
        for (int i = n - 1; i >= 1; i--) {
            // 打印空格，随着行数减少，空格反而增加
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
