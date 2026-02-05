import java.util.ArrayList;
import java.util.List;

/*
 UC3: Retrieve Vessel by ID
 -------------------------
 This class allows searching a vessel
 using a case-sensitive vesselId.
*/

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId) {

        // Loop to search vessel by ID
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
}
