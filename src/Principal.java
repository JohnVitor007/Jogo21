import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada;
        int nPontosUsuario = 0, nPontoComputador = 0, i = 0;

        Baralho b = new Baralho();

        System.out.println("\tBEM VINDO AO JOGO 21 \u2660 \u2663 \u2665 \u2666");

        Carta c = null;

        do{

            do {

                c = b.lancarCarta();

            }while(c.flgUsado);

            c.flgUsado = true;

            nPontosUsuario += c.getNumero();

            System.out.print("\nPontos: "+ nPontosUsuario +"\nSua carta foi " + c.getNumero() + " de " + c.getNaipe());

            if(nPontosUsuario > 21) {
                System.out.println("\nTotal de pontos " + nPontosUsuario +
                        "\nVocê perdeu!");
                break;
            }

            System.out.print("\nDeseja continuar ? (S ou N):");


            entrada = sc.next();

            i++;

        }while(!(entrada.equals("N") || entrada.equals("n")));

        System.out.println("Vez do computador");

        do{

            if(nPontosUsuario > 21) {
                break;
            }

            do {

                c = b.lancarCarta();

            }while(c.flgUsado);

            c.flgUsado = true;

            nPontoComputador += c.getNumero();

        }while(nPontoComputador <= 21);

        System.out.println("\n\nResultado final: Computador = " + nPontoComputador + " Usuário = " + nPontosUsuario);





    }

}
