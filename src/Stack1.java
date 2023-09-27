
import java.util.*;
public class Stack1
{
    public static void main(String[] args) {
        Stack <String>animals = new Stack<>();

        animals.push("Lion");
        animals.push("horse");
        animals.push("koo");


        System.out.println(animals);
        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals.peek());

    }
}
