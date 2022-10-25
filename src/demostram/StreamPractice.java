package demostram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(6);
        list.add(5);
        list.add(1);
        List<Integer> listodd=new ArrayList<>();
        for(Integer i:list){
            if(i%2==1){
                listodd.add(i);

            }
        }
        System.out.println(list);
        System.out.println(listodd);
        //Stream api
        Stream<Integer> stream =list.stream();
        List<Integer> newList= stream.filter(i ->i%2==0).collect(Collectors.toList());
        System.out.println("Stream api: "+newList);

    }


}
