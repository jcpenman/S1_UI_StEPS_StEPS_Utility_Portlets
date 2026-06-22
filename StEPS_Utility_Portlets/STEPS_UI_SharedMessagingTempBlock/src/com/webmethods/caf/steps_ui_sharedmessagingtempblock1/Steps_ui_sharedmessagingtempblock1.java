/**
 * 
 */
package com.webmethods.caf.steps_ui_sharedmessagingtempblock1;

/**
 * @author Paddy
 *
 */

import javax.portlet.PortletPreferences;

public class Steps_ui_sharedmessagingtempblock1  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Steps_ui_sharedmessagingtempblock steps_ui_sharedmessagingtempblock = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Steps_ui_sharedmessagingtempblock1() {
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

	public com.webmethods.caf.Steps_ui_sharedmessagingtempblock getSteps_ui_sharedmessagingtempblock()  {
		if (steps_ui_sharedmessagingtempblock == null) {
		    steps_ui_sharedmessagingtempblock = (com.webmethods.caf.Steps_ui_sharedmessagingtempblock)resolveExpression("#{Steps_ui_sharedmessagingtempblock}");
		}
		return steps_ui_sharedmessagingtempblock;
	}
}