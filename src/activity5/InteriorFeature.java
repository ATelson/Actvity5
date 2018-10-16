package activity5;

/**
 * Author: Allen Telson
 *
 * Description: The InteriorFeature class implements the interface Feature in which provides
 * implemented methods that are overridden and used with respect to its own properties. The class is
 * used to create InteriorFeature objects that will be used if a vehicle object has certain interior
 * features that need to be listed.
 */

public class InteriorFeature implements Feature {

  // String used to represent an interior feature
  private String interiorFeature;

  /**
   * Default constructor that sets interiorFeature to "Generic".
   */

  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  /**
   * Overloaded constructor that passes an argument to set interiorFeature.
   *
   * @param interiorFeature is used to set specific interior feature.
   */

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  /**
   * Overridden accessor String method from Feature interface used specifically to get
   * interiorFeature.
   */

  @Override
  public String getFeature() {
    return this.interiorFeature;
  }

  /**
   * Overridden mutator method from Feature interface used to set specific interiorFeature.
   *
   * @param feature is used to set interiorFeature.
   */
  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  /**
   * Overriden toString() method used to return interior features
   */

  @Override
  public String toString() {
    return "Interior   : [" + this.interiorFeature + "]";
  }
}
