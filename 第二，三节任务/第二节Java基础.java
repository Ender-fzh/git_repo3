import java.util.ArrayList;
import java.util.List;

public class workfirst {

    // 定义阶乘方法
    public static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("阶乘的参数不能为负数");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 定义排列数方法
    public static long permutations(int n, int k) {
        return factorial(n) / factorial(n - k);
    }

    // 定义组合数方法
    public static long combinations(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        // 任务1：数据类型与运算符（一）
        int a = 7;
        int c = 25;
        double d = (double) a / c; // 实数意义上的商
        boolean b = (d * 25) <= 7; // 逻辑结果
        System.out.println("任务1结果：");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        // 任务2：数据类型与运算符（二）
        d -= 1;
        c += ~(a ^ 11); // a异或11的相反数
        b = b || ((a << 1) > c); // 逻辑或
        System.out.println("任务2结果：");
        System.out.println("b = " + b + ", c = " + c + ", d = " + d);

        // 任务3：控制结构
        for (int i = 0; i < a - 4; i++) {
            if (c % 2 != 0) {
                c += 1;
            } else {
                c /= 2;
            }
        }
        while (d >= -6) {
            d *= 2;
        }
        a += (int) d; // 将d的整数部分加到a
        System.out.println("任务3结果：");
        System.out.println("a = " + a + ", c = " + c + ", d = " + d);

        // 任务4：字符串与数组
        String string = "Hello 2025";
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        // 反转数组
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("任务4结果：");
        System.out.println("string第-a位字符: " + string.charAt(-a));
        System.out.println("array第c位字符: " + array[c]);
        System.out.println("拼接子串: " + string.substring(0, 4) + string.substring(5));

        // 任务5：方法与异常抛出
        System.out.println("任务5结果：");
        System.out.println("c的阶乘: " + factorial(c));
        System.out.println("10和a+c的组合数: " + combinations(10, a + c));
        System.out.println("10和a+c的排列数: " + permutations(10, a + c));

        // 任务6：异常捕获
        System.out.println("任务6结果：");
        try {
            System.out.println("尝试计算factorial(-1):");
            System.out.println(factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("捕获到异常: " + e.getMessage());
        }

        // 任务7：泛型容器与包装类型
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) { // 奇数位
                charList.add(array[i]);
            }
        }
        System.out.println("任务7结果：");
        while (!charList.isEmpty()) {
            System.out.println("删除并打印最后一个元素: " + charList.remove(charList.size() - 1));
        }

        // 任务8：引用类型与字符串相等
        //在 Java 中，引用类型是指那些通过引用来操作的对象类型，而不是直接存储实际的值。与基本类型（如 int、char 等）不同，引用类型的变量存储的是对象的内存地址，而不是对象本身。常见的引用类型包括：
        //类（如 String、ArrayList），接口，数组
        //大多数引用类型的对象需要通过 new 关键字创建（除了字符串字面量等特殊情况）。
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("任务8结果：");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true，比较内容
        System.out.println("str1 == str2: " + (str1 == str2)); // false，比较引用
        //使用 ==：== 比较的是两个字符串对象的内存地址，即它们是否是同一个对象，使用 equals() 方法：equals() 方法比较的是两个字符串的内容是否相同。
        //Java 中的字符串常量池会复用相同的字符串字面量，因此 == 在某些情况下可能返回 true，但为了安全起见，判断字符串内容是否相等时，应始终使用 equals() 方法。
    }
}
