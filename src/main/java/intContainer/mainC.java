package intContainer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class mainC {
    public static void main(String[] args) {

        IntoCont container = new IntoCont();

        int[] newArr = {544, 15, 45,3,3,34,5,6,7,5,5,23};

        container.addAll(newArr);



     /*   for (int i = 0; i < tempArr.length-1; i++) {
            int temp = 0;
            for (int j = 0; j < tempArr.length-i; j++) {
                if (tempArr[i] > tempArr[i + j]) {
                    temp = tempArr[i];
                    tempArr[i] = tempArr[i + j];
                    tempArr[i + j] = temp;
                }
            }
        }*/



        container.print();
        container.sort();
        container.print();






    }


}
