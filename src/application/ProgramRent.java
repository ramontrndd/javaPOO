package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vector = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + ( i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt() - 1;
            vector[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vector[i] != null) {
                System.out.println((i + 1) + ": " + vector[i]);
            }
        }
        sc.close();
    }
}
