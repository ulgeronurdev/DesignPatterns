package factory_design_pattern;

public class CarFactory {
    public static Car createCar(Class aCLass) throws InstantiationException, IllegalAccessException {
        return(Car) aCLass.newInstance();
    }
}
