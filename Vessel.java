/*
 UC6: OOPS Refactoring
 --------------------
 Display responsibility moved to model
 to improve reusability and readability.
*/

public class Vessel {

    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    public String getVesselId() {
        return vesselId;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    // Vessel formats its own output
    public String displayVessel() {
        return vesselId + " | " + vesselName + " | " +
                vesselType + " | " + averageSpeed + " knots";
    }
}
