package com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.IgetPreviousCases_WSD_PortType.getPreviousCases.
 */
public class GetPreviousCases_WSC extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 7968306707829245952L;

	/**
	 * Default constructor
	 */
	public GetPreviousCases_WSC() {
		super(com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.IgetPreviousCases_WSD_PortType.class, // port type proxy class
			"getPreviousCases", // method to invoke
			new String[] { "getPreviousCases", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCases.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getPreviousCases_WSD.wsdl");
		setMapUrls(new String[] { "classpath:getPreviousCases_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCasesResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 2769827504754701312L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCases getPreviousCases  = new  com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCases() ;

		public com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCases getGetPreviousCases() {
			return getPreviousCases;
		}

		public void setGetPreviousCases(com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCases getPreviousCases) {
			this.getPreviousCases = getPreviousCases;
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
	public com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCasesResponse getResult() {
		return (com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.getPreviousCasesResponse)result;
	}
	

		
}