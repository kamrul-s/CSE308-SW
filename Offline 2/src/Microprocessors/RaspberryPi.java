package Microprocessors;

import Controllers.Controller;
import Controllers.TouchScreenCountroler;
import Displays.Display;
import Displays.TouchScreen;
import Identifications.Identification;
import Identifications.NfcCard;
import InternetConnections.Ethernet;
import InternetConnections.GSM;
import InternetConnections.InternetConnection;
import InternetConnections.WiFi;
import Microprocessors.Microprocessor;
import Storages.InternalStorage;
import Storages.Storage;

import java.util.Scanner;

public class RaspberryPi implements Microprocessor {
    @Override
    public String getMicroprocessor(){
        System.out.println("Microprocessor:Raspberry Pi");
        return "Raspberry Pi";
    }
    @Override
    public Identification setIdentification() {
        return new NfcCard();
    }
    @Override
    public Storage setStorage(){
        return new InternalStorage();
    }
    @Override
    public Display setDisplay() {
        return new TouchScreen();
    }
    @Override
    public InternetConnection setInternetConnection() {
        System.out.println("Choose Internet Connection module:");
        System.out.println("1.InternetConnections.WiFi Module");
        System.out.println("2.InternetConnections.GSM Module");
        System.out.println("3.InternetConnections.Ethernet");
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        if(x==1) return new WiFi();
        else if(x==2) return new GSM();
        else return new Ethernet();
    }
    @Override
    public Controller setController() {
        return new TouchScreenCountroler();
    }
}