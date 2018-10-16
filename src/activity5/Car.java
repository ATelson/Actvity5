package activity5;

import java.util.Date;

/**
 * Author: Allen Telson
 *
 * Description: The class Car extends Vehicle which contains implemented methods from both Engine
 * and Chassis interfaces in which all aggregate to the Car class in order to be able to create a
 * Car object that contains all fields and methods necessary to provide Manufacture Name,
 * Manufactured Date, Vehicle Make, Vehicle Model, Vehicle Type, Engine Manufacturer, Engine
 * Manufacture Date, Engine Make, Engine Model, Engine Type, Engine Cylinders, Drive Train, Interior
 * Features(if any), Exterior Features(if any), and Car Axle to be accessed and can be manipulated.
 */
public final class Car extends Vehicle {

  //field used to create list of features and a field used to as car axle
  private Feature[] featureList;
  private int carAxle;

  /**
   * Default constructor that sets all fields to generic values.
   */

  public Car() {
    super();
    Feature[] list = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.featureList = list;
    this.carAxle = 2;
  }

  /**
   * Overloaded constructor that passes arguments which are used to set fields within the Car
   * object. Uses super() method to pass parameters as arguments from the Vehicle class.
   *
   * @param vehicleManufacturedDate is used to set vehicleManufacturedDate.
   * @param vehicleManufacturer is used to set vehicleManufacturer.
   * @param vehicleMake is used to set vehicleMake.
   * @param vehicleModel is used to set vehicleModel.
   * @param vehicleFrame is used to set vehicleFrame.
   * @param vehicleType is used to set vehicleType.
   * @param driveTrain is used to set drive train.
   * @param vehicleEngine is used to set vehicleEngine.
   * @param feature is used to set the list of features.
   * @param carAxle is used to set carAxle.
   */
  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake
      , String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine,
      Feature[] feature, int carAxle) {

    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame, vehicleType,
        driveTrain, vehicleEngine);
    this.featureList = feature;
    this.carAxle = carAxle;

  }

  /**
   * String method getExteriorFeatures is an accessor method used to get and return the list of
   * exterior features.
   */

  String getExteriorFeatures() {

    // String exteriorFeatureList used to separate each feature properly
    String exteriorFeatureList = "";

    //used to access all elements within the Feature array
    for (int i = 0; i < this.featureList.length; i++) {

      //if the element with the feature array is an instance of ExteriorFeature
      if (this.featureList[i] instanceof ExteriorFeature) {

        // if the exteriorFeatureList length is 0
        if (exteriorFeatureList.length() == 0) {

          // add feature element to exteriorFeatureList
          exteriorFeatureList += this.featureList[i];
        }

        // else add tab below, add space and add feature element to exteriorFeatureList
        else {
          exteriorFeatureList += "\n          :  " + this.featureList[i];
        }// end of else statement
      }// end of if-else statement
    }// end of for loop
    return exteriorFeatureList;
  }

  /**
   * String method getInteriorFeatures is an accessor method used to get and return the list of
   * interior features.
   */

  String getInteriorFeatures() {

    // String interiorFeatureList used to separate each feature properly
    String interiorFeatureList = "";

    //used to access all elements within the Feature array
    for (int i = 0; i < this.featureList.length; i++) {

      //if the element with the feature array is an instance of InteriorFeature
      if (this.featureList[i] instanceof InteriorFeature) {

        // if the interiorFeatureList length is 0
        if (interiorFeatureList.length() == 0) {

          // add feature element to interiorFeatureList
          interiorFeatureList += this.featureList[i];
        }
        // else add tab below, add space and add feature element to interiorFeatureList
        else {
          interiorFeatureList += "\n          " + this.featureList[i];
        } // end of else statement
      } // end of if-else statement
    } // end of for loop
    return interiorFeatureList;
  }

  /**
   * Overridden toString() method used to return all fields that pertains to a car. All fields come
   * from aggregating all interfaces and classes into this Car class in order to provide information
   * for a car.
   */

  @Override
  public String toString() {

    //String used to separate feature list properly.
    String featureList = "";

    //use a for loop to access all elements within array
    for (int i = 0; i < this.featureList.length; i++) {

      // if the array length is 0 then add feature element to featureList String
      if (this.featureList.length == 0) {
        featureList += this.featureList[i];
      }

      //else tab down and add white space to match the format of loaded information
      //and add feature element to feature list.
      else {
        featureList += "\n            " + this.featureList[i];
      }
      //end of if-else statement
    } // end of for loop

    //return all information from Vehicle using super and also add features to the information
    // along with car axel.
    return super.toString() + "\n" + "Features" + featureList + "\n" + "Car Axle               : "
        + carAxle;
  }

}
