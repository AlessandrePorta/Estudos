package Exercicios.ExercicioEnumExemplo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentarios c1 = new Comentarios("Tenha uma ótima viagem!");
        Comentarios c2 = new Comentarios("Wow, isso é incrível!");

        Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelândia.",
                "Vou visitar esse lugar maravilhoso!",
                12);

        p1.addComentario(c1);
        p1.addComentario(c2);

        Comentarios c3 = new Comentarios("Good night!");
        Comentarios c4 = new Comentarios("May the Force be with you.");

        Postagem p2 = new Postagem(sdf.parse("28/07/2018 13:14:19"),
                "Boa noite galera.",
                "Vejos vocês amanhã.",
                5);

        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
