package pl.narodzinyprogramisty.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GreenTriangle implements CashBox {
    private Queue<Customer> customerQueue = new LinkedList<>();

    @Override
    public void standInTheQueue(Customer customer) {
        customerQueue.add(customer);
    }

    @Override
    public void handleCustomer() throws InterruptedException {

        if (customerQueue.size() > 0) {
            Customer customer = customerQueue.poll();

            if (customer != null && customer.getMoney() >= customer.getCartValue()) {
                customer.setMoney(customer.getMoney() - customer.getCartValue());
                customerQueue.poll();
                successMsg(customer);
            } else if (customer != null){
                failedMsg(customer);
            }
            Thread.sleep(2000);
        }else {
            warnignMsg();
        }


    }

    private void failedMsg(Customer customer) {
        System.out.println("Go out " + customer.getName()
                + " you don't have cash (" + customer.getMoney()
                + "$) for this products list ("
                + customer.getCartValue() + "$)");
    }

    private void successMsg(Customer customer) {
        System.out.println("Well done "
                + customer.getName()
                + " you buy this products. Now you have "
                + customer.getMoney()
                + "$");
    }

    private void warnignMsg(){
        System.out.println("This queue is empty");
    }
}
