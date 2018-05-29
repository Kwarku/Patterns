package pl.narodzinyprogramisty.ChainOfResponibility;

import java.util.Arrays;
import java.util.Map;

public class MobilePhoneWholesale extends Shop {

    public MobilePhoneWholesale(Shop successor) {
        super("Mobile Phone Wholesale", Arrays.asList("IphoneX","SGS9+","OnePlus6","Xaiomi MI A1"), successor);
    }
}
