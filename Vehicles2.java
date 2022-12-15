

package abstraction;

import java.util.Scanner;

abstract class vehicle2{
    abstract void get();
    abstract void show();
}
class Car2 extends vehicle2{
    Scanner in =new Scanner(System.in);
    private long cost;
    private String name;
    @Override
    void get() {
        System.out.println("Enter the car Name : ");
        name=in.nextLine();
        System.out.println("Enter the Car Price : ");
        cost = in.nextLong();
    }

    @Override
    void show() {
        System.out.println("name of the car : " +name);
        System.out.println("Price of the car : " + cost);
    }
}
class Bike2 extends vehicle2{

    Scanner in = new Scanner(System.in);
    private long cost;
    private String name;

    @Override
    void get() {
        System.out.println("Enter the Bike name : " );
        name=in.nextLine();
        System.out.println("Enter the Bike Price : ");
        cost= in.nextLong();
    }

    @Override
    void show() {
        System.out.println("The Bike Name is : " + name);
        System.out.println("The Bike Price is : " + cost);
    }
}



public class Vehicles2
{
    public static void main(String[] args) {
         Bike2 b = new Bike2();
         b.get();
         b.show();
    }
}