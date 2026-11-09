package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;

public class Problems {
    static void reverselist(ArrayList<Integer>list){
        int i =0, j= list.size()-1;

        while (i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
                    j--;
        }
    }
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original list" + list);
        Collections.reverse(list);
     //   reverselist(list);
        System.out.println("reversed list" +list);
        Collections.sort(list);
        System.out.println("asending order"+ list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("desendind order"+ list);

        ArrayList<String>  s = new ArrayList<>();
        s.add("wellcome");
        s.add("tome");
        s.add("come");
        System.out.println("og" +s);
        Collections.sort(s);
        System.out.println("sort"+s);


    }
}
