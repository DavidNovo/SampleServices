/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.appfuse.service;

/**
 * (no documentation provided)
 */
@javax.xml.ws.WebFault (
  faultBean = "org.appfuse.service.jaxws.UserExistsExceptionBean"
)
public class UserExistsException extends Exception {
  private org.appfuse.service.jaxws.UserExistsExceptionBean faultInfo;

  public UserExistsException(String message, org.appfuse.service.jaxws.UserExistsExceptionBean faultInfo) {
    super(message);
    init(faultInfo);
    if (message != null) {
      this.message = message;
    }
  }

  public UserExistsException(String message, org.appfuse.service.jaxws.UserExistsExceptionBean faultInfo, Throwable cause) {
    super(message, cause);
    init(faultInfo);
    if (message != null) {
      this.message = message;
    }
  }

  protected void init(org.appfuse.service.jaxws.UserExistsExceptionBean faultInfo) {
    setMessage(faultInfo.getMessage());
  }

  /**
   * The fault info for this exception.
   */
  public org.appfuse.service.jaxws.UserExistsExceptionBean getFaultInfo() {
    return this.faultInfo;
  }

  private java.lang.String message;

  /**
   * (no documentation provided)
   */
  public java.lang.String getMessage() {
    return this.message;
  }

  /**
   * (no documentation provided)
   */
  public void setMessage(java.lang.String message) {
    this.message = message;
  }

}
