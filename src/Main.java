public class Main {



public static void printIsLeapYear(int year){
    boolean yearIsLeap=isLeap(year);
    printIsLeapYearResult(year, yearIsLeap);
}
    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 && year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }


    public static boolean IsDeviceOld(int deviceYear) {
        return deviceYear >= 2012;
    }

    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = IsDeviceOld(deviceYear);
        System.out.println(" Установите ");
        if (deviceIsOld) {
            System.out.println("lite");
        }
        System.out.println("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else System.out.println("Android");
    }


    public static void calculateDeliveryDays(int deliveryDistance) {

        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        } else {
            System.out.println("Невозможно рассчитать срок доставки");
        }

        System.out.println("Потребуется дня :" + result);
    }


    public static void main(String[] args) {
        System.out.println("Task 1");
        printIsLeapYear(2022);


        System.out.println("Task 2");
        recommendApplicationVersion(1, 2015);
        System.out.println("Task 3 ");

        calculateDeliveryDays(76);


    }


}



