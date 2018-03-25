package pl.narodzinyprogramisty.Observer;

public class YtUser implements Observer {
    private String name;

    public YtUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name + " : " + msg);

    }

}
