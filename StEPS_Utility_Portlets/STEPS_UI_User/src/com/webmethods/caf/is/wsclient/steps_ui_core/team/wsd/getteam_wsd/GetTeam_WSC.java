package com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.IgetTeam_WSD_PortType.getTeam.
 */
public class GetTeam_WSC extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 1333075324063917056L;

	/**
	 * Default constructor
	 */
	public GetTeam_WSC() {
		super(com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.IgetTeam_WSD_PortType.class, // port type proxy class
			"getTeam", // method to invoke
			new String[] { "getTeam", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeam.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getTeam_WSD.wsdl");
		setMapUrls(new String[] { "classpath:getTeam_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeamResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 4384636798407165952L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeam getTeam  = new  com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeam() ;

		public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeam getGetTeam() {
			return getTeam;
		}

		public void setGetTeam(com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeam getTeam) {
			this.getTeam = getTeam;
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
	public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeamResponse getResult() {
		return (com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.getTeamResponse)result;
	}
	

		
}