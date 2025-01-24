import java.util.ArrayList;
import java.util.List;

class Sieve {
    private final List<Integer> primes;

    Sieve(int maxPrime) {
        if (maxPrime < 2) {
            primes = new ArrayList<>(); // 如果 maxPrime 小于 2，返回空列表
        } else {
            primes = findPrimes(maxPrime); // 否则，使用筛法找到所有素数
        }
    }

    List<Integer> getPrimes() {
        return primes;
    }

    // 使用埃拉托斯特尼筛法找到小于等于 maxPrime 的所有素数
    private List<Integer> findPrimes(int maxPrime) {
        boolean[] isPrime = new boolean[maxPrime + 1];
        for (int i = 2; i <= maxPrime; i++) {
            isPrime[i] = true; // 初始化所有数为素数
        }

        for (int i = 2; i * i <= maxPrime; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxPrime; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 收集所有素数
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}