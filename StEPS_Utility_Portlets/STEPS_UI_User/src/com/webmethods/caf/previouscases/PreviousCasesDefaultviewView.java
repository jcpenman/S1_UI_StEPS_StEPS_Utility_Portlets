/**
 * 
 */
package com.webmethods.caf.previouscases;

/**
 * @author Paddy
 *
 */

public class PreviousCasesDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.previouscases.PreviousCases previousCases = null;
	private com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.GetPreviousCases_WSC getPreviousCases = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider previousCasesProvider = null;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] PREVIOUSCASESPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{PreviousCasesProvider.rowType}", "com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.Case"},
		{"#{PreviousCasesProvider.rowVariable}", "previousCase"},
		{"#{PreviousCasesProvider.array}", "#{PreviousCasesDefaultviewView.getPreviousCases.result.previousCases}"},
	};
	private static final String[][] GETPREVIOUSCASES_PROPERTY_BINDINGS = new String[][] {
		{"#{getPreviousCases.authCredentials.requiresAuth}", "true"},
		{"#{getPreviousCases.parameters.getPreviousCases.employee_in}", "#{facesContext.externalContext.userPrincipal.name}"},
		{"#{getPreviousCases.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Core.PreviousCases.WSD:getPreviousCases_WSD"},
		{"#{getPreviousCases.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{getPreviousCases.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
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

	public com.webmethods.caf.previouscases.PreviousCases getPreviousCases()  {
		if (previousCases == null) {
		    previousCases = (com.webmethods.caf.previouscases.PreviousCases)resolveExpression("#{PreviousCases}");
		}
		return previousCases;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.GetPreviousCases_WSC getGetPreviousCases()  {
		if (getPreviousCases == null) {
		    getPreviousCases = (com.webmethods.caf.is.wsclient.steps_ui_core.previouscases.wsd.getpreviouscases_wsd.GetPreviousCases_WSC)resolveExpression("#{GetPreviousCases}");
		}
	
	    resolveDataBinding(GETPREVIOUSCASES_PROPERTY_BINDINGS, getPreviousCases, "getPreviousCases", false, false);
		return getPreviousCases;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPreviousCasesProvider()  {
		if (previousCasesProvider == null) {
		    previousCasesProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PreviousCasesProvider}");
		}
	
	    resolveDataBinding(PREVIOUSCASESPROVIDER_PROPERTY_BINDINGS, previousCasesProvider, "previousCasesProvider", false, false);
		return previousCasesProvider;
	}

	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		this.getGetPreviousCases().refresh();
	}
	
}