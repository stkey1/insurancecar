package stkey;

/**
 * This method for creating different class objects with factory pattern
 * @author stkey
 * @add class
 * @return newInstance
 * @since 13.12.2022
 */
public class CarFactory {
    public static ICarSpec createCar(Class aClass) throws IllegalAccessException, InstantiationException{
        return (ICarSpec) aClass.newInstance();
    }
}
