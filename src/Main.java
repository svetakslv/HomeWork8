import java.time.LocalDate;

class Homework {
    public static void printYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - это високосный год");
        } else {
            System.out.println(year + " - это не високосный год");

        }
    }

    public static int getClientOS(int clientOS, int currentYear) {
        if (currentYear < 2022) {
            System.out.println("Установите облегченную версию приложения по ссылке.");
        } else {
            if (clientOS == 0) {
                System.out.println("Приложение будет работать корректно для iOS.");
                return 0;
            } else {
                if (clientOS == 1) {
                    System.out.println("Приложение будет работать корректно для Android.");
                }
                return 1;
            }
        }
        return clientOS;
    }

    public static int getDeliveryDays(int deliveryDays, int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
            if (deliveryDistance >= 60) {
                deliveryDays++;
                System.out.println("Потребуется дней: " + deliveryDays);
            }
            return deliveryDays;
        }
        return deliveryDays;
    }

    ///Данные для задачи №1
    public static void main(String[] args) {
        int year = 1900;
        printYearLeap(year);


        ///Данные для задачи №2
        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        getClientOS(clientOS, currentYear);


        ///Данные для задачи №3
        int deliveryDistance = 10;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            }
            if (deliveryDistance >= 60) {
                deliveryDays++;
            }
            getDeliveryDays(deliveryDays, deliveryDistance);
        }
    }














