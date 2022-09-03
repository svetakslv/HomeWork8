import java.time.LocalDate;

class Homework {
    public static void printYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - это високосный год");
        } else {
            System.out.println(year + " - это не високосный год");

        }
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
                System.out.println(name + "система");
                return 0;
            } else {
                return 1;
            }
        }

        public static void main (String[]args){
            int year = 1900;
            printYearLeap(year);
        }
        String osName = "iOS";
        int currentYear = LocalDate.now().getYear();
        int clientOS = getClientOS(osName);
        }










