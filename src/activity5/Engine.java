package activity5;

import java.util.Date;

/**
 * Author: Allen Telson
 *
 * Description: The interface Engine is used to provide structure to what any implementation of a
 * vehicle engine can do. The interface contains accessors and mutators that involve manipulating
 * the fields that pertains to an Engine.
 */
public interface Engine {

  // mutator method used to set engineCylinders field
  public void setEngineCylinders(int engineCylinders);

  // mutator method used to set date field
  public void setEngineManufacturedDate(Date date);

  // mutator method used to set engineManufacturer field
  public void setEngineManufacturer(String manufacturer);

  // mutator method used to set engineMake field
  public void setEngineMake(String engineMake);

  // mutator method used to set engineModel field
  public void setEngineModel(String engineModel);

  // mutator method used to set driveTrain field
  public void setDriveTrain(String driveTrain);

  // mutator method used to set engineType field
  public void setEngineType(String fuel);

}
