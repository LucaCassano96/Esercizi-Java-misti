import java.util.Scanner;

public class Valore {

    //VARIABILI DI ISTANZA
    int valoreMinimo;
    int valoreMassimo;
    String sollecito;


    //GETTER E SETTER

    public int getValoreMinimo() {
        return valoreMinimo;
    }

    public void setValoreMinimo(int valoreMinimo) {

        if (valoreMinimo >=  0 ) {
            this.valoreMinimo = valoreMinimo;
        } else {
            System.out.println("errore");
        }


    }

    public int getValoreMassimo() {
        return valoreMassimo;
    }

    public void setValoreMassimo(int valoreMassimo) {

        if (valoreMinimo > 0) {
            this.valoreMassimo = valoreMassimo;
        } else {
            System.out.println("errore");
        }

    }

    public String getSollecito() {
        return sollecito;
    }

    public void setSollecito(String sollecito) {

        if (sollecito != null) {
            this.sollecito = sollecito;
        } else {
            System.out.println("errore");
        }

    }

    //METODI

    public int getValore() {

        Scanner scan = new Scanner( System.in );
      int numeroSollecito = 0;
        while (true) {

            System.out.println( sollecito );

            if (scan.hasNextInt()) {
                numeroSollecito = scan.nextInt();

                if (valoreMinimo < numeroSollecito && valoreMassimo < numeroSollecito) {

                    System.out.println( "Hai inserito il numero giusto" );
                    return numeroSollecito;

                } else {
                    System.out.println( "riprova" );

                }
            }
            else {
                System.out.println("errore dato errato");
                scan.next();
            }
            scan.close();
        }

    }


}
