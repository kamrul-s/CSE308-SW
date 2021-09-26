package Partcipents;

import Mediator.JSC;

public class JRTA {
    JSC jscob;
    public JRTA(JSC med){
        jscob=med;
    }
    public void requestbyJRTA(String st){
        jscob.setRequest("JRTA",st);
    }
    public void serve(){
        jscob.serve("JRTA");
    }
}
