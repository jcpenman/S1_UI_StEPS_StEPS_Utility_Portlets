package com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.IsetTeam_WSD_PortType.setTeam.
 */
public class SetTeam_WSC extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6468379995162801152L;

	/**
	 * Default constructor
	 */
	public SetTeam_WSC() {
		super(com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.IsetTeam_WSD_PortType.class, // port type proxy class
			"setTeam", // method to invoke
			new String[] { "setTeam", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeam.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:setTeam_WSD.wsdl");
		setMapUrls(new String[] { "classpath:setTeam_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeamResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8557094953387770880L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeam setTeam  = new  com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeam() ;

		public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeam getSetTeam() {
			return setTeam;
		}

		public void setSetTeam(com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeam setTeam) {
			this.setTeam = setTeam;
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
	public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeamResponse getResult() {
		return (com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.setTeamResponse)result;
	}
	

		
}