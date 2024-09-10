package KevinJulian.Refact;

public class FilePermissionManager {
    public void transferOwnership(SupportsChangeOfOwnership file, String ownerUsername, String ownerGroupname){
        file.changeOwner(ownerUsername, ownerGroupname);
    }
}
