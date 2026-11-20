public class Week3 {
    public static void main(String[] args) {


        // roller simulation
        boolean rollerSensor = true;
        boolean kickerSensor = true;
        boolean shooterSensor = false;
        if (shooterSensor) {
            System.out.println("Shoot the note");
        } else if (rollerSensor && kickerSensor) {
            System.out.println("Keep moving the note into the kicker");
        } else if (kickerSensor) {
            System.out.println("Move the note to the shooter");
        } else if (rollerSensor) {
            System.out.println("Keep running the rollers until the note reaches the kicker");
        } else {
            System.out.println("Run the rollers to collect the note");
        }


        // fuel counter
        int fuelCount = 0;
        for (int i = 1; i <= 8; i++) {
            fuelCount++;
        }
        System.out.println(fuelCount);
        int shots = 0;
        while (fuelCount > 0) {
            fuelCount--;
            shots++;
        }
        System.out.println(shots);
        System.out.println(fuelCount);

        
        
        // Simulated fuel counter
        int simFuelCount = 0;
        int simulatedFuelCounter = 0;
        for (int cycle = 1; cycle <= 50; cycle++) {
            simulatedFuelCounter++;
            if (simulatedFuelCounter >= 5) {
                simFuelCount++;
                simulatedFuelCounter = 0;
            }
        }
        System.out.println(simFuelCount);  // prints 10


        

        System.out.println(circumference(0.0515507563));
        System.out.println(isNear(45.0, 41.5, 5.0));

    }
    public static String rollerStatus(double measured, double target, double tolerance) {
        if (isNear(measured, target, tolerance)) {
            return "At speed";
        } else if (measured > target) {
            return "Too fast";
        } else {
            return "Too slow";
        }
    }

    // week 2 missions to methods
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static boolean isNear(double a, double b, double tolerance) {
        return Math.abs(a - b) <= tolerance;
    }    



}
