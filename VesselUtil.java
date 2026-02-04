import java.util.ArrayList;
import java.util.List;

/*
 UC2: Vessel Storage Utility
 ---------------------------
 This class stores Vessel objects using a List.
 It supports dynamic addition of vessel records.
*/

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    // Adds vessel to the list
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
}
