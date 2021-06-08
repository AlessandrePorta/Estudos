package ExercicioFixacaoCap14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> lista = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do produto: " + i);
            System.out.print("Produto comum, usado ou importado? (c/u/i): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            if (ch == 'c') {
                lista.add(new Produto(nome, preco));
            }
            if (ch == 'u') {
                System.out.print("Digite a data de faturamento: ");
                Date dataDeFaturamento = sdf.parse(sc.next());
                lista.add(new ProdutoUsado(nome, preco, dataDeFaturamento));
            }
            if (ch == 'i') {
                System.out.print("Taxa de importação: ");
                Double taxa = sc.nextDouble();
                lista.add(new ProdutoImportado(nome, preco, taxa));
            }
        }
        System.out.println("DADOS DOS PRODUTOS: ");
        for (Produto prod : lista) {
            System.out.println(prod.etiquetaDePreco());
        }
    }
}