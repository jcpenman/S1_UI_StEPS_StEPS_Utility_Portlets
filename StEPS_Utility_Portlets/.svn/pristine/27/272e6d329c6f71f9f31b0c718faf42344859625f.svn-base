/**
 * 
 */
package com.webmethods.caf.studentrecordsdatabasesearch;

/**
 * @author Paddy
 *
 */

import javax.portlet.PortletPreferences;

public class StudentRecordsDatabaseSearch  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Steps_ui_caseworkertools steps_ui_caseworkertools = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public StudentRecordsDatabaseSearch() {
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

	public com.webmethods.caf.Steps_ui_caseworkertools getSteps_ui_caseworkertools()  {
		if (steps_ui_caseworkertools == null) {
		    steps_ui_caseworkertools = (com.webmethods.caf.Steps_ui_caseworkertools)resolveExpression("#{Steps_ui_caseworkertools}");
		}
		return steps_ui_caseworkertools;
	}
}