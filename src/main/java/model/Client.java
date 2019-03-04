package model;

public final class Client {

    private static ProductA prodA;
    private static ProductB prodB;

    public Client(){
        prodA = new ProductA();
    }

    public void foo(){
        prodA.foo();
        ProductB myProdB = new ProductB();
        myProdB.foo();
        ProductC myProdC = new ProductC();
        myProdC.foo();
    }
}
