package mumu;

import java.util.Arrays;

public class ContainerTest {
    public static void main(String[] args) {
        int capasity = 0;
        int arr[] = new int[capasity];
        String containerName = "My container";
        Container container1 = new Container(containerName, capasity, arr);

        container1.printContainer();
        System.out.println("добавим один элемент");
        container1.addEllement(0);
        container1.printContainer();
        System.out.println("добавим один элемент");
        container1.addEllement(0);
        container1.printContainer();
        System.out.println("удалим один элемент");
        container1.dellEllement(0);
        container1.printContainer();

    }
}

