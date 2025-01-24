import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {

    private final int a;
    private final int b;
    private final int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        private int sum;
        private int maxFactor = Integer.MAX_VALUE;

        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();

            // 遍历可能的 a 和 b 值
            for (int a = 1; a <= sum / 3; a++) {
                if (a > maxFactor) {
                    continue; // 跳过超过 maxFactor 的 a
                }

                for (int b = a + 1; b <= (sum - a) / 2; b++) {
                    if (b > maxFactor) {
                        continue; // 跳过超过 maxFactor 的 b
                    }

                    int c = sum - a - b;
                    if (c > maxFactor) {
                        continue; // 跳过超过 maxFactor 的 c
                    }

                    // 检查是否满足毕达哥拉斯条件
                    if (a * a + b * b == c * c) {
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }

            return triplets;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }

   
    // 重写hashCode方法，返回a、b、c的哈希码
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "PythagoreanTriplet{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}