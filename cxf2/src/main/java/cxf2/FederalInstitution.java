
package cxf2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for federalInstitution complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="federalInstitution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictionaryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "federalInstitution", propOrder = { "authority", "cantonCode", "dictionaryKey", "id", "parentId" })
public class FederalInstitution {

	protected String authority;
	protected String cantonCode;
	protected String dictionaryKey;
	protected int id;
	protected int parentId;

	/**
	 * Gets the value of the authority property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * Sets the value of the authority property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAuthority(String value) {
		this.authority = value;
	}

	/**
	 * Gets the value of the cantonCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCantonCode() {
		return cantonCode;
	}

	/**
	 * Sets the value of the cantonCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCantonCode(String value) {
		this.cantonCode = value;
	}

	/**
	 * Gets the value of the dictionaryKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDictionaryKey() {
		return dictionaryKey;
	}

	/**
	 * Sets the value of the dictionaryKey property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDictionaryKey(String value) {
		this.dictionaryKey = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * Gets the value of the parentId property.
	 * 
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * Sets the value of the parentId property.
	 * 
	 */
	public void setParentId(int value) {
		this.parentId = value;
	}

}
