/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.appfuse.service.jaxws;

/**
 * Response bean for the getUsersResponse operation.
 */
@javax.xml.bind.annotation.XmlRootElement (
  name = "getUsersResponse",
  namespace = "http://service.appfuse.org/"
)
@javax.xml.bind.annotation.XmlType (
  name = "getUsersResponse",
  namespace = "http://service.appfuse.org/",
  propOrder = { "return" }
)
public class GetUsersResponse {

  private java.util.List<org.appfuse.model.User> _retval;

  /**
   * 
   */
  public java.util.List<org.appfuse.model.User> getReturn() {
    return this._retval;
  }

  /**
   * 
   */
  public void setReturn(java.util.List<org.appfuse.model.User> value) {
    this._retval = value;
  }
}
