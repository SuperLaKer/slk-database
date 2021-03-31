package aa.slkdatabase.jpa;

import java.util.ArrayList;
import java.util.Comparator;

public class Arr {

    public static void main(String[] args) {

        order();
    }

    public static void order() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(5);
        integers.add(1);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("ab1");
        strings.add("ca2");
        strings.add("bc3");

        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(2) - o1.charAt(2);  // 大于0降序，小于0升序
            }
        });
        System.out.println(strings);
    }

}
