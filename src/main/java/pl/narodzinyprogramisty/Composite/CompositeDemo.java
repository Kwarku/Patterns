package pl.narodzinyprogramisty.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        File folderC = new Folder("C");
        File folderSDA = new Folder("sda");
        File folderPrezetnacje = new Folder("prezentacje");
        File folderJava = new Folder("java");
        File javaPrezentacje = new SystemFile("java.pdf");

        File folderDoc = new Folder("documents");
        File cvFile = new SystemFile("cv.pdf");


        folderJava.addTo(javaPrezentacje);
        folderPrezetnacje.addTo(folderJava);
        folderSDA.addTo(folderPrezetnacje);
        folderC.addTo(folderSDA);

        folderDoc.addTo(cvFile);
        folderC.addTo(folderDoc);


        folderC.showMe();
    }

}
