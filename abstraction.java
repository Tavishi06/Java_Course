abstract class payment{

    abstract void pay();
}

class upi extends payment{

    @Override

    void pay(){

        System.out.print("Payment made by UPI ");
    }
}

class cash extends payment{

    @Override

    void pay(){

        System.out.print("Payment made by Cash ");
    }
}

class card extends payment{

    @Override

    void pay(){

        System.out.print("Payment made by Card ");
    }
}

public class abstraction{

    public static void main(String[] args){

        payment p;

        p = new upi();
        p.pay();

        p = new card();
        p.pay();

        p = new cash();
        p.pay();

    }
    
}