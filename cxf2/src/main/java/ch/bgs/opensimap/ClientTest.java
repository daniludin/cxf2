package ch.bgs.opensimap;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import cxf2.Fault;
import cxf2.LongArray;
import cxf2.SoapServer;
import cxf2.SoapServerService;

public class ClientTest {

	public static void main(String[] args) {
		new ClientTest().getAuthentication();
		new ClientTest().getActualCantonNoticeList();
		new ClientTest().getNoticeXmls();
		
		
		for (int i = 5555; i < 5556; i++) {
			new ClientTest().getNoticeXml(Long.valueOf(String.valueOf(i)));
			
		}
	}

	public void getAuthentication() {
		System.out.println("getAuthentication:");
		SoapServerService service = new SoapServerService();
		SoapServer soapServerPort = service.getSoapServerPort();
		try {
			boolean authentication = soapServerPort.getAuthentication();
			System.out.println("authentication: " + authentication);

		} catch (Fault e) {
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void getActualCantonNoticeList() {
		System.out.println("getActualCantonNoticeList:");
		SoapServerService service = new SoapServerService();
		SoapServer soapServerPort = service.getSoapServerPort();
		try {
			LongArray actualCantonNoticeList = soapServerPort.getActualCantonNoticeList();
			System.out.println("actualCantonNoticeList: " + actualCantonNoticeList);

		} catch (Fault e) {
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void getNoticeXmls() {
		System.out.println("getNoticeXmls:");
		SoapServerService service = new SoapServerService();
		SoapServer soapServerPort = service.getSoapServerPort();
		try {

			XMLGregorianCalendar publishDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2014-01-07");
			// System.out.println(publishDate);

			String result = soapServerPort.getNoticeXmls(publishDate);
			System.out.println("result: " + result);

		} catch (Fault e) {
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void getNoticeXml(long docId) {
		System.out.println("getNoticeXml:");
		SoapServerService service = new SoapServerService();
		SoapServer soapServerPort = service.getSoapServerPort();
		try {

			//long docId = 3;
			String result = soapServerPort.getNoticeXml(docId);
			System.out.println("result: " + result);

		} catch (Fault e) {
			System.out.println("FaultInfo: " + e.getFaultInfo().getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
