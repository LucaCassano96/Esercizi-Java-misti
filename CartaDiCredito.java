import java.util.Objects;
import java.util.Scanner;


public class CartaDiCredito {

    // VARIABILI D'ISTANZA
    private String nomeCorrentista;
    private int numeroConto;
    private int password;
    private int totaleConto;

    // GETTER E SETTER


    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getTotaleConto(){
        return totaleConto;
    }

    public void setTotaleConto(int totaleConto){

        this.totaleConto = totaleConto;
    }



    // METODI DI FUNZIONAMENTO
    public void accediConto() {
        Scanner scan = new Scanner(System.in);

        int accessi = 3;

        for (int i = 1; i <= accessi; i++) {
            System.out.println("Vuoi accedere al tuo conto?");
            System.out.println("Inserisci il nome assegnato al conto");
            String nome = scan.nextLine();

            if (nome.equals(nomeCorrentista)) {
                System.out.println("Hai inserito il nome corretto");

                System.out.println("Inserisci il numero di conto");
                int iban = scan.nextInt();
                scan.nextLine();

                if (numeroConto == iban) {
                    System.out.println("Hai inserito il numero di conto corretto");

                    System.out.println("Inserisci la password");
                    int pin = scan.nextInt();
                    scan.nextLine();

                    if (pin == password) {
                        System.out.println("Hai inserito la password corretta");
                        System.out.println("Sei dentro il tuo conto");
                        System.out.println("il tuo totale sul conto è " + totaleConto + " €");
                        System.out.println("vuoi effetuare un prelievo? si/no");
                        String prelievoSiNo = scan.nextLine();


                        if (prelievoSiNo.equalsIgnoreCase( "si" )) {

                            System.out.println("quanti soldi vuoi prelevare?");
                            int prelievo = scan.nextInt();
                            scan.nextLine();
                            totaleConto-= prelievo;
                            System.out.println("il tuo totale sul conto è " + totaleConto + " €");

                        } else {
                            break;
                        }


                    } else {
                        System.out.println("Hai inserito il pin sbagliato, riprova");
                    }
                } else {
                    System.out.println("Hai inserito il numero di conto sbagliato, riprova");
                }
            } else {
                System.out.println("Hai inserito il nome sbagliato, riprova");
            }
        }

        scan.close();
    }

}
