import java.util.ArrayList;

public class ArrayLList {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(23);
        list.add(23);
        list.add(3423);
        list.add(23);
        list.add(23);
        list.add(4323);
        list.add(23);
        list.add(4323);
        list.set(1,67);
        System.out.println(list);
    }
}
