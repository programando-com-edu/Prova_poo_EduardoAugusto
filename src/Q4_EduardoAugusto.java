import java.util.Scanner;

public class Q4_EduardoAugusto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
  
        System.out.print("Digite uma string: ");
        String str = entrada.nextLine();
  
        String[] tokens = str.split(" ");
  
        System.out.print("Tokens que começam com a letra \"s\": ");
        for (String token : tokens) {
           if (token.startsWith("s")) {
              System.out.print(token + " ");
           }
        }
  
        entrada.close();
     }
}
