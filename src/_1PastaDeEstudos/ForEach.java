package _1PastaDeEstudos;

public class ForEach {
    public static void main(String[] args){

        String[] lista = new String[] {"Maria", "Bob", "Alex"};

        for(int i = 0; i<lista.length; i++){
            System.out.println(lista[i]);
        }
        System.out.println("------------------------------------");
        for(String exemplo : lista){
            System.out.println(exemplo);
        }
    }
}
