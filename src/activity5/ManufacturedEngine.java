package activity5;

import java.util.Date;

/**
 * Author: Allen Telson
 *
 * Description: The ManufacturedEngine class implements the Engine interface and provides
 * constructors, accessors and mutators used to manipulate the variables that pertain to Engine and
 * the variables within the class itself. The ManufacturedEngine class is used in conjunction to
 * creating a vehicle.
 */

public class ManufacturedEngine implements Engine {

  // private fields used to provide information about a manufactured engine
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /**
   * public default constructor ManufacturedEngine that sets variables to generic values.
   */
  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "85 AKI";
    this.driveTrain = "2WD: Two-Wheel Drives";
  }

  /**
   * public Overloaded constructor ManufacturedEngine that uses arguments passed through the
   * parameters to set variables.
   *
   * @param engineManufacturer for engine manufacturer name.
   * @param engineManufacturedDate for engine manufactured date.
   * @param engineMake for name of engine make.
   * @param engineModel for name of engine model.
   * @param driveTrain for drive train.
   * @param engineCylinders for the amount of cylinders the engine has.
   * @param engineType for the type of engine.
   */
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String driveTrain, int engineCylinders,
      String engineType) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.driveTrain = driveTrain;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
  }

  /**
   * Mutator method used to set engineCylinder using int-type parameter.
   *
   * @param engineCylinders for amount of cylinders the engine has.
   */
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * Mutator method used to set date using date-type parameter.
   *
   * @param date is used as a passing argument to set date to specific time.
   */
  public void setEngineManufacturedDate(Date date) {
    engineManufacturedDate = date;
  }

  /**
   * Mutator method used to set engine manufacturer name using String-type parameter.
   *
   * @param manufacturer is used to set name of engine manufacturer.
   */
  public void setEngineManufacturer(String manufacturer) {
    engineManufacturer = manufacturer;
  }

  /**
   * Mutator method used to set engine make using String-type parameter.
   *
   * @param engineMake is used to set engine make.
   */
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * Mutator method used to set engine model name using String-type parameter.
   *
   * @param engineModel is used to set engine model.
   */
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * Mutator method used to set drive train using String-type parameter.
   *
   * @param driveTrain is used to set drive train.
   */
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * Mutator method used to set engine type using String-type parameter.
   *
   * @param engineType is used to set engine type.
   */
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  /**
   * Overriding toString method to return all variables to console.
   */
  @Override
  public String toString() {

    return "Engine Manufacturer    : " + engineManufacturer + "\n"
        + "Engine Manufactured    : " + engineManufacturedDate + "\n"
        + "Engine Make            : " + engineMake + "\n"
        + "Engine Model           : " + engineModel + "\n"
        + "Engine Type            : " + engineType + "\n"
        + "Engine Cylinders       : " + engineCylinders + "\n"
        + "Drive Train            :" + driveTrain;
  }
}
