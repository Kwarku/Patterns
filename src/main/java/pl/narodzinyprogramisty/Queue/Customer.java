package pl.narodzinyprogramisty.Queue;

public class Customer {
    private String name;
    private int money;
    private int cartValue;

    public Customer(String name, int money, int cartValue) {
        this.name = name;
        this.money = money;
        this.cartValue = cartValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCartValue() {
        return cartValue;
    }

    public void setCartValue(int cartValue) {
        this.cartValue = cartValue;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", cartValue=" + cartValue +
                '}';
    }
}
