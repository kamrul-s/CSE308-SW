package Microprocessors;


import Controllers.Controller;
import Displays.Display;
import Identifications.Identification;
import InternetConnections.InternetConnection;
import Storages.Storage;

public interface Microprocessor {
    public String getMicroprocessor();
    public Identification setIdentification();
    public Storage setStorage();
    public Display setDisplay();
    public InternetConnection setInternetConnection();
    public Controller setController();
}
