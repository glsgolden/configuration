package com.simple.configuration.model;

public class ElementReference extends Id
{
    private static final long serialVersionUID = -3275043352873378014L;
    /**
     * the mode value.
     */
    private int mode;
    
    /**
     * the name of the view mentioned 
     */
    private String reference;
    
    /**
     * indicates if the mentioned view has to be rendered as popup or not
     */
    private boolean isPopup;

    /**
     * instantiates DElementReference instance. 
     */
    public ElementReference()
    {
        this.mode = CptClientConstants.VIEW_MODE;
        this.isPopup = false;
    }
    
    /**
     * mode mentioned in the href tag.
     * <p>
     * @return mode - the mode 
     */
    public int getMode()
    {
        return mode;
    }

    /**
     * Sets mode for the view popup to be rendered.
     * <p>
     * @param mode
     */
    public void setMode(int mode)
    {
        this.mode = mode;
    }

    /**
     * Gets the value of the refereed view is
     * <p>
     * @return  reference
     *      the refereed view id
     */
    public String getReference()
    {
        return reference;
    }

    /**
     * Sets the value of the refereed view is
     * <p>
     * @param reference
     *      the refereed view id
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }

    /**
     * Returns the boolean value to indicate whether view is to be rendered as a popup or not
     * <p>
     * @return isPopup
     */
    public boolean isPopup()
    {
        return isPopup;
    }

    /**
     * Sets the boolean value to indicate whether view is to be rendered as a popup or not
     * <p>
     * @param isPopup
     */
    public void setPopup(boolean isPopup)
    {
        this.isPopup = isPopup;
    }
}
