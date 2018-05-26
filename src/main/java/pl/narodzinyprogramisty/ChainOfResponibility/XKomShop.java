package pl.narodzinyprogramisty.ChainOfResponibility;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Map;

public class XKomShop extends Shop {

    public XKomShop(Shop successor) {
        super("XKom", Arrays.asList("OnePlus6","IphoneX","SGS9"), successor);
    }

}


