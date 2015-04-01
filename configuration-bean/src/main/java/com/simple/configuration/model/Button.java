package com.simple.configuration.model;
import java.util.HashMap;
import java.util.Map;

public class Button extends Id
{
    private static final long serialVersionUID = -5163084163485970102L;

    // --- Button defintion as per presentation.xsd ---
    private String menuImage;
    private String rolloverImage;
    private String inactiveImage;
    private Label label;
    private String tooltip;
    private boolean isSelected;
    private boolean isRender;
    private ElementReference elementReference;
    private double actGroup;
    private String data;
    private Map<String, String> dataMap;
    
    /**
     * Get the instance of DButton.
     * 
     */
    public Button()
    {
        super();
        this.isRender = true;
    }

    /**
     * Instantiate a new <code>DButton</code> object given all the fields.
     * @param id
     *      The Button name.
     * @param image
     *      The image of button.
     * @param rolloverImage
     *      The rolloverimage of button.
     * @param inactiveImage
     *      The disabled image of button.    
     * @param label
     *      The label of button.    
     * @param tooltip
     *      The tooltip of button.
     * @param isRender
     *      The button is render or not.
     */
    public Button(String id, String image, String rolloverImage, String inactiveImage, Label label, String tooltip, boolean isRender)
    {
        super(id);
        this.menuImage = image;
        this.rolloverImage = rolloverImage;
        this.inactiveImage = inactiveImage;
        this.label = label;
        this.tooltip = tooltip;
        this.isRender = isRender;
    }

    /**
     * Gets the string value for image.
     * @return
     *      <code>String</code> value.
     */
    public String getMenuImage()
    {
        return menuImage;
    }

    /**
     * Sets the string value for image.
     * <p>
     * @param image
     *          <code>String</code> value.
     */
    public void setMenuImage(String image)
    {
        this.menuImage = image;
    }

    /**
     * Gets the string value for inactiveImage.
     * @return
     *      <code>String</code> value.
     */
    public String getInactiveImage()
    {
        return inactiveImage;
    }

    /**
     * Sets the string value for inactiveImage.
     * <p>
     * @param inactiveImage
     *          <code>String</code> value.
     */
    public void setInactiveImage(String inactiveImage)
    {
        this.inactiveImage = inactiveImage;
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
     * Gets the string value for rolloverImage.
     * @return
     *      <code>String</code> value.
     */
    public String getRolloverImage()
    {
        return rolloverImage;
    }

    /**
     * Sets the string value for rolloverImage.
     * <p>
     * @param rolloverImage
     *          <code>String</code> value.
     */
    public void setRolloverImage(String rolloverImage)
    {
        this.rolloverImage = rolloverImage;
    }

    /**
     * Gets the strng value for tooltip.
     * @return
     *      <code>String</code> value.
     */
    public String getTooltip()
    {
        return tooltip;
    }

    /**
     * Sets the string value for tooltip.
     * <p>
     * @param tooltip
     *          <code>String</code> value.
     */
    public void setTooltip(String tooltip)
    {
        this.tooltip = tooltip;
    }

    /**
     * Return if the action is selected or not.
     * <p>
     * @return
     *      <code>true</code> if the action is selected, else <code>false</code>
     */
    public boolean isSelected()
    {
        return isSelected;
    }

    /**
     * Set <code>true</code> if the action is selected, else <code>false</code>.
     * <p>
     * @param isSelected
     *      <code>boolean true</code> if the action is selected, else <code>false</code>.
     */
    public void setSelected(boolean isSelected)
    {
        this.isSelected = isSelected;
    }

    /**
     * Gets boolean value true/false whether button rendered or not. 
     * @return
     *      <code>Boolean</code> true/false value.
     */
    public boolean isRender()
    {
        return isRender;
    }

    /**
     * Sets boolean value true/false whether button rendered or not.
     * <p>
     * @param isRender
     *          <code>Boolean</code> true/false value.
     */
    public void setRender(boolean isRender)
    {
        this.isRender = isRender;
    }

    public String toString()
    {
        return getLabel() != null ? getLabel() : super.toString();
    }

    /**
     * Gets the DElementReference instance.
     * <p>
     * @return
     *      elementReference
     */
    public ElementReference getElementReference()
    {
        return elementReference;
    }

    /**
     * Sets the DElementReference instance.
     * <p>
     * @param elementReference
     */
    public void setElementReference(ElementReference elementReference)
    {
        this.elementReference = elementReference;
    }

	/**
	 * @return the data
	 */
	public String getData() 
	{
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) 
	{
		this.data = data;
	}
    
    /**
     * Gets the group of actions
     * <p>
     * @return
     * 		actGroup
     */
	public double getActGroup() 
	{
		return actGroup;
	}
	/**
	 * Sets the group of actions
	 * <p>
	 * @param actGroup
	 */
	public void setActGroup(double actGroup) 
	{
		this.actGroup = actGroup;
	}
	
	/**
	 * @return the dataMap
	 */
	public Map<String, String> getDataMap() 
	{
		return dataMap;
	}

	/**
	 * @param dataMap the dataMap to set
	 */
	public void setDataMap(Map<String, String> dataMap) 
	{
		this.dataMap = dataMap;
	}

	/**
	 * Add user data to data map.
	 * <p>
	 * @param key
	 * @param value
	 */
	public void addDataToDataMap(String key, String value)
	{
		if(dataMap == null)
		{
			dataMap = new HashMap<String, String>();
		}
		dataMap.put(key, value);
	}
	
	/**
	 * Get data for the given key from the data map.
	 * @param key
	 * @return value for the given key.
	 */
	public String getDataFromDataMap(String key)
	{
		if(dataMap == null)
			return null;
		else 
			return dataMap.get(key);
	}
	
}
