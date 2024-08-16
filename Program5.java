//import stuff here?

//Your code here

//Paste console output below:
/*


*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
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
        
        // Calculate average miles per gallon
        double royaleAverage = (double) royalemMiles / royaleGallons;
        double royaleRound = Math.round(royaleAverage * 10.0) / 10.0;
        System.out.println("Royale averaged " + royaleRound + " m/g"); 
        
        double koopaAverage = (double) koopaMiles / koopaGallons;
        double koopaRound = Math.round(koopaAverage * 10.0) / 10.0;
        System.out.println("Koopa averaged " + koopaRound + " m/g"); 
        
        double pipeAverage = (double) pipeMiles / pipeGallons;
        double pipeRound = Math.round(pipeAverage * 10.0) / 10.0;
        System.out.println("Pipe averaged " + pipeRound + " m/g");
        
        double badwagonAverage = (double) badwagonMiles / badwagonGallons;
        double badWagonRound = Math.round(badwagonAverage * 10.0) / 10.0;
        System.out.println("Badwagon averaged " + badWagonRound + " m/g");
    }
}
