package Generics.CovarianciaEContraVariancia;

public class Application {

    //Covariancia

    //Não pode adicionar e pode dar get
    /* List<Integer> intList = new ArrayList<Integer>();
    intList.add(10);
    intList.add(5);

    List<? extends Number> lista = intList;

    number x = list.get(0);

    lista.add(20);
     */

    //ContraVariancia

    //Pode adicionar e não pode dar get
    /*
    List<Object> myObjs = new ArrayList<>();
    myObjs.add("Maria");
    myObjs.add("Alex");

    List<? super Number> myNums = myObjs;

    myNums.add(10);
    myNums.add(3.14);

    Number x = myNums.get(0);
     */
}
