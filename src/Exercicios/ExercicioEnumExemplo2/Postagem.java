package Exercicios.ExercicioEnumExemplo2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;

    private List<Comentarios> comentario = new ArrayList<>();

    public Postagem() {
    }

    public Postagem(Date momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentarios> getComentario() {
        return comentario;
    }

    public void addComentario(Comentarios comentarios) {
        comentario.add(comentarios);
    }

    public void remComentario(Comentarios comentarios) {
        comentario.remove(comentarios);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo +"\n");
        sb.append(curtidas);
        sb.append(" curtidas - ");
        sb.append(sdf.format(momento)+"\n");
        sb.append(conteudo +"\n");
        sb.append("Comentarios: \n");
        for (Comentarios c : comentario) {
            sb.append(c.getTesto()+"\n");

        }
        return sb.toString();
    }
}