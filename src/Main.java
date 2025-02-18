import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       double pi = 3.14159;
       double a,b,c, area_tri,area_tra,area_qua,area_ret,area_cir;
       a = sc.nextDouble();
       b = sc.nextDouble();
       c = sc.nextDouble();

       area_tri = (a*c)/2;
       area_cir = pi*(Math.pow(c,2));
       area_tra = ((a+b)*c)/2;
       area_qua = b*b;
       area_ret = a*b;

       System.out.printf("TRIANGULO: %.3f%n",area_tri);
       System.out.printf("CIRCULO: %.3f%n", area_cir);
       System.out.printf("TRAPEZIO: %.3f%n", area_tra);
       System.out.printf("QUADRADO: %.3f%n", area_qua);
       System.out.printf("RETANGULO: %.3f%n", area_ret);

       sc.close();
    }
}