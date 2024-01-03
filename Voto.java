public class Voto {

    //Variabili di istanza

    private double esercizio1;
    private double esercizio2;
    private double esameIntermedio1;
    private double esameIntermedio2;
    private double esameFinale;
    private double punteggioTotale;
    private String votoInLettara;


    //getter e setter
    public double getEsercizio1() {
        return esercizio1;
    }

    public void setEsercizio1(double esercizio1) {

        if (esercizio1 < 0 || esercizio1 > 10) {
            System.out.println("non può essere inferiore a 0 o maggiore di 10");
        } else{
            this.esercizio1 = esercizio1;
        }
    }

    public double getEsercizio2() {
        return esercizio2;
    }

    public void setEsercizio2(double esercizio2) {
        if (esercizio2 < 0 || esercizio2 > 10) {
            System.out.println("non può essere inferiore a 0 o maggiore di 10");
        } else{
            this.esercizio2 = esercizio2;
        }
    }

    public double getEsameIntermedio1() {
        return esameIntermedio1;
    }

    public void setEsameIntermedio1(double esameIntermedio1) {

        if (esameIntermedio1 < 0 || esameIntermedio1 > 100) {
            System.out.println("non può essere inferiore a 0 o maggiore di 100");
        } else{
            this.esameIntermedio1 = esameIntermedio1;
        }

    }

    public double getEsameIntermedio2() {
        return esameIntermedio2;
    }

    public void setEsameIntermedio2(double esameIntermedio2) {
        if (esameIntermedio2 < 0 || esameIntermedio2 > 100) {
            System.out.println("non può essere inferiore a 0 o maggiore di 100");
        } else{
            this.esameIntermedio2 = esameIntermedio2;
        }
    }

    public double getEsameFinale() {
        return esameFinale;
    }

    public void setEsameFinale(double esameFinale) {
        if (esameFinale < 0 || esameFinale > 100) {
            System.out.println("non può essere inferiore a 0 o maggiore di 100");
        } else{
            this.esameFinale = esameFinale;
        }
    }

    public double getPunteggioTotale() {
        return punteggioTotale;
    }

    public void setPunteggioTotale(double punteggioTotale) {
        this.punteggioTotale = punteggioTotale;
    }

    public String getVotoInLettara() {
        return votoInLettara;
    }

    public void setVotoInLettara(String votoInLettara) {
        this.votoInLettara = votoInLettara;
    }

    //metodi

    public double mediaVotiEsercizi () {
        return (esercizio1 + esercizio2) / 2; // vale il 25% del totale

    }

    public double mediaVotiEsameIntermedio () {
        return (esameIntermedio1 + esameIntermedio2) / 2; // vale il 25% del totale

    }

    public double metaValutazione(){

      return mediaVotiEsercizi() + mediaVotiEsameIntermedio(); // vale il 50% del totale

    }

    public double votoFineCorso(){
        return  metaValutazione() + esameFinale; // vale il 100% del totale

    }

    public double votoFineCorsoInPercentuale(){
        return votoFineCorso() / punteggioTotale  *100;

    }

   public void votoInLettera(){

       if (votoFineCorsoInPercentuale() >= 90) {
           System.out.println("A");
       } else if (votoFineCorsoInPercentuale() >= 80 && votoFineCorsoInPercentuale() <= 89) {
           System.out.println("B");
       } else if (votoFineCorsoInPercentuale() >= 70  && votoFineCorsoInPercentuale() <= 79) {
           System.out.println("C");
       }else if (votoFineCorsoInPercentuale() >= 60  && votoFineCorsoInPercentuale() <= 69) {
           System.out.println("D");
       } else {
           System.out.println("F");
       }
   }

}
