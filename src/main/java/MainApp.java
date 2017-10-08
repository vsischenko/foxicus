import java.util.*;

/**
 * Created by fox on 19.09.17.
 */
public class MainApp {
    public static void main(String[] args) {
        ArrayList<Students> studentBD = new ArrayList();

        studentBD.add(new Students("Персианов", "Алексей", "АС-001", 1982));
        studentBD.add(new Students("Персианов", "Григорий", "АС-099", 1980));
        studentBD.add(new Students("Ищенко", "Виталий", "МТ-991", 1982));
        studentBD.add(new Students("Варламов", "Евгений", "МТ-091", 1979));
        studentBD.add(new Students("Персианова", "Татьяна", "МТ-991", 1982));
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
                    "6. Просмотр групп\n" +
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

            } else if (chouse == 0) {
                System.out.println("Пока! \n");
                break;
            } else if (chouse == 3) {
                chouse = 0;
                System.out.println("Сделайте свой выбор сортировки:\n 1. А-Я \n 2. Я-А");
                chouse = scanner.nextInt();
                if (chouse == 1) {
                    PrintStudents.PrinterA(studentBD, 1);
                } else if (chouse == 2) {
                    PrintStudents.PrinterA(studentBD, 2);
                } else {
                    System.out.println("Ошибка");
                }


            } else if (chouse == 2) {
                System.out.println("Напишите фамилию студента, которого требуется удалить");
                String studentNameFromInput = scanner.next();
                findAndDeliteStudent(studentNameFromInput, studentBD);
            } else {
                System.out.println("Неверный ввод, выберете 1-6 /n  ____");
            }

        } while (chouse != 0);
    }

    private static ArrayList findAndDeliteStudent(String studentNameFromInput,
                                                  ArrayList<Students> studentBD) {
        //Делаем поиск всех студентов по введенной фамилии и выводим на экран.
        // Студенты имеют номера. Предлагаем удалить, выбрав номер.
        // Пишем вы уверены? Удаляем. Возвращаем новый Арэйлист без студента.
        ArrayList<Students> searchResultStudents = new ArrayList();
        ArrayList searchResultIndex = new ArrayList();

        for (int i = 0; i < studentBD.size(); i++) {
            if (studentBD.get(i).getFirstName().equals(studentNameFromInput)) {
                searchResultStudents.add(studentBD.get(i));
                searchResultIndex.add(i);
            }
        }

        if (searchResultStudents.size() > 0) {
            System.out.println("Найдено " + searchResultStudents.size() + " студентов " +
                    "по фамилии " + studentNameFromInput+":");
            for (int i=0; i<searchResultStudents.size();i++) {
                System.out.println((i+1)+". "+searchResultStudents.get(i).getFirstName()+" "+searchResultStudents.get(i).getLastName().substring(0,1)+".");
            }
            System.out.println("Выберете номер студента для удаления 1-"+searchResultStudents.size());
            int choose=0;
            Scanner scanner = new Scanner(System.in);
            choose=scanner.nextInt();
            if (choose<1||choose>searchResultStudents.size()){
                System.out.println("Выбор неверный. Повторите выбор");} else {
                choose=choose-1;
                int index =0;
                index= (int) searchResultIndex.get(choose);
                String tempNameOfStudent = studentBD.get(index).getFirstName()+" "+studentBD.get(index).getLastName();
                studentBD.remove(index);
                System.out.println("\n Студент "+tempNameOfStudent+ " удален!");
            }


        } else {
            System.out.println("Не найдено ни одного студента по имени " + studentNameFromInput);
        }

        return studentBD;
    }


}
