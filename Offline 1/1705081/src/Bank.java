import java.beans.Customizer;

public class Bank {
    private int curtime;
    private double initfunds;
    private Customer cust[]=new Customer [50];
    private int curcustomer;
    private int maxcust;
    private int pendingloan;
    private double penloanbal;
    private double savingsInt;
    private double studetnsInt;
    private double fxdInt;

    public Bank(){
        this.curtime = 0;
        this.initfunds= 1000000;
        this.curcustomer=0;
        this.maxcust=50;
        this.pendingloan=0;
        this.penloanbal=0;
        savingsInt=10;
        studetnsInt=5;
        fxdInt=15;
    }
    public void CreateAccount(Customer obj){
        if(curcustomer>=maxcust){
            Customer temp[]=new Customer[maxcust+50];
            int i;
            for(i=0;i<maxcust;i++){
                temp[i]=cust[i];
            }
            maxcust+=50;
            cust=temp;
        }
        this.cust[curcustomer]=obj;
        curcustomer++;
    }

    public Customer getCustomer(String name){
        int i;
        for(i=0;i<curcustomer;i++){
            if(cust[i].getName().equals(name)){
                return cust[i];
            }

        }
        return null;
    }


    public int getCurtime() {
        return curtime;
    }

    public void setPenloanbal(double bal) {
        this.penloanbal += bal;
        this.pendingloan++;
    }

    public double getPenloanbal() {
        return penloanbal;
    }

    public double getIntfunds() {
        return initfunds;
    }
    public void INCtime(){
        int i;
        double tempbal,inter,temploan,finbal;
        String tempType;
        for(i=0;i<curcustomer;i++){
            tempbal=cust[i].getBalance();
            tempType=cust[i].getAccType();
            if(tempType.equals("saving")) inter=savingsInt;
            else if(tempType.equals("student")) inter=studetnsInt;
            else inter=fxdInt;
            temploan=cust[i].getApprovedloan();
            finbal=((tempbal)+(tempbal*inter/100)-(temploan*10/100));
            if(!tempType.equals("student")) finbal-=500;
            cust[i].setBalance(finbal);
        }
        curtime+=1;
        System.out.println(curtime+" year passed");
        return;
    }

    public int getPendingloan() {
        return pendingloan;
    }

    public void AproveloanBank(){
        int i;
        double reloan;
        for(i=0;i<curcustomer;i++){
            reloan=cust[i].getRequloan();
            initfunds-=reloan;
            cust[i].setApprovedloan();
            if(reloan!=0)System.out.println("Loan for "+cust[i].getName()+" Approved");
        }
        pendingloan=0;
        penloanbal=0;
    }
    public void changeInterest(String typ,double NewInt){
        if(typ.equals("saving")) savingsInt=NewInt;
        else if(typ.equals("student")) studetnsInt=NewInt;
        else fxdInt=NewInt;
    }
}
