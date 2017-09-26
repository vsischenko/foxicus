import java.util.*;

/**
 * Created by fox on 19.09.17.
 */
public class MainApp {
    public static void main(String[] args) {
        ArrayList<Students> studentBD = new ArrayList();

        System.out.println("Приветствую, дорогой друг!");

        Scanner scanner = new Scanner(System.in);
        int chouse;



do {
    System.out.println("---***---\n Ты можешь: \n" +
        "1. Добавить студента.\n" +
        "2. Удалить студента по фамилии\n" +
        "3. Просмотреть список студентов\n" +
        "4. Перевести из группы в группу\n" +
        "5. Поиск студента\n" +
        "6. Просмотр групп\n"+
        "0. Выход \n");


    chouse = scanner.nextInt();

    if (chouse == 1) {

        String fN = "";
        String lN = "";
        String gr = "";
        int age;
        System.out.println("Введите Фамилию студента");
        fN = scanner.next();
        System.out.println("Введите Имя студента");
        lN = scanner.next();
        System.out.println("Введите Дату рождения студента");
        age = scanner.nextInt();
        System.out.println("Введите Группу");
        gr = scanner.next();
        System.out.println("Все параметры введены, студент добавлен в базу");

        Students tempstudent = new Students(fN, lN, gr, age);

        studentBD.add(tempstudent);
        System.out.println("Продолжить?");

    } else if (chouse==0){
        System.out.println("Пока! \n");break;}

        else if (chouse==3){
        chouse=0;
        System.out.println("Сделайте свой выбор сортировки:\n 1. А-Я \n 2. Я-А");
        chouse=scanner.nextInt();
        if (chouse==1) {
            PrintStudents.PrinterA(studentBD,1);
        } else if (chouse==2) {
            PrintStudents.PrinterA(studentBD,2);
        }else {
            System.out.println("Ошибка");}


    }

        else {
        System.out.println("Неверный ввод, выберете 1-6 /n  ____");
    }

} while (chouse !=0);
    }




}
