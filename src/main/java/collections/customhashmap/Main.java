package collections.customhashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> customMap = new CustomHashMap<>();
        customMap.put("one", 1);
        customMap.put("two", 2);
        customMap.put("three", 3);

        System.out.println(customMap.get("one")); // 1
        System.out.println(customMap.get("four")); // null

        customMap.remove("two");
        System.out.println(customMap.get("two")); // null
        System.out.println(customMap.size()); // 2
    }
}
