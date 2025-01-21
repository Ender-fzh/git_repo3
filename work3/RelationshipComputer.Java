import java.util.List;
import java.util.Objects;

class RelationshipComputer<T> {

    Relationship computeRelationship(List<T> firstList, List<T> secondList) {
        if (firstList.equals(secondList)) {
            return Relationship.EQUAL;
        } else if (isSuperlist(firstList, secondList)) {
            return Relationship.SUPERLIST;
        } else if (isSuperlist(secondList, firstList)) {
            return Relationship.SUBLIST;
        } else {
            return Relationship.UNEQUAL;
        }
    }

    // 检查 listA 是否是 listB 的超级列表
    private boolean isSuperlist(List<T> listA, List<T> listB) {
        if (listB.isEmpty()) {
            return true; // 空列表是任何列表的子列表
        }
        if (listA.size() < listB.size()) {
            return false; // listA 的长度必须大于或等于 listB 的长度
        }

        // 遍历 listA，检查是否存在连续的 sublist 等于 listB
        for (int i = 0; i <= listA.size() - listB.size(); i++) {
            if (listA.subList(i, i + listB.size()).equals(listB)) {
                return true;
            }
        }
        return false;
    }
}