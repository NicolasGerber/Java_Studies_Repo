import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int total_gas = 0;
        int total_alc = 0;
        int total_die = 0;

        int cod = sc.nextInt();
        while (cod !=4){
            switch (cod){
                case 1:
                    total_alc+=1;
                    break;
                case 2:
                    total_gas+=1;
                    break;
                case 3:
                    total_die+=1;
                    break;
                default:
                    System.out.printf("CODIGO INVALIDO!%n");

            }
        cod = sc.nextInt();

        }
        System.out.printf("MUITO OBRIGADO!%n");
        System.out.printf("ALCOOL : %d %n",total_alc);
        System.out.printf("GASOLINA : %d %n",total_gas);
        System.out.printf("DIESEL : %d %n",total_die);

        sc.close();
    }
}