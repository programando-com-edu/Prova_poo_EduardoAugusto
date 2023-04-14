import java.util.Scanner;

public class Q1_EduardoAugusto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
  
        int num1, num2, soma;
  
        System.out.print("Digite o primeiro número inteiro: ");
        num1 = entrada.nextInt();
  
        System.out.print("Digite o segundo número inteiro: ");
        num2 = entrada.nextInt();
  
        soma = num1 + num2;
  
        System.out.println("A soma dos dois números é: " + soma);
  
        entrada.close();
     }
}
