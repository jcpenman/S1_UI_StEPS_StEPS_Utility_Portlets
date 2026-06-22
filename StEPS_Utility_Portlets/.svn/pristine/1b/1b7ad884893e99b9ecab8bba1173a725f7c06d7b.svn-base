/**
 * 
 */
package com.webmethods.caf.utilitydsareminders;

/**
 * @author BSU_User
 *
 */

public class UtilityDSARemindersDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient com.webmethods.caf.utilitydsareminders.UtilityDSAReminders utilityDSAReminders = null;
	private transient com.webmethods.caf.wsclient.steps_ui_utilities.wsd.rundsareminderletters_wsd.RunDSAReminderLetters_WSC runDSAReminderLetters = null;
	private static final String[][] RUNDSAREMINDERLETTERS_PROPERTY_BINDINGS = new String[][] {
		{"#{runDSAReminderLetters.authCredentials.authenticationMethod}", "1"},
		{"#{runDSAReminderLetters.authCredentials.requiresAuth}", "true"},
		{"#{runDSAReminderLetters.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Utilities.WSD:runDSAReminderLetters_WSD"},
		{"#{runDSAReminderLetters.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{runDSAReminderLetters.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
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

	public com.webmethods.caf.utilitydsareminders.UtilityDSAReminders getUtilityDSAReminders()  {
		if (utilityDSAReminders == null) {
		    utilityDSAReminders = (com.webmethods.caf.utilitydsareminders.UtilityDSAReminders)resolveExpression("#{UtilityDSAReminders}");
		}
		return utilityDSAReminders;
	}

	/**
	 * Action Event Handler for the control with id='buttonDSAReminders'
	 */
	public String buttonDSAReminders_action() {
		this.getRunDSAReminderLetters().refresh();
	    return null;
	}

	public com.webmethods.caf.wsclient.steps_ui_utilities.wsd.rundsareminderletters_wsd.RunDSAReminderLetters_WSC getRunDSAReminderLetters()  {
		if (runDSAReminderLetters == null) {
		    runDSAReminderLetters = (com.webmethods.caf.wsclient.steps_ui_utilities.wsd.rundsareminderletters_wsd.RunDSAReminderLetters_WSC)resolveExpression("#{RunDSAReminderLetters}");
		}
	
	    resolveDataBinding(RUNDSAREMINDERLETTERS_PROPERTY_BINDINGS, runDSAReminderLetters, "runDSAReminderLetters", false, false);
		return runDSAReminderLetters;
	}
	
}