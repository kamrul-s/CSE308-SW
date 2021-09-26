package Storages;

public class SdCard implements Storage {
    @Override
    public String getStorage(){
        System.out.println("Storage:Interfaced with SD card");
        return "Sd Card";
   }

}
