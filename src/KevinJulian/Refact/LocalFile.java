package KevinJulian.Refact;

public class LocalFile implements SupportsRenaming, SupportsChangeOfOwnership{
    private String name;
    private String ownerUsername;
    private String ownerGroupname;

    public LocalFile(String name, String ownerUsername, String ownerGroupname) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupname = ownerGroupname;
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }

    @Override
    public void changeOwner(String user, String group) {
        this.ownerUsername = user;
        this.ownerGroupname = group;
    }
    public String getName() {
        return name;
    }
}
