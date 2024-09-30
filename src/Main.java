
public class Main {

    public static void main(String[] args) {
        TempSpringChecker checker = new TempSpringChecker();

        System.out.println("Temperature:" + checker.isSpring(5.0));
        System.out.println("Temperature:" + checker.isSpring(10.5));
        System.out.println("Temperature:" + checker.isSpring(22.0));
        System.out.println("Temperature:" + checker.isSpring(-7.0));


    }

}

