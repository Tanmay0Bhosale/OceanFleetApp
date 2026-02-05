import java.util.ArrayList;
import java.util.List;

/*
 UC4: High Performance Vessel Identification
 -------------------------------------------
 This class finds vessel(s) having
 the highest average speed.
*/

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId) {
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> result = new ArrayList<>();
        double maxSpeed = 0;

        // Find maximum speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Collect vessels matching max speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                result.add(vessel);
            }
        }

        return result;
    }
}
