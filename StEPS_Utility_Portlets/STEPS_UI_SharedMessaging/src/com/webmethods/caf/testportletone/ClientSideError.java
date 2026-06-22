package com.webmethods.caf.testportletone;

public class ClientSideError extends com.webmethods.caf.faces.bean.BaseFacesSessionBean {

	private java.lang.String title;
	private java.lang.String style;
	private java.lang.String message;

	/**
     * Override this method to release any resources associated with this session.
     * Please note, the FacesContext is not valid for this function 
     */
    protected void release() {
    	this.setTitle("");
    	this.setStyle("");
    	this.setMessage("");
    }

	public java.lang.String getTitle()  {
		
		return title;
	}

	public void setTitle(java.lang.String title)  {
		this.title = title;
	}

	public java.lang.String getStyle()  {
		
		return style;
	}

	public void setStyle(java.lang.String style)  {
		this.style = style;
	}

	public java.lang.String getMessage()  {
		
		return message;
	}

	public void setMessage(java.lang.String message)  {
		this.message = message;
	};
}