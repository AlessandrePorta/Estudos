package ClasseAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<>();

        lista.add(new Poupança(1001, "Alex", 500.0, 0.01));
        lista.add(new ContaEmpresarial(1002, "Maria", 1000.0, 400.0));
        lista.add(new Poupança(1004, "Alex", 300.0, 0.01));
        lista.add(new ContaEmpresarial(1005, "Ana", 500.0, 500.0));

        double soma = 0.0;

        for (Conta conta: lista){
            soma += conta.getSaldo();
        }

        System.out.printf("Saldo total: %.2f%n", soma);

        for (Conta conta : lista){
            conta.deposito(10.0);
        }
        for (Conta conta : lista){
            System.out.printf("Saldo atualizado para a conta%d: %.2f%n", conta.getNumero(), conta.getSaldo());
        }
    }
}
