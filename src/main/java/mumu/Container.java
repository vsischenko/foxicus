package mumu;
import java.util.Arrays;

public class Container  {
    String name = "defaultName";
    int capasity = 0;
    int[] array = new int[capasity];

    public void setName(String name) {
        this.name = name;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    public String getName() {
        return name;
    }

    public int getCapasity() {
        return capasity;
    }

    public Container(String name, int capasity, int[] array) {
        this.name = name;
        this.capasity = capasity;

        this.array = array;
    }

    public Container() {
    }

    public void printContainer() {
        System.out.println("Название контейнера - " + this.name);
        System.out.println("Возможная емкость контейнера - " + this.capasity);
        System.out.println("Содержимое контейнера - " + Arrays.toString(this.array));
        System.out.println();
    }

    public int[] addEllement(int element) {
        if (array.length == 0) {
            System.out.println("В контейнере нет элементов! Создаем первый элемент");
            int[] newArray = new int[1];
            newArray[0] = element;
            this.capasity = newArray.length;
            return array = newArray;
        }

        boolean containerIsFull = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                containerIsFull = false;
                array[i] = element;
                return array;
            } else if (i == array.length - 1 && containerIsFull == true) {
                int[] newArray = new int[array.length + 1];
                newArray[newArray.length - 1] = element;
                for (int j = 0; j < array.length; j++) {
                    newArray[j] = array[j];
                }
                this.capasity = newArray.length;
                array = newArray;
                break;
            }
        }
        this.capasity = array.length;
        return array;
    }

    public int[] dellEllement(int element) {
        if (array.length == 0) {
            System.out.println("В контейнере нет элементов!");
            return array;
        }
        int[] newArray = new int[array.length - element];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = array[j];
        }
        this.capasity = newArray.length;
        return array = newArray;
    }
}