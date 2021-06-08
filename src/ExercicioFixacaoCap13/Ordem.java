package ExercicioFixacaoCap13;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem{

    private Date momento;
    private statusOrdem status;
    private Cliente cliente;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private static List<pedidoProduto> produtos = new ArrayList<>();

    public Ordem(statusOrdem status, Cliente cliente) {
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public statusOrdem getStatus() {
        return status;
    }

    public void setStatus(statusOrdem status) {
        this.status = status;
    }

    public List<pedidoProduto> getProdutos() {
        return produtos;
    }

    public void addProdutos(pedidoProduto produtos) {
        this.produtos.add(produtos);
    }

    public Double total(){
        Double soma = 0.0;
        for ( pedidoProduto c : produtos){
            soma += c.subTotal();
        }
        return soma;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Status do pedido" +"\n");
        sb.append(getStatus()+"\n");
        sb.append("Cliente: ");
        sb.append(cliente.getNome()+"("+sdf.format(cliente.getDataDeNascimento())+")"+ cliente.getEmail()+"\n");
        sb.append("Itens do pedido: \n");
        for (pedidoProduto c : produtos) {
            sb.append(c.getProduto().getNomeProduto()+
                    ", & "+ c.getProduto().getPreco() +
                    ", quantidade: "+ c.getQuantity()+", Subtotal: $"+
                    c.subTotal()+"\n");
        }
        sb.append("Preço total: $"+ total());
        return sb.toString();
    }
}
