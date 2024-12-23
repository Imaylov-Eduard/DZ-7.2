import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1");

        int year = 2021;
        checkLeapYear(year);
    }
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        System.out.println("Задача№2");

        int osType = 1;
        int clientDeviceYear = 2015;

        suggestAppVersion(osType, clientDeviceYear);
    }

    public static void suggestAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < currentYear) {
            if (osType == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (osType == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите обычное приложение для iOS по ссылке.");
            } else if (osType == 1) {
                System.out.println("Установите обычное приложение для Android по ссылке.");
            }
        }

        System.out.println("Задача№3");

        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}