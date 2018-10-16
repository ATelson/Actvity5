package activity5;

/**
 * Author: Allen Telson
 *
 * Description: The class VehicleChassis implements the interface Chassis that is used to implement
 * the methods from the Chassis interface and provide fields and methods related to a vehicle
 * chassis.
 */

public class VehicleChassis implements Chassis {

  //  Create a String named chassisName instance variable.
  public String chassisName;

  /**
   * A public default constructor that sets chassisName to Chassis.
   */
  public VehicleChassis() {
    this.chassisName = chassis;
  }

  /**
   * an overloaded constructor with the following value: A String with a parameter value of
   * chassisName Set the chassisName instance variable in both, use the interface constant as the
   * default String value.
   *
   * @param chassisName is used to set specific chassisName.
   */
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  /**
   * A public method named getChassisType that doesn't have a formal parameter and that returns an
   * instance of the interface Chassis (hint that would be a copy of this class).
   */
  public Chassis getChassisType() {
    return this;
  }

  /**
   * A public method setChassisType that takes a String parameter vehicleChassis and that returns a
   * void. It should set the instance variable chassisName.
   *
   * @param vehicleChassis is used to set chassisName to vehicleChassis.
   */
  public void setChassisType(String vehicleChassis) {
    chassisName = vehicleChassis;
  }

  /**
   * A public toString method that returns the following: Chassis Name : Chassis.
   */
  public String toString() {
    return "Manufacturer  : " + chassisName + "\n"
        + "Serial Number : " + chassisName + "\n"
        + "Date          : " + chassisName + "\n"
        + "Name          : " + chassisName;
  }
}
