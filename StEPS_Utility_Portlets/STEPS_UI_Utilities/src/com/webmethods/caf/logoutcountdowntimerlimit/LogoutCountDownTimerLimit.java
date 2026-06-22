/**
 * 
 */
package com.webmethods.caf.logoutcountdowntimerlimit;

/**
 * @author Paddy
 *
 */

import javax.portlet.PortletPreferences;

public class LogoutCountDownTimerLimit  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.Steps_ui_utilities steps_ui_utilities = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"inactivityTime"
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public LogoutCountDownTimerLimit() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public com.webmethods.caf.Steps_ui_utilities getSteps_ui_utilities()  {
		if (steps_ui_utilities == null) {
		    steps_ui_utilities = (com.webmethods.caf.Steps_ui_utilities)resolveExpression("#{Steps_ui_utilities}");
		}
		return steps_ui_utilities;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getInactivityTime() throws Exception {
		return (String) getPreferenceValue("inactivityTime", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setInactivityTime(String inactivityTime) throws Exception {
		setPreferenceValue("inactivityTime", inactivityTime);
	}
}