package ExercicioFixacaoCap13;

import ExercicioEnumExemplo1.ContratoPorHora;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

    private String nome;
    private String email;
    private Date dataDeNascimento;
    private statusOrdem status;


    public Cliente() {
    }

    public Cliente(String nome, String email, Date dataDeNascimento, statusOrdem status) {
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public statusOrdem getStatus() {
        return status;
    }

    public void setStatus(statusOrdem status) {
        this.status = status;
    }

    public String toString(){
        return "Cliente: "+ nome + "("+dataDeNascimento+")"+" - "+ email;
    }

}
