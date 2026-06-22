/**
 * 
 */
package com.webmethods.caf.showdebug;

/**
 * @author Paddy
 *
 */

public class ShowDebugDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.showdebug.ShowDebug showDebug = null;

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

	public com.webmethods.caf.showdebug.ShowDebug getShowDebug()  {
		if (showDebug == null) {
		    showDebug = (com.webmethods.caf.showdebug.ShowDebug)resolveExpression("#{ShowDebug}");
		}
		return showDebug;
	}

	/* (non-Javadoc)
	 * @see com.webmethods.caf.faces.bean.BaseViewBean#beforeRenderResponse()
	 */
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		try {
			if(this.getShowDebug().getShowDebug() == null) {
				this.getShowDebug().setShowDebug("false");
			}
		} catch (Exception e) {
			log(e);
		}
	}

}