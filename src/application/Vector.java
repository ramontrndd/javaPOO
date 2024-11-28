package application;



import entities.VectorProduct;

import java.util.Locale;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        VectorProduct[] vector = new VectorProduct[n];

        for(int i=0; i < vector.length; i++) {
          sc.nextLine();
          String name = sc.next();
            double price = sc.nextDouble();
            vector[i] = new VectorProduct(name, price);
        }

    double sum = 0.0;
        for(int i = 0; i < vector.length; i++) {
        sum += vector[i].getPrice();
    }
        double avg = sum / vector.length;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
