package pl.narodzinyprogramisty.Composite;
/**
 * Composite pattern
 *
 * we use this pattern when try show structure.
 *
 * Everything in our computer is File.
 * Some elements is folder (can have own element inside)
 * system file is unit file. Don't have ow element
 *
 * */
public abstract class File {
    abstract String getFileName();

    protected abstract void addTo(File file);

    protected abstract void removeFrom(File file);

    public void showMe() {
        System.out.println("File:" + getFileName());
    }
}
