
package cxf2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for authentication complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="authentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addNewFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="asUserID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="asUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asUserRedirect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contractorEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractorRoleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enableYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highlightedTopNavigation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loggedIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="loginError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="loginTries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mailAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mustGTCaccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="natureUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="navigationPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="step2Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userRedirect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentication", propOrder = { "addNewFields", "asUserID", "asUserName", "asUserRedirect", "canton",
		"category", "companyEnabled", "companyId", "contractorEnabled", "contractorRoleId", "enableYN",
		"highlightedTopNavigation", "language", "loggedIn", "loginError", "loginTries", "mailAdress", "mobileNumber",
		"mustGTCaccepted", "natureUser", "navigationPage", "selectedLanguage", "step2Password", "type", "userID",
		"userName", "userPassword", "userRedirect" })
public class Authentication {

	protected boolean addNewFields;
	protected long asUserID;
	protected String asUserName;
	protected String asUserRedirect;
	protected String canton;
	protected String category;
	protected String companyEnabled;
	protected long companyId;
	protected String contractorEnabled;
	protected int contractorRoleId;
	protected String enableYN;
	protected int highlightedTopNavigation;
	protected String language;
	protected boolean loggedIn;
	protected boolean loginError;
	protected int loginTries;
	protected String mailAdress;
	protected String mobileNumber;
	protected boolean mustGTCaccepted;
	protected String natureUser;
	protected String navigationPage;
	protected String selectedLanguage;
	protected String step2Password;
	protected int type;
	protected long userID;
	protected String userName;
	protected String userPassword;
	protected String userRedirect;

	/**
	 * Gets the value of the addNewFields property.
	 * 
	 */
	public boolean isAddNewFields() {
		return addNewFields;
	}

	/**
	 * Sets the value of the addNewFields property.
	 * 
	 */
	public void setAddNewFields(boolean value) {
		this.addNewFields = value;
	}

	/**
	 * Gets the value of the asUserID property.
	 * 
	 */
	public long getAsUserID() {
		return asUserID;
	}

	/**
	 * Sets the value of the asUserID property.
	 * 
	 */
	public void setAsUserID(long value) {
		this.asUserID = value;
	}

	/**
	 * Gets the value of the asUserName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAsUserName() {
		return asUserName;
	}

	/**
	 * Sets the value of the asUserName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAsUserName(String value) {
		this.asUserName = value;
	}

	/**
	 * Gets the value of the asUserRedirect property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAsUserRedirect() {
		return asUserRedirect;
	}

	/**
	 * Sets the value of the asUserRedirect property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAsUserRedirect(String value) {
		this.asUserRedirect = value;
	}

	/**
	 * Gets the value of the canton property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCanton() {
		return canton;
	}

	/**
	 * Sets the value of the canton property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCanton(String value) {
		this.canton = value;
	}

	/**
	 * Gets the value of the category property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCategory(String value) {
		this.category = value;
	}

	/**
	 * Gets the value of the companyEnabled property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompanyEnabled() {
		return companyEnabled;
	}

	/**
	 * Sets the value of the companyEnabled property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCompanyEnabled(String value) {
		this.companyEnabled = value;
	}

	/**
	 * Gets the value of the companyId property.
	 * 
	 */
	public long getCompanyId() {
		return companyId;
	}

	/**
	 * Sets the value of the companyId property.
	 * 
	 */
	public void setCompanyId(long value) {
		this.companyId = value;
	}

	/**
	 * Gets the value of the contractorEnabled property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContractorEnabled() {
		return contractorEnabled;
	}

	/**
	 * Sets the value of the contractorEnabled property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setContractorEnabled(String value) {
		this.contractorEnabled = value;
	}

	/**
	 * Gets the value of the contractorRoleId property.
	 * 
	 */
	public int getContractorRoleId() {
		return contractorRoleId;
	}

	/**
	 * Sets the value of the contractorRoleId property.
	 * 
	 */
	public void setContractorRoleId(int value) {
		this.contractorRoleId = value;
	}

	/**
	 * Gets the value of the enableYN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnableYN() {
		return enableYN;
	}

	/**
	 * Sets the value of the enableYN property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEnableYN(String value) {
		this.enableYN = value;
	}

	/**
	 * Gets the value of the highlightedTopNavigation property.
	 * 
	 */
	public int getHighlightedTopNavigation() {
		return highlightedTopNavigation;
	}

	/**
	 * Sets the value of the highlightedTopNavigation property.
	 * 
	 */
	public void setHighlightedTopNavigation(int value) {
		this.highlightedTopNavigation = value;
	}

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the loggedIn property.
	 * 
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	/**
	 * Sets the value of the loggedIn property.
	 * 
	 */
	public void setLoggedIn(boolean value) {
		this.loggedIn = value;
	}

	/**
	 * Gets the value of the loginError property.
	 * 
	 */
	public boolean isLoginError() {
		return loginError;
	}

	/**
	 * Sets the value of the loginError property.
	 * 
	 */
	public void setLoginError(boolean value) {
		this.loginError = value;
	}

	/**
	 * Gets the value of the loginTries property.
	 * 
	 */
	public int getLoginTries() {
		return loginTries;
	}

	/**
	 * Sets the value of the loginTries property.
	 * 
	 */
	public void setLoginTries(int value) {
		this.loginTries = value;
	}

	/**
	 * Gets the value of the mailAdress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMailAdress() {
		return mailAdress;
	}

	/**
	 * Sets the value of the mailAdress property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMailAdress(String value) {
		this.mailAdress = value;
	}

	/**
	 * Gets the value of the mobileNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * Sets the value of the mobileNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMobileNumber(String value) {
		this.mobileNumber = value;
	}

	/**
	 * Gets the value of the mustGTCaccepted property.
	 * 
	 */
	public boolean isMustGTCaccepted() {
		return mustGTCaccepted;
	}

	/**
	 * Sets the value of the mustGTCaccepted property.
	 * 
	 */
	public void setMustGTCaccepted(boolean value) {
		this.mustGTCaccepted = value;
	}

	/**
	 * Gets the value of the natureUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNatureUser() {
		return natureUser;
	}

	/**
	 * Sets the value of the natureUser property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNatureUser(String value) {
		this.natureUser = value;
	}

	/**
	 * Gets the value of the navigationPage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNavigationPage() {
		return navigationPage;
	}

	/**
	 * Sets the value of the navigationPage property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNavigationPage(String value) {
		this.navigationPage = value;
	}

	/**
	 * Gets the value of the selectedLanguage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSelectedLanguage() {
		return selectedLanguage;
	}

	/**
	 * Sets the value of the selectedLanguage property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSelectedLanguage(String value) {
		this.selectedLanguage = value;
	}

	/**
	 * Gets the value of the step2Password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStep2Password() {
		return step2Password;
	}

	/**
	 * Sets the value of the step2Password property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStep2Password(String value) {
		this.step2Password = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 */
	public int getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 */
	public void setType(int value) {
		this.type = value;
	}

	/**
	 * Gets the value of the userID property.
	 * 
	 */
	public long getUserID() {
		return userID;
	}

	/**
	 * Sets the value of the userID property.
	 * 
	 */
	public void setUserID(long value) {
		this.userID = value;
	}

	/**
	 * Gets the value of the userName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	/**
	 * Gets the value of the userPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * Sets the value of the userPassword property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUserPassword(String value) {
		this.userPassword = value;
	}

	/**
	 * Gets the value of the userRedirect property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserRedirect() {
		return userRedirect;
	}

	/**
	 * Sets the value of the userRedirect property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUserRedirect(String value) {
		this.userRedirect = value;
	}

}
