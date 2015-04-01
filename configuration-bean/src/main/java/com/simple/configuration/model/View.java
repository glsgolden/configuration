package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class View extends Id 
{
	private static final long serialVersionUID = 6613433488901905107L;
	//--- View definition as per presentation.xsd ---
	private boolean isDefault;
	private Toolbar actionbar;
    private List<Section> sections;
    private boolean isHomePage;
    private boolean isStoreSelection;
    private boolean isPopup;
    private List<ElementReference> elementReference;
    
    /**
     * Pre process configuration for the view.
     */
    private List<ViewProcess> preProcesses;
    
    /**
     * Post process configuration for the view.
     */
    private List<ViewProcess> postProcesses;
    
    /**
     * Process configuration for the view.
     */
    private List<ViewProcess> processes;

    /**
     * indicates whether refId for edit mode is specified or
     *  not. 
     */
    private boolean isEdit;
    
    /**
     * indicates whether refId for new mode is specified or not. 
     */
    private boolean isNew;
    
	private AccessRights rights;
	
	/**
     * Name of the module to which this view belongs.   
     */
	private String moduleName;
	/**
	 * Module Id to which this view belongs
	 */
	private String moduleId;
	/**
	 * pkg Id to which this view belongs
	 */
	private String packageId;
	/**
	 * The view name.
	 */
	private String viewName;
	
	/**
     * Type of view which will be either User/System. 
     */
    private String viewType;
    
    /** The width value in pixels. */
    private int width;
    
    /** The height value in pixels. */
    private int height;
    
    /** 
     *  Indiacates whether view is folder view or not. 
     */
    private boolean isFolderView;
    /**
     * Business object name of the view.
     */
    private String businessObject;
    
    /**
     * Url of the javascript file for the view.
     */
    private String script;    
	
	public View() 
	{
		super();
        this.isHomePage = false;
        this.isStoreSelection = false;
        this.isPopup = false;
        this.viewType = CptClientConstants.VIEWTYPE_USER;
	}

	public View(String id, boolean isDefault, Toolbar actionbar, List<Section> sections) 
	{
		super(id);
        this.isHomePage = false;
        this.isStoreSelection = false;
        this.isPopup = false;
		this.isDefault = isDefault;
		this.actionbar = actionbar;
		this.sections = sections;
		this.viewType = CptClientConstants.VIEWTYPE_USER;
	}

	public Toolbar getActionbar() 
	{
		return actionbar;
	}

	public void setActionbar(Toolbar actionbar) 
	{
		this.actionbar = actionbar;
		this.actionbar.setType(ACTIONBAR);
	}

	public boolean isDefault() 
	{
		return isDefault;
	}

	public void setDefault(boolean isDefault) 
	{
		this.isDefault = isDefault;
	}

	public List<Section> getSections() 
	{
		return sections;
	}

	public void setSections(List<Section> sections) 
	{
		this.sections = sections;
	}

	public void addSection(Section section) 
	{
		if (this.sections == null) {
			this.sections = new ArrayList<Section>();
		}
		
		//for every section added, calculate the sum of heights
		//and set the width to the max of all section widths.
		if (!section.isHidden()) 
		{
		    height = height + section.getHeight();
	        if (section.getWidth() > width) 
	        {
	            width = section.getWidth();
	        }
		}
		this.sections.add(section);
	}
	
	/**
	 * Return the number of sections contained in the view.
	 * 
	 * @return int The number of sections contained in the view.
	 */
	public int size() 
	{
		int size = 0;
		if (this.sections != null) 
		{
			size = this.sections.size();
		}
		return size;
	}
    
    public boolean isHomePage()
    {
        return isHomePage;
    }

    public void setHomePage(boolean isHomePage)
    {
        this.isHomePage = isHomePage;
    }
    public boolean isStoreSelection()
    {
        return isStoreSelection;
    }

    public void setStoreSelection(boolean isStoreSelection)
    {
        this.isStoreSelection = isStoreSelection;
    }

    public boolean isPopup()
    {
        return isPopup;
    }

    public void setPopup(boolean isPopup)
    {
        this.isPopup = isPopup;
    }

	public AccessRights getRights() 
	{
		return rights;
	}

	public void setRights(AccessRights rights) 
	{
		this.rights = rights;
	}

	/**
     * Returns true if refId for Edit mode is specified  else returns false.
     * <p>
     * @return
     *      The isEdit <code>true</code> or <code>false</code> 
     */
	public boolean isEdit()
	{
		return isEdit;
	}

	/**
     * Sets true if refId for Edit mode is specified  else returns false.
     * <p>
     * @param isEdit
     *      The isEdit flag <code>true</code> or <code>false</code>
     */
	public void setIsEdit(boolean isEdit)
	{
		this.isEdit = isEdit;
	}

	/**
     * Returns true if refId for New mode is specified  else returns false.
     *  * <p>
     * @return
     *      The isEdit <code>true</code> or <code>false</code> 
     */
	public boolean isNew()
	{
		return isNew;
	}

	/**
     * Sets true if refId for Edit mode is specified  else returns false.
     * <p>
     * @param isNew
     *      The isNew flag <code>true</code> or <code>false</code>
     */
	public void setIsNew(boolean isNew)
	{
		this.isNew = isNew;
	}

	/**
	 * Check rights for provided mode and return true or false
	 * @param mode
	 * @return boolean
	 */
	public boolean hasAccessRights (int mode)
	{
		boolean hasRights = false;

		if (mode == CptClientConstants.EDIT_MODE)
		{
			hasRights = this.rights.isModify();
		}
		else if (mode == CptClientConstants.NEW_MODE)
		{
			hasRights = this.rights.isCreate();
		}
		else if (mode == CptClientConstants.VIEW_MODE)
		{
			hasRights = this.rights.isView();  
		}
		
		return hasRights;
	}
	
	/**
	 * Check delete rights for provided mode and return true or false.
	 * @return boolean
	 */
	public boolean hasDeleteRights ()
	{
		boolean hasRights = false;
		hasRights = this.rights.isDelete();  
		return hasRights;
	}
	
	/**
     * Returns the name of the module to which this view belongs.   
     */
    public String getModuleName()
    {
        return moduleName;
    }

    /**
     * Sets the name of the module to which this view belongs.   
     */
    public void setModuleName(String moduleName) 
    {
        this.moduleName = moduleName;
    }
    
    /**
     * Sets the uniqueId for the DView element and the Sections contained within the view.
     * 
     * @param parentId
     *          The uniqueId of the module element.
     */
    public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the module if not present already.
        super.setUniqueId(parentId);

        //iterate the section and set the uniqueId for each section if not assigned already.
        if (this.sections != null)
        {
            Iterator it = sections.iterator();
            while(it.hasNext())
            {
                Section section = (Section)it.next();
                section.setUniqueId(this.getUniqueId());
            }
        }
    }

    /**
     * Get the list of preProcesses to be applied for this view.
     * <p>
     * @return preProcesses
     *      List of <code>DViewProcess</code>
     */
    public List<ViewProcess> getPreProcesses()
    {
        return preProcesses;
    }

    /**
     * Set the list of preProcesses to be applied for this view.
     * <p>
     * @return preProcesses
     *      List of <code>DViewProcess</code>
     */
    public void setPreProcesses(List<ViewProcess> preProcesses)
    {
        this.preProcesses = preProcesses;
    }
    
    /**
     * Store the preProcess to be applied for this view.
     * <p>
     * @param preProcess
     *      <code>DViewProcess</code>
     */
    public void addPreProcess(ViewProcess preProcess)
    {
        if (this.preProcesses == null)
        {
            this.preProcesses = new ArrayList<ViewProcess>();
        }
        this.preProcesses.add(preProcess);
    }

    /**
     * Get the list of post processes to be applied for this view.
     * <p>
     * @return postProcesses
     *      List of <code>DViewProcess</code>
     */
    public List<ViewProcess> getPostProcesses()
    {
        return postProcesses;
    }

    /**
     * Set the list of post processes to be applied for this view.
     * <p>
     * @return postProcesses
     *      List of <code>DViewProcess</code>
     */
    public void setPostProcesses(List<ViewProcess> postProcesses)
    {
        this.postProcesses = postProcesses;
    }
    
    /**
     * Store the post process to be applied for this view.
     * <p>
     * @param postProcess
     *      <code>DViewProcess</code>
     */
    public void addPostProcess(ViewProcess postProcess)
    {
        if (this.postProcesses == null)
        {
            this.postProcesses = new ArrayList<ViewProcess>();
        }
        this.postProcesses.add(postProcess);
    }

    /**
     * get module Id
     * @return String
     */
    public String getModuleId()
    {
        return moduleId;
    }

    /**
     * set module Id
     * @param moduleId 
     *          <code>String</code>
     */
    public void setModuleId(String moduleId)
    {
        this.moduleId = moduleId;
    }

    /**
     * get package Id
     * @return packageId
     *      <code>String</code>
     */
    public String getPackageId()
    {
        return packageId;
    }

    /**
     * set package Id
     * @param packageId
     *          <code>String</code>
     */ 
    public void setPackageId(String packageId)
    {
        this.packageId = packageId;
    }

    /**
     * Gets the view name.
     * <p>
     * @return viewName 
     *      The xml file name.
     */
    public String getViewName()
    {
        return viewName;
    }

    /**
     * Sets the view name.
     * <p>
     * @param viewName
     *      The xml file name.
     */
    public void setViewName(String viewName)
    {
        this.viewName = viewName;
    }

    /**
     * Get the ViewType (either User/System).
     * @return
     *      <Code>String</code> viewType
     */
    public String getViewType() 
    {
        return viewType;
    }

    /**
     * Set the ViewType (either User/System).
     * @param viewType
     *      <code>String</code> viewType 
     */
    public void setViewType(String viewType) 
    {
        this.viewType = viewType;
    }
    
    /**
     * Returns boolean indicating whether the selected view is system View or not.
     */
    public boolean isSystemView()
    {
        if (CptClientConstants.VIEWTYPE_SYSTEM.equals(this.viewType))
        {
            return true;
        }
        return false;
    }

    /**
     * Get the list of ok/save processes to be applied for this view.
     * <p>
     * @return processes
     *      List of <code>DViewProcess</code>
     */
    public List<ViewProcess> getProcesses()
    {
        return processes;
    }

    /**
     * Set the list of ok/save processes to be applied for this view.
     * <p>
     * @return processes
     *      List of <code>DViewProcess</code>
     */
    public void setProcesses(List<ViewProcess> processes)
    {
        this.processes = processes;
    }
    
    /**
     * Store the ok/save process to be applied for this view.
     * <p>
     * @param processes
     *      <code>DViewProcess</code>
     */
    public void addProcess(ViewProcess process)
    {
        if (this.processes == null)
        {
            this.processes = new ArrayList<ViewProcess>();
        }
        this.processes.add(process);
    }

    /**
     * Gets the List of DElementReference instances.
     * <p>
     * @return
     *      elementReference
     */
    public List<ElementReference> getElementReference()
    {
        return elementReference;
    }

    /**
     * Sets the List of DElementReference instances.
     * <p>
     * @param elementReference
     *           - List of DElementReference instances
     */
    public void setElementReference(List<ElementReference> elementReference)
    {
        this.elementReference = elementReference;
    }

    /**
     * add the DElementReference instance into List
     * <p>
     * @param elementReference
     */
    public void addElementReference(ElementReference elementReference)
    {
        if (this.elementReference == null)
        {
            this.elementReference = new ArrayList<ElementReference>();
        }
        this.elementReference.add(elementReference);
        //-- set isNew/isEdit true if data Element reference mode is new/edit
        int mode = elementReference.getMode();
        if (mode == CptClientConstants.NEW_MODE)
        {
            this.isNew = true;
        }
        else if (mode == CptClientConstants.EDIT_MODE)
        {
            this.isEdit = true;
        }
    }

    /**
     * Gets the width for this view.
     * 
     * @return The width value in pixels
     */
    public int getWidth()
    {
        return width;
    }

	/**
	 * Gets the height for this view.
	 * 
	 * @return The height value in pixels
	 */
	public int getHeight()
    {
        return height;
    }

	/**
     * Returns true if view is folder view.
     *  * <p>
     * @return
     *      The isFolderView <code>true</code> or <code>false</code> 
     */
    public boolean isFolderView()
    {
        return isFolderView;
    }

    /**
     * Sets true if view is folder view.
     * <p>
     * @param isNew
     *      The isNew flag <code>true</code> or <code>false</code>
     */
    public void setFolderView(boolean isFolderView)
    {
        this.isFolderView = isFolderView;
    }

	/**
	 * Get the business object name.
	 * <p>
	 * @return businessObject
	 * 		The business object name.
	 */
    public String getBusinessObject() 
	{
		return businessObject;
	}

	/**
	 * Set the business object name.
	 * <p>
	 * @param businessObject
	 * 		The business object name.
	 */
	public void setBusinessObject(String businessObject) 
	{
		this.businessObject = businessObject;
	}

	/**
	 * Gets the JavaScript file name to be referred to.
	 * @return script
	 * 		Returns the URL of the JavaScript file
	 * 		
	 */
	public String getScript() 
	{
		return script;
	}
	
	/**
	 * Sets the JavaScript file name to be referred to.
	 * @param script	
	 * 		URL of the JavaScript file
	 */
	public void setScript(String scriptName) 
	{
		this.script = scriptName;
	}
}
