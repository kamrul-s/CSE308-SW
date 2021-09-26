import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ch,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Select file type:\n1. Integer \n2. Character");
        ch=sc.nextInt();
        sc.nextLine();
        while(!(ch==1 || ch==2)){
            System.out.println("Invalid option");
            System.out.println("Select file type:\n1. Integer \n2. Character");
            ch=sc.nextInt();
            sc.nextLine();
        }
        String type;
        if(ch==1) type="integer";
        else type="character";
        System.out.println("Enter File name");
        String inpufile = sc.nextLine();
        IntSumClass myobj=new IntSumClass();
        x=myobj.CalcSum(inpufile,type);
        System.out.println("The Sum is: "+x);
    }
}
