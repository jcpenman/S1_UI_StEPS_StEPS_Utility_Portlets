/**
 * 
 */
package com.webmethods.caf.rolemembership;

import java.util.ArrayList;

import com.webmethods.sc.directory.DirectorySystemFactory;
import com.webmethods.sc.directory.IDirectoryPrincipal;
import com.webmethods.sc.directory.IDirectoryRole;
import com.webmethods.sc.directory.IDirectorySession;
import com.webmethods.sc.directory.IDirectoryUser;

/**
 * @author Paddy
 *
 */

public class RoleMembershipDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String username;
	private java.lang.String emailAddress;
	private java.lang.Boolean isTeamLeader;
	private java.lang.Boolean hasQARole;
	private com.webmethods.caf.rolemembership.RoleMembership roleMembership = null;
	private java.util.ArrayList<java.lang.String> roleWorkQueues = null;
	private java.util.ArrayList<java.lang.String> otherRoles = null;
	private java.util.ArrayList<java.lang.String> userRoleMembership = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider userRoleMembershipProvider = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider roleWorkQueuesProvider = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider otherRolesProvider = null;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] USERROLEMEMBERSHIP_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] USERROLEMEMBERSHIPPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{UserRoleMembershipProvider.rowType}", "java.lang.String"},
		{"#{UserRoleMembershipProvider.rowVariable}", "userRoleMembership"},
		{"#{UserRoleMembershipProvider.list}", "#{RoleMembershipDefaultviewView.userRoleMembership}"},
	};
	private static final String[][] ROLEWORKQUEUES_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] ROLEWORKQUEUESPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{RoleWorkQueuesProvider.rowType}", "java.lang.String"},
		{"#{RoleWorkQueuesProvider.rowVariable}", "roleWorkQueue"},
		{"#{RoleWorkQueuesProvider.list}", "#{RoleMembershipDefaultviewView.roleWorkQueues}"},
	};
	private static final String[][] OTHERROLES_PROPERTY_BINDINGS = new String[][] {
	};
	private static final String[][] OTHERROLESPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{OtherRolesProvider.rowType}", "java.lang.String"},
		{"#{OtherRolesProvider.rowVariable}", "otherRole"},
		{"#{OtherRolesProvider.list}", "#{RoleMembershipDefaultviewView.otherRoles}"},
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

	public com.webmethods.caf.rolemembership.RoleMembership getRoleMembership()  {
		if (roleMembership == null) {
		    roleMembership = (com.webmethods.caf.rolemembership.RoleMembership)resolveExpression("#{RoleMembership}");
		}
		return roleMembership;
	}

	public java.lang.String getUsername()  {
		
		return username;
	}

	public void setUsername(java.lang.String username)  {
		this.username = username;
	}

	public java.lang.String getEmailAddress()  {
		
		return emailAddress;
	}

	public void setEmailAddress(java.lang.String emailAddress)  {
		this.emailAddress = emailAddress;
	}

	public java.lang.Boolean getIsTeamLeader()  {
		
		return isTeamLeader;
	}

	public void setIsTeamLeader(java.lang.Boolean isTeamLeader)  {
		this.isTeamLeader = isTeamLeader;
	}

	public java.lang.Boolean getHasQARole()  {
		
		return hasQARole;
	}

	public void setHasQARole(java.lang.Boolean hasQARole)  {
		this.hasQARole = hasQARole;
	}

	public java.util.ArrayList<java.lang.String> getUserRoleMembership()  {
		if (userRoleMembership == null) {
			userRoleMembership = new java.util.ArrayList<java.lang.String>();
		}
	
	    resolveDataBinding(USERROLEMEMBERSHIP_PROPERTY_BINDINGS, userRoleMembership, "userRoleMembership", false, false);
		return userRoleMembership;
	}

	public void setUserRoleMembership(java.util.ArrayList<java.lang.String> userRoleMembership)  {
		this.userRoleMembership = userRoleMembership;
	}

	public java.util.ArrayList<java.lang.String> getRoleWorkQueues()  {
		if (roleWorkQueues == null) {
			roleWorkQueues = new java.util.ArrayList<java.lang.String>();
		}
	
	    resolveDataBinding(ROLEWORKQUEUES_PROPERTY_BINDINGS, roleWorkQueues, "roleWorkQueues", false, false);
		return roleWorkQueues;
	}

	public void setRoleWorkQueues(java.util.ArrayList<java.lang.String> roleWorkQueues)  {
		this.roleWorkQueues = roleWorkQueues;
	}

	public java.util.ArrayList<java.lang.String> getOtherRoles()  {
		if (otherRoles == null) {
			otherRoles = new java.util.ArrayList<java.lang.String>();
		}
	
	    resolveDataBinding(OTHERROLES_PROPERTY_BINDINGS, otherRoles, "otherRoles", false, false);
		return otherRoles;
	}

	public void setOtherRoles(java.util.ArrayList<java.lang.String> otherRoles)  {
		this.otherRoles = otherRoles;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getUserRoleMembershipProvider()  {
		if (userRoleMembershipProvider == null) {
		    userRoleMembershipProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{UserRoleMembershipProvider}");
		}
	
	    resolveDataBinding(USERROLEMEMBERSHIPPROVIDER_PROPERTY_BINDINGS, userRoleMembershipProvider, "userRoleMembershipProvider", false, false);
		return userRoleMembershipProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getRoleWorkQueuesProvider()  {
		if (roleWorkQueuesProvider == null) {
		    roleWorkQueuesProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{RoleWorkQueuesProvider}");
		}
	
	    resolveDataBinding(ROLEWORKQUEUESPROVIDER_PROPERTY_BINDINGS, roleWorkQueuesProvider, "roleWorkQueuesProvider", false, false);
		return roleWorkQueuesProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getOtherRolesProvider()  {
		if (otherRolesProvider == null) {
		    otherRolesProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{OtherRolesProvider}");
		}
	
	    resolveDataBinding(OTHERROLESPROVIDER_PROPERTY_BINDINGS, otherRolesProvider, "otherRolesProvider", false, false);
		return otherRolesProvider;
	}

	/* (non-Javadoc)
	 * @see com.webmethods.caf.faces.bean.BaseViewBean#beforeRenderResponse()
	 */
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		this.getUserRoleMembership().clear();
		this.getRoleWorkQueues().clear();
		this.getOtherRoles().clear();
		this.setIsTeamLeader(false);
		this.setHasQARole(false);
		
		IDirectorySession ids = DirectorySystemFactory.getDirectorySystem().createSession();
		IDirectoryUser user = (IDirectoryUser)ids.lookupPrincipalByName(this.getFacesContext().getExternalContext().getUserPrincipal().getName(), IDirectoryPrincipal.TYPE_USER);
		this.setUsername(user.getFirstName() +" "+user.getLastName());
		this.setEmailAddress(user.getEmail());
		ArrayList<IDirectoryRole> roles = (ArrayList<IDirectoryRole>)ids.getRoleMembership(user.getID());
		for(IDirectoryRole role : roles) {
			if (role.getName().contains("Role")) {
				this.getUserRoleMembership().add(role.getName());
				if(role.getName().equalsIgnoreCase("STEPSTLRole")) {
					this.setIsTeamLeader(true);
				}
				if(role.getName().equalsIgnoreCase("STEPSQARole")) {
					this.setHasQARole(true);
				}
			} else if (role.getName().contains("TLQ") || role.getName().contains("QAQ") || role.getName().contains("WQ")) {
				if (role.getName().contains("TLQ") && this.getIsTeamLeader()) {
					this.getRoleWorkQueues().add(role.getName());
				} else if(role.getName().contains("QAQ") && this.getHasQARole()) {
					this.getRoleWorkQueues().add(role.getName());
				} else if (role.getName().contains("WQ")) {
					this.getRoleWorkQueues().add(role.getName());
				}
				
			} else {
				this.getOtherRoles().add(role.getName());
			}
		}
	}

}