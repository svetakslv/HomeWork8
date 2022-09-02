class Homework {
        public static void printYear(int yearLeap){
            System.out.println(yearLeap);

        }
        public static void main(String[] args) {
            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - не високосный год");
            }
        }
    }




///  public static void printTask2 ( int yearLeap){
///     System.out.println(yearLeap);


///   public static void printTask3 ( int yearLeap){
///     System.out.println(yearLeap);


          ///  public static void task2 () {

            ///    int OSClient = 1;
              ///  int clientDeviceYear = 2010;
              ///  if (OSClient == 0) {
              ///      if (clientDeviceYear >= 2015) {
                 ///       System.out.println("Установите облегченную версию приложения для iOS по ссылке");
               ///     } else {
                  ///      System.out.println("Приложение будет работать корректно на iOS");
             ///       }
             ///   } else {
                    ///      if (clientDeviceYear < 2015) {
                    ///      System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    ///   } else {
                    ///      System.out.println("Установите облегченную версию приложения для Android по ссылке");

                    ///       }
                    ///     }
                    ///    }
                    ///  public static void task3 () {
                    ///      int deliveryDistance = 95;
                    ///    int deliveryDays = 1;
                    ///    if (deliveryDistance > 20) {
                    ///       deliveryDays++;
                    ///    }
                    ///    if (deliveryDistance > 60) {
                    ///        deliveryDays++;
                    ///    }
                ///    System.out.println("Потребуется дней: " + deliveryDays);
                    ///    }
                    ///  }



