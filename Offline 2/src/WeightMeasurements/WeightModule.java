package WeightMeasurements;

import WeightMeasurements.WeightMeasurement;

public class WeightModule implements WeightMeasurement {
    @Override
    public String getWeightMeasurement(){
        System.out.println("WeightMeasurement:Interface with a weight module");
        return "Weight Module";
    }
}
