package WeightMeasurements;

public class LoadSensor implements WeightMeasurement {
    @Override
    public String getWeightMeasurement(){
        System.out.println("WeightMeasurement:Implement with load Sensor");
        return "Load Sensor";
    }
}
