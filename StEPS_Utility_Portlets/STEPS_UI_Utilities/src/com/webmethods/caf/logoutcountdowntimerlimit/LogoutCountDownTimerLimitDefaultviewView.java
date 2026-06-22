/**
 * 
 */
package com.webmethods.caf.logoutcountdowntimerlimit;

/**
 * @author Paddy
 *
 */

public class LogoutCountDownTimerLimitDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.logoutcountdowntimerlimit.LogoutCountDownTimerLimit logoutCountDownTimerLimit = null;
	//private static final String[][] UPDATE_PROPERTY_BINDINGS = new String[][] {};
	private java.lang.String inactivityTime;

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

	public com.webmethods.caf.logoutcountdowntimerlimit.LogoutCountDownTimerLimit getLogoutCountDownTimerLimit()  {
		if (logoutCountDownTimerLimit == null) {
		    logoutCountDownTimerLimit = (com.webmethods.caf.logoutcountdowntimerlimit.LogoutCountDownTimerLimit)resolveExpression("#{LogoutCountDownTimerLimit}");
		}
		return logoutCountDownTimerLimit;
	}

	public String update() {
	    try {
			int inactivityTimeLimit = Integer.parseInt(this.getInactivityTime());
			if(inactivityTimeLimit < 1 || inactivityTimeLimit > 240) {
				this.setInactivityTime("240");
			} else {
				this.setInactivityTime(Integer.toString(inactivityTimeLimit));
			}
			
			this.getLogoutCountDownTimerLimit().setInactivityTime(this.getInactivityTime());
			this.getLogoutCountDownTimerLimit().storePreferences();
		} catch (Exception e) {
			log(e);
		}
		 
	    
		return null;
	}

	public java.lang.String getInactivityTime()  {
		
		return inactivityTime;
	}

	public void setInactivityTime(java.lang.String inactivityTime)  {
		this.inactivityTime = inactivityTime;
	}

	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		try {
			this.setInactivityTime(this.getLogoutCountDownTimerLimit().getInactivityTime());
		} catch(Exception e) {
			log(e);
		}
	}
	
}