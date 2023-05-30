public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
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

    private static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 110;

        int deliveryOneDay = 1;
        int deliveryTwoDay = 2;
        int deliveryThreeDay = 3;

        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryOneDay);
        }else if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней: " + deliveryTwoDay);
        }else if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребуется дней: " + deliveryThreeDay);
        }else if (deliveryDistance >100){
            System.out.println("доставки нет");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");

        int year = 200;

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год является НЕ високосным");
        } else{
            System.out.println(year + " год является НЕ високосным");
    }
}

    private static void task2() {
        System.out.println("Задача 2");

        int clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015 && clientOS == 0 ){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task1() {
        System.out.println("Задача 1");

        int clientOS = 0;

        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
}