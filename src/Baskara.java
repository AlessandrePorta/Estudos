public class Baskara {
    public static void main(String[] args){
        int b = -4;
        int a = 5;
        int c = -1;

        double delta = Math.pow(b,2) -4*a*c;

        double x1 = (-b +Math.sqrt(delta))/(2*a);
        double x2 = (-b -Math.sqrt(delta))/(2*a);

        System.out.println("A raiz positiva é: "+ x1);
        System.out.println("A raiz negativa é: "+ x2);

    }
}
