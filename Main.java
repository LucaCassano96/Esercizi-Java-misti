import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );

        CartaDiCredito conto = new CartaDiCredito();

        conto.setNomeCorrentista( "Luca" );
        conto.setNumeroConto( 12345 );
        conto.setPassword( 123 );
        conto.setTotaleConto( 2000 );

        conto.accediConto();


        Valore valore = new Valore();

        valore.setValoreMinimo( 10 );
        valore.setValoreMassimo( 100 );
        valore.setSollecito( "Il sollecito deve essere maggiore di 10 e minore di 100" );

        int valoreSollecito = valore.getValore();
        System.out.println( valoreSollecito );


        Vendite vendite = new Vendite();

        vendite.setCostoPerArticolo( 10.50 );
        vendite.setTotaleVendite( 200 );
        vendite.setPercentualeIngrosso( 5 );
        vendite.setNumeroVenduti( 50 );
        vendite.setQuantitaIngrosso( 60 );

        vendite.registraVendita();
        vendite.mostravendite();

        Contatore.BarcaMotore barca = new Contatore.BarcaMotore();

        barca.setFuelCapacity( 100 );
        barca.setFuelQuantity( 50 );
        barca.setMaxSpeed( 100 );
        barca.setCurrentSpeed( 50 );
        barca.setEngineEfficenty( 30 );
        barca.setDistance( 500 );

        barca.speed( 3100 );
        barca.distance( 50 );
        barca.fuel( 210 );

        IndirizzoPersona indirizzo = new IndirizzoPersona();
        indirizzo.setMail( "lucaCassano96@gmail.com" );
        indirizzo.setNumeroTelefono( "123456789" );
        String nuovaMail = indirizzo.cambiareMail();
        System.out.println( "la tua mail è stata cambiata con " + nuovaMail );
        String numeroDitelefono = indirizzo.nuovoNumeroDiTelefono();
        System.out.println( "il tuo nuovo numero di telefono è " + numeroDitelefono );

        Punteggio punteggio = new Punteggio();

        punteggio.setDescrizione( "Questo film è un film di grande successo" );
        punteggio.setPunteggioMassimo( 10 );
        punteggio.setSommaPunteggiComunity( 130 );
        punteggio.setNumeroUtentiVotanti( 20 );

        double punteggioUtente = punteggio.punteggioUtente();
        System.out.println( "il punteggio che hai inserito è " + punteggioUtente );
        double punteggioMedio = punteggio.valoreMedioVoti();
        System.out.println( "il punteggio medio del film è " + punteggioMedio );
        int numerUtentiVotanti = punteggio.getNumeroUtentiVotanti();
        System.out.println( "il numero di utenti votanti è " + numerUtentiVotanti );

        Prodotto prodotto = new Prodotto();

        prodotto.setNome( "banana" );
        prodotto.setPrezzo( 2.99 );
        prodotto.setIva( 22 );

        int codiceProdotto = prodotto.getCodice();

        String nomeProdotto = prodotto.getNome();
        System.out.println( "il nome del prodotto è " + nomeProdotto );
        String nomeEcodice = prodotto.nomeEseso();
        System.out.println( "il codice del prodotto è " + nomeEcodice );
        prodotto.prezzo();
        int codice = prodotto.getCodice();
        System.out.println( codice );


        Specie bufalo = new Specie();

        bufalo.setNomeSpecie( "Bufalo" );
        bufalo.setPopolazioneCorrente( 100 );
        bufalo.setTassoDiCrescita( 15 );
        bufalo.setAnniCrescita( 0 );


        Specie elefante = new Specie();

        elefante.setNomeSpecie( "Elefante" );
        elefante.setPopolazioneCorrente( 10 );
        elefante.setTassoDiCrescita( 35 );
        elefante.setAnniCrescita( 0 );

        int arcoTemporale = 20;
        double popolazioneBufaloPrevista = bufalo.getPopolazioneCorrente();
        double popolazioneElefantePrevista = elefante.getPopolazioneCorrente();
        int anniCrescitaBufalo = bufalo.getAnniCrescita();
        int anniCrescitaElefante = elefante.getAnniCrescita();

        int tempoNecessarioSuperamentoBufali = 0;

        for (int i = 1; i <= arcoTemporale; i++) {
            popolazioneBufaloPrevista += popolazioneBufaloPrevista * (bufalo.getTassoDiCrescita() / 100.0);
            popolazioneElefantePrevista += popolazioneElefantePrevista * (elefante.getTassoDiCrescita() / 100.0);

            anniCrescitaBufalo++;
            anniCrescitaElefante++;

            if (popolazioneElefantePrevista >= popolazioneBufaloPrevista) {

                tempoNecessarioSuperamentoBufali = anniCrescitaElefante;
                break;
            }
        }


        System.out.println( "Nell' arco tempotale di " + arcoTemporale + " anni " + " la popolazione del " + bufalo.getNomeSpecie() + " è di " + (int) popolazioneBufaloPrevista +
                " mentre la popolazione " + elefante.getNomeSpecie() + " è di " + (int) popolazioneElefantePrevista );


        if (popolazioneElefantePrevista >= popolazioneBufaloPrevista) {

            System.out.println( "la popolazione " + elefante.getNomeSpecie() + " supererà quella del " + bufalo.getNomeSpecie() + " in " + tempoNecessarioSuperamentoBufali + " anni" );
        } else {
            System.out.println( "nell'arco temporale inserito " + elefante.getNomeSpecie() + " non ha superato la popolazione " + bufalo.getNomeSpecie() );
        }


        Contatore mioContatore = new Contatore();

        mioContatore.incrementoConteggio();
        mioContatore.incrementoConteggio();
        mioContatore.valoreCorrenteContatore();  // Stampa: valore corrente conteggio 2

        mioContatore.decrementoConteggio();
        mioContatore.valoreCorrenteContatore();  // Stampa: valore corrente conteggio 1


        Voto valutazione = new Voto();

        valutazione.setPunteggioTotale( 210 );

        valutazione.setEsercizio1( 8.0 );
        valutazione.setEsercizio2( 7.5 );
        valutazione.setEsameIntermedio1( 70 );
        valutazione.setEsameIntermedio2( 80 );
        valutazione.setEsameFinale( 95 );

        double votoFineCorso = valutazione.votoFineCorso();
        double votoFineCorsoInPercentuale = Math.round( valutazione.votoFineCorsoInPercentuale() * 100.0 ) / 100.0;


        System.out.println( votoFineCorso );
        System.out.println( votoFineCorsoInPercentuale );
        valutazione.votoInLettera();


        Persona persona1 = new Persona();
        persona1.setNome( "Alessio" );
        persona1.setEta( 27 );

        Persona persona2 = new Persona();
        persona2.setNome( "Alessio" );
        persona2.setEta( 24 );

        if (persona1.equalsNomeEeta( persona2 )) {
            System.out.println( "Hanno lo stesso nome e la stessa eta" );
        } else if (persona1.equalsNome( persona2 )) {
            System.out.println( "Hanno lo stesso nome" );
        } else if (persona1.equalsEta( persona2 )) {
            System.out.println( "Hanno la stessa età" );
        } else if (persona1.etamaggiore( persona2 )) {
            System.out.println( "persona1 ha un'età maggiore di persona2" );
        } else if (persona1.etaMinore( persona2 )) {
            System.out.println( "persona2 ha un'età maggiore di persona1" );
        }

        // A
        Valutazione valutazioneA = new Valutazione();
        valutazioneA.setVoto( "A" );
        valutazioneA.setNumeroStudenti( 2 );

        // B
        Valutazione valutazioneB = new Valutazione();
        valutazioneB.setVoto( "B" );
        valutazioneB.setNumeroStudenti( 4 );

        // C
        Valutazione valutazioneC = new Valutazione();
        valutazioneC.setVoto( "C" );
        valutazioneC.setNumeroStudenti( 6 );

        // D
        Valutazione valutazioneD = new Valutazione();
        valutazioneD.setVoto( "D" );
        valutazioneD.setNumeroStudenti( 7 );

        //F
        Valutazione valutazioneF = new Valutazione();
        valutazioneF.setVoto( "F" );
        valutazioneF.setNumeroStudenti( 3 );

        int sommaNumeroToaleClasse = sommaNumeroToaleClasse( valutazioneA.getNumeroStudenti(), valutazioneB.getNumeroStudenti(), valutazioneC.getNumeroStudenti(), valutazioneD.getNumeroStudenti(), valutazioneF.getNumeroStudenti() );

        //A
        double percentualeVotiLetteraA = valutazioneA.percentualeVotiLettera( sommaNumeroToaleClasse );
        System.out.println( "A " + percentualeVotiLetteraA );

        //B
        double percentualeVotiLetteraB = valutazioneB.percentualeVotiLettera( sommaNumeroToaleClasse );
        System.out.println( "B " + percentualeVotiLetteraB );

        //C
        double percentualeVotiLetteraC = valutazioneC.percentualeVotiLettera( sommaNumeroToaleClasse );
        System.out.println( "C " + percentualeVotiLetteraC );

        //D
        double percentualeVotiLetteraD = valutazioneD.percentualeVotiLettera( sommaNumeroToaleClasse );
        System.out.println( "D " + percentualeVotiLetteraD );

        //F
        double percentualeVotiLetteraF = valutazioneF.percentualeVotiLettera( sommaNumeroToaleClasse );
        System.out.println( "F " + percentualeVotiLetteraF );


        //Collonna grafico A

        valutazioneA.colonnaGrafico( sommaNumeroToaleClasse );

        //Collonna grafico B
        valutazioneB.colonnaGrafico( sommaNumeroToaleClasse );

        //Collonna grafico C
        valutazioneC.colonnaGrafico( sommaNumeroToaleClasse );

        //Collonna grafico D
        valutazioneD.colonnaGrafico( sommaNumeroToaleClasse );

        //Collonna grafico F
        valutazioneF.colonnaGrafico( sommaNumeroToaleClasse );

        Gioco gioco = new Gioco();
        gioco.setParolaDaIndovinare( "abracadabra" );

        gioco.indovina();


        PartitaDiBasket SquadraRossi = new PartitaDiBasket();

        SquadraRossi.setNomeSquadra( "Squadra Rossi" );
        SquadraRossi.setPunteggioSquadra( 0 );
        SquadraRossi.setStatoGioco( true );

        PartitaDiBasket SquadraVerdi = new PartitaDiBasket();

        SquadraVerdi.setNomeSquadra( "Squadra Verdi" );
        SquadraVerdi.setPunteggioSquadra( 0 );
        SquadraVerdi.setStatoGioco( true );

        int punteggioPrimaSquadra = SquadraRossi.getPunteggioSquadra();
        int punteggioSecondaSquadra = SquadraVerdi.getPunteggioSquadra();

        while (punteggioPrimaSquadra <= 20 || punteggioSecondaSquadra <= 20) {

            System.out.println( "inserisci la squadra e il punteggio" );
            String squadra = scan.nextLine();
            int puntegggio2 = scan.nextInt();
            scan.nextLine();

            if (puntegggio2 != 1 && puntegggio2 != 2 && puntegggio2 != 3) {
                System.out.println( "Il puntegggio2 deve essere 1, 2 o 3. Riprova." );
                continue;
            }

            if (squadra.equals( SquadraRossi.getNomeSquadra() )) {
                if (puntegggio2 == 1) {
                    punteggioPrimaSquadra = SquadraRossi.canestro1Punto();
                } else if (puntegggio2 == 2) {
                    punteggioPrimaSquadra = SquadraRossi.canestro2Punto();
                } else {
                    punteggioPrimaSquadra = SquadraRossi.canestro3Punto();
                }
            }


            if (squadra.equals( SquadraVerdi.getNomeSquadra() )) {
                if (puntegggio2 == 1) {
                    punteggioSecondaSquadra = SquadraVerdi.canestro1Punto();
                } else if (puntegggio2 == 2) {
                    punteggioSecondaSquadra = SquadraVerdi.canestro2Punto();
                } else {
                    punteggioSecondaSquadra = SquadraVerdi.canestro3Punto();
                }
            }

            if (punteggioPrimaSquadra > punteggioSecondaSquadra) {
                System.out.println( "La Squadra " + SquadraRossi.getNomeSquadra() + " è in vantaggio con " + punteggioPrimaSquadra + " mentre la " + SquadraVerdi.getNomeSquadra() + " è a " + punteggioSecondaSquadra + " punti" );
            } else if (punteggioSecondaSquadra > punteggioPrimaSquadra) {
                System.out.println( "La Squadra " + SquadraVerdi.getNomeSquadra() + " è in vantaggio con " + punteggioSecondaSquadra + " mentre la " + SquadraRossi.getNomeSquadra() + " è a " + punteggioPrimaSquadra + " punti" );
            } else {
                System.out.println( "le due squadre sono pari con " + SquadraRossi.getNomeSquadra() + " a " + punteggioPrimaSquadra + " e " + SquadraVerdi.getNomeSquadra() + " a " + punteggioSecondaSquadra + " punti" );
            }

            if (punteggioPrimaSquadra >= 20) {

                System.out.println( "La squadra " + SquadraRossi.getNomeSquadra() + " ha vinto con " + punteggioPrimaSquadra + " punti" );
                break;
            } else if (punteggioSecondaSquadra >= 20) {
                System.out.println( "La squadra " + SquadraVerdi.getNomeSquadra() + " ha vinto con " + punteggioSecondaSquadra + " punti" );
                break;
            }


        }


        PromotoreConcerto concerto = new PromotoreConcerto();

        concerto.setNomeGruppo( "Green Day" );
        concerto.setBigliettoVendutoTelefono( 20.00 );
        concerto.setNumeroPersonemassima( 1000 );

        concerto.bigliettiAltelefono();

    }




    public static int sommaNumeroToaleClasse( int vA, int vB, int vC, int vD, int vF){
        return vA + vB + vC + vD + vF;
    }




}