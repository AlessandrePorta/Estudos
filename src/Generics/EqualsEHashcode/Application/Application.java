package Generics.EqualsEHashcode.Application;

import Generics.EqualsEHashcode.Entities.Client;

public class Application {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "test";
        String s2 = "test";

        //PEGA O VALOR DA STRING E CONVER EM UM "INT"
        System.out.println(c1.hashCode());
        //PEGA O VALOR DA STRING E CONVER EM UM "INT"
        System.out.println(c2.hashCode());
        //COMPARA 2 OBJETOS
        System.out.println(c1.equals(c2));
        //COMPARA REFERENCIA DE MEMORIA (HEAP)
        System.out.println(c1 == c2);

        //RESULTADO TRUE POR QUE FOI DECLARADO DIRETO NA STRING
        System.out.println(s1 == s2);
    }
}
