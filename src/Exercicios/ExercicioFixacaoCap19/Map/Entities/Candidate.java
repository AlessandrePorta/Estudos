package Exercicios.ExercicioFixacaoCap19.Map.Entities;

import java.util.Objects;

public class Candidate {

    private String name;
    private Integer votes;

    public Candidate(String name, Integer votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name) && Objects.equals(votes, candidate.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, votes);
    }
}
