/**
 * 
 */
package com.webmethods.caf.studentrecordsdatabasesearch;

/**
 * @author Paddy
 *
 */

public class StudentRecordsDatabaseSearchDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.studentrecordsdatabasesearch.StudentRecordsDatabaseSearch studentRecordsDatabaseSearch = null;
	private java.lang.String database;
	private java.lang.String studRefNo;
	private com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.GetStudentSessions_WSC getStudentSessions = null;
	private static final String[][] GETSTUDENTSESSIONS_PROPERTY_BINDINGS = new String[][] {
		{"#{getStudentSessions.authCredentials.requiresAuth}", "true"},
		{"#{getStudentSessions.autoRefresh}", "false"},
		{"#{getStudentSessions.parameters.getStudentSessions.stud_ref_no_in}", "#{StudentRecordsDatabaseSearchDefaultviewView.studRefNo}"},
		{"#{getStudentSessions.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/STEPS_UI_Student.Navigation.WSD:getStudentSessions_WSD"},
		{"#{getStudentSessions.authCredentials.userName}", "#{environment[\"wsclient-username\"]}"},
		{"#{getStudentSessions.authCredentials.password}", "#{environment[\"wsclient-password\"]}"},
	};
	
	//private static final String[][] SEARCHFORSTUDENTRECORDS_PROPERTY_BINDINGS = new String[][] {};

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

	public com.webmethods.caf.studentrecordsdatabasesearch.StudentRecordsDatabaseSearch getStudentRecordsDatabaseSearch()  {
		if (studentRecordsDatabaseSearch == null) {
		    studentRecordsDatabaseSearch = (com.webmethods.caf.studentrecordsdatabasesearch.StudentRecordsDatabaseSearch)resolveExpression("#{StudentRecordsDatabaseSearch}");
		}
		return studentRecordsDatabaseSearch;
	}

	public java.lang.String getDatabase()  {
		
		return database;
	}

	public void setDatabase(java.lang.String database)  {
		this.database = database;
	}

	public java.lang.String getStudRefNo()  {
		
		return studRefNo;
	}

	public void setStudRefNo(java.lang.String studRefNo)  {
		this.studRefNo = studRefNo;
	}

	public com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.GetStudentSessions_WSC getGetStudentSessions()  {
		if (getStudentSessions == null) {
		    getStudentSessions = (com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.GetStudentSessions_WSC)resolveExpression("#{GetStudentSessions}");
		}
	
	    resolveDataBinding(GETSTUDENTSESSIONS_PROPERTY_BINDINGS, getStudentSessions, "getStudentSessions", false, false);
		return getStudentSessions;
	}

	/**
	 * Action method
	 * This method invokes the service for searching for the students latest record between the StEPS and GRASS databases
	 * @return null
	 */
	public String searchForStudentRecords() {
		this.setDatabase("");
		String latestSession = "";
		String database = "";
	    if(this.studRefNo != null && !"".equalsIgnoreCase(this.getStudRefNo())) {
	    	this.getGetStudentSessions().getParameters().getGetStudentSessions().setStud_ref_no_in(this.getStudRefNo());
	    	this.getGetStudentSessions().refresh();
	    	com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.StudSessions[] ss = this.getGetStudentSessions().getResult().getStudsessions();
	    	for(com.webmethods.caf.is.wsclient.steps_ui_student.navigation.wsd.getstudentsessions_wsd.StudSessions studSession : ss) {
	    		if("".equalsIgnoreCase(latestSession) || (Integer.parseInt(latestSession) < Integer.parseInt(studSession.getSession_code()))) {
	    			
	    			if(studSession != null){
	    			latestSession = studSession.getSession_code();
	    			database = studSession.getDb();
	    			}
	    		}
	    	}
	    	if (database != null && database.equalsIgnoreCase("S")) {
	    		this.setDatabase("StEPS for session " + latestSession);
	    	} else if(database != null && database.equalsIgnoreCase("G")) {
	    		this.setDatabase("GRASS for session " + latestSession);
	    	} else {
	    		this.setDatabase("None found");
	    	}
	    }

		return null;
	}
	
}