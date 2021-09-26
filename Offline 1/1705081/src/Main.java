import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank abc=new Bank();
        MDirector MD=new MDirector("MD",abc);
        Officer O1=new Officer("O1",abc);
        Officer O2=new Officer("O2",abc);
        Cashier C1=new Cashier("C1",abc);
        Cashier C2=new Cashier("C2",abc);
        Cashier C3=new Cashier("C3",abc);
        Cashier C4=new Cashier("C4",abc);
        Cashier C5=new Cashier("C5",abc);
        System.out.println("Bank Created; MD, O1, O2, C1, C2, C3, C4, C5 created");
        while (true){
            String inpu=in.nextLine();
            String strInpu[]=inpu.split(" ");

            if(strInpu[0].toLowerCase().equals("open")){
                String TempEmploy=strInpu[1];
                Cashier tempCas=null;
                Officer tempOfficer=null;
                if(TempEmploy.matches("C1|C2|C3|C4|C5")){
                    if(TempEmploy.equals("C1")) tempCas=C1;
                    else if(TempEmploy.equals("C2")) tempCas=C2;
                    else if(TempEmploy.equals("C3")) tempCas=C3;
                    else if(TempEmploy.equals("C4")) tempCas=C4;
                    else if(TempEmploy.equals("C5")) tempCas=C5;
                    //int hasloan=abc.getPendingloan();
                    System.out.println(TempEmploy+" active");
                    //if(hasloan!=0) System.out.println(", there are loan approvals pending");
                    while (true){
                        inpu=in.nextLine();
                        String TempStr[]=inpu.split(" ");
                        if(TempStr[0].toLowerCase().equals("lookup")){
                            tempCas.lookup(TempStr[1]);
                        }
                        else if(TempStr[0].toLowerCase().equals("close")){
                            System.out.println("Operations for "+TempEmploy+" closed");
                            break;
                        }
                        else{
                            tempCas.Approveloan();
                        }
                    }
                    continue;
                }
                else if(TempEmploy.matches("O1|O2")){
                    if(TempEmploy.equals("O1")) tempOfficer=O1;
                    else if(TempEmploy.equals("O2")) tempOfficer=O2;
                    int hasloan=abc.getPendingloan();
                    System.out.print(TempEmploy+" active");
                    if(hasloan!=0) System.out.println(", there are loan approvals pending");
                    else System.out.println();
                    while (true){
                        inpu=in.nextLine();
                        String TempStr[]=inpu.split(" ");
                        if(TempStr[0].toLowerCase().equals("lookup")){
                            tempOfficer.lookup(TempStr[1]);
                        }
                        else if(TempStr[0].toLowerCase().equals("approve")){
                            tempOfficer.Approveloan();
                        }
                        else if(TempStr[0].toLowerCase().equals("close")){
                            System.out.println("Operations for "+TempEmploy+" closed");
                            break;
                        }
                        else{
                            tempOfficer.SeeIntFunds();
                        }
                    }
                    continue;
                }
                else if(TempEmploy.matches("MD")){
                    int hasloan=abc.getPendingloan();
                    System.out.print(TempEmploy+" active");
                    if(hasloan!=0) System.out.println(", there are loan approvals pending");
                    else System.out.println("");
                    while (true){
                        inpu=in.nextLine();
                        String TempStr[]=inpu.split(" ");
                        if(TempStr[0].toLowerCase().equals("lookup")){
                            MD.lookup(TempStr[1]);
                        }
                        else if(TempStr[0].toLowerCase().equals("approve")){
                            MD.Approveloan();
                        }
                        else if(TempStr[0].toLowerCase().equals("change")){
                            String TypCh=TempStr[1];
                            double newInter=Double.parseDouble(TempStr[2]);
                            MD.Changepct(TypCh,newInter);
                        }
                        else if(TempStr[0].toLowerCase().equals("see")){
                            MD.SeeIntFunds();
                        }
                        else if(TempStr[0].toLowerCase().equals("close")){
                            System.out.println("Operations for "+TempEmploy+" closed");
                            break;
                        }

                    }
                    continue;
                }
            }
            if(strInpu[0].toLowerCase().equals("inc")){
                abc.INCtime();
                continue;
            }
            //Create account
            if((strInpu[0].toLowerCase()).equals("create")){
                String nam=strInpu[1];
                String typ=strInpu[2];
                int i=3;
                Customer temptocheck=abc.getCustomer(nam);
                if(temptocheck!=null){
                    System.out.println("Already has an account");
                    continue;
                }
                if(typ.toLowerCase().equals("fixed")){
                    typ+=" deposit";
                    i=4;
                }
                double inittbal=Double.parseDouble(strInpu[i]);
                if(i==4&&inittbal<100000){
                    System.out.println("Can't Open!Cause initial Balance is too low!!");
                    continue;
                }
                Customer crt=new Customer(nam,typ,inittbal,abc);
                abc.CreateAccount(crt);
                System.out.println(typ+" account for "+nam+" Created; initial balance "+inittbal+"$");
            }
            if((strInpu[0].toLowerCase()).equals("create")||(strInpu[0].toLowerCase()).equals("open")){
                String nam=strInpu[1];
                Customer tempCust=abc.getCustomer(nam);
                if(tempCust==null) continue;
                if((strInpu[0].toLowerCase()).equals("open")){
                    System.out.println("Welcome back, "+nam);
                }
                while (true){
                    inpu=in.nextLine();
                    String TempStr[]=inpu.split(" ");
                    if(TempStr[0].toLowerCase().equals("close"))
                    {
                        System.out.println("Transaction Closed for "+nam);
                        break;
                    }
                    else if(TempStr[0].toLowerCase().equals("deposit")){
                        double amoun=Double.parseDouble(TempStr[1]);
                        tempCust.Deposit(amoun);
                    }
                    else if(TempStr[0].toLowerCase().equals("query")){
                        tempCust.Query();
                    }
                    else if(TempStr[0].toLowerCase().equals("request")){
                        double amoun=Double.parseDouble(TempStr[1]);
                        tempCust.Requloan(amoun);
                    }
                    else if(TempStr[0].toLowerCase().equals("withdraw")){
                        double amoun=Double.parseDouble(TempStr[1]);
                        tempCust.Withdraw(amoun);
                    }
                }
                continue;
            }


            if(strInpu[0].toLowerCase().equals("exit")) break;
        }
    }
}
