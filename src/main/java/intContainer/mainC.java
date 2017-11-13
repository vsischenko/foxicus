package intContainer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class mainC {
    public static void main(String[] args) {

        IntoCont container = new IntoCont(1);

        container.add(3);
        container.add(5);
        container.add(8);

        System.out.println(container.getArraySize());

        for (int i = 0; i < container.getArraySize(); i++) {
            System.out.println(container.getArr()[i]);

        }




    }


}
