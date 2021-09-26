package Partcipents;

import Mediator.JSC;

public class JWSA {
    JSC jscob;
    public JWSA(JSC med){
        jscob=med;
    }
    public void requestbyJWSA(String st){
        jscob.setRequest("JWSA",st);
    }
    public void serve(){
        jscob.serve("JWSA");
    }
}
