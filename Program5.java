//import stuff here?

//Your code here

//Paste console output below:
/*


*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
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
        System.out.println("Royale averaged " + Math.round(royaleAverage * 10.0) / 10.0 + " m/g"); 
        
        double koopaAverage = (double) koopaMiles / koopaGallons;
        System.out.println("Koopa averaged " + Math.round(koopaAverage * 10.0) / 10.0 + " m/g"); 
        
        double pipeAverage = (double) pipeMiles / pipeGallons;
        System.out.println("Pipe averaged " + Math.round(pipeAverage * 10.0) / 10.0 + " m/g");
        
        double badwagonAverage = (double) badwagonMiles / badwagonGallons;
        System.out.println("Badwagon averaged " + Math.round(badwagonAverage * 10.0) / 10.0 + " m/g");
    }
}
