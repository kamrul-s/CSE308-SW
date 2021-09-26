package Identifications;

import Identifications.Identification;

public class RFID implements Identification {
    @Override
    public String getIdentification(){
        System.out.println("Identification:RFID");
        return "RFID";
    }
}
