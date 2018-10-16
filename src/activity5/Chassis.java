package activity5;

/**
 * Author: Allen Telson
 *
 * Description: The interface Chassis is used to provide structure to what any
 * implementation of a vehicle chassis can do. The interface contains a String named chassis and
 * accessors and mutators that involve manipulating the String.
 */


public interface Chassis {

  // A public constant string named chassis with a value of "chassis".
  public final String chassis = "Chassis";


  // the definition of a public getChassisType method that returns an integer
  public Chassis getChassisType();


  // the definition of a public setChassisType that accepts a string named vehicleChassis
  public void setChassisType(String vehicleChassis);


}
