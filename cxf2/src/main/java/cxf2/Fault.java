
package cxf2;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "Fault", targetNamespace = "http://www.kps-consulting.com")
public class Fault extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private FaultDetail faultInfo;

	/**
	 * 
	 * @param faultInfo
	 * @param message
	 */
	public Fault(String message, FaultDetail faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param faultInfo
	 * @param cause
	 * @param message
	 */
	public Fault(String message, FaultDetail faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean: cxf2.FaultDetail
	 */
	public FaultDetail getFaultInfo() {
		return faultInfo;
	}

}