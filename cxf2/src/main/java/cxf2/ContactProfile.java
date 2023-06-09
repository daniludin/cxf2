
package cxf2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for contactProfile complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="contactProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantonLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantonPrivateYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceAddressSupplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceCountry" type="{http://notice.server.soap.common.exchange.autinform.de/}country" minOccurs="0"/>
 *         &lt;element name="invoiceCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoicePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceSalutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCantonMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldCantonMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactProfile", propOrder = { "cantonLegal", "cantonPrivateYN", "firstName", "information",
		"invoiceAddress", "invoiceAddressSupplement", "invoiceCity", "invoiceCountry", "invoiceCountryCode",
		"invoiceFax", "invoiceFirstName", "invoiceLastName", "invoiceMail", "invoiceOrganisation", "invoicePhone",
		"invoiceSalutation", "invoiceZipCode", "lastName", "mail", "newCantonMode", "oldCantonMode", "phone",
		"salutation" })
public class ContactProfile {

	protected String cantonLegal;
	protected String cantonPrivateYN;
	protected String firstName;
	protected String information;
	protected String invoiceAddress;
	protected String invoiceAddressSupplement;
	protected String invoiceCity;
	protected Country invoiceCountry;
	protected String invoiceCountryCode;
	protected String invoiceFax;
	protected String invoiceFirstName;
	protected String invoiceLastName;
	protected String invoiceMail;
	protected String invoiceOrganisation;
	protected String invoicePhone;
	protected String invoiceSalutation;
	protected String invoiceZipCode;
	protected String lastName;
	protected String mail;
	protected String newCantonMode;
	protected String oldCantonMode;
	protected String phone;
	protected String salutation;

	/**
	 * Gets the value of the cantonLegal property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCantonLegal() {
		return cantonLegal;
	}

	/**
	 * Sets the value of the cantonLegal property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCantonLegal(String value) {
		this.cantonLegal = value;
	}

	/**
	 * Gets the value of the cantonPrivateYN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCantonPrivateYN() {
		return cantonPrivateYN;
	}

	/**
	 * Sets the value of the cantonPrivateYN property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCantonPrivateYN(String value) {
		this.cantonPrivateYN = value;
	}

	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the firstName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the information property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * Sets the value of the information property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInformation(String value) {
		this.information = value;
	}

	/**
	 * Gets the value of the invoiceAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceAddress() {
		return invoiceAddress;
	}

	/**
	 * Sets the value of the invoiceAddress property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceAddress(String value) {
		this.invoiceAddress = value;
	}

	/**
	 * Gets the value of the invoiceAddressSupplement property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceAddressSupplement() {
		return invoiceAddressSupplement;
	}

	/**
	 * Sets the value of the invoiceAddressSupplement property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceAddressSupplement(String value) {
		this.invoiceAddressSupplement = value;
	}

	/**
	 * Gets the value of the invoiceCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceCity() {
		return invoiceCity;
	}

	/**
	 * Sets the value of the invoiceCity property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceCity(String value) {
		this.invoiceCity = value;
	}

	/**
	 * Gets the value of the invoiceCountry property.
	 * 
	 * @return possible object is {@link Country }
	 * 
	 */
	public Country getInvoiceCountry() {
		return invoiceCountry;
	}

	/**
	 * Sets the value of the invoiceCountry property.
	 * 
	 * @param value allowed object is {@link Country }
	 * 
	 */
	public void setInvoiceCountry(Country value) {
		this.invoiceCountry = value;
	}

	/**
	 * Gets the value of the invoiceCountryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceCountryCode() {
		return invoiceCountryCode;
	}

	/**
	 * Sets the value of the invoiceCountryCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceCountryCode(String value) {
		this.invoiceCountryCode = value;
	}

	/**
	 * Gets the value of the invoiceFax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceFax() {
		return invoiceFax;
	}

	/**
	 * Sets the value of the invoiceFax property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceFax(String value) {
		this.invoiceFax = value;
	}

	/**
	 * Gets the value of the invoiceFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceFirstName() {
		return invoiceFirstName;
	}

	/**
	 * Sets the value of the invoiceFirstName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceFirstName(String value) {
		this.invoiceFirstName = value;
	}

	/**
	 * Gets the value of the invoiceLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceLastName() {
		return invoiceLastName;
	}

	/**
	 * Sets the value of the invoiceLastName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceLastName(String value) {
		this.invoiceLastName = value;
	}

	/**
	 * Gets the value of the invoiceMail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceMail() {
		return invoiceMail;
	}

	/**
	 * Sets the value of the invoiceMail property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceMail(String value) {
		this.invoiceMail = value;
	}

	/**
	 * Gets the value of the invoiceOrganisation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceOrganisation() {
		return invoiceOrganisation;
	}

	/**
	 * Sets the value of the invoiceOrganisation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceOrganisation(String value) {
		this.invoiceOrganisation = value;
	}

	/**
	 * Gets the value of the invoicePhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoicePhone() {
		return invoicePhone;
	}

	/**
	 * Sets the value of the invoicePhone property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoicePhone(String value) {
		this.invoicePhone = value;
	}

	/**
	 * Gets the value of the invoiceSalutation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceSalutation() {
		return invoiceSalutation;
	}

	/**
	 * Sets the value of the invoiceSalutation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceSalutation(String value) {
		this.invoiceSalutation = value;
	}

	/**
	 * Gets the value of the invoiceZipCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvoiceZipCode() {
		return invoiceZipCode;
	}

	/**
	 * Sets the value of the invoiceZipCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvoiceZipCode(String value) {
		this.invoiceZipCode = value;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the mail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Sets the value of the mail property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMail(String value) {
		this.mail = value;
	}

	/**
	 * Gets the value of the newCantonMode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNewCantonMode() {
		return newCantonMode;
	}

	/**
	 * Sets the value of the newCantonMode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNewCantonMode(String value) {
		this.newCantonMode = value;
	}

	/**
	 * Gets the value of the oldCantonMode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOldCantonMode() {
		return oldCantonMode;
	}

	/**
	 * Sets the value of the oldCantonMode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOldCantonMode(String value) {
		this.oldCantonMode = value;
	}

	/**
	 * Gets the value of the phone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the value of the phone property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPhone(String value) {
		this.phone = value;
	}

	/**
	 * Gets the value of the salutation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * Sets the value of the salutation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSalutation(String value) {
		this.salutation = value;
	}

}
