import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamond = new ArrayList<>();
        if (a < 'A' || a > 'Z') {
            throw new IllegalArgumentException("Input must be an uppercase letter from A to Z.");
        }

        int size = a - 'A' + 1; // 计算菱形的行数
        int totalRows = 2 * size - 1; // 总行数
        int midRow = size - 1; // 中间行的索引

        // 生成上半部分（包括中间行）
        for (int i = 0; i < size; i++) {
            StringBuilder row = new StringBuilder();
            char currentChar = (char) ('A' + i);

            // 前导空格
            int leadingSpaces = size - i - 1;
            for (int j = 0; j < leadingSpaces; j++) {
                row.append(' '); // 使用普通空格
            }

            // 字母部分
            row.append(currentChar);
            if (currentChar != 'A') {
                int middleSpaces = 2 * i - 1;
                for (int j = 0; j < middleSpaces; j++) {
                    row.append(' '); // 使用普通空格
                }
                row.append(currentChar);
            }

            // 尾随空格
            for (int j = 0; j < leadingSpaces; j++) {
                row.append(' '); // 使用普通空格
            }

            diamond.add(row.toString());
        }

        // 生成下半部分（对称复制上半部分）
        for (int i = size - 2; i >= 0; i--) {
            diamond.add(diamond.get(i));
        }

        return diamond;
    }
}