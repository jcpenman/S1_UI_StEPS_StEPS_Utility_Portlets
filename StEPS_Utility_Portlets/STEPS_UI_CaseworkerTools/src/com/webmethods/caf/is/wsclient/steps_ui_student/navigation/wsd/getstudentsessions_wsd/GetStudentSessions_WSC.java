package com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.IgetStudentSessions_WSD_PortType.getStudentSessions.
 */
public class GetStudentSessions_WSC extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 7393202339728720896L;

	/**
	 * Default constructor
	 */
	public GetStudentSessions_WSC() {
		super(com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.IgetStudentSessions_WSD_PortType.class, // port type proxy class
			"getStudentSessions", // method to invoke
			new String[] { "getStudentSessions", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessions.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getStudentSessions_WSD.wsdl");
		setMapUrls(new String[] { "classpath:getStudentSessions_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessionsResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 7993921400450984960L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessions getStudentSessions  = new  com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessions() ;

		public com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessions getGetStudentSessions() {
			return getStudentSessions;
		}

		public void setGetStudentSessions(com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessions getStudentSessions) {
			this.getStudentSessions = getStudentSessions;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result
	 */
	public com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessionsResponse getResult() {
		return (com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.getStudentSessionsResponse)result;
	}
	

		
}