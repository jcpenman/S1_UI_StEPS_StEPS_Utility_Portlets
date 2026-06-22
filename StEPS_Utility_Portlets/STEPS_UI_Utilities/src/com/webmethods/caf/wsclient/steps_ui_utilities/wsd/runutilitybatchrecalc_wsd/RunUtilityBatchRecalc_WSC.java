package com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.IrunUtilityBatchRecalc_WSD_PortType.runUtilityBatchRecalc.
 */
public class RunUtilityBatchRecalc_WSC extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 7986222398845324288L;

	/**
	 * Default constructor
	 */
	public RunUtilityBatchRecalc_WSC() {
		super(com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.IrunUtilityBatchRecalc_WSD_PortType.class, // port type proxy class
			"runUtilityBatchRecalc", // method to invoke
			new String[] { "runUtilityBatchRecalc",  "result", }, // method parameter names
			new Class[] { com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.runUtilityBatchRecalc.class,  electric.util.async.Async.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:runUtilityBatchRecalc_WSD.wsdl");
		setMapUrls(new String[] { "classpath:runUtilityBatchRecalc_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6411875997925859328L;

		public Parameters() {
		}
	
		private com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.runUtilityBatchRecalc runUtilityBatchRecalc  = new  com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.runUtilityBatchRecalc() ;

		public com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.runUtilityBatchRecalc getRunUtilityBatchRecalc() {
			return runUtilityBatchRecalc;
		}

		public void setRunUtilityBatchRecalc(com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.runUtilityBatchRecalc runUtilityBatchRecalc) {
			this.runUtilityBatchRecalc = runUtilityBatchRecalc;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	

		
}