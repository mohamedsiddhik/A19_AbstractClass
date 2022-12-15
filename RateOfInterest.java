
package abstraction;

abstract class Loan{
    abstract int Interest();
}
class IOB extends Loan{
    int Interest(){
        return  10;
    }
}
class BOB extends Loan{
    int Interest(){
        return  9;
    }
}
class SBI extends Loan{
    int Interest(){
        return 8;
    }
}

class IDBC extends  Loan{
    int Interest(){
        return 11;
    }
}
public class RateOfInterest
{

    public static void main(String[] args) {
        Loan loan;
        loan =new IOB();
        System.out.println("\n Rate of interest of Indian overseas Bank " + loan.Interest() + " % ");
        loan =new BOB();
        System.out.println("\n Rate of interest of Bank of Baroda " + loan.Interest() + " % ");
        loan =new SBI();
        System.out.println("\n Rate of interest of State Bank of India " + loan.Interest() + " % ");
        loan =new IDBC();
        System.out.println("\n Rate of interest of IDBC " + loan.Interest() + " % ");
    }
}
