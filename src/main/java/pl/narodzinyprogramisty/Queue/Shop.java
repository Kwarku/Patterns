package pl.narodzinyprogramisty.Queue;

public class Shop {
    public static void main(String[] args) {
        CashBox cashBox = new GreenTriangle();
        cashBox.standInTheQueue(new Customer("Paweł",150,20));
        cashBox.standInTheQueue(new Customer("Łukasz",100,50));
        cashBox.standInTheQueue(new Customer("Michał",150,200));


        try {
           cashBox.handleCustomer();
           cashBox.handleCustomer();
           cashBox.handleCustomer();
           cashBox.handleCustomer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
