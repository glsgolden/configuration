package com.simple.configuration.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Module extends Id
{

	private static final long serialVersionUID = -8956659290512919269L;

    // --- Module definition as per presentation.xsd ---
    private boolean isDefault;
    private Label label;
   /**
	 * The Module name.
	 */
	private String moduleName;
	private int sequenceNum;
	
	private Navigation navigation;
	
	private boolean isHidden;
	
    /**
     * Contains all module views.
     * Key = View Id, value = DView object.
     */ 
    private Map<String,View> views;
	
	//--- variables required for user access rights. ---
	private String name;
	private AccessRights rights;
	
	public Module() 
	{
		super();
		this.isHidden = false;
	}

    /**
     * Instantiate a new <code>DModule</code> object for the given parameters.
     * @param id
     *      The name of module.
     * @param isDefault
     *      The module is default or not.
     * @param label
     *      The label information of module.
     * @param views
     *      The views of module.
     */
    public Module(String id, boolean isDefault, Label label,
            Map<String, View> views)
    {
        super(id);
        this.isDefault = isDefault;
        this.label = label;
        this.views = views;
        this.isHidden = false;
    }

	public boolean isDefault() 
	{
		return isDefault;
	}

	public void setDefault(boolean isDefault) 
	{
		this.isDefault = isDefault;
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
     */ 
	public Map<String,View> getViews() 
	{
		return views;
	}

    /** 
     */ 
	public void setViews(Map<String,View> views) 
	{
		this.views = views;
	}

	public void addView(View view) 
	{
		if (this.views == null) 
		{
			this.views = new HashMap<String,View>();
		}
		
		this.views.put(view.getId(), view);
	}
	
	public View getView(String id) 
	{
		View view = null;
		if (views != null) 
		{
			view = (View) views.get(id);
		}
		return view;
	}

	/**
	 * Get the default <code>DView</code>.
	 * 
	 * @return the default <code>DView</code>.
	 */
	public View getDefaultView() 
	{
		View view = null;
		Iterator<String> itr = this.views.keySet().iterator(); 
		while (itr.hasNext()) 
		{
			view = this.views.get(itr.next());
			if (view.isDefault()) 
			{
				break;
			}
		}
		return view;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public AccessRights getRights() 
	{
		return rights;
	}

	public void setRights(AccessRights rights) 
	{
		this.rights = rights;
	}

	public int getSequenceNum() 
	{
		return sequenceNum;
	}

	public void setSequenceNum(int sequenceNum) 
	{
		this.sequenceNum = sequenceNum;
	}

	/**
	 * Return the number of views contained in the module.
	 * 
	 * @return int The number of views contained in the module.
	 */
	public int size() 
	{
		int size = 0;
		if (this.views != null) 
		{
			size = this.views.size();
		}
		return size;
	}

    public boolean isHidden()
    {
        return isHidden;
    }

    public void setHidden(boolean isHidden)
    {
        this.isHidden = isHidden;
    }

    public Navigation getNavigation()
    {
        return navigation;
    }

    public void setNavigation(Navigation navigation)
    {
        this.navigation = navigation;
    }
    
    /**
     * Sets the uniqueId for the element.
     * <p>
     * @param parentId
     *          The unique Id of the parent element.
     */
    public void setUniqueId(String parentId)
    {
        //--- create and set the uniqueId of the module if not present already. ---
        super.setUniqueId(parentId);
        
        //--- iterate the Views and set the uniqueId for each view if not assigned already. ---
        if (this.views != null)
        {
            Iterator<String> it = this.views.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                View view = views.get(key);
                view.setUniqueId(this.getUniqueId());
            }
        }
    }

    /**
     * Gets the module name.
     * <p>
     * @return moduleName
     *      The module name.
     */
    public String getModuleName()
    {
        return moduleName;
    }

    /**
     * Sets the module name.
     * <p>
     * @param moduleName
     *      The module name.
     */
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }
    /**
     * Gets the package id for the module id.
     * <p>
     * @param moduleId
     *      The module name.
     * @param Packages
     *      The List of available packages.
     */
  
    public String getPackageId(String moduleId)
    {
    	Iterator<String> itr = this.views.keySet().iterator(); 
		while (itr.hasNext()) 
		{
			View view = this.views.get(itr.next());
			if(view.getModuleId().equals(moduleId))
			{
				return view.getPackageId();
			}
		}
    	return null;
    }
}
