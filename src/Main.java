public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание 1.

        int clientOS1 = 0;
        if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2.

        int clientOS2 = 0;
        int clientDeviceYear = 2014;
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");

        }

        //Задание 3.

        int year = 2020;
        if ((year % 400) == 0) {
            System.out.printf("%d год является високосным.\n", year);
        } else if (((year % 4) == 0) && ((year % 100) != 0)) {
            System.out.printf("%d год является високосным.\n", year);
        } else {
            System.out.printf("%d год не является високосным.\n", year);
        }

        //Задание 4.

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день.");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня.");
        } else {
            System.out.println("Доставки нет.");
        }

        //Задание 5.

        int monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12) {
            System.exit(0);
        }
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;


        }
    }
}




