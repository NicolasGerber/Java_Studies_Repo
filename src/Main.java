import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       String product1 = "Computer";
       String product2 = "Office Desk";
       int age = 30;
       int code = 5290;
       char gender =  'F';
       double price1,price2,measure;
       price1 = 2100.0;
       price2 = 650.50;
       measure = 53.234567;

       System.out.printf("Products:%n%s, which price is $ %f%n%s, which price is $ %f%n",product1,price1,product2,price2);
       System.out.printf("%nRecord: %d years old, code %d and gender: %c%n",age,code,gender);
       System.out.printf("%nMeasure with eight decimal places: %.8f%n",measure);
       System.out.printf("Rounded (three decimal places): %.3f%n",measure);
       Locale.setDefault(Locale.US);
       System.out.printf("US decimal point: %.3f",measure);

    }
}