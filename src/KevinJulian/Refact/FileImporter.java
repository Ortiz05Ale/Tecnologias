package KevinJulian.Refact;

public class FileImporter {
    public void importFile(SupportsRenaming file, String name) {
        //Lógica para importar
        file.rename(name); //Liskov
    }

}
