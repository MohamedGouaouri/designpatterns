package com.example.gof.creation.builder.theory;

public class ConcreteBuilder implements Builder{
    Product product;
    @Override
    public void reset() {
        product = new Product();
    }

    @Override
    public void buildPart1(int attr1) {
        product.setAttr1(attr1);
    }

    @Override
    public void buildPart2(int attr2) {
        product.setAttr2(attr2);
    }

    @Override
    public void buildPart3(int attr3) {
        product.setAttr3(attr3);
    }

    public Product getProduct(){
        return product;
    }
}
