package Interfaces.Comparable.Exemplo2.Entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        //Retornar a comparação pelo tipo indicado (Para retornar decrescente, adicionar "-" no começo.
        return salary.compareTo(other.getSalary());
    }
}
