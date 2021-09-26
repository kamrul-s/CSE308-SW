public class AdapterClass implements SumInterface {
    OtherSumClass adapte;
    public AdapterClass(String type){
        if(type.equalsIgnoreCase("character")) adapte=new charSumClass();
    }
    @Override
    public int CalcSum(String fname, String type) {
        if(type.equalsIgnoreCase("character")) return adapte.CalcSum(fname);
        return 0;
    }
}
