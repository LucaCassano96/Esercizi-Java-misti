import java.util.Scanner;

public class PromotoreConcerto {

    // Variabili di istanza
    private String nomeGruppo;
    private int numeroPersonemassima;
    private int numeroBigliettiVenduti;
    private double bigliettoVendutoTelefono;
    private double bigliettoVendutoAlConcerto;
    private double ricavatoTotale;


    // Getter e Setter
    public String getNomeGruppo() {
        return nomeGruppo;
    }

    public void setNomeGruppo(String nomeGruppo) {
        if (nomeGruppo == null) {
            System.out.println("errore");
        } else {
            this.nomeGruppo = nomeGruppo;
        }

    }

    public int getNumeroPersonemassima() {
        return numeroPersonemassima;
    }

    public void setNumeroPersonemassima(int numeroPersonemassima) {
        if (numeroPersonemassima <= 0 ) {
            System.out.println("errore deve essere maggiore di 0");
        } else {
            this.numeroPersonemassima = numeroPersonemassima;
        }

    }

    public int getNumeroBigliettiVenduti() {
        return numeroBigliettiVenduti;
    }


    public double getBigliettoVendutoTelefono() {
        return bigliettoVendutoTelefono;
    }

    public void setBigliettoVendutoTelefono(double bigliettoVendutoTelefono) {
        if (bigliettoVendutoTelefono <  0.00) {
            System.out.println("il prezzo deve essere maggiore di 0");
        } else {
            this.bigliettoVendutoTelefono = bigliettoVendutoTelefono;
        }
    }

    public double getBigliettoVendutoAlConcerto() {

        return bigliettoVendutoAlConcerto;
    }

    public void setBigliettoVendutoAlConcerto(double bigliettoVendutoAlConcerto) {

        if (bigliettoVendutoAlConcerto >  0.00) {
            System.out.println("il prezzo deve essere maggiore di 0");
        } else {
            this.bigliettoVendutoAlConcerto = bigliettoVendutoAlConcerto;
        }

    }

    public double getRicavatoTotale() {
        return ricavatoTotale;
    }


    //Metodi


    public void bigliettiAltelefono(){

        Scanner scan = new Scanner( System.in );

            while (true){

                System.out.println("Vuoi coprare dei biglietti al telefono? si/no");
                String risposta = scan.nextLine();


                if (risposta.equalsIgnoreCase( "si" )) {

                    System.out.println("quanti biglietti vuoi comprare?");
                    int numeroBigliettiComprati = scan.nextInt();

                    if (numeroBigliettiComprati >=  numeroPersonemassima) {
                        System.out.println("hai superato la capienza massima riprova");
                        scan.nextLine();
                    } else {
                        double costoDeiBiglietti = numeroBigliettiComprati * bigliettoVendutoTelefono;
                        ricavatoTotale += costoDeiBiglietti;
                        numeroBigliettiVenduti += numeroBigliettiComprati;
                        int numeroBigliettiRimanenti = numeroPersonemassima - numeroBigliettiVenduti;

                        if (numeroBigliettiVenduti > numeroPersonemassima) {
                            System.out.println("hai aggiunto un numero di biglietti superiore alla capienza massima");
                            System.out.println("ci sono ancora " + (numeroPersonemassima - (numeroBigliettiVenduti - numeroBigliettiComprati)) + " biglietti disponibili");
                            scan.nextLine();
                        } else {
                            System.out.println("hai comprato " + numeroBigliettiComprati + " biglietti " + " e hai speso " + costoDeiBiglietti + " €");
                            System.out.println("rimangono ancora disponibili " + numeroBigliettiRimanenti + " biglietti");
                            scan.nextLine();
                        }
                    }



                } else {
                    break;
                }
            }

    }

}
