package com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.IrunUtilityFeeStatusReport2012Institution_WSD_PortType.runUtilityFeeStatusReport2012Institution.
 */
public class RunUtilityFeeStatusReport2012Institution_WSC extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 1801849681141943296L;

	/**
	 * Default constructor
	 */
	public RunUtilityFeeStatusReport2012Institution_WSC() {
		super(com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.IrunUtilityFeeStatusReport2012Institution_WSD_PortType.class, // port type proxy class
			"runUtilityFeeStatusReport2012Institution", // method to invoke
			new String[] { "runUtilityFeeStatusReport2012Institution",  "result", }, // method parameter names
			new Class[] { com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.runUtilityFeeStatusReport2012Institution.class,  electric.util.async.Async.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:runUtilityFeeStatusReport2012Institution_WSD.wsdl");
		setMapUrls(new String[] { "classpath:runUtilityFeeStatusReport2012Institution_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 3621551206301192192L;

		public Parameters() {
		}
	
		private com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.runUtilityFeeStatusReport2012Institution runUtilityFeeStatusReport2012Institution  = new  com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.runUtilityFeeStatusReport2012Institution() ;

		public com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.runUtilityFeeStatusReport2012Institution getRunUtilityFeeStatusReport2012Institution() {
			return runUtilityFeeStatusReport2012Institution;
		}

		public void setRunUtilityFeeStatusReport2012Institution(com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.runUtilityFeeStatusReport2012Institution runUtilityFeeStatusReport2012Institution) {
			this.runUtilityFeeStatusReport2012Institution = runUtilityFeeStatusReport2012Institution;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	

		
}