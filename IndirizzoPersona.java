import java.util.Objects;
import java.util.Scanner;

public class IndirizzoPersona {

    private String nome;
    private String cognome;
    private String mail;
    private String numeroTelefono;

    Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String cambiareMail(){



        while (true){

            System.out.println("vuoi cambiare mail si/no?");
            String entra = scan.nextLine();
            if (entra.equalsIgnoreCase( "si" )) {
                System.out.println("inserisci la tua mail corrente");
                String mailCorrente = scan.nextLine();

                if (mailCorrente.equals( mail )) {
                    System.out.println("inserisci la nuova mail");
                    String nuovamail = scan.nextLine();

                    if (nuovamail.equals( mail )) {

                        System.out.println("la mail corrente e la mail nuova sono uguali riprova");
                    }
                    else if (!nuovamail.contains( "@" )) {
                        System.out.println("la mail deve contenere @ per essere valida");
                    }
                    else {
                        mail = nuovamail;
                        return mail;
                    }

                } else {
                    System.out.println("riprova a inserire");
                }
            } else {
                break;

            }


        }
        return mail;

    }


    public String nuovoNumeroDiTelefono(){

        while (true){

            System.out.println("vuoi cambiare numero di telefono? si/no");
            String risposta = scan.nextLine();

            if (risposta.equalsIgnoreCase( "si" )) {

                System.out.println("inserisci il nuovo numero di telefono");
                String nuovoNumero = scan.nextLine();

                if (nuovoNumero.equals( numeroTelefono )) {
                    System.out.println("il numero di telefono non può essere uguale a quello vecchio");
                } else if (nuovoNumero.length() != 9 ) {

                    System.out.println("errore il numero di telefono deve avere 9 cifre");

                } else {
                    numeroTelefono = nuovoNumero;
                    break;

                }

            } else {

                break;
            }


        }
        return numeroTelefono;
    }
}
