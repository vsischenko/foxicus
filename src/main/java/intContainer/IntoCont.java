package intContainer;

import javax.management.RuntimeErrorException;

public class IntoCont {

    private int arr[] = new int[0];
    private int arraySize = 0;

    public IntoCont() {

        this.arr = new int[0];
        this.arraySize = 0;
    }

    public int[] getArr() {
        return this.arr;
    }

    public int getArraySize() {
        return this.arraySize;
    }

    public void setArr(int[] arra) {
        this.arr = arra;
        setArraySize(arra.length);
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    //Добавить 1 элемент в массив

    public void add(int a) {

        int narray[] = new int[getArraySize() + 1];

        narray[narray.length - 1] = a;

        for (int j = 0; j < narray.length - 1; j++) {

            narray[j] = getArr()[j];
        }
        setArraySize(narray.length);

        setArr(narray);
    }

    //Вывести массив на экран

    public void print() {
        System.out.println("В контейнере сейчас " + getArraySize() + " эл.");
        for (int i = 0; i < getArraySize(); i++) {
            System.out.println("Элемент № " + i + " = " + getArr()[i]);
        }
    }

    //Достать элемент по индексу
    public int getByIndex(int index) {
        if (index < 0 || index >= getArraySize()) {
            throw new ArrayIndexOutOfBoundsException("Такого индекса нет в контэйнере");
        } else {
            return getArr()[index];
        }

    }

    //Проверить наличие такого числа в массиве

    public boolean isAnybodyHere(int number) {

        for (int i = 0; i < getArraySize(); i++) {
            if (getArr()[i] == number) {
                return true;
            }
        }
        return false;
    }

    //Добавить все из другого массива
    public void addAll(int[] arr) {
        int[] summuryArray = new int[getArraySize() + arr.length];
        for (int i = 0; i < getArraySize(); i++) {
            summuryArray[i] = getArr()[i];
        }
        int j = 0;
        for (int i = getArraySize(); i < getArraySize() + arr.length; i++) {

            summuryArray[i] = arr[j];
            j++;
        }
        setArraySize(getArraySize() + arr.length);
        setArr(summuryArray);
    }

    //Проверить на равенство
    public boolean isClone(int[] arr) {
        if (arr.length != getArraySize()) {
            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != getArr()[i]) {
                    return false;
                }
            }
        }

        return true;


    }

    //Очистить контэйнер
    public void clear() {
        int[] arr = new int[0];
        setArr(arr);
        setArraySize(0);
    }

    //Найти индексы элементов
    public void findIndex(int element) {
        IntoCont cont = new IntoCont();

        for (int i = 0; i < getArraySize(); i++) {
            if (getArr()[i] == element) {
                cont.add(i);
            }

        }
        System.out.println("Результат поиска числа " + element + " :");
        cont.print();
    }

    //Сортировка
    public void sort() {
        int[] tempArr = new int[getArraySize()];

        for (int i = 0; i < getArraySize(); i++) {
            tempArr[i] = getArr()[i];
        }


        for (int i = 0; i < tempArr.length-1; i++) {
            int temp = 0;
            for (int j = 0; j < tempArr.length-i; j++) {
                if (tempArr[i] > tempArr[i + j]) {
                    temp = tempArr[i];
                    tempArr[i] = tempArr[i + j];
                    tempArr[i + j] = temp;
                }
            }
        }
        setArr(tempArr);

    }

}




