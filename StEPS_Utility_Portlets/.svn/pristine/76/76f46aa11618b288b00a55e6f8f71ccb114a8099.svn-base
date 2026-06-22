/**
 * 
 */
package com.webmethods.caf.showteam;

/**
 * @author Paddy
 *
 */

public class ShowTeamDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private com.webmethods.caf.showteam.ShowTeam showTeam = null;
	private com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.GetTeam_WSC getTeam = null;
	private static final String[][] GETTEAM_PROPERTY_BINDINGS = new String[][] {
		{"#{getTeam.authCredentials.requiresAuth}", "true"},
		{"#{getTeam.parameters.getTeam.employee_in}", "#{facesContext.externalContext.userPrincipal.name}"},
		{"#{getTeam.autoRefresh}", "false"},
		{"#{getTeam.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Core.Team.WSD:getTeam_WSD"},
		{"#{getTeam.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{getTeam.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);

		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}

	public com.webmethods.caf.showteam.ShowTeam getShowTeam()  {
		if (showTeam == null) {
		    showTeam = (com.webmethods.caf.showteam.ShowTeam)resolveExpression("#{ShowTeam}");
		}
		return showTeam;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.GetTeam_WSC getGetTeam()  {
		if (getTeam == null) {
		    getTeam = (com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.GetTeam_WSC)resolveExpression("#{GetTeam}");
		}
	
	    resolveDataBinding(GETTEAM_PROPERTY_BINDINGS, getTeam, "getTeam", false, false);
		return getTeam;
	}

	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		this.getGetTeam().refresh();
	}
	
}