/**
 * 
 */
package com.webmethods.caf.utilityfeestatusreport2012institution;

/**
 * @author BSU-Dev
 *
 */

import javax.portlet.PortletPreferences;

public class UtilityFeeStatusReport2012Institution  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient com.webmethods.caf.Steps_ui_utilities steps_ui_utilities = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public UtilityFeeStatusReport2012Institution() {
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
}