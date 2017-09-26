import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class PrintStudents implements Comparable {


    static void PrinterA(ArrayList<Students> db, int chouse) {
        if (chouse == 1) {

            if (db.size()==0){
                System.out.println("В базе нет студентов \n");
            } else {


                //  db.add(new Students("Ищенко", "Виталий", "МТ-991", 1982));
                //  db.add(new Students("Абраменко", "Сергей", "МТ-991", 1981));
                //  db.add(new Students("Абраменко", "Андриан", "МТ-991", 1981));

                Collections.sort(db, new Comparator<Students>() {
                    public int compare(Students o1, Students o2) {

                        return (o1.getFirstName().toString() + o1.getLastName()).compareTo((o2.getFirstName().toString() + o2.getLastName()));
                    }
                });


                System.out.println("\n Отсортированный список А-Я выглядит так:");
                for (int i = 0; i < db.size(); i++) {
                    System.out.println(db.get(i).getFirstName() + " " + db.get(i).getLastName());
                }




            }


        } else if (chouse == 2) {
           // db.add(new Students("Ищенко", "Виталий", "МТ-991", 1982));
          //  db.add(new Students("Абраменко", "Сергей", "МТ-991", 1981));
          //  db.add(new Students("Абраменко", "Андриан", "МТ-991", 1981));

            Collections.sort(db, new Comparator<Students>() {
                public int compare(Students o1, Students o2) {

                    return (o2.getFirstName().toString() + o2.getLastName()).compareTo((o1.getFirstName().toString() + o1.getLastName()));
                }
            });


            System.out.println("\n Отсортированный список Я-А выглядит так:");
            for (int i = 0; i < db.size(); i++) {
                System.out.println(db.get(i).getFirstName() + " " + db.get(i).getLastName());
            }
        } else {
            System.out.println("Сорян, чувак, нет такого выбора...");
        }

    }

}
