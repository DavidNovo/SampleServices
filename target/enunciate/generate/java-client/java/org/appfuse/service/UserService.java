/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.appfuse.service;

/**
 * (no documentation provided)
 */
 @javax.jws.WebService (
   name = "UserService",
   targetNamespace = "http://service.appfuse.org/"
 )
 @javax.xml.bind.annotation.XmlSeeAlso ( {
  org.appfuse.service.jaxws.GetUser.class,
  org.appfuse.service.jaxws.GetUserByUsername.class,
  org.appfuse.service.jaxws.GetUserByUsernameResponse.class,
  org.appfuse.service.jaxws.GetUserResponse.class,
  org.appfuse.service.jaxws.GetUsers.class,
  org.appfuse.service.jaxws.GetUsersResponse.class,
  org.appfuse.service.jaxws.RemoveUser.class,
  org.appfuse.service.jaxws.RemoveUserResponse.class,
  org.appfuse.service.jaxws.SaveUser.class,
  org.appfuse.service.jaxws.SaveUserResponse.class,
  org.appfuse.service.jaxws.UserExistsExceptionBean.class
 } )
public interface UserService {

  /**
   * (no documentation provided)
   */
  @javax.jws.WebMethod (
    operationName = "getUser",
    action = ""
  )
  @javax.jws.WebResult (
    name = "return",
    targetNamespace = "",
    header = false,
    partName = "return"
  )
  @javax.xml.ws.RequestWrapper (
    localName = "getUser",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.GetUser"
  )
  @javax.xml.ws.ResponseWrapper (
    localName = "getUserResponse",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.GetUserResponse"
  )
  @javax.jws.soap.SOAPBinding (
    style = javax.jws.soap.SOAPBinding.Style.DOCUMENT,
    use = javax.jws.soap.SOAPBinding.Use.LITERAL,
    parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED
  )
  org.appfuse.model.User getUser(@javax.jws.WebParam( name = "arg0", targetNamespace="", mode = javax.jws.WebParam.Mode.IN , header = false, partName = "arg0" ) java.lang.String arg0) ;

  /**
   * (no documentation provided)
   */
  @javax.jws.WebMethod (
    operationName = "getUserByUsername",
    action = ""
  )
  @javax.jws.WebResult (
    name = "return",
    targetNamespace = "",
    header = false,
    partName = "return"
  )
  @javax.xml.ws.RequestWrapper (
    localName = "getUserByUsername",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.GetUserByUsername"
  )
  @javax.xml.ws.ResponseWrapper (
    localName = "getUserByUsernameResponse",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.GetUserByUsernameResponse"
  )
  @javax.jws.soap.SOAPBinding (
    style = javax.jws.soap.SOAPBinding.Style.DOCUMENT,
    use = javax.jws.soap.SOAPBinding.Use.LITERAL,
    parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED
  )
  org.appfuse.model.User getUserByUsername(@javax.jws.WebParam( name = "arg0", targetNamespace="", mode = javax.jws.WebParam.Mode.IN , header = false, partName = "arg0" ) java.lang.String arg0) ;

  /**
   * (no documentation provided)
   */
  @javax.jws.WebMethod (
    operationName = "getUsers",
    action = ""
  )
  @javax.jws.WebResult (
    name = "return",
    targetNamespace = "",
    header = false,
    partName = "return"
  )
  @javax.xml.ws.RequestWrapper (
    localName = "getUsers",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.GetUsers"
  )
  @javax.xml.ws.ResponseWrapper (
    localName = "getUsersResponse",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.GetUsersResponse"
  )
  @javax.jws.soap.SOAPBinding (
    style = javax.jws.soap.SOAPBinding.Style.DOCUMENT,
    use = javax.jws.soap.SOAPBinding.Use.LITERAL,
    parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED
  )
  java.util.List<org.appfuse.model.User> getUsers() ;

  /**
   * (no documentation provided)
   */
  @javax.jws.WebMethod (
    operationName = "saveUser",
    action = ""
  )
  @javax.jws.WebResult (
    name = "return",
    targetNamespace = "",
    header = false,
    partName = "return"
  )
  @javax.xml.ws.RequestWrapper (
    localName = "saveUser",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.SaveUser"
  )
  @javax.xml.ws.ResponseWrapper (
    localName = "saveUserResponse",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.SaveUserResponse"
  )
  @javax.jws.soap.SOAPBinding (
    style = javax.jws.soap.SOAPBinding.Style.DOCUMENT,
    use = javax.jws.soap.SOAPBinding.Use.LITERAL,
    parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED
  )
  org.appfuse.model.User saveUser(@javax.jws.WebParam( name = "arg0", targetNamespace="", mode = javax.jws.WebParam.Mode.IN , header = false, partName = "arg0" ) org.appfuse.model.User arg0) throws org.appfuse.service.UserExistsException;

  /**
   * (no documentation provided)
   */
  @javax.jws.WebMethod (
    operationName = "removeUser",
    action = ""
  )
  @javax.jws.WebResult (
    name = "return",
    targetNamespace = "",
    header = false,
    partName = "return"
  )
  @javax.xml.ws.RequestWrapper (
    localName = "removeUser",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.RemoveUser"
  )
  @javax.xml.ws.ResponseWrapper (
    localName = "removeUserResponse",
    targetNamespace = "http://service.appfuse.org/",
    className = "org.appfuse.service.jaxws.RemoveUserResponse"
  )
  @javax.jws.soap.SOAPBinding (
    style = javax.jws.soap.SOAPBinding.Style.DOCUMENT,
    use = javax.jws.soap.SOAPBinding.Use.LITERAL,
    parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED
  )
  void removeUser(@javax.jws.WebParam( name = "arg0", targetNamespace="", mode = javax.jws.WebParam.Mode.IN , header = false, partName = "arg0" ) java.lang.String arg0) ;

}