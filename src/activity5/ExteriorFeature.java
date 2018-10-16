package activity5;

/**
 * Author: Allen Telson
 *
 * Description: The InteriorFeature class implements the interface Feature in which provides
 * implemented methods that are overridden and used with respect to its own properties. The class is
 * used to create InteriorFeature objects that will be used if a vehicle object has certain interior
 * features that need to be listed.
 */

public class ExteriorFeature implements Feature {

  // String used to represent an exterior feature
  private String exteriorFeature;

  /**
   * Default constructor that sets interiorFeature to "Generic".
   */
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  /**
   * Overloaded constructor that passes an argument to set exteriorFeature.
   *
   * @param exteriorFeature is used to set specific exterior feature.
   */
  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * Overridden accessor String method from Feature interface used specifically to get
   * exteriorFeature.
   */
  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  /**
   * Overridden mutator method from Feature interface used to set specific exteriorFeature.
   *
   * @param feature is used to set exteriorFeature.
   */
  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  /**
   * Overriden toString() method used to return exterior features
   */
  @Override
  public String toString() {
    return "Exterior   : [" + this.exteriorFeature + "]";
  }
}
