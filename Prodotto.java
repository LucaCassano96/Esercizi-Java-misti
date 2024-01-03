public class Prodotto {

    // VARIABILI DI ISTANZA
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;


    //GETTER E SETTER

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println( "inserisci un nome valido" );
        }else {
            this.nome = nome;
        }

    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {

        if (descrizione == null) {
            System.out.println( "inserisci una descrizione valida" );
        }else {
            this.descrizione = descrizione;
        }

    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo <= 0 ) {
            System.out.println("il prezzo deve essere maggiore di 0");
        }else {
            this.prezzo = prezzo;
        }

    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        if (iva <= 0 ) {
            System.out.println("l' iva deve essere maggiore di 0");
        }else {
            this.iva = iva;
        }

    }

    //METODI
    private int generaCodice (){
        int min = 10000000;
        int max = 99999999;
        codice = (int)(Math.random()*(max-min+1)+min);
        return codice;
    }

    public void prezzo(){

        double prezzoBase = prezzo;
        double prezzoConIva = prezzoBase + (prezzoBase * iva /100);
        double prezzoConIvaArrotondato = Math.round(prezzoConIva * 100.0) / 100.0;
        System.out.println("il prezzo base del prodotto è " + prezzoBase + " €");
        System.out.println("il prezzo con iva è: " + prezzoConIvaArrotondato + " €");

    }

    public String nomeEseso(){
        return nome + generaCodice();
    }

}
