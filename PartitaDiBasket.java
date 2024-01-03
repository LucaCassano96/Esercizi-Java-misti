public class PartitaDiBasket {

    // Variabili di istanza
    private String nomeSquadra;
    private int punteggioSquadra;
    private boolean statoGioco;


    // Gettere e Setter

    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }

    public int getPunteggioSquadra() {
        return punteggioSquadra;
    }

    public void setPunteggioSquadra(int punteggioSquadra) {
        this.punteggioSquadra = punteggioSquadra;
    }

    public boolean isStatoGioco() {
        return statoGioco;
    }

    public void setStatoGioco(boolean statoGioco) {
        this.statoGioco = statoGioco;
    }


    // Metodi

    public int canestro1Punto(){
        return punteggioSquadra += 1;
    }

    public int canestro2Punto(){
        return punteggioSquadra += 2;
    }

    public int canestro3Punto(){
        return punteggioSquadra += 3;
    }

    public boolean finePartita(){
        if (punteggioSquadra >= 20){

            statoGioco = false;
        }
        return statoGioco;
    }


}
