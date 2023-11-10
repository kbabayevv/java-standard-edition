package creational.prototype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CloneDeep implements Cloneable {

    public CloneDeep(String name, Map<Integer, Integer> map) {
        this.name = name;
        this.map = map;
    }

    private String name;
    private Map<Integer, Integer> map;
    @Override
    public CloneDeep clone() {
        System.out.println("Doing deep copy");

        Map<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> it = this.map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            map.put(key, this.map.get(key));
        }

        CloneDeep cloneDetailedDeep = new CloneDeep(new String(name), map);

        return cloneDetailedDeep;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 11);

        CloneDeep obj1 = new CloneDeep("sam", map);

        CloneDeep obj2 = obj1.clone();

        System.out.println(obj1 == obj2);           //false
        System.out.println(obj1.name == obj2.name); //false
        System.out.println(obj1.map == obj2.map);   //false
    }

}
