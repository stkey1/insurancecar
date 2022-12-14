package stkey;
/**
 * This method for creating objects and calculating total insurance price via objects
 * @author stkey
 * @add renault1, bmw1, mercedes1
 * @return totalPrice
 * @since 14.12.2022
 */
public class Total {
    /**
     * @return totalPrice
     */
    public int totalPrice() {
        CarFactory mercedes = new CarFactory();
        CarFactory bmw = new CarFactory();
        CarFactory renault = new CarFactory();
        Mercedes mercedes1 = null;
        Renault renault1 = null;
        Bmw bmw1 = null;
        try {
            mercedes1 = (Mercedes)
                    mercedes.createCar(Mercedes.class);
            bmw1 = (Bmw)
                    bmw.createCar(Bmw.class);
            renault1 = (Renault)
                    renault.createCar(Renault.class);

        } catch (IllegalAccessException |
                InstantiationException e) {
            e.printStackTrace();
        }

        Insurance insurance = new Insurance.Builder(mercedes1.carBrand, mercedes1.origin)
                .setGearType("Auto")
                .setisDamaged(1)
                .setModelYear(2015)
                .setMotorPower(2.0)
                .setModel("CLA200")
                .build();

        System.out.println("Looking for " + insurance.getCarBrand1() + " " + insurance.getModel());
        Calculation calculation = new Calculation();
        calculation.calcCarbrand(insurance.getCarBrand1());
        calculation.calcDamaged(insurance.getIsDamaged());
        calculation.calcGearType(insurance.getGearType());
        calculation.calcModel(insurance.getModel());
        calculation.calcModelYear(insurance.getModelYear());
        calculation.calcOrigin(insurance.getOrigin1());
        int totalPrice = calculation.calcMotorPower(insurance.getMotorPower());

        System.out.println("Total Insurance Price: " + totalPrice + " TL");

        return totalPrice;
    }
}
