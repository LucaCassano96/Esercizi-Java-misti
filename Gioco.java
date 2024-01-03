import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Gioco {

    // VARIABILI DI ISTANZA
    private String parolaDaIndovinare;
    private int numeroTentativiTotali;
    private int numeroTentativiFalliti;


    // GETTER E SETTER
    public String getParolaDaIndovinare() {
        return parolaDaIndovinare;
    }

    public void setParolaDaIndovinare(String parolaDaIndovinare) {
        this.parolaDaIndovinare = parolaDaIndovinare;
    }

    public int getNumeroTentativiTotali() {
        return numeroTentativiTotali;
    }

    public void setNumeroTentativiTotali(int numeroTentativiTotali) {
        this.numeroTentativiTotali = numeroTentativiTotali;
    }

    public int getNumeroTentativiFalliti() {
        return numeroTentativiFalliti;
    }

    public void setNumeroTentativiFalliti(int numeroTentativiFalliti) {
        this.numeroTentativiFalliti = numeroTentativiFalliti;
    }

    // METODI

    public void indovina () {


        char[] parolaDaIndovinareChars = parolaDaIndovinare.toCharArray();
        char[] parolaIncompleta = new char[parolaDaIndovinareChars.length];

        Arrays.fill( parolaIncompleta, '?' );

        numeroTentativiTotali = 0;

        while (true) {
            System.out.println( "inserisci una lettera" );
            Scanner scan = new Scanner( System.in );
            String lettera = scan.nextLine();
            char letteraChar = lettera.charAt( 0 );
            for (int i = 0; i < parolaDaIndovinareChars.length; i++) {

                if (parolaDaIndovinareChars[i] == letteraChar) {
                    parolaIncompleta[i] = parolaDaIndovinareChars[i];
                }

            }

            for (char l : parolaIncompleta) {
                System.out.print( l );


            }
            numeroTentativiTotali++;
            System.out.println("");
            if (Arrays.equals( parolaDaIndovinareChars, parolaIncompleta )) {
                System.out.println("HAI VINTO!!");
                System.out.println("Il numero di tentativi è " + numeroTentativiTotali);
                break;
            }
        }





    }



}
