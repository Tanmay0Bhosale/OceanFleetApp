import java.util.List;
import java.util.Scanner;

/*
 UC6: Refactored User Interface
 ------------------------------
 This class handles user interaction via console.

 Refactoring Done:
 ✔ Removed formatting logic from UI
 ✔ Delegated display responsibility to Vessel class
 ✔ Improved separation of concerns
 ✔ Made UI thinner and cleaner
*/

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter vessel details");

        // Loop to read vessel input and store objects
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(":");

            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            util.addVesselPerformance(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String vesselId = sc.nextLine();

        Vessel found = util.getVesselById(vesselId);

        if (found != null) {

            // ✅ UC6 CHANGE: Model handles display
            System.out.println(found.displayVessel());

        } else {
            System.out.println("Vessel Id " + vesselId + " not found");
        }

        System.out.println("High performance vessels are");

        List<Vessel> highList = util.getHighPerformanceVessels();

        // Loop to print highest speed vessels
        for (Vessel vessel : highList) {
            System.out.println(vessel.displayVessel()); // UC6 change
        }

        sc.close();
    }
}
