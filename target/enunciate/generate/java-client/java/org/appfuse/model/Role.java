/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.appfuse.model;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "role",
  namespace = ""
)
public class Role extends org.appfuse.model.BaseObject {

  private java.lang.String _description;
  private java.lang.String _name;
  private java.lang.Long _id;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "description",
    namespace = ""
  )
  public java.lang.String getDescription() {
    return this._description;
  }

  /**
   * (no documentation provided)
   */
  public void setDescription(java.lang.String _description) {
    this._description = _description;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "name",
    namespace = ""
  )
  public java.lang.String getName() {
    return this._name;
  }

  /**
   * (no documentation provided)
   */
  public void setName(java.lang.String _name) {
    this._name = _name;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "id",
    namespace = ""
  )
  public java.lang.Long getId() {
    return this._id;
  }

  /**
   * (no documentation provided)
   */
  public void setId(java.lang.Long _id) {
    this._id = _id;
  }

}