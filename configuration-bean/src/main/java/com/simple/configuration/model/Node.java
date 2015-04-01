package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing the Tree Node element as used by the presentation framework.
 */
public class Node extends Id
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7037240081536653426L;

    // --- Node definition as per presentation.xsd ---
    /**
     * The label for this node.
     */
    private String label;

    /**
     * The children for this <code>Node</code> can be <code>DNode</code>s or <code>DLeaf</code>s.
     */
    private ArrayList<Id> children;

    /**
     * Flag indicating if the current Node is current view or not.
     */
    private boolean isCurrent;

    /**
     * Flag indicating if the current Node should expanded or collapsed by default.
     */
    private boolean isVisible;

    /**
     * String containing the reference. 
     * */
    private String ref;
    
    /**
     * The image for this node.
     */
    private String image;
    /**
     * Contains the filter.
     */
    private List<Condition> filterCondition;
    
    /**
    * The configured right click menu.
    */
    private Toolbar menu;
    
    /**
     * Initialize a new DNode object.
     */
    public Node()
    {
        super();
        /*
         * Visible is true by default, unless specified by the user.
         */
        isVisible = true;
        this.isCurrent = false;
        this.filterCondition = new ArrayList<Condition>();
    }

    /**
     * Initialize a new DNode object.
     * <p>
     * 
     * @param label
     *            White label for the Node.
     * @param children
     *            Sub elements for the Node. i.e. either DNode and/or DLeaf children
     *            <com.capgent.cpt.client.common.dto.DEntity>
     */
    public Node(String label, ArrayList children, String image)
    {
        this.isCurrent = false;
        this.label = label;
        this.children = children;
        this.image = image;
        this.filterCondition = new ArrayList<Condition>();
    }

    /**
     * Get the Sub elements for the Node.
     * <p>
     * The child elements for this Node can be <code>DNode</code> and/or <code>DLeaf</code>
     * objects. <com.capgent.cpt.client.common.dto.DEntity>
     */
    public ArrayList getChildren()
    {
        return children;
    }

    /**
     * Set the Sub elements for the Node.
     * <p>
     * 
     * @param children
     *            The Child Elements for the Node; i.e. <code>DNode</code> and/or
     *            <code>DLeaf</code> objects. children <com.capgent.cpt.client.common.dto.DEntity>
     */
    public void setChildren(ArrayList children)
    {
        this.children = children;
    }

    /**
     * Add a child leaf to the current Node.
     * <p>
     * 
     * @param leaf
     *            The child <code>DLeaf</code> object to be added to the current Node.
     */
    public void addLeaf(Leaf leaf)
    {
        if (this.children == null)
        {
            this.children = new ArrayList<Id>();
        }

        this.children.add(leaf);
        if (leaf.isCurrentView())
        {
            this.isCurrent = true;
        }
    }

    /**
     * Add a sub node to the current Node.
     * <p>
     * 
     * @param node
     *            The sub <code>DNode</code> object to be added to the current Node.
     */
    public void addNode(Node node)
    {
        if (this.children == null)
        {
            this.children = new ArrayList<Id>();
        }

        this.children.add(node);
    }

    /**
     * Add a child leaf/node to the current Node.
     * <p>
     * 
     * @param entity
     *            The child <code>DLeaf/DNode</code> object to be added to the current Node.
     */
    public void addChild(Id entity)
    {
        if (this.children == null)
        {
            this.children = new ArrayList<Id>();
        }
        this.children.add(entity);
    }

    /**
     * Get the Node Label.
     * <p>
     * 
     * @return The Node Label.
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * Set the Node Label.
     * <p>
     * 
     * @param label
     *            The Node Label.
     */
    public void setLabel(String label)
    {
        this.label = label;
    }

    /**
     * Get the number of current nodes sub elements.
     * <p>
     * 
     * @return The number of sub elements.
     */
    public int size()
    {
        int size = 0;
        if (this.children != null)
        {
            size = this.children.size();
        }
        return size;
    }

    /**
     * Check if the Node is current view or not.
     * <p>
     * 
     * @return <code>boolean true</code> if the node is current view, else <code>false</code>
     */
    public boolean isCurrent()
    {
        return isCurrent;
    }

    /**
     * Set if the Node is current view or not.
     * <p>
     * 
     * @param isCurrent
     *            <code>boolean true</code> if the node is current view, else <code>false</code>
     */
    public void setCurrent(boolean isCurrent)
    {
        this.isCurrent = isCurrent;
    }

    /**
     * Checks if node is visible.
     * <p>
     * if visible=true, tree node is rendered expanded, else collapsed.
     * 
     * @return <code>true</code>, if is expanded by default. <code>false</code> for displayed
     *         as collapsed by default.
     */
    public boolean isVisible()
    {
        return isVisible;
    }

    /**
     * Sets visible value for node.
     * <p>
     * if visible =<code>true</code>, tree node is expanded else if visible is
     * <code>false</code>, the tree is collapsed
     * 
     * @param isVisible <code>true</code>, if is expanded by default. <code>false</code> for displayed
     *         as collapsed by default
     */
    public void setVisible(boolean isVisible)
    {
        this.isVisible = isVisible;
    }

    /**
     * Gets the ref property.
     * 
     * @return The ref property
     *      <br>of type <code>String</code>
     */
    public String getRef()
    {
        return ref;
    }

    /**
     * Sets the ref to a new value
     * 
     * @param ref the new ref value
     * <br> of type <code>String</code>
     */
    public void setRef(String ref)
    {
        this.ref = ref;
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
