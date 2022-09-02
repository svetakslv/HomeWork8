public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");
        }
    }
    public static void task2() {

        int OSClient = 1;
        int clientDeviceYear = 2010;
        if (OSClient == 0) {
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Приложение будет работать корректно на iOS");
        }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3() {

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
            }
        }