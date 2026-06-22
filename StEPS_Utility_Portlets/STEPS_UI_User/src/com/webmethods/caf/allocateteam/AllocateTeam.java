/**
 * 
 */
package com.webmethods.caf.allocateteam;

/**
 * @author Paddy
 *
 */

import javax.portlet.PortletPreferences;

public class AllocateTeam  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Steps_ui_user steps_ui_user = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public AllocateTeam() {
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

	public com.webmethods.caf.Steps_ui_user getSteps_ui_user()  {
		if (steps_ui_user == null) {
		    steps_ui_user = (com.webmethods.caf.Steps_ui_user)resolveExpression("#{Steps_ui_user}");
		}
		return steps_ui_user;
	}
}