import java.util.ArrayList;

public class RetrieveSpecifiedElement {
    public static Integer solution(ArrayList<Integer> arrList, int elm) {
        if (arrList.isEmpty())
            return 0;
        if (elm >= arrList.size() || elm < 0)
            return 0;
        return arrList.get(elm);
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(8);
        test.add(9);
        test.add(10);

        System.out.println(solution(test, 5));
    }
}
