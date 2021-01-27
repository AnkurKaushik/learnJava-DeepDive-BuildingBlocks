public class learnTypecasting {

    public static void main(String[] args)
    {
        System.out.println("Implicit Type Casting");
        char a = 'A';
        System.out.println("Value of a: "+a);

        int b = a;
        System.out.println("Value of a: "+b);
        float c = a;
        System.out.println("Value of a: "+c);

        long d = a;
        System.out.println("Value of a: "+d);

        double e = a;
        System.out.println("Value of a: "+e);

        //adding comments

        System.out.println("Explicit Type Casting");

        double x = 45.5;
        int y = (int) x;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
