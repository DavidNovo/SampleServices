/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.appfuse.service.jaxws;

import javax.xml.namespace.QName;

/**
 * Response bean for the saveUserResponse operation.
 */
@javax.xml.bind.annotation.XmlRootElement (
  name = "saveUserResponse",
  namespace = "http://service.appfuse.org/"
)
@javax.xml.bind.annotation.XmlType (
  name = "saveUserResponse",
  namespace = "http://service.appfuse.org/",
  propOrder = { "_retval" }
)
 @javax.xml.bind.annotation.XmlAccessorType ( javax.xml.bind.annotation.XmlAccessType.FIELD )
public class SaveUserResponse {

  @javax.xml.bind.annotation.XmlElement (
    name = "return"
  )
  protected org.appfuse.model.User _retval;

  /**
   * 
   */
  public org.appfuse.model.User getReturn() {
    return this._retval;
  }

  /**
   * 
   */
  public void setReturn(org.appfuse.model.User value) {
    this._retval = value;
  }

}
