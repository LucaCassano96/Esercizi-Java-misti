public class Vendite {

    // VARIABILI D'ISTANZA
    private int numeroVenduti;
    private double totaleVendite;
    private double totaleScontati;
    private double costoPerArticolo;
    private int quantitaIngrosso;
    private int percentualeIngrosso;

   // GETTER E SETTER
    public int getNumeroVenduti() {
        return numeroVenduti;
    }

    public void setNumeroVenduti(int numeroVenduti) {
        this.numeroVenduti = numeroVenduti;
    }

    public double getTotaleVendite() {
        return totaleVendite;
    }

    public void setTotaleVendite(int totaleVendite) {
        this.totaleVendite = totaleVendite;
    }

    public double getTotaleScontati() {
        return totaleScontati;
    }

    public void setTotaleScontati(int totaleScontati) {
        this.totaleScontati = totaleScontati;
    }

    public double getCostoPerArticolo() {
        return costoPerArticolo;
    }

    public void setCostoPerArticolo(double costoPerArticolo) {
        this.costoPerArticolo = costoPerArticolo;
    }

    public int getQuantitaIngrosso() {
        return quantitaIngrosso;
    }

    public void setQuantitaIngrosso(int quantitaIngrosso) {
        this.quantitaIngrosso = quantitaIngrosso;
    }

    public int getPercentualeIngrosso() {
        return percentualeIngrosso;
    }

    public void setPercentualeIngrosso(int percentualeIngrosso) {
        this.percentualeIngrosso = percentualeIngrosso;
    }


    //METODI

    public double registraVendita(){

        if (numeroVenduti > quantitaIngrosso) {
            costoPerArticolo = numeroVenduti * percentualeIngrosso/ 100;
        }

        return costoPerArticolo;
    }

    public void mostravendite(){

        System.out.println("il numero di articoli venduti è " + numeroVenduti);
        totaleVendite = costoPerArticolo * numeroVenduti;
        System.out.println("il totale delle vendite è " + totaleVendite);

    }

}
