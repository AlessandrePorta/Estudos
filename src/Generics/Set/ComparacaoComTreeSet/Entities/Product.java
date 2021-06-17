package Generics.Set.ComparacaoComTreeSet.Entities;

import java.util.Locale;
import java.util.Objects;

public class Product implements Comparable<Product>{

    private String name;
    private Double value;

    public Product(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(value, product.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    public String toString(){
        return "Produto [nome = "+  name +", preco= "+ value +"]";
    }

    @Override
    public int compareTo(Product o) {
        return name.toUpperCase(Locale.ROOT).compareTo(o.getName().toUpperCase(Locale.ROOT));
    }
}
