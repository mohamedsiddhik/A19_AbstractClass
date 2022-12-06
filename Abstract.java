


abstract class  Member{
    abstract  void welcomeMessage();
}

class Student7 extends Member{
    @Override
    void welcomeMessage() {
        System.out.println("Hello Student...");
    }
}

class Teacher extends Member{
    @Override
    void welcomeMessage() {
        System.out.println("Hello Teacher...");
    }
}

public class Abstract
{
    public static void main(String[] args) {
        Student7 s1 = new Student7();  //object declared
        s1.welcomeMessage();           //calling method
        Teacher t1 = new Teacher();
        t1.welcomeMessage();

        Member m[] = new Member[5];  //creating an array
        m[0] = new Student7();
        m[1] = new Teacher();
        m[2] = new Student7();
        m[3] = new Teacher();
        m[4] = new Student7();

        for(Member m1 : m){
            m1.welcomeMessage();
        }


    }
}