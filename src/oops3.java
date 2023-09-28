interface Animals{
    int eyes=2;
    void walk();

}
interface Herbivore
{

}

class Horses implements Animals,Herbivore{
    public void walk()
    {
        System.out.println("walks om 4 leg");
    }
}







public class oops3
{
    public static void main(String[] args) {
Horses horse = new Horses();
horse.walk();
    }
}
