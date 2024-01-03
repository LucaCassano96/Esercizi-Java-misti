public class Valutazione {

    private String voto;
    private int numeroStudenti;

    public String getVoto(){
        return voto;
    }

    public void setVoto(String voto){

        String[] voti = {"A", "B", "C", "D", "F"};

        for (String v : voti) {

            if (v.equalsIgnoreCase( "A" ) ||
                    v.equalsIgnoreCase( "B" ) ||
                    v.equalsIgnoreCase( "C" ) ||
                    v.equalsIgnoreCase( "D" ) ||
                    v.equalsIgnoreCase( "F" )) {
                this.voto = voto;
            }
            else {
                System.out.println("Hai inserito un voto non valido");
            }
        }
    }

    public int getNumeroStudenti() {
            return numeroStudenti;
    }

    public void setNumeroStudenti(int numeroStudenti) {
        if (numeroStudenti <= 0) {
            System.out.println("errore");
        } else {
            this.numeroStudenti = numeroStudenti;
        }
    }


    public double percentualeVotiLettera (int numeroToaleClasse){
        return Math.round( (double) numeroStudenti / numeroToaleClasse * 100 * 100.0) / 100.0;
    }

    public void colonnaGrafico(int numeroToaleClasse){

        int numeroAsterischi = (int) percentualeVotiLettera(numeroToaleClasse) / 2;

        System.out.print(voto + " ");
        for (int i = 1; i <= numeroAsterischi; i++) {
            System.out.print("*");
        }

        System.out.println("");

    }
}
