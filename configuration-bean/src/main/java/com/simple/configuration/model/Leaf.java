package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Leaf extends Id
{

	private static final long serialVersionUID = -8500879258366768517L;

	//--- Leaf definition as per presentation.xsd ---
	private String label;
	private String ref;
	private boolean isCurrentView;
	
	/**
     * The image for this leaf.
     */
	private String image;
	
	//-- isVisible to set leaf as visible or not
	private boolean isVisible;
	 /**
     * Style stored the css of label.
     */
	private String style;
	/**
	 * Contains the filter.
	 */
	private List<Condition> filterCondition;
	
	/**
	* The configured right click menu.
	*/
	private Toolbar menu;
	
	public Leaf() 
	{
		super();
		isVisible = true;
		this.filterCondition = new ArrayList<Condition>();
	}

	public Leaf(String label, String ref, boolean isCurrentView, String image)
	{
		this.label = label;
		this.ref = ref;
		this.isCurrentView = isCurrentView;
		this.isVisible = true;
		this.image = image;
		this.filterCondition = new ArrayList<Condition>();
		this.setId(label);
	}
	
	public Leaf(String label, String ref, boolean isCurrentView, String image, String style)
    {
        this.label = label;
        this.ref = ref;
        this.isCurrentView = isCurrentView;
        this.isVisible = true;
        this.image = image;
        this.style = style;
    }

	public boolean isCurrentView()
	{
		return isCurrentView;
	}

	public void setCurrentView(boolean isCurrentView)
	{
		this.isCurrentView = isCurrentView;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public String getRef()
	{
		return ref;
	}

	public void setRef(String ref)
	{
		this.ref = ref;
	}

	/**
	 * check if leaf is visible or not 
	 * @return true or false
	 */
	public boolean isVisible()
	{
		return isVisible;
	}

	/**
	 * Set leaf visible true or false
	 * @param isVisible
	 */
	public void setVisible(boolean isVisible)
	{
		this.isVisible = isVisible;
	}

	/**
     * Gets the image property.
     * 
     * @return The image property
     *      <br>of type <code>String</code>
     */
	public String getImage() 
	{
		return image;
	}

	/**
     * Sets the image to a new value
     * 
     * @param image the new image value
     * <br> of type <code>String</code>
     */
	public void setImage(String image) 
	{
		this.image = image;
	}
	
	 /**
     * Gets the string value of style.
     * <p>
     * @return style
     *      The style of DLeaf.
     */
    public String getStyle()
    {
        return style;
    }
    
    /**
     * Sets the string value for style.
     * <p>
     * @param style
     *          The style of DLeaf.
     */
    public void setStyle(String style)
    {
        this.style = style;
    }

    /**
     * Get the filter.
     * <p>
     * @return filterCondition
     *      The <code>List</code> of filter.
     */
	public List<Condition> getFilterCondition()
    {
        return filterCondition;
    }

	/**
     * Set the filter.
     * <p>
     * @param filterCondition
     *      The <code>List</code> of filter.
     */
	public void setFilterCondition(List<Condition> filterCondition)
    {
        this.filterCondition = filterCondition;
    }
	
	/**
	 * Add the filter.
	 * <p>
	 * @param condition
	 *     The ({@link Condition} object.
	 */
	public void addFilter(Condition condition)
	{
	    this.filterCondition.add(condition);
	}
	
	/**
	* Get the right click menu options for the grid.
	* <p>
	* @return menu
	* <code>DToolbar</code> holding the list of <code>DButton</code>
	* as actions available.
	*/
	public Toolbar getMenu()
	{
	    return menu;
	}

	/**
	* Save the right click Menu options for the grid.
	* <p>
	* @param menu
	* <code>DToolbar</code> holding the list of <code>DButton</code>
	* as actions available.
	*/
	public void setMenu(Toolbar menu)
	{
	    this.menu = menu;
	}


	
}
