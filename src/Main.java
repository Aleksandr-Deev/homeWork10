import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        // Домашнее задание 1.7 Стоки
        // Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        // Задание 2
        System.out.println();
        String fullNameUp = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUp);

        // Задание 3
        System.out.println();
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + newFullName);

    }
}