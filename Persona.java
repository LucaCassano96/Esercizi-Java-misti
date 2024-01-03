import java.util.Objects;

public class Persona {

    //VARIABILI DI ISTANZA
    private String nome;
    private int eta;

    //GETTER E SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null) {
            System.out.println("Errore");
        } else {
            this.nome = nome;
        }

    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if (eta < 0) {
            System.out.println("errore");
        }else {
            this.eta = eta;
        }

    }


    //METODI

    public boolean equalsNomeEeta(Persona altraPersona){
        return (nome.equalsIgnoreCase( altraPersona.nome )) &&
                (eta == altraPersona.eta);
    }

    public boolean equalsNome(Persona altraPersona){
        return nome.equalsIgnoreCase( altraPersona.nome );
    }

    public boolean equalsEta(Persona altraPersona){
        return eta == altraPersona.eta;
    }

    public boolean etamaggiore(Persona altraPersona){
        return eta > altraPersona.eta;
    }

    public boolean etaMinore(Persona altraPersona){
        return eta < altraPersona.eta;
    }

}
