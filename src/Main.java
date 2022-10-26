import javax.swing.*;

public class Main {


public static void printIsLeapYear(int year){
    boolean yearIsLeap=isLeap(year);
    printIsLeapYearResult(year, yearIsLeap);
}
    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
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
        if (deviceIsOld && deviceYear<2022) {

            System.out.println("lite");}
            else if (deviceIsOld && deviceYear>2021) {
                System.out.println("обычную");

        }
        System.out.println("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else System.out.println("Android");
    }


    public static void calculateDeliveryDays(int deliveryDistance) {

        int results = 0;
        if (deliveryDistance > 0 && deliveryDistance<60) {
            results++;
        System.out.println("Потребуется дня :" + results);}
        else if (deliveryDistance > 60){
            results++;


        System.out.println("Невозможно рассчитать срок доставки");}}



    public static void main(String[] args) {
        System.out.println("Task 1");
        printIsLeapYear(2016);


        System.out.println("Task 2");
        recommendApplicationVersion(1, 2000);
        System.out.println("Task 3 ");

        calculateDeliveryDays(10);


    }


}



