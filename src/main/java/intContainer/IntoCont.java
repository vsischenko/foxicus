package intContainer;

public class IntoCont {

    public  int arr[] = new int[0];

    private int arraySize = 0;


    public IntoCont(int a) {

        this.arr = new int [a];
        this.arraySize = a;
    }

    public  int[] getArr() {
        return this.arr;
    }

    public  int getArraySize() {
        return this.arraySize;
    }

    public  void setArr(int[] arra) {
        this.arr = arra;
    }

    public  void add (int a) {

        int narray [] =new int [getArraySize()+1];

        narray[narray.length-1] = a;

        for (int j=0; j<narray.length-1; j++) {

           narray[j]=getArr()[j];
        }
arraySize=arraySize+1;

        setArr(narray);
    }




}




