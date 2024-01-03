import java.util.Scanner;

public class Punteggio {

    // VARIABILI DI ISTANZA
    private String descrizione;
    private double punteggio;
    private double sommaPunteggiComunity;
    private int numeroUtentiVotanti;
    private int punteggioMassimo;

    //SCANNER

    Scanner scan = new Scanner( System.in );


    // GETTER E SETTER
    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){

        if (descrizione == null) {
            System.out.println("errore inserisci una descrizione valida");
        } else {
            this.descrizione = descrizione;
        }
    }

    public double getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(double punteggio) {

        if (punteggio < 0 || punteggio > 10) {
            System.out.println("inserisci un punteggio tra 0 e 10");
        } else {
            this.punteggio = punteggio;
        }

    }

    public double getSommaPunteggiComunity() {
        return sommaPunteggiComunity;
    }

    public void setSommaPunteggiComunity(double sommaPunteggiComunity) {
        this.sommaPunteggiComunity = sommaPunteggiComunity;
    }

    public int getNumeroUtentiVotanti() {
        return numeroUtentiVotanti;
    }

    public void setNumeroUtentiVotanti(int numeroUtentiVotanti) {
        this.numeroUtentiVotanti = numeroUtentiVotanti;
    }

    public double getPunteggioMassimo() {
        return punteggioMassimo;
    }

    public void setPunteggioMassimo(int punteggioMassimo) {

        if (punteggioMassimo != 10) {
            System.out.println("il punteggio massimo non può essere meno di 10 o superiore");
        }
        else {
            this.punteggioMassimo = punteggioMassimo;
        }

    }

    // METODI

    public double punteggioUtente(){

        while (true){

            System.out.println("inserisci un punteggio per il film che hai visto da 0-10");
            double punteggioUtente = scan.nextDouble();

            if (punteggioUtente < 0 || punteggioUtente > 10) {
                System.out.println("inserisci un punteggio valido");
            } else {
                punteggio = punteggioUtente;
                numeroUtentiVotanti++;
                break;
            }

        }

        return punteggio;

    }

    public double valoreMedioVoti(){
        double punteggioMedio = (sommaPunteggiComunity + punteggio) / numeroUtentiVotanti;
        return Math.round(punteggioMedio * 100.0) / 100.0;
    }



}
