public class SystemBuilder {
    public Systeminpu getSystem(String pkg,String wbsrb){
        Systeminpu temp=new Systeminpu();
        temp.setWebserver(wbsrb);
        if(pkg.equals("Silver")){
            temp.setPeocessorDep("AtMega32");
            temp.setWeightMeasurements("Load Sensor");
        }
        else if(pkg.equals("Gold")){
            temp.setPeocessorDep("ArduionoMega");
            temp.setWeightMeasurements("Weight Module");
        }
        else if(pkg.equals("Diamond")){
            temp.setPeocessorDep("Raspberry Pi");
            temp.setWeightMeasurements("Load Sensor");
        }
        else {
            temp.setPeocessorDep("Raspberry Pi");
            temp.setWeightMeasurements("Weight Module");
        }
        return temp;
    }
}
