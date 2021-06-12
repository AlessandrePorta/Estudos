package ExercicioFixacaoCap18.Services;

import ExercicioFixacaoCap18.Entities.Contract;
import ExercicioFixacaoCap18.Entities.Installment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContractService {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private OnlineService onlineService;

    public ContractService(OnlineService onlineService) {
        this.onlineService = onlineService;
    }

    public void contractProcessing(Contract contract, Integer date){
        Double valorBase = contract.getValorTotal() / date;
        for(int i = 1; i <= date; i++){
            Date data = addMonths(contract.getData(), i);
            Double a = valorBase + onlineService.paypalTax(valorBase, i);
            Double b = a + onlineService.paymentTax(a);

            contract.addInstallment(new Installment(data, b));
        }
    }

    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}
