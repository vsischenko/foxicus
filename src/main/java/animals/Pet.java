package animals;

public class Pet extends Animal {
    String name;
    boolean isVactinated;


    public Pet(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String toLoud () {


        return (super.toLoud()+"My name is :"+name);
    }
}
