public class test {

    public static  int a;
    public  static  final int b;
    public  static  final  int c=3;

    static {
        System.out.println("first static blocks");
        a= 20;
    }

    static {
        System.out.println(" second static block");
        b = 10;
        a=21;
    }
    {
        System.out.println("Empty block of code");
    }
    public  test (){
        System.out.println("Constructor called");

    }

    public static void main(String[] args) {
         test testing = new test();
    }

}


