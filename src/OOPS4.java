import javax.management.MBeanAttributeInfo;

class Student1
{
    String name;
    static String school;

   public static void changeschool() {
    school = "new school";
    }
}





public class OOPS4
{
    public static void main(String[] args) {
Student1.school = " ABC";
Student1 student1 = new Student1();
student1.name = " tony";
        System.out.println(student1.school);
    }
}
