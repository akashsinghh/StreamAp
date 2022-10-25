package optionalJava8;

import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        String s="Akash is my favourite boy";
        Optional optional= Optional.ofNullable(s);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("Not is present"));

//        if (s==null){
//            System.out.println("This is null object ");
//        }else {
//            System.out.println(s.length());
//        }
    }
}
