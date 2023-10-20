package failfastvsfailsafe;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // creates array with initial capacity of 10.
        List<String> arrayList = new ArrayList<String>();

        arrayList.add("ind");
        arrayList.add("america");

        // fail-fast
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
            System.out.println(iterator.next());
        }

        // fail-fast
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
            System.out.println(listIterator.next());
        }


        // fail-fast
        Enumeration<String> listEnum = Collections.enumeration(arrayList);
        while (listEnum.hasMoreElements()) {
            arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
            System.out.println(listEnum.nextElement());
        }

        //enhanced for loop is fail-fast
        for (String string : arrayList) {
            arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
            System.out.println(string);
        }
    }

}
