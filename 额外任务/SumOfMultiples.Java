import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {

    private final int number;
    private final int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        Set<Integer> multiples = new HashSet<>();

        // 遍历每个魔法物品的基础值
        for (int base : set) {
            if (base == 0) {
                continue; // 如果基础值为 0，跳过
            }

            // 找到所有小于 number 的倍数
            for (int i = base; i < number; i += base) {
                multiples.add(i); // 将倍数添加到集合中
            }
        }

        // 计算所有唯一倍数的总和
        int sum = 0;
        for (int multiple : multiples) {
            sum += multiple;
        }

        return sum;
    }
}