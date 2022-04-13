import java.util.Scanner;
import java.util.Random;

public class Ex1 { 

    static public void main(String [] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            Random operador = new Random();
            System.out.println("Quantos sorteios voce deseja");
            int n = leitor.nextInt();
            for (int i = 1; i <= n; ++i){
                int d1 = operador.nextInt(6) + 1;
                int d2 = operador.nextInt(6) + 1;
                if (d1 > d2) {
                    System.out.printf("%d %c %d\n", d1, '<', d2);
                }
                else if (d1 == d2) {
                    System.out.printf("%d %c %d\n", d1, '=', d2);
                }
                else {
                    System.out.printf("%d %c %d\n", d1, '>', d2);
                }
            }
        }
    }
}
