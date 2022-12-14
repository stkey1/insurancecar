package stkey;

/**
 * This method for creating CarManager Objects
 * @author stkey
 * @since 13.12.2022
 */
public class CarManager implements ICarSpec{
    String origin, carBrand;
    private String model, gearType;
    private int modelYear, isDamaged;
    private double motorPower;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getGearType() {
        return gearType;
    }

    @Override
    public int getModelYear() {
        return modelYear;
    }

    @Override
    public int getIsDamaged() {
        return isDamaged;
    }

    @Override
    public double getMotorPower() {
        return motorPower;
    }

    @Override
    public int setModelYear(int modelYear) {
        this.modelYear = modelYear;
        return modelYear;
    }

    @Override
    public String setModel(String model) {
        this.model = model;
        return model;
    }

    @Override
    public float setMotorPower(float motorPower) {
        this.motorPower = motorPower;
        return motorPower;
    }

    @Override
    public int setisDamaged(int isDamaged) {
        this.isDamaged = isDamaged;
        return isDamaged;
    }

    @Override
    public String setgearType(String gearType) {
        this.gearType = gearType;
        return gearType;
    }
    public void cikar(){
        System.out.println(origin + carBrand + model + gearType + modelYear + isDamaged + motorPower);
    }
}
