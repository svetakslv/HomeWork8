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
        if (clientOS == 0 && currentYear < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Приложение будет работать корректно для iOS.");
            if (clientOS == 1 && currentYear > 2022) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Приложение будет работать корректно для Android.");
            }
            return clientOS;
        }
        return clientOS;
    }

    public static void main(String[] args) {
        int year = 1900;
        printYearLeap(year);

        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        getClientOS(clientOS, currentYear);

    }
}










