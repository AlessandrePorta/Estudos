package Enum;

import java.util.Date;

public class Enumeracoes {
    public static void main(String[] args){

        Ordem ordem = new Ordem(1080, new Date(), StatusOrdem.PAGAMENTO_PENDENTE);

        System.out.println(ordem);

        StatusOrdem a1 = StatusOrdem.ENVIADO;
        StatusOrdem a2 = StatusOrdem.valueOf("ENTREGUE");

        System.out.println(a1);
        System.out.println(a2);

    }
}
