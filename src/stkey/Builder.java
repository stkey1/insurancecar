package stkey;

public interface Builder {
    int calcCarbrand(String carBrand);
    int calcMotorPower(float power);
    int calcModel(String model);
    int calcModelYear(int year);
    int calcDamaged(int damage);
    int calcOrigin(String origin);
    int calcGearType(String gear);
}
