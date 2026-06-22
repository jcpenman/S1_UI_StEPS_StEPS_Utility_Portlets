/**
 * 
 */
package com.webmethods.caf.testportletone;

/**
 * @author Paddy
 *
 */

public class TestPortletOneDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.testportletone.TestPortletOne testPortletOne = null;
	private com.webmethods.caf.testportletone.ClientSideError clientSideError = null;
	private com.webmethods.caf.is.wsclient.steps_ui_common.wsd.sharedmessaging.createerrortag_wsd.CreateErrorTag_WSC createErrorTag = null;
	private java.lang.Boolean isClientSideMessageRequested;
	private com.webmethods.caf.testportletone.AsyncError asyncError = null;
	private com.webmethods.caf.testportletone.SyncError syncError = null;
	private com.webmethods.caf.testportletone.ErrorQuantities errorQuantities = null;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] CLIENTSIDEERROR_PROPERTY_BINDINGS = new String[][] {
	};
/*	private static final String[][] CREATECLIENTSIDEERROR_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] THROWASYNCERROR_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] THROWSYNCERROR_PROPERTY_BINDINGS = new String[][] {
	};
*/	private static final String[][] ASYNCERROR_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] SYNCERROR_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] ERRORQUANTITIES_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] CREATEERRORTAG_PROPERTY_BINDINGS = new String[][] {
		{"#{createErrorTag.authCredentials.requiresAuth}", "true"},
		{"#{createErrorTag.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Common.WSD.SharedMessaging:createErrorTag_WSD"},
		{"#{createErrorTag.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{createErrorTag.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		    this.getAsyncError().release();
		    this.getSyncError().release();
		    this.getErrorQuantities().release();
		    this.getClientSideError().release();
		    
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}

	public com.webmethods.caf.testportletone.TestPortletOne getTestPortletOne()  {
		if (testPortletOne == null) {
		    testPortletOne = (com.webmethods.caf.testportletone.TestPortletOne)resolveExpression("#{TestPortletOne}");
		}
		return testPortletOne;
	}

	public com.webmethods.caf.testportletone.ClientSideError getClientSideError()  {
		if (clientSideError == null) {
		    clientSideError = (com.webmethods.caf.testportletone.ClientSideError)resolveExpression("#{ClientSideError}");
		}
	
	    resolveDataBinding(CLIENTSIDEERROR_PROPERTY_BINDINGS, clientSideError, "clientSideError", false, false);
		return clientSideError;
	}

	public java.lang.Boolean getIsClientSideMessageRequested()  {
		
		return isClientSideMessageRequested;
	}

	public void setIsClientSideMessageRequested(java.lang.Boolean isClientSideMessageRequested)  {
		this.isClientSideMessageRequested = isClientSideMessageRequested;
	}

	public com.webmethods.caf.testportletone.AsyncError getAsyncError()  {
		if (asyncError == null) {
		    asyncError = (com.webmethods.caf.testportletone.AsyncError)resolveExpression("#{AsyncError}");
		}
	
	    resolveDataBinding(ASYNCERROR_PROPERTY_BINDINGS, asyncError, "asyncError", false, false);
		return asyncError;
	}

	public com.webmethods.caf.testportletone.SyncError getSyncError()  {
		if (syncError == null) {
		    syncError = (com.webmethods.caf.testportletone.SyncError)resolveExpression("#{SyncError}");
		}
	
	    resolveDataBinding(SYNCERROR_PROPERTY_BINDINGS, syncError, "syncError", false, false);
		return syncError;
	}

	public com.webmethods.caf.testportletone.ErrorQuantities getErrorQuantities()  {
		if (errorQuantities == null) {
		    errorQuantities = (com.webmethods.caf.testportletone.ErrorQuantities)resolveExpression("#{ErrorQuantities}");
		}
	
	    resolveDataBinding(ERRORQUANTITIES_PROPERTY_BINDINGS, errorQuantities, "errorQuantities", false, false);
		return errorQuantities;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_common.wsd.sharedmessaging.createerrortag_wsd.CreateErrorTag_WSC getCreateErrorTag()  {
		if (createErrorTag == null) {
		    createErrorTag = (com.webmethods.caf.is.wsclient.steps_ui_common.wsd.sharedmessaging.createerrortag_wsd.CreateErrorTag_WSC)resolveExpression("#{CreateErrorTag}");
		}
	
	    resolveDataBinding(CREATEERRORTAG_PROPERTY_BINDINGS, createErrorTag, "createErrorTag", false, false);
		return createErrorTag;
	}

	public String createClientSideError() {
		this.createMessage(this.getClientSideError().getTitle(), this.getClientSideError().getStyle(), this.getClientSideError().getMessage());
	    this.setIsClientSideMessageRequested(true);
		
		return null;
	}

	public String throwAsyncError() {
		this.getAsyncError().release();
		this.getAsyncError().setError_boolean("true");
		String error_text = "";
		for(int i = 0; i < Integer.parseInt(this.getErrorQuantities().getAsync()); i++) {
			this.createMessage("Test Portlet One", "error", "Async Error Number " + i);
			error_text = error_text + this.getCreateErrorTag().getResult().getSharedMessage();
			
		}
		this.getAsyncError().setError_text(error_text);
		log("Outputting Async Error String");
		log(this.getAsyncError().getError_text());
	    this.resetCreateErrorTag();
	    
		return null;
	}

	public String throwSyncError() {
		this.getSyncError().release();
		this.getSyncError().setError_boolean("true");
		String error_text = "";
		for(int i = 0; i < Integer.parseInt(this.getErrorQuantities().getSync()); i++) {
			this.createMessage("Test Portlet One", "error", "Sync Error Number " + i);
			error_text = error_text + this.getCreateErrorTag().getResult().getSharedMessage();
		}
		this.getSyncError().setError_text(error_text);
		log("Outputting Sync Error String");
		log(this.getSyncError().getError_text());
	    this.resetCreateErrorTag();
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.webmethods.caf.faces.bean.BaseViewBean#afterRenderResponse()
	 */
	@Override
	protected void afterRenderResponse() {
		super.afterRenderResponse();
		this.resetCreateErrorTag();
		this.getAsyncError().release();
		this.getSyncError().release();
	}

	private void resetCreateErrorTag() {
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setTitle(null);
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setStyle(null);
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setMessage(null);
		this.getCreateErrorTag().getResult().setSharedMessage(null);
		this.setIsClientSideMessageRequested(false);
	}

	/**
	 * @param st
	 */
	private void createMessage(String title, String style, String message) {
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setTitle(title);
	    this.getCreateErrorTag().getParameters().getCreateErrorTag().setStyle(style);
	    this.getCreateErrorTag().getParameters().getCreateErrorTag().setMessage(message);
	    this.getCreateErrorTag().refresh();
	}


}