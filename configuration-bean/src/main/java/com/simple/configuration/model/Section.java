package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Section extends Id 
{
	private static final long serialVersionUID = -4194209885301989045L;

	//--- Section definition as per presentation.xsd --- 
	private boolean isVisible;
	/**
     * Flag to indicate that the panel is collapsible or not.
     */
    private boolean isCollapsible;
	private Label label;
	private List<Panel> panels;
	/**
	 * Indicates if the current section already rendered once, is hidden or not.
	 * this is a copy of the hidden value.
	 */
	private boolean isCurrentlyHidden;
	/**
	 * Indicates if the current section is hidden or not.
	 */
	private boolean hidden;
	/**
	* The configured right click menu.
	*/
	private Toolbar menu;
	
	/**
	 * Indicates when no data for the section,
	 * then section should be hidden.
	 */
	private boolean hideWhenNoData;
	
	/**
	 * Initializes new instance of DSection.
	 */
	public Section() 
	{
	}

    /** 
     * Instantiate a new <code>DPanel</code> object for the given parameters.
     * <p>
     * @param isVisible
     *      The section is visible or not.
     * @param label
     *      the label information of section.
     * @param panels
     *      The panels of Section.
     */
    public Section(boolean isVisible, Label label, List<Panel> panels)
    {
        this.isVisible = isVisible;
        this.label = label;
        this.panels = panels;
    }

    public boolean isVisible() 
    {
        return isVisible;
    }

    public void setVisible(boolean isVisible) 
    {
        this.isVisible = isVisible;
    }

    /**
     * Gets the string value for label.
     * <p>
     * @return label
     *      The text of label.
     */
    public String getLabel() 
    {
        String label = null;
        if (this.label != null)
        {
            label = this.label.getLabel();
        }
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
    
	public List<Panel> getPanels() 
	{
		return panels;
	}

    public void setPanels(List<Panel> panels) 
    {
        this.panels = panels;
    }
	
    public void addPanel(Panel panel) 
    {
        if (this.panels == null)
        {
            this.panels = new ArrayList<Panel>();
        }
		
		this.panels.add(panel);
	}

	/**
	 * Return the number of panels within the section.
	 * 
	 * @return int The number of panels within the section.
	 */
	public int size() 
	{
		int size = 0;
		if (this.panels != null) 
		{
			size = this.panels.size();
		}
		return size;
	}

	/**
	 * Checks if is hidden.
	 * 
	 * @return true, if is hidden
	 */
	public boolean isHidden() 
	{
		return hidden;
	}

	/**
	 * Sets the hidden.
	 * 
	 * @param hidden the new hidden
	 */
	public void setHidden(boolean hidden) 
	{
		this.hidden = hidden;
		this.isCurrentlyHidden = hidden;
	}
	
	/**
     * Get the boolean value whether panel is 
     * collapsible or not.
     * <p>
     * @return isCollapsible
     *      The <code>Boolean</code> value (true/false).
     */
    public boolean isCollapsible()
    {
        return isCollapsible;
    }

    /**
     * Set the boolean value whether panel is 
     * collapsible or not.
     * <p>
     * @param isCollapsible
     *      The <code>Boolean</code> value (true/false).
     */
    public void setCollapsible(boolean isCollapsible)
    {
        this.isCollapsible = isCollapsible;
    }
	
    /**
	 * Indicates if the current section already rendered once, is hidden or not.
	 * this is a copy of the hidden value.
	 */
	public boolean isCurrentlyHidden() 
	{
		return isCurrentlyHidden;
	}

	/**
	 * Sets if the current section already rendered once, is hidden or not.
	 * this is a copy of the hidden value.
	 * @param isCurrentlyHidden
	 * 		<code>true</code> if hidden <code>false</code>
	 * 		otherwise.
	 */
	public void setCurrentlyHidden(boolean isCurrentlyHidden) 
	{
		this.isCurrentlyHidden = isCurrentlyHidden;
	}

	/**
     * Sets the uniqueId for the DSection element and the Panels contained within the view.
     * 
     * @param parentId
     *          The uniqueId of the DView element.
     */
	public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the section if not present already.
        super.setUniqueId(parentId);
            
        //iterate the Elements and set the uniqueId for each Element if not assigned already.
        if (this.panels != null)
        {
            Iterator it = panels.iterator();
            while(it.hasNext())
            {
                Panel panel = (Panel)it.next();
                panel.setUniqueId(this.getUniqueId());
            }
        }
    }

    /**
	* Gets the right click menu options configured
	* for this section.
    * 
    * @return menu
    *   {@link Toolbar} holding the list of {@link Button}
    *   as configured right click actions.
    */
    public Toolbar getMenu()
    {
        return menu;
    }

    /**
     * Sets the right click menu options configured
     * for this section.
     * 
     * @param menu
     *   {@link Toolbar} holding the list of {@link Button}
     *   as configured right click actions.
     */
    public void setMenu(Toolbar menu)
    {
        this.menu = menu;
    }
	
    /**
     * Gets whether the section should hide when there is no data found.
     * <p>
     * @return the hideWhenNoData
     *  {@link boolean} value to hide section when has no data.
     */
    public boolean isHideWhenNoData()
    {
        return hideWhenNoData;
    }

    /**
     * Sets whether the section should hide when there is no data found.
     * <p>
     * @param hideWhenNoData
     * {@link boolean} value to hide section when has no data.
     */
    public void setHideWhenNoData(boolean hideWhenNoData)
    {
        this.hideWhenNoData = hideWhenNoData;
    }
    /**
     * Gets the width value in pixels.<br>
     * This is the total of all the widths of panels<br>
     * in this section that are not hidden. 
  	 *
     * @return The width
     */
    public int getWidth()
    {
        int totalWidth = 0;
        for (int n = 0; n < panels.size(); n++)
        {
            if (!panels.get(n).isHidden())
            {
                totalWidth += panels.get(n).getWidth();
                if (panels.get(n).isCollapsible()) 
                {
                    totalWidth += 5;
                }
            }
        }
        return totalWidth;
    }
    
    /**
     * Gets the height value in pixels.<br>
     * This is the max of all the heights of panels<br>
     * in this section that are not hidden. 
	 *
     * @return The height
     */
    public int getHeight()
    {
        int maxHeight = 0;
        for (int n = 0; n < panels.size(); n++)
        {
            Panel panel = panels.get(n);
            if (!panel.isHidden() && panel.getHeight() > maxHeight)
            {
                maxHeight = panel.getHeight();
            }
        }
        maxHeight += 20; //-- inclusion of section header with the panel heights.
        return maxHeight;
    }
}
