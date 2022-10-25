package lambda;

import java.util.concurrent.Callable;

public class functional {
    public static void main(String[] args) {
//        System.out.println("My system" );
//        Myinter myinter=new MyinterImpl() ;
//        myinter.hello();
//        Myinter i=new Myinter() {
//            @Override
//            public void hello() {
//                System.out.println("This is first anyn class: ");
//            }
//        };
//        i.hello();
//        Myinter i2=new Myinter() {
//            @Override
//            public void hello() {
//                System.out.println("Hey this second class");
//            }
//        };
//        i2.hello();
//    }
        Myinter i = () -> System.out.println("THis is first lambdda");

        i.hello();
        Myinter i2 = () -> System.out.println("second");
        i2.hello();
        Suminterfacw suminterfacw = (a, b) -> a + b;
        System.out.println(suminterfacw.sum(4, 9));
//        Suminterfacw suminterfacw=(int a,int b) ->{
//            return a+b;
//
//        };
//        System.out.println(suminterfacw.sum(5,6));
//    }


    }


}
