package activity5;

import java.util.Date;

/**
 * Author: Allen Telson
 *
 * Description: The Vehicle class implements both the Engine and Chassis interfaces and is used to
 * provide structure to create a Vehicle object that can take advantage of all implemented methods
 * from both interfaces in order to give information about the vehicle that contains information
 * that will include fields within its class including its chassis and engine.
 */
public class Vehicle implements Engine, Chassis {

  // private fields used to provide information about a Vehicle itself
  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  /**
   * default Vehicle constructor used to set all fields to default values when creating Vehicle
   * object.
   */
  public Vehicle() {
    this.vehicleManufacturedDate = new Date(); // instantiating new Date object
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame(); // instantiating new Vehicle object
    this.vehicleType = "Generic";
    this.vehicleEngine = new ManufacturedEngine(); //instantiating manufacturedEngine object
    this.vehicleEngine.setDriveTrain("Generic");
    this.vehicleEngine.setEngineType("Generic");
  }

  /**
   * Overloaded Vehicle constructor used to set all fields to arguments passed in as parameters to
   * set values when creating Vehicle object.
   *
   * @param vehicleManufacturer is used to set name of vehicle manufacturer.
   * @param vehicleManufacturedDate is used to set manufactured date.
   * @param vehicleMake is used to set name of vehicle make.
   * @param vehicleModel is used to set name of vehicle model.
   * @param vehicleType is used to set vehicle type.
   * @param vehicleFrame is used to set vehicle frame in reference to Chassis interface.
   * @param engine is used to set properties of the engine using referencing to the Engine
   * interface.
   */
  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine engine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = engine;
  }

  /**
   * Overridden Mutator method from Engine interface used to set engine cylinders for a vehicle,
   * calling a method from the manufacturedEngine class and using int-type parameter as an argument
   * to set to engine cylinders.
   *
   * @param engineCylinders is used to set engine cylinders.
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  /**
   * Overridden Mutator method from Engine interface used to set engine manufactured date for a
   * vehicle, calling a method from the manufacturedEngine class and using Date-type parameter as an
   * argument to set to manufactured date.
   *
   * @param date is used to set date for engine manufactured date.
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }

  /**
   * Overridden Mutator method from Engine interface used to set engine manufacturer for a vehicle,
   * calling a method from the manufacturedEngine class and using String-type parameter as an
   * argument to set to engine manufacturer.
   *
   * @param manufacturer is used to set engine manufacturer name.
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleEngine.setEngineManufacturer(manufacturer);
  }

  /**
   * Overridden Mutator method from Engine used to set engine make for a vehicle, calling a method
   * from the manufacturedEngine class and using String-type parameter as an argument to set to
   * engine make.
   *
   * @param engineMake is used to set engine make.
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * Overridden Mutator method from Engine interface used to set engine model for a vehicle, calling
   * a method from the manufacturedEngine class and using String-type parameter as an argument to
   * set to engine model.
   *
   * @param engineModel is used to set engine model.
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineMake(engineModel);
  }

  /**
   * Overridden Mutator method from Engine interface used to set drive train for a vehicle, calling
   * a method from the manufacturedEngine class and using String-type parameter as an argument to
   * set to drive train.
   *
   * @param driveTrain is used to set drive train.
   */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  /**
   * Overridden Mutator method from Engine interface used to set engine type for a vehicle, calling
   * a method from the manufacturedEngine class and using String-type parameter as an argument to
   * set to engine type.
   *
   * @param fuel is used to set engine type.
   */
  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  /**
   * Overridden Accessor method from Chassis interface used to get chassis type for a vehicle,
   * calling a method from the VehicleChassis class to get chassis type.
   */
  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  /**
   * Overridden Mutator method from Chassis interface used to set chassis type for a vehicle,
   * calling a method from the VehicleChassis class and using String-type parameter as an argument
   * to set to chassis type.
   *
   * @param vehicleChassis is used to set vehicle chassis.
   */
  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  /**
   * Overridden toString method used to return all fields within the Vehicle class.
   */
  @Override
  public String toString() {

    return "Manufacturer Name      : " + this.vehicleManufacturer + "\n"
        + "Manufactured Date      : " + this.vehicleManufacturedDate.toString() + "\n"
        + "Vehicle Make           : " + this.vehicleMake + "\n"
        + "Vehicle Model          : " + this.vehicleModel + "\n"
        + "Vehicle Type           : " + this.vehicleType + "\n"
        + vehicleEngine.toString();
  }
}
