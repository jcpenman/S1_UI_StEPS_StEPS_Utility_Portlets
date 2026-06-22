/**
 * 
 */
package com.webmethods.caf.utilityfeestatusreport2012institution;

/**
 * @author BSU-Dev
 *
 */

public class UtilityFeeStatusReport2012InstitutionDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient com.webmethods.caf.utilityfeestatusreport2012institution.UtilityFeeStatusReport2012Institution utilityFeeStatusReport2012Institution = null;
	private transient com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.RunUtilityFeeStatusReport2012Institution_WSC runUtilityFeeStatusReport2012Institution = null;
	private static final String[][] RUNUTILITYFEESTATUSREPORT2012INSTITUTION_PROPERTY_BINDINGS = new String[][] {
		{"#{runUtilityFeeStatusReport2012Institution.authCredentials.authenticationMethod}", "1"},
		{"#{runUtilityFeeStatusReport2012Institution.authCredentials.requiresAuth}", "true"},
		{"#{runUtilityFeeStatusReport2012Institution.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Utilities.WSD:runUtilityFeeStatusReport2012Institution_WSD"},
		{"#{runUtilityFeeStatusReport2012Institution.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{runUtilityFeeStatusReport2012Institution.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
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

	public com.webmethods.caf.utilityfeestatusreport2012institution.UtilityFeeStatusReport2012Institution getUtilityFeeStatusReport2012Institution()  {
		if (utilityFeeStatusReport2012Institution == null) {
		    utilityFeeStatusReport2012Institution = (com.webmethods.caf.utilityfeestatusreport2012institution.UtilityFeeStatusReport2012Institution)resolveExpression("#{UtilityFeeStatusReport2012Institution}");
		}
		return utilityFeeStatusReport2012Institution;
	}

	public com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.RunUtilityFeeStatusReport2012Institution_WSC getRunUtilityFeeStatusReport2012Institution()  {
		if (runUtilityFeeStatusReport2012Institution == null) {
		    runUtilityFeeStatusReport2012Institution = (com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilityfeestatusreport2012institution_wsd.RunUtilityFeeStatusReport2012Institution_WSC)resolveExpression("#{RunUtilityFeeStatusReport2012Institution}");
		}
	
	    resolveDataBinding(RUNUTILITYFEESTATUSREPORT2012INSTITUTION_PROPERTY_BINDINGS, runUtilityFeeStatusReport2012Institution, "runUtilityFeeStatusReport2012Institution", false, false);
		return runUtilityFeeStatusReport2012Institution;
	}

	/**
	 * Action Event Handler for the control with id='buttonFeeStatusReport2012Institution'
	 */
	public String buttonFeeStatusReport2012Institution_action() {
		this.getRunUtilityFeeStatusReport2012Institution().refresh();
		return null;
	}
	
}