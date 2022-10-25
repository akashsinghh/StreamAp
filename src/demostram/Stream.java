package demostram;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
       List<Integer> listt=List.of(1,5,5,58,20);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        List<Integer> listeven=new ArrayList<>();
        for(Integer i:list){
            if(i%2==0){
                listeven.add(i);
            }
        }
        System.out.println(list);
        System.out.println(listeven);

        //stream api
       //Stream<Integer>

    }
}
