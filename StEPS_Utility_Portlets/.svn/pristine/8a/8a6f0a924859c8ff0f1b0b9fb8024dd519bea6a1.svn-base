/**
 * 
 */
package com.webmethods.caf.allemployees;

/**
 * @author Paddy
 *
 */

public class AllEmployeesDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.allemployees.AllEmployees allEmployees = null;
	private com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getalluserdetails_wsd.GetAllUserDetails_WSC getAllUserDetails = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider userDetailsProvider = null;
	private static final String[][] USERDETAILSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{UserDetailsProvider.rowType}", "com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getalluserdetails_wsd.UserDetail"},
		{"#{UserDetailsProvider.rowVariable}", "userDetail"},
		{"#{UserDetailsProvider.array}", "#{AllEmployeesDefaultviewView.getAllUserDetails.result.userDetails}"},
	};
	private static final String[][] GETALLUSERDETAILS_PROPERTY_BINDINGS = new String[][] {
		{"#{getAllUserDetails.authCredentials.requiresAuth}", "true"},
		{"#{getAllUserDetails.autoRefresh}", "true"},
		{"#{getAllUserDetails.socketTimeout}", "30000"},
		{"#{getAllUserDetails.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Core.Team.WSD:getAllUserDetails_WSD"},
		{"#{getAllUserDetails.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{getAllUserDetails.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
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

	public com.webmethods.caf.allemployees.AllEmployees getAllEmployees()  {
		if (allEmployees == null) {
		    allEmployees = (com.webmethods.caf.allemployees.AllEmployees)resolveExpression("#{AllEmployees}");
		}
		return allEmployees;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getalluserdetails_wsd.GetAllUserDetails_WSC getGetAllUserDetails()  {
		if (getAllUserDetails == null) {
		    getAllUserDetails = (com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getalluserdetails_wsd.GetAllUserDetails_WSC)resolveExpression("#{GetAllUserDetails}");
		}
	
	    resolveDataBinding(GETALLUSERDETAILS_PROPERTY_BINDINGS, getAllUserDetails, "getAllUserDetails", false, false);
		return getAllUserDetails;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getUserDetailsProvider()  {
		if (userDetailsProvider == null) {
		    userDetailsProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{UserDetailsProvider}");
		}
	
	    resolveDataBinding(USERDETAILSPROVIDER_PROPERTY_BINDINGS, userDetailsProvider, "userDetailsProvider", false, false);
		return userDetailsProvider;
	}
	
}