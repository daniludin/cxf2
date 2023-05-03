
package cxf2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for authentificationProfile complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="authentificationProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication" type="{http://notice.server.soap.common.exchange.autinform.de/}authentication" minOccurs="0"/>
 *         &lt;element name="categoriesAuthorised" type="{http://notice.server.soap.common.exchange.autinform.de/}category" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="category" type="{http://notice.server.soap.common.exchange.autinform.de/}category" minOccurs="0"/>
 *         &lt;element name="categoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryCodeList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://notice.server.soap.common.exchange.autinform.de/}language" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentificationProfile", propOrder = { "authentication", "categoriesAuthorised", "category",
		"categoryCode", "categoryCodeList", "language", "languageCode", "login", "password", "role", "status" })
public class AuthentificationProfile {

	protected Authentication authentication;
	@XmlElement(nillable = true)
	protected List<Category> categoriesAuthorised;
	protected Category category;
	protected String categoryCode;
	@XmlElement(nillable = true)
	protected List<String> categoryCodeList;
	protected Language language;
	protected String languageCode;
	protected String login;
	protected String password;
	protected int role;
	protected String status;

	/**
	 * Gets the value of the authentication property.
	 * 
	 * @return possible object is {@link Authentication }
	 * 
	 */
	public Authentication getAuthentication() {
		return authentication;
	}

	/**
	 * Sets the value of the authentication property.
	 * 
	 * @param value allowed object is {@link Authentication }
	 * 
	 */
	public void setAuthentication(Authentication value) {
		this.authentication = value;
	}

	/**
	 * Gets the value of the categoriesAuthorised property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the categoriesAuthorised property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCategoriesAuthorised().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Category }
	 * 
	 * 
	 */
	public List<Category> getCategoriesAuthorised() {
		if (categoriesAuthorised == null) {
			categoriesAuthorised = new ArrayList<Category>();
		}
		return this.categoriesAuthorised;
	}

	/**
	 * Gets the value of the category property.
	 * 
	 * @return possible object is {@link Category }
	 * 
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value allowed object is {@link Category }
	 * 
	 */
	public void setCategory(Category value) {
		this.category = value;
	}

	/**
	 * Gets the value of the categoryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCategoryCode() {
		return categoryCode;
	}

	/**
	 * Sets the value of the categoryCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCategoryCode(String value) {
		this.categoryCode = value;
	}

	/**
	 * Gets the value of the categoryCodeList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the categoryCodeList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCategoryCodeList().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getCategoryCodeList() {
		if (categoryCodeList == null) {
			categoryCodeList = new ArrayList<String>();
		}
		return this.categoryCodeList;
	}

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link Language }
	 * 
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value allowed object is {@link Language }
	 * 
	 */
	public void setLanguage(Language value) {
		this.language = value;
	}

	/**
	 * Gets the value of the languageCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * Sets the value of the languageCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLanguageCode(String value) {
		this.languageCode = value;
	}

	/**
	 * Gets the value of the login property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the value of the login property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLogin(String value) {
		this.login = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Gets the value of the role property.
	 * 
	 */
	public int getRole() {
		return role;
	}

	/**
	 * Sets the value of the role property.
	 * 
	 */
	public void setRole(int value) {
		this.role = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

}
