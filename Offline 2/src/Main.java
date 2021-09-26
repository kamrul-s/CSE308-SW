import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pkg;
        String wbsrver;
        int x;
        System.out.println("Choose a Package:");
        System.out.println("1.Silver\n" +
                "2.Gold\n" +
                "3.Diamond\n" +
                "4.Platinum");
        x=sc.nextInt();
        if(x==1) pkg="Silver";
        else if(x==2) pkg="Gold";
        else if(x==3) pkg="Diamond";
        else pkg="Platinum";
        System.out.println("Choose a Webserver:");
        System.out.println("1.WebServers.Django\n2.WebServers.Spring\n3.WebServers.Laravel");
        x=sc.nextInt();
        if(x==1) wbsrver="WebServers.Django";
        else if(x==2) wbsrver="WebServers.Spring";
        else wbsrver="WebServers.Laravel";
        SystemBuilder builder=new SystemBuilder();
        Systeminpu mybuild=builder.getSystem(pkg,wbsrver);
        mybuild.printinpu();
    }
}
