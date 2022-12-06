

abstract class Fifa{
    void currentWC(){
        System.out.println("QATAR 2022");
    }
    abstract void cup();
    abstract void match();
    abstract void goal();
}
class Brazil extends Fifa{
    void cup(){
        System.out.println("Brazil won titles 2 times ");
    }
    void match(){
        System.out.println("110 matches played in WC");
    }
    void goal(){
        System.out.println("126 goals in WC");
    }
}

class Portugal extends Fifa{
    void cup(){
        System.out.println("No title win");
    }
    void match(){
        System.out.println("38 matches played in WC");
    }
    void goal(){
        System.out.println(52);
    }
    void starPlayer(){
        System.out.println("Cristiano Ronaldo alias CR7 and El-Bicho");
    }
}


public class AbstractFifa
{
    public static void main(String[] args) {
        Brazil BZ = new Brazil();
        BZ.currentWC();
        BZ.cup();
        BZ.match();
        BZ.goal();
        System.out.println("------------------------------");
        Portugal POR = new Portugal();
        POR.currentWC();
        POR.cup();
        POR.match();
        POR.goal();
        POR.starPlayer();
    }
}