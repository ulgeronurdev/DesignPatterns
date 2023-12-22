package singleton_design_pattern;

public class MainEager {
    public static void main(String[] args) {
        SingletonDesignPatternEager instance = SingletonDesignPatternEager.getInstance();
        System.out.println("Instance created");
    }
}
