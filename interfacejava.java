// interface sports{
//     void play();
// }

// interface music{
//     void sing();
// }

// class student implements sports , music{

//     @Override
//     public void play(){
//         System.out.print("Student plays Cricket");
//     }

//     @Override
//     public void sing(){
//         System.out.print("Student sings Lofi");
//     }
// }

// public class interfacejava {

//     public static void main(String[] args) {

//         student s = new student();

//         s.play();
//         s.sing();
//     }
// }

interface payment{
    int max_amt = 100000;

    void pay(double amount);

    default void receipt(){
        System.out.println("Receipt generated");
    }

    static void bankinfo(){
        System.out.println("Payment processes successfully");
    }
}

class upi implements payment{

    @Override
    public void pay(double amount){

        if(amount <= max_amt){
            System.out.println("Paid $" +amount+ " using UPI");
        }
        else{
            System.out.println("Amount exceeds UPI limit");
        }
    }
}

public class interfacejava{
    public static void main(String[] args){

        upi Upi = new upi();
        Upi.pay(1000);
        Upi.receipt();
        payment.bankinfo();

        System.out.println("Maximum amount : $" +payment.max_amt);
    }
}