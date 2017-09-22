import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class PrintStudents implements Comparable{


    static void PrinterA(ArrayList<Students> db, int chouse){
        if (chouse==1) {
db.add(new Students("Ищенко","Виталий", "МТ-991", 1982));
            db.add(new Students("Абраменко","Сергей", "МТ-991", 1981));

            System.out.println("Неотсортированный список выглядит так:");
            for (int i=0; i<db.size(); i++){
                System.out.println(db.get(i).getFirstName()+ " " + db.get(i).getLastName());
            }

            Collections.sort(db, new Comparator<Students>() {
                public int compare(Students o1, Students o2) {
                    return o1 - o2;
                }
            });


                System.out.println("Отсортированный выглядит так:");
                for (int i=0; i<db.size(); i++) {
                    System.out.println(db.get(i).getFirstName() + " " + db.get(i).getLastName());
                }


        } else if (chouse==2){}else {
            System.out.println("Сорян, чувак, нет такого выбора...");
        }

    }

}
