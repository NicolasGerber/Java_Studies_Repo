package application;

import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar cottation?");
        double dollarCot = sc.nextDouble();

        System.out.println("How many dollar will by bought?");
        double dollarBuyAmount = sc.nextDouble();

        System.out.printf("Amount to be paid in Reais = %.2f",CurrencyConverter.converter(dollarCot,dollarBuyAmount));



        sc.close();
    }
}