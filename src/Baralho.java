import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnv on 07/10/2017.
 */
public class Baralho {

    public List<Carta> cartas;

    public Baralho(){

        cartas = new ArrayList();

        Carta c;

        String naipes[] = {"Ouros", "Copas", "Paus", "Espadas"};

        for(String naipe : naipes){

            for(int i = 1; i<= 12; i++){

                c = new Carta(i, naipe);
                cartas.add(c);

            }

        }

    }

    public Carta lancarCarta(){


        Carta c = null;

        String identificacao = obterNumero(Math.random());
        String naipe = obterNaipe(Math.random());

        for(Carta carta : cartas) {

            if (carta.getIdentificacao().equals(identificacao) && carta.getNaipe().equals(naipe)) {
                c = carta;
            }

        }

        return c;

    }

    private String obterNumero(double numero){

        String nBuffer = "";

        numero *= 12;

        if(numero < 1)
            nBuffer = "A";
        else if(numero < 2)
            nBuffer = "2";
        else if(numero < 3)
            nBuffer = "3";
        else if(numero < 4)
            nBuffer = "4";
        else if(numero < 5)
            nBuffer = "5";
        else if(numero < 6)
            nBuffer = "6";
        else if(numero < 7)
            nBuffer = "7";
        else if(numero < 8)
            nBuffer = "8";
        else if(numero < 9)
            nBuffer = "9";
        else if(numero < 10)
            nBuffer = "J";
        else if(numero < 11)
            nBuffer = "Q";
        else if(numero < 12)
            nBuffer = "K";

        return nBuffer;

    }

    public String obterNaipe(double numero){

        String naipe = "";

        if(numero < 0.25)
            naipe = "Ouros";
        else if(numero < 0.5)
            naipe = "Paus";
        else if(numero < 0.75)
            naipe = "Espadas";
        else if(numero < 1)
            naipe = "Copas";

        return naipe;

    }




}
