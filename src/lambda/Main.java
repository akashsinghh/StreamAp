package lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system is start: ");
//        Myinter myinter=new MyinterImpl();
//        myinter.hello();

        //annoymus fxn
        Myinter i=new Myinter() {
            @Override
            public void hello() {
                System.out.println("Hey akash yha kya ");
            }
        };
        i.hello();
        Myinter i2=new Myinter() {
            @Override
            public void hello() {
                System.out.println("Hey akash idr bi aagya tu");
            }
        };
        i2.hello();

        //lamba expression
        Myinter i3=()->{
            System.out.println("This is lamba fxn: ");

        };
        i3.hello();

        Suminterfacw suminterfacw=(int a,int b) ->{
            return a+b;
        };
        System.out.println(suminterfacw.sum(5,6));
    }
}
