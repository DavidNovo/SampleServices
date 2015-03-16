/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.appfuse.model.json;

import org.codehaus.jackson.annotate.*;

/**
 * (no documentation provided)
 */
public class User extends org.appfuse.model.json.BaseObject {

  @JsonIgnore
  private java.lang.Integer _version;
  @JsonIgnore
  private boolean _accountLocked;
  @JsonIgnore
  private java.lang.String _phoneNumber;
  @JsonIgnore
  private java.lang.String _firstName;
  @JsonIgnore
  private java.lang.String _lastName;
  @JsonIgnore
  private java.lang.String _username;
  @JsonIgnore
  private boolean _credentialsExpired;
  @JsonIgnore
  private org.appfuse.model.json.Address _address;
  @JsonIgnore
  private boolean _accountExpired;
  @JsonIgnore
  private boolean _enabled;
  @JsonIgnore
  private java.lang.String _email;
  @JsonIgnore
  private java.lang.Long _id;
  @JsonIgnore
  private java.lang.String _website;
  @JsonIgnore
  private java.util.Collection<org.appfuse.model.json.Role> _roles;

  /**
   * (no documentation provided)
   */
  @JsonProperty("version")
  public java.lang.Integer getVersion() {
    return this._version;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("version")
  public void setVersion(java.lang.Integer _version) {
    this._version = _version;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("accountLocked")
  public boolean getAccountLocked() {
    return this._accountLocked;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("accountLocked")
  public void setAccountLocked(boolean _accountLocked) {
    this._accountLocked = _accountLocked;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("phoneNumber")
  public java.lang.String getPhoneNumber() {
    return this._phoneNumber;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("phoneNumber")
  public void setPhoneNumber(java.lang.String _phoneNumber) {
    this._phoneNumber = _phoneNumber;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("firstName")
  public java.lang.String getFirstName() {
    return this._firstName;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("firstName")
  public void setFirstName(java.lang.String _firstName) {
    this._firstName = _firstName;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("lastName")
  public java.lang.String getLastName() {
    return this._lastName;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("lastName")
  public void setLastName(java.lang.String _lastName) {
    this._lastName = _lastName;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("username")
  public java.lang.String getUsername() {
    return this._username;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("username")
  public void setUsername(java.lang.String _username) {
    this._username = _username;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("credentialsExpired")
  public boolean getCredentialsExpired() {
    return this._credentialsExpired;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("credentialsExpired")
  public void setCredentialsExpired(boolean _credentialsExpired) {
    this._credentialsExpired = _credentialsExpired;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("address")
  public org.appfuse.model.json.Address getAddress() {
    return this._address;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("address")
  public void setAddress(org.appfuse.model.json.Address _address) {
    this._address = _address;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("accountExpired")
  public boolean getAccountExpired() {
    return this._accountExpired;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("accountExpired")
  public void setAccountExpired(boolean _accountExpired) {
    this._accountExpired = _accountExpired;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("enabled")
  public boolean getEnabled() {
    return this._enabled;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("enabled")
  public void setEnabled(boolean _enabled) {
    this._enabled = _enabled;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("email")
  public java.lang.String getEmail() {
    return this._email;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("email")
  public void setEmail(java.lang.String _email) {
    this._email = _email;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("id")
  public java.lang.Long getId() {
    return this._id;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("id")
  public void setId(java.lang.Long _id) {
    this._id = _id;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("website")
  public java.lang.String getWebsite() {
    return this._website;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("website")
  public void setWebsite(java.lang.String _website) {
    this._website = _website;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("roles")
  public java.util.Collection<org.appfuse.model.json.Role> getRoles() {
    return this._roles;
  }

  /**
   * (no documentation provided)
   */
  @JsonProperty("roles")
  public void setRoles(java.util.Collection<org.appfuse.model.json.Role> _roles) {
    this._roles = _roles;
  }
}
