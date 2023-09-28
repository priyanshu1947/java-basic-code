import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.plaf.PanelUI;
import java.sql.SQLOutput;

abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("YOU ARE CREATING A NEW ANIMAL");
    }
    public void eats(){
        System.out.println("Animals eats");
    }

    }

    class Horse extends Animal {
    Horse()
    {
        System.out.println("craeted a horse");
    }
        public void walk() {

                System.out.println("walk on four leg");

            }
        }

        class Chicken extends Animal {
            public void walk() {
                System.out.println("walks on two leg");
            }

        }





public class OOPS2
{
    public static void main(String[] args) {
        Horse horse = new Horse();
        //Chicken chicken = new Chicken();
        // Animal animal = new Animal();
        //chicken.walk();
        //chicken.eats();
    }
}
