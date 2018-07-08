package pl.narodzinyprogramisty.Reflection;

public class Bird {
    private boolean walks;
    private String name;

    public Bird() {
    }

    public Bird(boolean walks, String name) {
        this.walks = walks;
        this.name = name;
    }

    private boolean isWalks() {
        return walks;
    }

    private void setWalks(boolean walks) {
        this.walks = walks;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
