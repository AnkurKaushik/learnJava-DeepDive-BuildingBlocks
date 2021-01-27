public class accessSpecifiers extends protectedAccessSpecifiers{
    public static void main(String[] args){
        System.out.println("Default Access Specifier");

        learnModifiers obj = new learnModifiers();
        obj.display();

        System.out.println("Private Access Specifier");
        privateAccessSpecifiers obj2 = new privateAccessSpecifiers();
        //obj2.display() won't work tho
        System.out.println("Protected Access Specifier");
        protectedAccessSpecifiers obj3 = new protectedAccessSpecifiers();
        obj3.display();
    }

}
