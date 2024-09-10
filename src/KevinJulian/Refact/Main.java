package KevinJulian.Refact;

public class Main {
    public static void main(String[] args) {
        LocalFile local = new LocalFile("Archivo local", "Usuario 1", "Grupo 1");
        DropboxFile dropbox = new DropboxFile("Archivo dropbox", "Usuario 2", "Grupo 2");

        FileImporter fileImporter = new FileImporter();
        FilePermissionManager filePermissionManager = new FilePermissionManager();


        //Demostración del archivo


        fileImporter.importFile(local,"Archivo local importado");
        System.out.println(local.getName());

        fileImporter.importFile(dropbox, "Archivo dropbox importado");
        System.out.println(dropbox.getName());

        filePermissionManager.transferOwnership(local, "Nuevo usuario", "Nuevo grupo");
        filePermissionManager.transferOwnership(dropbox, "Nuevo usuario 2", "Nuevo grupo 2");
    }
}
