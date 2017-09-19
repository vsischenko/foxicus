import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by fox on 19.09.17.
 */
public class MainApp {
    public static void main(String[] args) {
        ArrayList<Students> studentBD = new ArrayList();

        System.out.println("Приветствую, дорогой друг!  Ты можешь: " +
                "1. Добавить студента.\n" +
                "2. Удалить студента по фамилии\n" +
                "3. Просмотреть список студентов\n" +
                "4. Перевести из группы в группу\n" +
                "5. Поиск студента\n" +
                "6. Просмотр групп\n");

        Scanner scanner = new Scanner(System.in);
        int chouse=0;



         if (scanner.hasNextInt(1)) {

            String fN="";
            String lN ="";
            String gr ="";
            int age;
            System.out.println("Введите Фамилию студента");
            fN=scanner.nextLine();
            System.out.println("Введите Имя студента");
            lN=scanner.nextLine();
            System.out.println("Введите Возраст студента");
            age=scanner.nextInt();
            System.out.println("Введите Группу");
            gr=scanner.nextLine();
            Students  tempstudent = new Students(fN, lN, gr, age);

            studentBD.add(tempstudent);

        } else {System.out.println("Неверный ввод, выберете 1-6 /n  ____");}


    }
}
