import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;

class Pen
{
    String color;
    String type;

    public void write()
        {
    System.out.println("Writing something");
}

public void printcolor()
{
    System.out.println(this.color);
}

}
class Student
{
    String name;
    int age;

    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name,int age )
    {
        System.out.println(name +" "+age);
    }
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2)
    {
        this.name= s2.name;
        this.age= s2.age;
    }
    Student()
    {

    }
}


public class OOPS
{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name= "aman";
        s1.age= 24;

        //Student s2 = new Student(s1);
        s1.printInfo(s1.name,s1.age);
    }

}