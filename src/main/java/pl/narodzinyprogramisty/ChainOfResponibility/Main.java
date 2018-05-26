package pl.narodzinyprogramisty.ChainOfResponibility;

public class Main {
    public static void main(String[] args) {
        Shop factory = new MobilePhoneFactory(null);
        Shop wholesale = new MobilePhoneWholesale(factory);
        Shop shop = new XKomShop(wholesale);

        shop.buy("Iphone7S");
        shop.buy("IphoneX");
        shop.buy("Xaiomi MI A1");
    }
}
