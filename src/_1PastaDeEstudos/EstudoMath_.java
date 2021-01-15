package _1PastaDeEstudos;

public class EstudoMath_ {
    public static void main(String[] args){

        double x = 9.0;
        double y = 4.0;
        double z = -3.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);

        System.out.println("Raiz de: "+ x +" é igual a: "+ A);
        System.out.println("Raiz de: "+ y +" é igual a: "+ B);
        System.out.println("Raiz de: "+ z +" é igual a: "+ C);

        A = Math.pow(x,z);
        B = Math.pow(y,z);
        C = Math.pow(x,y);

        System.out.println("X elevado a Z é igual a: "+ A);
        System.out.println("Y elevado a Z é igual a: "+ B);
        System.out.println("X elevado a Y é igual a: "+ C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de: "+ y +" é igual a: "+A);
        System.out.println("Valor absoluto de: "+ z +" é igual a: "+B);
    }
}
