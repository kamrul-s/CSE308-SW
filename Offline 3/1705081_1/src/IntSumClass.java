import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class IntSumClass implements SumInterface{
    AdapterClass adp;
    @Override
    public int CalcSum(String fname,String type){
        if(type.equalsIgnoreCase("character")){
            adp=new AdapterClass(type);
            return adp.CalcSum(fname,type);
        }
        int x=0,y,i,j;
        try{
            File myfile=new File(fname);
            Scanner sc=new Scanner(myfile);
            while (sc.hasNextLine()){
                String inpu=sc.nextLine();
                String inpunum[]=inpu.split(" ");
                for(i=0;i<inpunum.length;i++){
                    try{
                        y=Integer.parseInt(inpunum[i]);
                    }
                    catch(NumberFormatException e){
                        System.out.println("File contains non integer number");
                        return 0;
                    }
                    x+=y;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            //e.printStackTrace();
        }
        return x;
    }
}
