package pl.narodzinyprogramisty.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private String name;
    private List<File> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void showMe() {
        super.showMe();
        fileList.forEach(File::showMe);
    }

    @Override
    String getFileName() {
        return name;
    }

    @Override
    protected void addTo(File file) {
        fileList.add(file);
    }

    @Override
    protected void removeFrom(File file) {
        fileList.remove(file);
    }
}
