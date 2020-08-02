package My12;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Pattern {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        //list.removeAll(Arrays.asList(2,4,6,8));
        System.out.println(list);

        list.retainAll(Arrays.asList(1));
        System.out.println(list);

        ArrayList<String> name = new ArrayList<>();

        name.addAll(Arrays.asList("Tur","Dag","Alov","Alov"));
       // name.removeAll(Arrays.asList("Tur"));
        System.out.println(name);

        //name.retainAll(Arrays.asList("Tur"));
       // System.out.println(name);


        boolean r = name.containsAll(Arrays.asList("Tur"));
        System.out.println(r);






    }
}
