public class Program5 {
public static void main(String[] args) {

        
        // Miles driven by each vehicle
        int royalemMiles = 286;
        int koopaMiles = 412;
        int pipeMiles = 361;
        int badwagonMiles = 161;
       
        // Gallons used by each vehicle
        int royaleGallons = 9;
        int koopaGallons = 40;
        int pipeGallons = 18;
        int badwagonGallons = 11;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        
        // Calculate average miles per gallon
        double royaleAverage = (double) royalemMiles / royaleGallons;
        double royaleRound = Math.round(royaleAverage * 10.0) / 10.0;
        System.out.println("Royale averaged " + royaleRound + " m/g"); 
        
        double koopaAverage = (double) koopaMiles / koopaGallons;
        double koopaRound = Math.round(koopaAverage * 10.0) / 10.0;
        System.out.println("Koopa King averaged " + koopaRound + " m/g"); 
        
        double pipeAverage = (double) pipeMiles / pipeGallons;
        double pipeRound = Math.round(pipeAverage * 10.0) / 10.0;
        System.out.println("Pipe Frame averaged " + pipeRound + " m/g");
        
        double badwagonAverage = (double) badwagonMiles / badwagonGallons;
        double badWagonRound = Math.round(badwagonAverage * 10.0) / 10.0;
        System.out.println("Badwagon averaged " + badWagonRound + " m/g");
    }
}
