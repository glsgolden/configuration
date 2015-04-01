package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Panel extends Id {

	private static final long serialVersionUID = 8724638868924652095L;

	//--- Panel definition as per presentation.xsd ---
	private boolean isVisible;
	private int width;
	private int height;
	private int dataAlign;
	//--- Attribute to hide or show panel.---
	private boolean isHidden;
	/**
	 * Flag to indicate that the panel is collapsible or not.
	 */
	private boolean isCollapsible;
	/**
	 * Flag to indicate that the border should display or not.
	 */
	private boolean isShowBorder;
	private Label label;
	private List<Id> elements;
	
	public Panel() 
	{
		super();
		this.isHidden = false;
	}

	/**
	 * Instantiate a new <code>DPanel</code> object for the given parameters.
	 * @param id
	 *     The name of panel.
	 * @param isVisible
	 *     The panel is visible or not.
	 * @param width
	 *     The width of panel.
	 * @param height
	 *     The height of panel.
	 * @param dataAlign
	 *     The data alignment of panel.
	 * @param elements
	 *     The elements of panel.
	 */
	public Panel(String id, boolean isVisible, int width, int height, int dataAlign, List<Id> elements) 
	{
		super(id);
		this.isHidden = false;
		this.isVisible = isVisible;
		this.width = width;
		this.height = height;
		this.dataAlign = dataAlign;
		this.elements = elements;
	}

	public int getDataAlign() 
	{
		return dataAlign;
	}

	public void setDataAlign(int dataAlign) 
	{
		this.dataAlign = dataAlign;
	}

    public List<Id> getElements() 
    {
		return elements;
	}

	public void setElements(List<Id> elements) 
	{
		this.elements = elements;
	}

	public void addElements(Id element) 
	{
		if (this.elements == null) 
		{
			this.elements = new ArrayList<Id>();
		}
		
		this.elements.add(element);
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
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
	 * Indicates whether the Panel is Visible true or false.
	 * <p>
	 * @return isHidden
	 * 		The <code>boolean</code> shows whether the Panel is Visible true or false.
	 */
	public boolean isHidden() 
	{
		return isHidden;
	}

	/**
	 * Sets Panel Visible true or false.
	 * <p>
	 * @param isHidden
	 * 		The <code>boolean</code> shows whether the Panel is Visible true or false.
	 */
	public void setHidden(boolean isHidden) 
	{
		this.isHidden = isHidden;
	}

	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}
	
	/**
	 * Return the number of elements (tree, graph, form, grid) within the panel.
	 * @return int The number of elements within the panel.
	 */
	public int size() 
	{
		int size = 0;
		if (this.elements != null) 
		{
			size = this.elements.size();
		}
		return size;
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

    /**
     * Sets the uniqueId for the DPanel element and the Elements contained within the panel.
     * 
     * @param parentId
     *          The uniqueId of the DSection element.
     */
    public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the Panel if not present already.
        super.setUniqueId(parentId);

        //iterate the panels and set the uniqueId for each view if not assigned already.
        if (this.elements != null)
        {
            int noOfElements = elements.size();
            for (int index = 0 ; index < noOfElements ; index++)
            {
                Id entity= (Id) elements.get(index);
                int type = entity.getType();
                switch(type)
                {
                    case UIConstants.FORM: 
                        //set the uniqueId for each dForm.
                        Form form = (Form) entity;
                        form.setUniqueId(this.getUniqueId());
                        break;
                        
                    case UIConstants.GRID: 
                        //set the uniqueId for each DGrid.
                        Grid grid = (Grid) entity;
                        grid.setUniqueId(this.getUniqueId());
                        break;
                        
                    case UIConstants.GRAPH: 
                        //set the uniqueId for each DGraph.
                        Graph graph = (Graph) entity;
                        graph.setUniqueId(this.getUniqueId());
                        break;
                    
                    case UIConstants.TREE: 
                        //set the uniqueId for each DTree.
                        Tree tree = (Tree) entity;
                        tree.setUniqueId(this.getUniqueId());
                        break;
                    
                    case UIConstants.HTML: 
                        //set the uniqueId for each DHtml.
                        Html html = (Html) entity;
                        html.setUniqueId(this.getUniqueId());
                        break;
                        
                    case UIConstants.MATCH: 
                        //set the uniqueId for each DMatch.
                        Match match = (Match) entity;
                        match.setUniqueId(this.getUniqueId());
                        break;    
                        
                }
            }
        }
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
     * Get the boolean value where panel needs
     * to show border or not.
     * <p>
     * @return isShowBorder
     *      The <code>Boolean</code> value (true/false).
     */
    public boolean isShowBorder()
    {
        return isShowBorder;
    }

    /**
     * Set the boolean value where panel needs
     * to show border or not.
     * <p>
     * @param isShowBorder
     *      The <code>Boolean</code> value (true/false).
     */
    public void setShowBorder(boolean isShowBorder)
    {
        this.isShowBorder = isShowBorder;
    }
}
