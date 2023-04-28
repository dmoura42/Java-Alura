import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);
        Scanner leitura = new Scanner(System.in);
        int jogadas = 5;

        System.out.println("""
                Vamos jogar o jogo da adivinhação?
                Você terá 5 chances de acertar o número gerado pelo computador.
                Boa sorte!
                """);

        while (jogadas > 0) {
            System.out.println("Escolha um número de 1 a 100: ");
            int numeroEscolhido = leitura.nextInt();
            if (numeroEscolhido == numeroAleatorio) {
                System.out.println("Acertou! O numero sorteado era " + numeroAleatorio);
                break;
            } else if (numeroEscolhido < numeroAleatorio) {
                System.out.println("O numero sorteado é maior que o escolhido.");
            } else {
                System.out.println("O numero sorteado é menor que o escolhido.");
            }
            jogadas--;
        }


    }
}
