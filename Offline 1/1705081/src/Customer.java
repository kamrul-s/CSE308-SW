public class Customer{
    private String name;
    private double balance;
    private double requloan;
    private double approvedloan;
    private String accType;
    private Bank obj;
    private int crtime;


    public Customer(String name, String acctype, double balance,Bank ob) {
        this.name = name;
        this.balance = balance;
        this.accType=acctype.toLowerCase();
        this.requloan=0;
        this.approvedloan=0;
        this.obj=ob;
        crtime=ob.getCurtime();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccType() {
        return accType;
    }

    public void setApprovedloan() {
        this.approvedloan += requloan;
        this.requloan=0;
        balance+=approvedloan;
    }

    public double getApprovedloan() {
        return approvedloan;
    }
    public double getRequloan() {
        return requloan;
    }


    public void Requloan(double requloan) {
        if((obj.getIntfunds()-obj.getPenloanbal())<requloan){
            System.out.println("Sorry can't request this amount of lone now!");
        }
        if((accType.equals("student")&&requloan>1000)||(accType.equals("saving")&&requloan>10000)||(accType.equals("fixed deposit")&&(requloan>100000 || (obj.getCurtime()-crtime)==0))){
            System.out.println("Sorry! You requested more than limits Or Doesn't hold the conditions");
            return;
        }
        this.requloan = requloan;
        obj.setPenloanbal(requloan);
        System.out.println("Loan request successful, sent for approval");
        return;
    }
    public void Query(){
        System.out.print("Current Balance "+balance+"$");
        if(approvedloan!=0){
            System.out.println(",loan "+approvedloan+"$");
        }
        System.out.println();
    }
    public void Deposit(double amoun){
        if(accType.equals("fixed deposit")&& amoun<50000){
            System.out.println("You can't deposite this little!");
            return;
        }
        balance+=amoun;
        System.out.println(amoun+"$ deposited; current balance "+balance+"$");
        return;
    }
    void Withdraw(double amoun){
        if((balance-amoun)<0){
            System.out.println("Invalid Transaction! Current Balance "+balance+"$");
            return;
        }
        if((accType.equals("student")&&amoun>10000)||(accType.equals("saving")&&(balance-amoun)<1000)||(accType.equals("fixed deposit")&&(obj.getCurtime()-crtime)==0)){
            System.out.println("Invalid Transaction! Current Balance "+balance+"$");
            return;
        }
        System.out.println("Withdraw successful");
        balance-=amoun;
    }

}
