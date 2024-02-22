import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("task1");
        int year = 2024;
        getLeapYear(year);
//task2
        System.out.println("task2");
        byte clientOS = 1;
        int clientDeviceYear = 2022;
        getUpdatePhone(clientOS, clientDeviceYear);
//task3
        System.out.println("task3");
        int deliveryDistance = 99;
        deliveryTime(deliveryDistance);
    }

    public static void getLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year >= 1584) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void getUpdatePhone(byte clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приолжения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию для Android по ссылке");
        }
    }

    public static void deliveryTime(int deliveryDistance) {
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + time);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (time + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (time + 2));
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
}