package stkey;

/**
 * This method for creating builder object
 * @author stkey
 * @add origin1, carBrand1, model, gearType, modelYear, isDamaged, motorPower;
 * @since 13.12.2022
 */
public class Insurance {
    private String origin1, carBrand1;
    private String model, gearType;
    private int modelYear, isDamaged;
    private float motorPower;

    public Insurance(Builder builder) {
        this.origin1 = builder.origin1;
        this.carBrand1 = builder.carBrand1;
        this.gearType = builder.gearType;
        this.isDamaged = builder.isDamaged;
        this.model = builder.model;
        this.modelYear = builder.modelYear;
        this.motorPower = (float) builder.motorPower;
    }

    public static class Builder {
        private String carBrand1;
        private String origin1;
        private String model;
        private String gearType;
        private int modelYear;
        private int isDamaged;
        private double motorPower;

        public Builder(String brand, String origin1, String model, String gearType, int modelYear, int isDamaged, double motorPower) {
            this.carBrand1 = brand;
            this.model = model;
            this.origin1 = origin1;
            this.gearType = gearType;
            this.modelYear = modelYear;
            this.isDamaged = isDamaged;
            this.motorPower = motorPower;
        }

        public Insurance build() {
            return new Insurance(this);
        }
        public Builder(String carBrand1, String origin1){
            this.carBrand1 = carBrand1;
            this.origin1 = origin1;
        }


        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setGearType(String gearType) {
            this.gearType = gearType;
            return this;
        }
        public Builder setModelYear(int modelYear) {
            this.modelYear = modelYear;
            return this;
        }
        public Builder setisDamaged(int isDamaged) {
            this.isDamaged = isDamaged;
            return this;
        }
        public Builder setMotorPower(double motorPower) {
            this.motorPower = motorPower;
            return this;
        }
    }


    public String getOrigin1() {
        return origin1;
    }

    public String getCarBrand1() {
        return carBrand1;
    }

    public String getModel() {
        return model;
    }

    public String getGearType() {
        return gearType;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getIsDamaged() {
        return isDamaged;
    }

    public float getMotorPower() {
        return motorPower;
    }
}
