package activity5;

/**
 * Author: Allen Telson
 *
 * Description: The class VehicleFrame implements the interface Chassis that is used to implement
 * the methods from the Chassis interface and provide fields and methods related to a vehicle
 * frame.
 */

public class VehicleFrame implements Chassis {

  //  Create a String named vehicleFrameType instance variable.
  private String vehicleFrameType;

  /**
   * A public default constructor that sets vehicleFrameType to "Unibody".
   */
  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  /**
   * an overloaded constructor with the following value: A String with a parameter value of
   * vehicleFrameType. Usse the interface constant as the default String value.
   *
   * @param vehicleFrameType is used to set specific chassisName.
   */
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Overridden accessor method implemented from Chassis interface used to get chassis type.
   */
  @Override
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Overridden mutator method implemented from Chassis interface used to set chassis type to
   * vehicleFrameType.
   *
   * @param vehicleFrameType is used as a String to set to vehicleFrameType.
   */
  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Overridden toString() method used to return chassis and vehicleFrameType.
   */
  @Override
  public String toString() {
    return "Chassis:         " + this.chassis + "\n"
        + "Vehicle Frame:   " + this.vehicleFrameType;
  }
}
