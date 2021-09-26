package Partcipents;

import Mediator.JSC;

public class JPDC {
    JSC jscob;
    public JPDC(JSC med){
        jscob=med;
    }
    public void requestbyJPDC(String st){
        jscob.setRequest("JPDC",st);
    }
    public void serve(){
        jscob.serve("JPDC");
    }
}
