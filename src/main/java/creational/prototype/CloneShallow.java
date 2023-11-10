package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CloneShallow implements Cloneable {

    private String name;
    private Map<Integer, Integer> map;

    public CloneShallow(String name, Map<Integer, Integer> map) {
        this.name = name;
        this.map = map;
    }

    @Override
    public CloneShallow clone() {
        System.out.println("Doing shallow copy");
        try {
            return (CloneShallow) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(11, 11);

        CloneShallow obj = new CloneShallow("ankit", map);

        CloneShallow clonedObj = obj.clone();

        System.out.println(obj == clonedObj);             //false
        System.out.println(obj.name == clonedObj.name);   //true
        System.out.println(obj.map == clonedObj.map);     //true
    }

}