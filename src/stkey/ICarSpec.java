package stkey;

public interface ICarSpec {
    int setModelYear(int modelYear);
    String setModel(String model);
    float setMotorPower(float motorPower);
    int setisDamaged(int isDamaged);
    String setgearType(String gearType);
    String getModel();
    String getGearType();
    int getModelYear();
    int getIsDamaged();
    double getMotorPower();
}
