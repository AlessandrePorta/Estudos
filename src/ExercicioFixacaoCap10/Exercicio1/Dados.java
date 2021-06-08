package ExercicioFixacaoCap10.Exercicio1;

public class Dados {

    String nome;
    String email;

    public Dados(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Nome: "+ nome + ", e-mail: " + email;
    }
}
