import java.util.Scanner;

class calculator{

    public void add(int a,int b){

        System.out.println("Addition of two int numbers is " + (a + b));

    }

    public void add(int a,int b,int c){

        System.out.println("Addition of three int numbers is " + (a + b + c));
    }

    public void add(double a,double b){

        System.out.print("Addition of two double numbers is " + (a + b));
    
    }
}

class animal{

    public void sound(){

        System.out.print("Animal makes sound");
        System.out.println();

    }
}

class dog extends animal{

    @Override
    public void sound(){

        System.out.print("Dog makes sound");
        System.out.println();

    }
}

class cat extends animal{

    @Override
    public void sound(){

        System.out.print("cat makes sound");
        System.out.println();

    }
}

class employee{

    public void calculateBonus(){

        System.out.print("Employee bonus");
        System.out.println();

    }
}

class manager extends employee{

    @Override
    public void calculateBonus(){

        System.out.print("Manager bonus");
        System.out.println();

    }
}

public class polymorphism{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first int number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second int number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third int number: ");
        int third = sc.nextInt();

        System.out.print("Enter the first double number: ");
        double d = sc.nextDouble();

        System.out.print("Enter the second double number: ");
        double e = sc.nextDouble();

        calculator calc = new calculator();
        calc.add(a, b);
        calc.add(a, b, third);
        calc.add(d, e);

        animal a1 = new animal();

        System.out.println();
        System.out.print("By defualt override - ");
        a1.sound();

        dog d1 = new dog();
        cat c1 = new cat();
        
        System.out.print("Function caliing - ");
        System.out.println();
        d1.sound();
        c1.sound();
        
        employee e1 = new employee();
        e1.calculateBonus();

        manager m1 = new manager();
        m1.calculateBonus();

        sc.close();
    }
}