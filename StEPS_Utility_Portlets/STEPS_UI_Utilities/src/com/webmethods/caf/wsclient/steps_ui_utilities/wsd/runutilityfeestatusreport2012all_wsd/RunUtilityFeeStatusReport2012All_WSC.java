package com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.IrunUtilityFeeStatusReport2012All_WSD_PortType.runUtilityFeeStatusReport2012All.
 */
public class RunUtilityFeeStatusReport2012All_WSC extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3200586506676427776L;

	/**
	 * Default constructor
	 */
	public RunUtilityFeeStatusReport2012All_WSC() {
		super(com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.IrunUtilityFeeStatusReport2012All_WSD_PortType.class, // port type proxy class
			"runUtilityFeeStatusReport2012All", // method to invoke
			new String[] { "runUtilityFeeStatusReport2012All",  "result", }, // method parameter names
			new Class[] { com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.runUtilityFeeStatusReport2012All.class,  electric.util.async.Async.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:runUtilityFeeStatusReport2012All_WSD.wsdl");
		setMapUrls(new String[] { "classpath:runUtilityFeeStatusReport2012All_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 5053613002370648064L;

		public Parameters() {
		}
	
		private com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.runUtilityFeeStatusReport2012All runUtilityFeeStatusReport2012All  = new  com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.runUtilityFeeStatusReport2012All() ;

		public com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.runUtilityFeeStatusReport2012All getRunUtilityFeeStatusReport2012All() {
			return runUtilityFeeStatusReport2012All;
		}

		public void setRunUtilityFeeStatusReport2012All(com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.runUtilityFeeStatusReport2012All runUtilityFeeStatusReport2012All) {
			this.runUtilityFeeStatusReport2012All = runUtilityFeeStatusReport2012All;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	

		
}