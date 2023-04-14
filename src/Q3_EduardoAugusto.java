import java.util.Scanner;

public class Q3_EduardoAugusto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
  
        int n, soma = 0;
  
        System.out.print("Digite a quantidade de números a serem somados: ");
        n = entrada.nextInt();
  
        for (int i = 1; i <= n; i++) {
           System.out.print("Digite o " + i + "º número: ");
           soma += entrada.nextInt();
        }
  
        System.out.println("A soma dos " + n + " números é: " + soma);
  
        entrada.close();
     }
}
