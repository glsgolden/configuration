package com.simple.configuration.model;

public class Navigation extends Id
{
    private static final long serialVersionUID = 8152326930902131991L;

    /**
     * Orientation "h" or "v" defines if the Nav panel should be render using a Horizontal or Vertical Split Panel.
     */
    private int orientation;
    
    /**
     * Label/Title for the Spilt panel. Not used now
     */
    private Label label;
    
    /**
     * Widget aligment
     */
    private int dataAlign;
    
    /**
     * The widget to be displayed in the nav panel
     */
    private Id element;
    
    private boolean isVisible;
    
    /**
     * The value for split the panel.
     */
    private int splitPosition;

    /**
     * Default constructor
     */
    public Navigation()
    {
    	this.orientation = HORI_ORIENTATION;
    	this.isVisible = true;
    }
    
    /**
     * Returns the Orientation "h" or "v"
     * <p>
     * 
     * @return
     *      <code>int</code> value of orientation corresponding to Vertical or Horizontal.
     */
    public int getOrientation()
    {
        return orientation;
    }

    /**
     * Sets the orientations "h" or "v"
     * <p>
     * 
     * @param orientation
     *              <code>int</code> value of orientation corresponding to Vertical or Horizontal.
     */
    public void setOrientation(int orientation)
    {
        this.orientation = orientation;
    }

    /**
     * Gets the string value for label.
     * <p>
     * @return label
     *      The text of label.
     */
    public String getLabel()
    {
        String label = this.label.getLabel();
        return label;
    }

    /**
     * Sets the string value for label.
     * <p>
     * @param label
     *          The text of label.
     */
    public void setLabel(String label)
    {
        if (this.label == null)
        {
            this.label = new Label();
        }        
        this.label.setLabel(label);
    }

    /**
     * Gets the <code>DLabel</code> object.
     * <p>
     *  @return label
     *          The <code>DLabel</code> object.
     */
    public Label getLabelConfig()
    {
        return label;
    }

    /**
     * Sets the <code>DLabel</code> object.
     * <p>
     *  @return label
     *          The <code>DLabel</code> object.
     */
    public void setLabel(Label label)
    {
        this.label = label;
    }

	/**
	 * Returns the default data alignment
	 * @return
	 */
	public int getDataAlign() 
	{
		return dataAlign;
	}

	/**
	 * Sets the data alignment
	 * @param dataAlign
	 */
	public void setDataAlign(int dataAlign) 
	{
		this.dataAlign = dataAlign;
	}

	/**
	 * Returns the DElement Object that has the config of the Widget that has to be rendered
	 * @return
	 */
	public Id getElement() 
	{
		return element;
	}

	/**
	 * Sets the DElement Object that has the config of the Widget that has to be rendered
	 * @param element
	 */
	public void setElement(Id element) 
	{
		this.element = element;
	}
	
	/**
	 * Gets the true/false value if navigation panel is visible or not.
	 * <p>
	 * 
	 * @return
	 *       <code>boolean</code> value.
	 */
	public boolean isVisible() 
	{
        return isVisible;
    }

	/**
	 * Sets the true/false value if navigation panel is visible or not.
	 * <p>
	 * 
	 * @param isVisible
	 *             <code>boolean</code> value.
	 */
    public void setVisible(boolean isVisible) 
    {
        this.isVisible = isVisible;
    }
    
    /**
     * Gives the splitPosition value for navigation panel.
     * <p>
     * 
     * @return
     *      <code>int</code> value for splitPosition.
     */
    public int getSplitPosition()
    {
        return splitPosition;
    }

    /**
     * Sets the splitPosition value for navigation panel.
     * <p>
     * 
     * @param splitPosition
     *          <code>int</code> value for splitPosition.
     * 
     */
    public void setSplitPosition(int splitPosition)
    {
        this.splitPosition = splitPosition;
    }
}
