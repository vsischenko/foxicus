package animals;

public class Dog extends Pet {
    boolean isTrained;

    public Dog(int id, int age, double weight, String color, String name, boolean isVactinated, boolean isTrained) {
        super(id, age, weight, color, name, isVactinated);
        this.isTrained = isTrained;
    }

    public String goHome() {
    if (isTrained) {return "Let's go! I take you home";}
    else { return "...";}
    }
}
