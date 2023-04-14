import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Q5_EduardoAugusto {
    public static void main(String[] args) {
        try {
            ArrayList<String> palavrasComLink = buscaPalavras("./src/link.txt");
            System.out.println(palavrasComLink);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static ArrayList<String> buscaPalavras(String caminhoArquivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;
        ArrayList<String> palavrasComLink = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] palavras = linha.split(" ");
            for (String palavra : palavras) {
                if (palavra.contains("link")) {
                    palavrasComLink.add(palavra);
                }
            }
        }
        br.close();
        return palavrasComLink;
    }
}
