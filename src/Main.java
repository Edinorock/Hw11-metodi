import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        System.out.println("Задание 1");
        year = 2021;
        year();
        System.out.println("Задание 2");
        phone();
        System.out.println("Задание 3");
        deliveryDistance = 90;
        bankcardDelivery();

    }

    public static int year;

    public static int deliveryDistance;

    public static void year() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный");}
        else {System.out.println( year + " не високосный");}
    }

    public static void phone() {
        int newClientOS = 1;
        int clientDeviceYear = 2010;
        boolean newAndroidVersion = (newClientOS == 1 && clientDeviceYear >= 2015);
        if (newAndroidVersion) {
            System.out.println("Установите приложение на Android");
        } else if (newClientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченное приложение на Android");
        }
        if (newClientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение на iOS");
        }
        if (newClientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченное приложение на iOS");

        }
    }

    public static void bankcardDelivery() {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день доставки");
        }
        if (deliveryDistance >=20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 суток доставки");
        }
        if (deliveryDistance >=60 && deliveryDistance <=100) {
            System.out.println("Потребуется 3 суток доставки");
        }
    }
}