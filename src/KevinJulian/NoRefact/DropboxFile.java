package KevinJulian.NoRefact;

public class DropboxFile implements FileInterface{
    private String name;
    private final String ownerUsername;
    private final String ownerGroupname;


    public DropboxFile(String name, String ownerUsername, String ownerGroupname) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupname = ownerGroupname;
    }

    @Override
    public void changeOwner(String username, String groupname) {
        //
    }
    @Override
    public void rename(String name){
        this.name = name;
    }

}
