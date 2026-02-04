/*
 UC1: Vessel Model
 -----------------
 This class represents a vessel entity.
 It stores basic vessel information such as
 vesselId, vesselName, averageSpeed and vesselType.
*/

public class Vessel {

    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    public Vessel() {
    }

    public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    public String getVesselId() {
        return vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public String getVesselType() {
        return vesselType;
    }
}
