package Mediator;

import Partcipents.*;

import java.util.*;

public class JSC implements Mediaor {
    private Queue<String> jwsalist;
    private Queue<String> jpdclist;
    private  Queue<String> jrtalist;
    private Queue<String> jtrcList;
    public JSC(){
        jwsalist=new LinkedList<>();
        jpdclist=new LinkedList<>();
        jrtalist=new LinkedList<>();
        jtrcList=new LinkedList<>();
    }
    public void setRequest(String st,String st2){
        System.out.println(st+" requests for "+st2+" service");
        if(st2.equalsIgnoreCase("Water")) st2="JWSA";
        else if(st2.equalsIgnoreCase("ENERGY")||st2.equalsIgnoreCase("POWER")) st2="JPDC";
        else if(st2.equalsIgnoreCase("TRANSPORT")) st2="JRTA";
        else if(st2.equalsIgnoreCase("TELECOM")) st2="JTRC";
        if(st2.equalsIgnoreCase("JWSA")) jwsalist.add(st);
        else if(st2.equalsIgnoreCase("JPDC")) jpdclist.add(st);
        else if(st2.equalsIgnoreCase("JRTA")) jrtalist.add(st);
        else if(st2.equalsIgnoreCase("JTRC")) jtrcList.add(st);
    }
    @Override
    public void serve(String st) {
        if(st.equalsIgnoreCase("JWSA")){
            if(jwsalist.size()==0){
                System.out.println("JWSA has notihnig to serve");
            }
            else {
                System.out.println("JWSA serves the request of "+jwsalist.poll());
            }
        }
        else if(st.equalsIgnoreCase("JPDC")){
            if(jpdclist.size()==0){
                System.out.println("JPDC has notihnig to serve");
            }
            else {
                System.out.println("JPDC serves the request of "+jpdclist.poll());
            }
        }
        else if(st.equalsIgnoreCase("JRTA")){
            if(jrtalist.size()==0){
                System.out.println("JRTA has notihnig to serve");
            }
            else {
                System.out.println("JRTA serves the request of "+jrtalist.poll());
            }
        }
        else if(st.equalsIgnoreCase("JTRC")){
            if(jtrcList.size()==0){
                System.out.println("JTRC has notihnig to serve");
            }
            else {
                System.out.println("JTRC serves the request of "+jtrcList.poll());
            }
        }
    }
}
