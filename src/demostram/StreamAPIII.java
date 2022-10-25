package demostram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIII {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1,5,5,58,20);//immutable list
        List<Integer> list2= new ArrayList<>();//mutable
        list2.add(0);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(2);
        //without Stream
        List<Integer> listEven=new ArrayList<>();
        for(Integer i:list1){
            if(i%2==0){
               listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        //stream api
        Stream<Integer> stream =list1.stream();
        List<Integer> newList=stream.filter(i ->i%2==0).collect(Collectors.toList());
        System.out.println("Steam api:::::  "+newList);
       List<Integer> newList1= list1.stream().filter(i ->i>5).collect(Collectors.toList());
        System.out.println("hey"+newList1);



    }
}
