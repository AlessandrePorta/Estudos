import java.util.Locale;

public class EditandoStrings {
    /*
    static class teoria {
    public static void main(String[] args) {

    Para formatar a string:
    toLowerCase();
    toUpperCase();
    trim();

    Para recortar a string:

    substring(inicio);
    substring(inicio, fim);

    Para substituir

    replace(char,char);
    replace(string, string);

    Para buscar

    IndexOf;
    LastIndexOf;

    Recortar string

    str.split("");

    */


    static class teste {
        public static void main(String[] args) {
            String teste = "     ahsudf UASHdU U Ad dhsuah       ";
            String a = teste.toLowerCase();
            String b = teste.toUpperCase();
            String c = teste.trim();
            String d = teste.substring(8);
            String e = teste.substring(2, 9);
            String f = teste.replace('h', 'a');
            String g = teste.replace('s', 'a');
            int h = teste.indexOf("ah");
            int i = teste.lastIndexOf("a");

            System.out.println("Sem edição:" + a + "\n" + b + "\n" + "trim (sem espaçamento)" + c + "\nsubs:(tira todas a letras até o número) " + d + "\nsubs def:(Mostra todas as letras até o número) " + e + "\nreplace: " + f + "\nreplace: " + g + "\nposição da letra: " + h + "\nultima posicao da letra: " + i);
        }
    }

    static class teste2 {
        public static void main(String[] args) {
            String a = "Como deve ser";
            String[] vect = a.split("");
            String b = vect[0];
            String c = vect[1];
            String d = vect[2];

            System.out.println(d);
        }
    }
}
