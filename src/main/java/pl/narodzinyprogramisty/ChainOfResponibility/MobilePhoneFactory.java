package pl.narodzinyprogramisty.ChainOfResponibility;

import java.util.Arrays;
import java.util.Map;

public class MobilePhoneFactory extends Shop {

    public MobilePhoneFactory(Shop successor) {
        super("Mobile Phone Factory", Arrays.asList("IphoneX","Iphone8","Iphone7S"), successor);
    }
}
