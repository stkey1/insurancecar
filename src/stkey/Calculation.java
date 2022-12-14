package stkey;

/**
 * This method for calculation total insurance according to car specs
 * @author stkey
 * @add carBrand, power, model, year, damage, origin, gear
 * @return total
 * @since 14.12.2022
 */
public class Calculation implements Builder {
    private int total = 0;

    /**
     * @param carBrand
     * @return total
     */
    @Override
    public int calcCarbrand(String carBrand) {
        if (carBrand.equalsIgnoreCase("Mercedes")) {
            total += 200;
            System.out.println("For Mercedes : 200");
        } else if (carBrand.equalsIgnoreCase("Bmw")) {
            total += 300;
            System.out.println("For Bmw : 300");
        } else if (carBrand.equalsIgnoreCase("Renault")) {
            total += 100;
            System.out.println("For Renault : 100");
        } else {
            System.out.println("There is not car brand");
        }
        return total;
    }

    /**
     * @param power
     * @return total
     */
    @Override
    public int calcMotorPower(float power) {
        if (power < 1.6) {
            total += 100;
            System.out.println("For less power than 1.6 : 100");
        } else if (power == 1.6) {
            total += 200;
            System.out.println("For power 1.6 : 200");
        } else if (power > 1.6) {
            total += 300;
            System.out.println("For more power than 1.6 : 300");
        } else {
            System.out.println("There is not car which has engine power");
        }
        return total;
    }

    /**
     * @param model
     * @return total
     */
    @Override
    public int calcModel(String model) {
        if (model.equalsIgnoreCase("Clio")) {
            total += 100;
            System.out.println("For Clio: 100");
        } else if (model.equalsIgnoreCase("Z4")) {
            total += 300;
            System.out.println("For Z4: 300");
        } else if (model.equalsIgnoreCase("cla200")) {
            total += 200;
            System.out.println("For Cla 200: 200");
        } else {
            System.out.println("There is not this type of car model");
        }
        return total;
    }

    /**
     * @param year
     * @return total
     */
    @Override
    public int calcModelYear(int year) {
        if (year < 2000) {
            total += 100;
            System.out.println("For less model year than 2000 : 100");
        } else if (year > 2000 && year < 2010) {
            total += 200;
            System.out.println("For model year between 2000-2010  : 200");
        } else if (year > 2010) {
            total += 300;
            System.out.println("For more model year than 2000 : 300");
        }
        return total;
    }

    /**
     * @param damage
     * @return total
     */
    @Override
    public int calcDamaged(int damage) {
        if (damage == 1) {
            total += 200;
            System.out.println("For damaged car : 200");
        } else {
            total -= 100;
            System.out.println("For not damaged car : -100");
        }
        return total;
    }

    /**
     * @param origin
     * @return total
     */

    @Override
    public int calcOrigin(String origin) {
        if (origin.equalsIgnoreCase("Germany")) {
            total += 200;
            System.out.println("For German car : 200");
        } else if (origin.equalsIgnoreCase("France")) {
            total += 100;
            System.out.println("For French car : 200");
        } else {
            System.out.println("This car is not supported");
        }
        return total;
    }

    /**
     * @param gear
     * @return total
     */
    @Override
    public int calcGearType(String gear) {
        if (gear.equalsIgnoreCase("Auto")) {
            total += 300;
            System.out.println("For automatic car : 300");
        } else if (gear.equalsIgnoreCase("Manuel")) {
            total += 200;
            System.out.println("For manuel car : 200");
        } else {
            System.out.println("There is not");
        }
        return total;
    }
}
