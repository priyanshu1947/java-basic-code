class Shape
{
    String color;
}

class Triangle extends Shape{

}

class Shape1
{
    public void area()
    {
        System.out.println("display area");
    }
}

class Triangle1 extends Shape1{
    public void area1(int l, int h)
    {
        System.out.println(1/2*l*h);
    }
}

class equilateralTriangle extends Triangle{
    public void area(int l, int h)
    {
        System.out.println(1/2*l*h);
    }

}

class Circle extends Shape{
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
}







public class OOPS1
{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color= " red";
    }
}
