package animals;

public class VildAnimal extends Animal {
    boolean predator = false;





    public VildAnimal(boolean predator, int id, int age, double weight, String color) {
        super(id, age, weight, color);
        this.predator = predator;
    }

    public boolean isPredator () {
        if (this.predator) {return true;} else {return false;}

    }

    public String toLoud () {
        if (!isPredator()) {
        return (super.toLoud()+"I am a wild animal");}
     return (super.toLoud()+"I am a wild animal, and I am angry");
    }
}
