import java.util.ArrayList;
import java.util.List;

public class AddListToList {
    public static void main(String[] args){
        List<Integer> newArrayList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        newArrayList = addListToAnotherList(list1,list2,2);
        System.out.println(newArrayList);
        System.out.println(addListToAnotherList(list1,list2,6));
    }

    private static List<Integer> addListToAnotherList(List<Integer> firstList, List<Integer> secondList, int position) {
        List<Integer> result = new ArrayList<>(firstList);
        if (result.size() < position){
            result.addAll(secondList);
        } else {
            result.addAll(position,secondList);
        }
        return result;
    }
}
