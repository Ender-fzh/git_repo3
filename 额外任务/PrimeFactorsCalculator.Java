import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalculator {

    List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> primeFactors = new ArrayList<>();

        // 处理 2 的倍数
        while (number % 2 == 0) {
            primeFactors.add(2L);
            number /= 2;
        }

        // 处理奇数因子
        for (long i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        // 如果剩下的数是一个质数
        if (number > 2) {
            primeFactors.add(number);
        }

        return primeFactors;
    }
}