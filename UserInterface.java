import java.util.List;
import java.util.Scanner;

/*
 UC5: User Interface
 -------------------
 This class handles user input and output.
 It allows adding vessels, searching by ID,
 and displaying high performance vessels.
*/

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter vessel details");

        // Read and add vessel data
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(":");
            Vessel v = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );
            util.addVesselPerformance(v);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String id = sc.nextLine();

        Vessel found = util.getVesselById(id);

        if (found != null) {
            System.out.println(found.getVesselId() + " | " +
                    found.getVesselName() + " | " +
                    found.getVesselType() + " | " +
                    found.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + id + " not found");
        }

        System.out.println("High performance vessels are");

        List<Vessel> list = util.getHighPerformanceVessels();

        // Display high performance vessels
        for (Vessel v : list) {
            System.out.println(v.getVesselId() + " | " +
                    v.getVesselName() + " | " +
                    v.getVesselType() + " | " +
                    v.getAverageSpeed() + " knots");
        }

        sc.close();
    }
}
