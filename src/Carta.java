/**
 * Created by johnv on 07/10/2017.
 */
public class Carta {

    private int numero;
    private String naipe;
    public boolean flgUsado;


    public Carta(int numero, String naipe){

        this.numero = numero;
        this.naipe = naipe;
        this.flgUsado = false;

    }

    public String getIdentificacao(){

        if(numero == 1)
            return "A";

        if(numero == 10)
            return "J";

        if(numero == 11)
            return "Q";

        if(numero == 12)
            return "K";

        return String.valueOf(this.numero);

    }

    public int getNumero(){

        if(numero > 10)
            return 10;

        return this.numero;

    }


    public String getNaipe(){

        return this.naipe;

    }





}
