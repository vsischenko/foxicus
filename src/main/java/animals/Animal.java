package animals;

public class Animal {
    int id;
    int age;
    double weight;
    String color;



    public String toLoud() {
        return "Hallo! ";
    }
    public Animal(){}

   public Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
