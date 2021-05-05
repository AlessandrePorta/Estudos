package ExercicioFixacaoCap13;

import java.util.ArrayList;
import java.util.List;

public class pedidoProduto {

    private static List<itens> produtos = new ArrayList<>();

    public List<itens> getProdutos() {
        return produtos;
    }

    public static void addContrato(itens produto) {
        produtos.add(produto);
    }

    public void remContrato(itens produto) {
        produtos.remove(produto);
    }
}
