//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке».");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");
        int year = 1984;
        if (year % 400 == 0) {
            System.out.printf("%d год является високосным \n", year);
        } else if (year % 100 == 0) {
            System.out.printf("%d год не является високосным \n", year);
        } else if (year % 4 == 0) {
            System.out.printf("%d год является високосным \n", year);
        } else {
            System.out.printf("%d год не является високосным \n", year);
        }

        System.out.println("Задача 4");
        int deliveryDistance = 195;
        if (deliveryDistance <= 20) {
            System.out.printf("Потребуется один день для доставки в пределах 20 км");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.printf("Потребуется два дня для доставки в пределах от 20 км до 60 км");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.printf("Потребуется три дня для доставки в пределах от 60 км до 100 км");
        }
        else {
            System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12,1,2:
                System.out.printf("%d Месяц прииналежит к сезону Зима", monthNumber);
                break;
            case 3,4,5:
                System.out.printf("%d Месяц прииналежит к сезону Весна", monthNumber);
                break;
            case 6,7,8:
                System.out.printf("%d Месяц прииналежит к сезону Лето", monthNumber);
                break;
            case 9,10,11:
                System.out.printf("%d Месяц прииналежит к сезону Осень", monthNumber);
                break;
            default:
                System.out.printf("Месяца с номером %d не существует", monthNumber);
        }
    }
}