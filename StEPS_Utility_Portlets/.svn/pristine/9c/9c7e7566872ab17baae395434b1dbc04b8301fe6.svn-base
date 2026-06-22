/**
 * 
 */
package com.webmethods.caf.sharedmessaging;

/**
 * @author Paddy
 *
 */

import javax.portlet.PortletPreferences;

public class SharedMessaging  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Steps_ui_sharedmessaging steps_ui_sharedmessaging = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public SharedMessaging() {
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

	public com.webmethods.caf.Steps_ui_sharedmessaging getSteps_ui_sharedmessaging()  {
		if (steps_ui_sharedmessaging == null) {
		    steps_ui_sharedmessaging = (com.webmethods.caf.Steps_ui_sharedmessaging)resolveExpression("#{Steps_ui_sharedmessaging}");
		}
		return steps_ui_sharedmessaging;
	}
}