
public class wrapper{
    
    public static void main(String[] args){

        int x = 10;
        Integer y = 20;
        Integer i = 10;
        System.out.println("int x: " + x);
        System.out.println("Integer y: " + y);
        System.out.println("Integer i: " + i);

        // boxing
        Integer z = x;

        // unboxing
        int a = y;

        System.out.println("Integer z: " + z);
        System.out.println("int a: " + a);

        //converting manually
        Integer b = Integer.valueOf(x);
        System.out.println("Integer b: " + b);

        //check equallity
        System.out.println("z.equals(i): " + z.equals(i));
    }
}