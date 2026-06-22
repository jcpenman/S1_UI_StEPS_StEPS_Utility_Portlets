/**
 * 
 */
package com.webmethods.caf.steps_ui_sharedmessagingtempblock1;

import org.apache.commons.lang.text.StrBuilder;

import uk.gov.saas.steps.caf.sharedmessaging.helper.JavaScriptHelperStrings;

/**
 * @author Paddy
 *
 */

public class Steps_ui_sharedmessagingtempblock1defaultviewview  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.steps_ui_sharedmessagingtempblock1.Steps_ui_sharedmessagingtempblock1 steps_ui_sharedmessagingtempblock1 = null;
	private String modalWindowJavaScriptCode = JavaScriptHelperStrings.getDisplayModalWindowJavaScriptFunction( getJavaScriptBlockPath() );
	private static String BLOCK_CONTAINING_JAVA_SCRIPT = "messagingBlockPanel";
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

	public com.webmethods.caf.steps_ui_sharedmessagingtempblock1.Steps_ui_sharedmessagingtempblock1 getSteps_ui_sharedmessagingtempblock1()  {
		if (steps_ui_sharedmessagingtempblock1 == null) {
		    steps_ui_sharedmessagingtempblock1 = (com.webmethods.caf.steps_ui_sharedmessagingtempblock1.Steps_ui_sharedmessagingtempblock1)resolveExpression("#{Steps_ui_sharedmessagingtempblock1}");
		}
		return steps_ui_sharedmessagingtempblock1;
	}

	public java.lang.String getModalWindowJavaScriptCode()  {
		
		return modalWindowJavaScriptCode;
	}
	
	/**
	 * return the absolute path of java script block in order to populate the java script snippet
	 * used when initialising modalWindowJavaScriptCode
	 * @return
	 */
	private String getJavaScriptBlockPath(){
		StrBuilder javaScriptBlockPath = new StrBuilder();
		//set parent object in path
		javaScriptBlockPath.append( findComponentInRoot( BLOCK_CONTAINING_JAVA_SCRIPT ).getParent().getId() );
		//set path object separator
		javaScriptBlockPath.append( ":" );
		javaScriptBlockPath.append( BLOCK_CONTAINING_JAVA_SCRIPT );
		
		return javaScriptBlockPath.toString();
	}
}