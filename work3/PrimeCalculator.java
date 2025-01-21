class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        int count = 0; // 用于记录当前找到的素数数量
        int number = 2; // 从 2 开始检查素数

        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == nth) {
                    return number; // 找到第 n 个素数
                }
            }
            number++;
        }
    }

    // 辅助方法：检查一个数是否是素数
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // 如果能被整除，则不是素数
            }
        }
        return true; // 否则是素数
    }
}