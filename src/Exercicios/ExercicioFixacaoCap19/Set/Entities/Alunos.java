package Exercicios.ExercicioFixacaoCap19.Set.Entities;

import java.util.Objects;

public class Alunos {

    private Integer nome;

    public Alunos(Integer nome) {
        this.nome = nome;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(nome, alunos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
