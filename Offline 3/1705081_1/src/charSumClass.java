import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class charSumClass implements OtherSumClass{
    @Override
    public int CalcSum(String fname){
        int x=0,y,i,j;
        try{
            File myfile=new File(fname);
            Scanner sc=new Scanner(myfile);
            while (sc.hasNextLine()){
                String inpu=sc.nextLine();
                String inpunum[]=inpu.split(" ");
                for(i=0;i<inpunum.length;i++){
                    for(j=0;j<inpunum[i].length();j++){
                        x+=inpunum[i].charAt(j);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            //e.printStackTrace();
        }
        return x;
    }
}
