package Storages;

public class InternalStorage implements Storage {
    @Override
    public String getStorage() {
        System.out.println("Storage:Internal Storage");
        return "Internal Storage";
    }
}
