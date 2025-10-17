package a;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой год вы хотите проверить?");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        
        if (!isLeapYear) {
            System.out.println("Согласно григорианскому календарю, этот год - не високосный!");
        } else {
            System.out.println("Согласно григорианскому календарю, этот год - високосный!");
        }
    }
}