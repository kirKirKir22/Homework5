public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("Задача 1");

        int clientOS = 1;
        int iOs = 0;
        int android = 1;

        if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS != iOs || clientOS != android) {
            System.out.println("Обратитесь в поддержку)");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");

        int iOs = 0;
        int android = 1;
        int checkYear = 2015;

        int clientYear = 2016;
        int clientOS = 1;

        if (clientOS == iOs) {
            if (clientYear <= checkYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientYear > checkYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == android) {
            if (clientYear <= checkYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientYear > checkYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    private static void task3() {
        System.out.println("Задача 3");

        int year = 100;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 20;
        int deliveryDay = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryDay + " , срок доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (deliveryDay + 1) + " , срок доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (deliveryDay + 1) + " , срок доставки");
        } else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");

        int monthNumber = 3;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}






