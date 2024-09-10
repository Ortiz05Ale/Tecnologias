package KevinJulian.Refact;

public class DropboxFile implements SupportsRenaming {
    private String name;
    private String ownerUsername = "";
    private String ownerGroupname = "";

    public DropboxFile(String name, String ownerUsername, String ownerGroupname) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupname = ownerGroupname;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
