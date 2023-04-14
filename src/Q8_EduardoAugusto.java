import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Q8_EduardoAugusto extends JFrame implements ActionListener {

    private JButton[] botoes;
    private JTextField textFieldTentativa;
    private JLabel labelResultado;

    private Random random;
    private int numeroAleatorio;
    private int tentativaAtual;
    private final int NUMERO_MAXIMO_TENTATIVAS = 5;

    public Q8_EduardoAugusto() {
        setTitle("Adivinhe o número");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Cria e adiciona os botões à janela
        JPanel panelBotoes = new JPanel(new GridLayout(1, 20));
        botoes = new JButton[20];
        for (int i = 0; i < botoes.length; i++) {
            botoes[i] = new JButton(String.valueOf(i + 1));
            botoes[i].addActionListener(this);
            panelBotoes.add(botoes[i]);
        }
        add(panelBotoes);

        // Cria e adiciona o campo de texto à janela
        JPanel panelTentativa = new JPanel(new FlowLayout());
        JLabel labelTentativa = new JLabel("Tentativa atual:");
        textFieldTentativa = new JTextField(2);
        textFieldTentativa.setEditable(false);
        panelTentativa.add(labelTentativa);
        panelTentativa.add(textFieldTentativa);
        add(panelTentativa);

        // Cria e adiciona o rótulo de resultado à janela
        JPanel panelResultado = new JPanel(new FlowLayout());
        labelResultado = new JLabel();
        panelResultado.add(labelResultado);
        add(panelResultado);

        // Inicializa as variáveis
        random = new Random();
        numeroAleatorio = random.nextInt(20) + 1;
        tentativaAtual = 1;
        textFieldTentativa.setText(String.valueOf(tentativaAtual));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Verifica se ainda há tentativas disponíveis
        if (tentativaAtual > NUMERO_MAXIMO_TENTATIVAS) {
            labelResultado.setText("Você excedeu o número máximo de tentativas! O número escolhido era o " + numeroAleatorio + ".");
            return;
        }

        // Verifica se o botão pressionado é o que contém o número aleatório
        JButton botaoClicado = (JButton) e.getSource();
        int numeroEscolhido = Integer.parseInt(botaoClicado.getText());
        if (numeroEscolhido == numeroAleatorio) {
            labelResultado.setText("Parabéns! Você acertou o número " + numeroAleatorio + " na tentativa " + tentativaAtual + ".");
        } else {
            labelResultado.setText("Você errou!");
        }

        // Atualiza o número da tentativa e o campo de texto correspondente
        tentativaAtual++;
        if (tentativaAtual <= NUMERO_MAXIMO_TENTATIVAS) {
            textFieldTentativa.setText(String.valueOf(tentativaAtual-1));
        }
    }

    public static void main(String[] args) {
        Q8_EduardoAugusto gui = new Q8_EduardoAugusto();
        gui.setVisible(true);
    }
}
