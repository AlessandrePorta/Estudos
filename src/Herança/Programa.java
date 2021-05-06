package Herança;

public class Programa {
    public static void main(String[] args) {

        Conta acc = new Conta(1001, "Ale", 0.0);
        ContaEmpresarial bacc = new ContaEmpresarial(1002, "Jose", 0.0, 500.0);

        // UPCASTING

        Conta acc1 = bacc;

        Conta acc2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);

        Conta acc3 = new Poupança(1004, "Ana", 0.0, 0.01);

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
