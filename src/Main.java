import java.time.LocalDate;

class Homework {
    public static void printYearLeap(int yearLeap) {
        System.out.println(yearLeap + " - это високосный год");
    }

    public static void printNoYearLeap(int yearNoLeap) {
        System.out.println(yearNoLeap + " - это не високосный год");
    }

    public static void main(String[] args) {

        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printYearLeap(year);
        } else {
            printNoYearLeap(year);
        }
    }
}
