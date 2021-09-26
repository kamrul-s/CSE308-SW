package Microprocessors;

import Controllers.ButtonController;
import Controllers.Controller;
import Displays.Display;
import Displays.LED;
import Identifications.Identification;
import Identifications.RFID;
import InternetConnections.GSM;
import InternetConnections.InternetConnection;
import InternetConnections.WiFi;
import Microprocessors.Microprocessor;
import Storages.SdCard;
import Storages.Storage;

import java.util.*;

public class ArduinoMega implements Microprocessor {
    @Override
    public String getMicroprocessor(){
        System.out.println("Microprocessor:Arduino Mega");
        return "Arduino Mega";
    }
    @Override
    public Identification setIdentification() {
        return new RFID();
    }
    @Override
    public Storage setStorage(){
        return new SdCard();
    }
    @Override
    public Display setDisplay() {
        return new LED();
    }
    @Override
    public InternetConnection setInternetConnection() {
        int x;
        System.out.println("Choose Internet Connection module:");
        System.out.println("1.InternetConnections.WiFi Module");
        System.out.println("2.InternetConnections.GSM Module");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x==1) return new WiFi();
        else return new GSM();
    }
    @Override
    public Controller setController() {
        return new ButtonController();
    }
}