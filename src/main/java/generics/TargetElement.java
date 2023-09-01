package generics;

import java.util.List;

public class TargetElement {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println(findTarget(integerList, 3));
        System.out.println(findTarget(integerList, 6));
    }

    public static <T> int findTarget(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
