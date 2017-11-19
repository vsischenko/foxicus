package animals;

import static java.awt.Color.yellow;

public class mainAnimal {
    public static void main(String[] args) {


        VildAnimal lion = new VildAnimal(true, 1, 20, 40.5, "yellow");
        System.out.println(lion.toLoud());


        Pet dog = new Dog(2, 5, 20, "braun", "dingo", false, true);

        System.out.println(dog.toLoud());


    }
}
