package pl.narodzinyprogramisty.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Operon implements WebsiteNavigator {
    private Stack<Website> websites = new Stack<>();

    @Override
    public Website prev() {
        Website website = null;
        try {
            websites.pop();
            website = websites.peek();
            System.out.println("Operon : Back to website: " + website);
        } catch (EmptyStackException e) {
            System.out.println("You cant move back");
        }
        return website;
    }

    @Override
    public void next(Website website) {
        System.out.println("Operon : Go to website : " + website);
        websites.push(website);
    }
}
