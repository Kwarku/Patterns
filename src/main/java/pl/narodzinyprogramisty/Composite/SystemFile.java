package pl.narodzinyprogramisty.Composite;

public class SystemFile extends File {
    private String name;

    public SystemFile(String name) {
        this.name = name;
    }

    @Override
    public void showMe() {
        super.showMe();
    }

    @Override
    String getFileName() {
        return name;
    }

    @Override
    protected void addTo(File file) {
        System.out.println("Cannot add to file!");
    }

    @Override
    protected void removeFrom(File file) {
        System.out.println("Cannot remove from file!");
    }
}
