import Controllers.Controller;
import Displays.Display;
import Identifications.Identification;
import InternetConnections.InternetConnection;
import Microprocessors.ATMega32;
import Microprocessors.ArduinoMega;
import Microprocessors.Microprocessor;
import Microprocessors.RaspberryPi;
import Storages.Storage;
import WebServers.Django;
import WebServers.Laravel;
import WebServers.Spring;
import WebServers.WebServer;
import WeightMeasurements.LoadSensor;
import WeightMeasurements.WeightMeasurement;
import WeightMeasurements.WeightModule;

public class Systeminpu {
    private WebServer wbsrbr;
    private Microprocessor mproc;
    private WeightMeasurement wtmsr;
    private Identification idnfic;
    private Storage strge;
    private Display displ;
    private InternetConnection intconec;
    private Controller cntrl;
    public void setPeocessorDep(String proc){
        if(proc.equals("AtMega32")){
            mproc=new ATMega32();
        }
        else if(proc.equals("ArduionoMega")){
            mproc=new ArduinoMega();
        }
        else mproc=new RaspberryPi();
        idnfic=mproc.setIdentification();
        strge=mproc.setStorage();
        displ=mproc.setDisplay();
        intconec=mproc.setInternetConnection();
        cntrl=mproc.setController();
        return;
    }
    public void setWeightMeasurements(String msr){
        if(msr.equals("Load Sensor")) wtmsr=new LoadSensor();
        else wtmsr=new WeightModule();
        return;
    }
    public void setWebserver(String wbsr){
        if(wbsr.equals("WebServers.Django"))wbsrbr=new Django();
        else if(wbsr.equals("WebServers.Spring")) wbsrbr=new Spring();
        else wbsrbr=new Laravel();
        return;
    }
    public void printinpu(){
        String temp;
        wbsrbr.getWebserver();
        mproc.getMicroprocessor();
        wtmsr.getWeightMeasurement();
        idnfic.getIdentification();
        strge.getStorage();
        displ.getDisplay();
        intconec.getInternetConnection();
        cntrl.getController();
    }

}
