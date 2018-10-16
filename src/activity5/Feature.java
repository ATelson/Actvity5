package activity5;

/**
 * Author: Allen Telson
 *
 * Description: The interface Feature is used to provide structure to what any
 * implementation of a vehicle chassis can do. The interface contains a String named chassis and
 * an accessor and a mutator method in order to manipulate the String.
 */

public interface Feature {

  // accessor method definition to get feature String
  public String getFeature();

  // mutator method definition to set feature String
  public void setFeature(String feature);
}
