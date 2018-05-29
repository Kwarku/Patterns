package pl.narodzinyprogramisty.ObserverV2;

public class Demo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        TVP1 tvp1 = new TVP1();
        TVN tvn = new TVN();
        Polsat polsat = new Polsat();

        agency.notify("Test");

        agency.add(tvp1);
        agency.add(tvn);
        agency.add(polsat);

        agency.notify("new msg to all");

        agency.remove(tvn);

        agency.notify("new msg to not all users");
    }
}
