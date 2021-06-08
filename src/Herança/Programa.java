package Herança;

public class Programa {
    public static void main(String[] args) {

        Conta acc = new Conta(1001, "Ale", 1000.0);
        acc.saque(200.0);
        System.out.println(acc.getSaldo());
        ContaEmpresarial bacc = new ContaEmpresarial(1002, "Jose", 0.0, 500.0);

        // UPCASTING

        Conta acc1 = bacc;

        Conta acc2 = new ContaEmpresarial(1003, "Bob", 1000.0, 500.0);
        acc2.saque(200);
        System.out.println(acc2.getSaldo());

        Conta acc3 = new Poupança(1004, "Ana", 1000.0, 0.01);
        acc3.saque(200.0);
        System.out.println(acc3.getSaldo());

        // DOWNCASTING

        ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
        acc4.emprestimo(100.0);

        //ContaEmpresarial acc5 = (ContaEmpresarial) acc3; IRÁ DAR ERRO POIS NÃO ESTÁ INSTANCIADO CORRETAMENTE

        if (acc3 instanceof ContaEmpresarial){
            ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
            acc5.emprestimo(200.);
            System.out.println("Emprestimo!");
        }
        if(acc3 instanceof Poupança){
            Poupança acc5 = (Poupança) acc3;
            acc5.atualizarSaldo();
            System.out.println("Atualizado!");
        }
    }
}
