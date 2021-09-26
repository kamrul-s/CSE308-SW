package Partcipents;

import Mediator.JSC;

public class JTRC {
    JSC jscob;
    public JTRC(JSC med){
        jscob=med;
    }
    public void requestbyJRTC(String st){
        jscob.setRequest("JTRC",st);
    }
    public void serve(){
        jscob.serve("JTRC");
    }
}
