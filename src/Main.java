class Homework {

    public static void main(String[] args) {
        // Здесь пишем код и вызываем другие методы

        // Здесь вызываем метод task1, который объявлен ниже
        task1();

        // А здесь вызываем метод task2, который тоже объявлен ниже
        task2();

        // А здесь вызываем метод task2, который тоже объявлен ниже
        task3();
    }

    // Внутри скобок класса пишем наш самописный метод, который будет выполнять определенную функцию
    //В данном случае он группирует в себе код по первой задаче ДЗ

    public static void task1() {
        // Здесь пишем код первого задания
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");
        }
    }

    // Внутри скобок класса пишем еще один самописный метод, который будет выполнять определенную функцию
    //В данном случае он группирует в себе код по второй задаче ДЗ
    public static void task2() {
        // Здесь пишем код второго задания
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
            } else{
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


