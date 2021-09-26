package Identifications;

import Identifications.Identification;

public class NfcCard implements Identification {
    @Override
    public String getIdentification(){
        System.out.println("Identification:NFIC CARD");
        return "NfcCard";
    }
}
