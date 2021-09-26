import java.util.*;
import Partcipents.*;
import Mediator.JSC;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inpu=sc.nextLine();
        while (true){
            if(inpu.equalsIgnoreCase("Init")) break;
            System.out.println("Please initialize first");
            inpu=sc.nextLine();
        }
        JSC medobj=new JSC();
        JWSA jwsaobj=new JWSA(medobj);
        JPDC jpdcobj= new JPDC(medobj);
        JRTA jrtaobj= new JRTA(medobj);
        JTRC jtrcobj=new JTRC(medobj);
        System.out.println("All four services are initiated through mediator");
        while (true) {
            inpu = sc.nextLine();
            String inpu2[] = inpu.split(" ");
            if(inpu2[0].equalsIgnoreCase("JWSA")) {
                if(inpu2[1].equalsIgnoreCase("serve")) jwsaobj.serve();
                else jwsaobj.requestbyJWSA(inpu2[1]);
            }
            else if(inpu2[0].equalsIgnoreCase("JPDC")) {
                if(inpu2[1].equalsIgnoreCase("serve")) jpdcobj.serve();
                else jpdcobj.requestbyJPDC(inpu2[1]);
            }
            else if(inpu2[0].equalsIgnoreCase("JRTA")) {
                if(inpu2[1].equalsIgnoreCase("serve")) jrtaobj.serve();
                else jrtaobj.requestbyJRTA(inpu2[1]);
            }
            else if(inpu2[0].equalsIgnoreCase("JTRC")) {
                if(inpu2[1].equalsIgnoreCase("serve")) jtrcobj.serve();
                else jtrcobj.requestbyJRTC(inpu2[1]);
            }
        }
    }
}
