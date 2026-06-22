/**
 * 
 */
package com.webmethods.caf.utilitybatchrecalc;

/**
 * @author BSU-Dev
 *
 */

public class UtilityBatchRecalcDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient com.webmethods.caf.utilitybatchrecalc.UtilityBatchRecalc utilityBatchRecalc = null;
	private transient com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.RunUtilityBatchRecalc_WSC runUtilityBatchRecalc = null;
	private static final String[][] RUNUTILITYBATCHRECALC_PROPERTY_BINDINGS = new String[][] {
		{"#{runUtilityBatchRecalc.authCredentials.authenticationMethod}", "1"},
		{"#{runUtilityBatchRecalc.authCredentials.requiresAuth}", "true"},
		{"#{runUtilityBatchRecalc.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{runUtilityBatchRecalc.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
		{"#{runUtilityBatchRecalc.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Utilities.WSD:runUtilityBatchRecalc_WSD"},
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

	public com.webmethods.caf.utilitybatchrecalc.UtilityBatchRecalc getUtilityBatchRecalc()  {
		if (utilityBatchRecalc == null) {
		    utilityBatchRecalc = (com.webmethods.caf.utilitybatchrecalc.UtilityBatchRecalc)resolveExpression("#{UtilityBatchRecalc}");
		}
		return utilityBatchRecalc;
	}

	public com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.RunUtilityBatchRecalc_WSC getRunUtilityBatchRecalc()  {
		if (runUtilityBatchRecalc == null) {
		    runUtilityBatchRecalc = (com.webmethods.caf.wsclient.steps_ui_utilities.wsd.runutilitybatchrecalc_wsd.RunUtilityBatchRecalc_WSC)resolveExpression("#{RunUtilityBatchRecalc}");
		}
	
	    resolveDataBinding(RUNUTILITYBATCHRECALC_PROPERTY_BINDINGS, runUtilityBatchRecalc, "runUtilityBatchRecalc", false, false);
		return runUtilityBatchRecalc;
	}

	/**
	 * Action Event Handler for the control with id='buttonBatchRecalc'
	 */
	public String buttonBatchRecalc_action() {
	    this.getRunUtilityBatchRecalc().refresh();	    
		return null;
	}

	
}