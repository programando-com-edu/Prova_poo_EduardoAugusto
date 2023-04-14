import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7_EduardoAugusto {
    public static void main(String[] args) {
        String nomeArquivo = "./src/numeros.txt";
        int soma = somarNumeros(nomeArquivo);
        System.out.println("A soma dos números é: " + soma);
    }

    public static int somarNumeros(String nomeArquivo) {
        int soma = 0;
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha = null;
            while ((linha = leitor.readLine()) != null) {
                String[] numeros = linha.split("[,\\s]+");
                for (String numeroStr : numeros) {
                    if (!numeroStr.isEmpty()) {
                        try {
                            int numero = Integer.parseInt(numeroStr.trim());
                            soma += numero;
                        } catch (NumberFormatException e) {
                            System.err.println("Erro ao converter número: " + e.getMessage());
                        }
                    }
                }
            }
            leitor.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return soma;
    }
}