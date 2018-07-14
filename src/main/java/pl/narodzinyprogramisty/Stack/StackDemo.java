package pl.narodzinyprogramisty.Stack;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StackDemo {
    public static void main(String[] args) {
        List<WebsiteNavigator> list = new ArrayList<>();
        list.add(new RamusChrome());
        list.add(new Operon());

        Website website = new Website("www.test.pl", "Test", LocalDateTime.now());
        Website website1 = new Website("www.test1.pl", "Test2", LocalDateTime.now());
        Website website2 = new Website("www.test2.pl", "test3", LocalDateTime.now());

        for (WebsiteNavigator navigoator : list) {
            navigoator.next(website);
            navigoator.next(website1);
            navigoator.next(website2);
        }

        for (WebsiteNavigator navigator : list) {
            navigator.prev();
        }

    }
}
