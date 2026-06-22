/**
 * 
 */
package com.webmethods.caf.allocateteam;

/**
 * @author Paddy
 *
 */

public class AllocateTeamDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.allocateteam.ClientSideError clientSideError = null;
	private java.lang.Boolean isClientSideMessageRequested;
	private com.webmethods.caf.allocateteam.AllocateTeam allocateTeam = null;
	private java.lang.Boolean isSearched;
	private java.lang.Boolean showConfirmationModal;
	private com.webmethods.caf.is.wsclient.steps_ui_common.wsd.sharedmessaging.createerrortag_wsd.CreateErrorTag_WSC createErrorTag = null;
	private com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteams_wsd.GetTeams_WSC getTeams = null;
	private com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.SetTeam_WSC setTeam = null;
	private com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.GetTeam_Allocate_WSC getTeam_Allocate = null;
	private com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider teamsProvider = null;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] TEAMSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{teamsProvider.rowVariable}", "team"},
		{"#{teamsProvider.valueBinding}", "#{team.value}"},
		{"#{teamsProvider.labelBinding}", "#{team.label}"},
		{"#{teamsProvider.array}", "#{AllocateTeamDefaultviewView.getTeams.result.teams}"},
	};
	private static final String[][] CLIENTSIDEERROR_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] CREATEERRORTAG_PROPERTY_BINDINGS = new String[][] {
		{"#{createErrorTag.authCredentials.requiresAuth}", "true"},
		{"#{createErrorTag.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Common.WSD.SharedMessaging:createErrorTag_WSD"},
		{"#{createErrorTag.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{createErrorTag.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	private static final String[][] GETTEAM_ALLOCATE_PROPERTY_BINDINGS = new String[][] {
		{"#{getTeam_Allocate.authCredentials.requiresAuth}", "true"},
		{"#{getTeam_Allocate.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Core.Team.WSD:getTeam_WSD"},
		{"#{getTeam_Allocate.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{getTeam_Allocate.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	private static final String[][] SETTEAM_PROPERTY_BINDINGS = new String[][] {
		{"#{setTeam.authCredentials.requiresAuth}", "true"},
		{"#{setTeam.parameters.setTeam.employee_in}", "#{facesContext.externalContext.userPrincipal.name}"},
		{"#{setTeam.autoRefresh}", "false"},
		{"#{setTeam.parameters.setTeam.username_in}", "#{AllocateTeamDefaultviewView.getTeam_Allocate.parameters.getTeam.employee_in}"},
		{"#{setTeam.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Core.Team.WSD:setTeam_WSD"},
		{"#{setTeam.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{setTeam.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	private static final String[][] GETTEAMS_PROPERTY_BINDINGS = new String[][] {
		{"#{getTeams.authCredentials.requiresAuth}", "true"},
		{"#{getTeams.autoRefresh}", "false"},
		{"#{getTeams.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Core.Team.WSD:getTeams_WSD"},
		{"#{getTeams.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{getTeams.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	
	/******************************************************************************************************
	private static final String[][] REQUESTUPDATE_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] CONFIRMUPDATE_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] CANCELUPDATE_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] SEARCHUSERNAME_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] CREATECLIENTSIDEERROR_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] CLEINTSIDEERROR_PROPERTY_BINDINGS = new String[][] {
	};
	*********************************************************************************************************/

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		    this.setShowConfirmationModal(false);
		} catch (Exception e) {
			error(e);
			log(e);
		}	
		return null;
	}

	public com.webmethods.caf.allocateteam.AllocateTeam getAllocateTeam()  {
		if (allocateTeam == null) {
		    allocateTeam = (com.webmethods.caf.allocateteam.AllocateTeam)resolveExpression("#{AllocateTeam}");
		}
		return allocateTeam;
	}

	public com.webmethods.caf.allocateteam.ClientSideError getClientSideError()  {
		if (clientSideError == null) {
		    clientSideError = (com.webmethods.caf.allocateteam.ClientSideError)resolveExpression("#{ClientSideError}");
		}
	
	    resolveDataBinding(CLIENTSIDEERROR_PROPERTY_BINDINGS, clientSideError, "clientSideError", false, false);
		return clientSideError;
	}

	public java.lang.Boolean getIsSearched()  {
		
		return isSearched;
	}

	public void setIsSearched(java.lang.Boolean isSearched)  {
		this.isSearched = isSearched;
	}

	public java.lang.Boolean getShowConfirmationModal()  {
		
		return showConfirmationModal;
	}

	public void setShowConfirmationModal(java.lang.Boolean showConfirmationModal)  {
		this.showConfirmationModal = showConfirmationModal;
	}

	public java.lang.Boolean getIsClientSideMessageRequested()  {
		
		return isClientSideMessageRequested;
	}

	public void setIsClientSideMessageRequested(java.lang.Boolean isClientSideMessageRequested)  {
		this.isClientSideMessageRequested = isClientSideMessageRequested;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_common.wsd.sharedmessaging.createerrortag_wsd.CreateErrorTag_WSC getCreateErrorTag()  {
		if (createErrorTag == null) {
		    createErrorTag = (com.webmethods.caf.is.wsclient.steps_ui_common.wsd.sharedmessaging.createerrortag_wsd.CreateErrorTag_WSC)resolveExpression("#{CreateErrorTag}");
		}
	
	    resolveDataBinding(CREATEERRORTAG_PROPERTY_BINDINGS, createErrorTag, "createErrorTag", false, false);
		return createErrorTag;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.GetTeam_Allocate_WSC getGetTeam_Allocate()  {
		if (getTeam_Allocate == null) {
		    getTeam_Allocate = (com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteam_wsd.GetTeam_Allocate_WSC)resolveExpression("#{GetTeam_Allocate}");
		}
	
	    resolveDataBinding(GETTEAM_ALLOCATE_PROPERTY_BINDINGS, getTeam_Allocate, "getTeam_Allocate", false, false);
		return getTeam_Allocate;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.SetTeam_WSC getSetTeam()  {
		if (setTeam == null) {
		    setTeam = (com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.setteam_wsd.SetTeam_WSC)resolveExpression("#{SetTeam}");
		}
	
	    resolveDataBinding(SETTEAM_PROPERTY_BINDINGS, setTeam, "setTeam", false, false);
		return setTeam;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteams_wsd.GetTeams_WSC getGetTeams()  {
		if (getTeams == null) {
		    getTeams = (com.webmethods.caf.is.wsclient.steps_ui_core.team.wsd.getteams_wsd.GetTeams_WSC)resolveExpression("#{GetTeams}");
		}
	
	    resolveDataBinding(GETTEAMS_PROPERTY_BINDINGS, getTeams, "getTeams", false, false);
		return getTeams;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getTeamsProvider()  {
		if (teamsProvider == null) {
		    teamsProvider = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{TeamsProvider}");
		}
	
	    resolveDataBinding(TEAMSPROVIDER_PROPERTY_BINDINGS, teamsProvider, "teamsProvider", false, false);
		return teamsProvider;
	}

	/**
	 * Action method
	 * This method creates a client side error with data in the ClientSideError managed bean 
	 * @return null
	 */
	public String createClientSideError() {
		this.createMessage(this.getClientSideError().getTitle(), this.getClientSideError().getStyle(), this.getClientSideError().getMessage());
	    this.setIsClientSideMessageRequested(true);
	    
		return null;
	}

	/**
	 * Action method
	 * This method requests the update process to begin 
	 * @return null
	 */
	public String requestUpdate() {
	    if(!this.getGetTeam_Allocate().getResult().getTeam_out().equalsIgnoreCase(this.getSetTeam().getParameters().getSetTeam().getTeam_in())) {
	    	this.setShowConfirmationModal(true);
	    } else {
	    	this.setShowConfirmationModal(false);
	    	this.createMessage("Allocate Team", "error", "You are trying to update the user to the team they are already in");
	    }
	    
		return null;
	}

	/**
	 * Action method
	 * This method invokes the service for updating the team member
	 * @return null
	 */
	public String confirmUpdate() {
		this.getSetTeam().refresh();
	    this.getGetTeam_Allocate().refresh();
		return null;
	}

	/**
	 * Action method
	 * This method cancels the update request and resets the parameters to default values
	 * @return null
	 */
	public String cancelUpdate() {
	    this.setIsSearched(false);
	    this.setShowConfirmationModal(false);
	    this.getGetTeam_Allocate().getParameters().getGetTeam().setEmployee_in("");
	    this.getSetTeam().getParameters().getSetTeam().setEmployee_in("");
	    this.getSetTeam().getParameters().getSetTeam().setTeam_in("");
	    	    
		return null;
	}

	/**
	 * Action method
	 * This method invokes the search service
	 * @return null
	 */
	public String searchUsername() {
		if(this.getGetTeam_Allocate().getParameters().getGetTeam().getEmployee_in() != null && this.getGetTeam_Allocate().getParameters().getGetTeam().getEmployee_in().length() > 0) {
	    	this.setIsSearched(true);
	    	this.getGetTeam_Allocate().refresh();
	    } else {
	    	this.createMessage("Allocate Team", "error", "You must enter a valid username");
	    }
		return null;
	}

	/**
	 * This method is responsible for updating the portlets data items from the preferences, running the main getter services
	 */
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		this.getGetTeams().refresh();
	}

	/**
	 * This method is responsible for resetting the shared messaging data and clearing any errors from the services.
	 */
	@Override
	protected void afterRenderResponse() {
		super.afterRenderResponse();
		this.setShowConfirmationModal(false);
		this.resetServiceErrors();
		this.resetSharedMessaging();
	}

	/**
	 * This method resets the error reporting outputs of the portlets web services
	 */
	private void resetServiceErrors() {
		this.getGetTeam_Allocate().getResult().setError_boolean("false");
		this.getGetTeam_Allocate().getResult().setError_text("");
		this.getGetTeams().getResult().setError_boolean("false");
		this.getGetTeams().getResult().setError_text("");
		this.getSetTeam().getResult().setError_boolean("false");
		this.getSetTeam().getResult().setError_text("");
	}

	/**
	 * This method resets the CreateErrorTag service parameters and output and sets the portlet flag to false
	 */
	private void resetSharedMessaging() {
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setTitle(null);
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setStyle(null);
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setMessage(null);
		this.getCreateErrorTag().getResult().setSharedMessage(null);
		this.setIsClientSideMessageRequested(false);
		
	}

	/**
	 * This method invokes the CreateErrorTag service with the passed parameters
	 * @param title
	 * @param style
	 * @param message
	 */
	private void createMessage(String title, String style, String message) {
		this.getCreateErrorTag().getParameters().getCreateErrorTag().setTitle(title);
	    this.getCreateErrorTag().getParameters().getCreateErrorTag().setStyle(style);
	    this.getCreateErrorTag().getParameters().getCreateErrorTag().setMessage(message);
	    this.getCreateErrorTag().refresh();
	}

}