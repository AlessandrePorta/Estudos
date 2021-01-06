package estudosantigos;

import java.util.Scanner;

public class OperadorBitWise {
    static class operador {
        public static void main(String[] args) {
            //Operação &
            //Significa "E" bit a bit
            //Quando as duas condições derem VERDADEIRO

            //Operação |
            //Significa "Ou" bit a bit
            //Quando 1 ou mais condições derem verdadeiro

            //Operação ^
            //Significa "Ou-exclusivo" bit a bit
            //Quando apenas 1 condição for verdadeira

            int z = 89;
            int x = 60;

            System.out.println(z & x);
            System.out.println(z | x);
            System.out.println(z ^ x);
        }
    }
    static class bitabit{
        public static void main(String[] args){

            Scanner ale = new Scanner(System.in);

            int x = ale.nextInt();
            int m = 0b100000;

            if ((x & m) != 0){
                System.out.printf("Seu 6th digito é 1.");
            } else{
                System.out.printf("Seu 6th digito é 0.");
            }
        }
    }
}
