package ch.bgs.opensimap;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import cxf2.Fault;
import cxf2.LongArray;
import cxf2.SoapServer;
import cxf2.SoapServerService;

public class ClientTest {

	public static void main(String[] args) {
//		new ClientTest().getNoticeXmls();
		new ClientTest().getActualCantonNoticeList();
		//new ClientTest().getAuthentication();
	}

	public void getNoticeXmls() {
		SoapServerService service = new SoapServerService();
		SoapServer soapServerPort = service.getSoapServerPort();
		try {
						
			XMLGregorianCalendar publishDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2014-01-07");
			System.out.println(publishDate);

			String noticeXmls = soapServerPort.getNoticeXmls(publishDate);
			System.out.println("noticeXmls: " + noticeXmls);
			
		} catch (Fault e) {
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}  
	}
	
	public void getActualCantonNoticeList() {
		SoapServerService service = new SoapServerService();
		SoapServer soapServerPort = service.getSoapServerPort();
		try {
			LongArray actualCantonNoticeList = soapServerPort.getActualCantonNoticeList();
			System.out.println("actualCantonNoticeList: " + actualCantonNoticeList);
			
		} catch (Fault e) {
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
		} 
	}
	public void getAuthentication() {
		SoapServerService service = new SoapServerService();
		SoapServer soapServerPort = service.getSoapServerPort();
		try {
			boolean authentication = soapServerPort.getAuthentication();
			System.out.println("authentication: " + authentication);
			
		} catch (Fault e) {
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
		} 
	}
}
