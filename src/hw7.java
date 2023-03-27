import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Какая у вас операционная система: 0) iOS 1) Android");
        int clientOS = input.nextInt();
        System.out.println("В каком году выпущен ваш телефон?");
        int clientDeviceYear = input.nextInt();

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по сслыке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (clientOS == 1 & clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по сслыке");
        } else {
            System.out.println("Неправильный ввод");
        }


        System.out.println("\nЗадание 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " - високосный год");
        }else {
            System.out.println(year + " - не високосный год");
        }
    }
}
