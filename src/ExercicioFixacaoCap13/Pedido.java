package ExercicioFixacaoCap13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Pedido {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf1.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        Date date = new Date();

        System.out.println("Entre com os dados do Cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento: ");
        Date dataDeNascimento = sdf.parse(sc.next());
        System.out.println("Entre os dados da ordem:");
        System.out.print("Status:");
        String status = sc.next();
        Cliente cliente = new Cliente(nome, email, dataDeNascimento, statusOrdem.valueOf(status));

        System.out.println("Quantos itens terá o pedido?");
        int n = sc.nextInt();

        itens produto = null;

        for (int i = 0; i < n; i++){
            System.out.println("Entre com os dados do #"+ (i+1) +" item");
            sc.nextLine();
            System.out.print("Nome do Produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            Integer quantidade = sc.nextInt();
            produto = new itens(nomeProduto, preco, quantidade);
            pedidoProduto.addContrato(produto);
        }

        System.out.println("RESUMO DO PEDIDO:");
        System.out.print("DATA: "+ sdf1.format(date)+ "\n");
        System.out.print("Status do pedido: "+ status+ "\n");
        System.out.print(cliente);
        System.out.println("Itens do pedido:");
        for(itens item : produto.getProdutos()){
            System.out.println(item.toString());
        }
    }
}
