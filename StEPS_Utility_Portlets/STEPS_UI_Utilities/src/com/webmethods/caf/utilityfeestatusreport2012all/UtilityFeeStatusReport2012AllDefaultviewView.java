/**
 * 
 */
package com.webmethods.caf.utilityfeestatusreport2012all;

/**
 * @author BSU-Dev
 *
 */

public class UtilityFeeStatusReport2012AllDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient com.webmethods.caf.utilityfeestatusreport2012all.UtilityFeeStatusReport2012All utilityFeeStatusReport2012All = null;
	private transient com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.RunUtilityFeeStatusReport2012All_WSC runUtilityFeeStatusReport2012All = null;
	private static final String[][] RUNUTILITYFEESTATUSREPORT2012ALL_PROPERTY_BINDINGS = new String[][] {
		{"#{runUtilityFeeStatusReport2012All.authCredentials.authenticationMethod}", "1"},
		{"#{runUtilityFeeStatusReport2012All.authCredentials.requiresAuth}", "true"},
		{"#{runUtilityFeeStatusReport2012All.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Utilities.WSD:runUtilityFeeStatusReport2012All_WSD"},
		{"#{runUtilityFeeStatusReport2012All.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{runUtilityFeeStatusReport2012All.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
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

	public com.webmethods.caf.utilityfeestatusreport2012all.UtilityFeeStatusReport2012All getUtilityFeeStatusReport2012All()  {
		if (utilityFeeStatusReport2012All == null) {
		    utilityFeeStatusReport2012All = (com.webmethods.caf.utilityfeestatusreport2012all.UtilityFeeStatusReport2012All)resolveExpression("#{UtilityFeeStatusReport2012All}");
		}
		return utilityFeeStatusReport2012All;
	}

	public com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.RunUtilityFeeStatusReport2012All_WSC getRunUtilityFeeStatusReport2012All()  {
		if (runUtilityFeeStatusReport2012All == null) {
		    runUtilityFeeStatusReport2012All = (com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012all_wsd.RunUtilityFeeStatusReport2012All_WSC)resolveExpression("#{RunUtilityFeeStatusReport2012All}");
		}
	
	    resolveDataBinding(RUNUTILITYFEESTATUSREPORT2012ALL_PROPERTY_BINDINGS, runUtilityFeeStatusReport2012All, "runUtilityFeeStatusReport2012All", false, false);
		return runUtilityFeeStatusReport2012All;
	}

	/**
	 * Action Event Handler for the control with id='buttonFeeStatusReport2012All'
	 */
	public String buttonFeeStatusReport2012All_action() {
		this.getRunUtilityFeeStatusReport2012All().refresh();
		return null;
	}
	
}