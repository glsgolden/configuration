package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Form definition as per presentation.xsd 
 *
 */
public class Form extends Id 
{
    private static final long serialVersionUID = -295051509156835948L;
    /** 
     * <java.lang.String, com.capgent.cpt.client.common.dto.DTab> 
     */ 
	private HashMap<String,Tab> tabs;
	/**
	 * 
	 */
	private FormRow row;
	/**
	 * 
	 */
	private List<FormRow> rows;
	/**
	 * <code>DDatasource</code> object containing forms objectref, 
	 * fromclause, Groupby and primaryId   
	 */
    private DataSource datasource;
    /**
     * The css for the tab.
     */
    private String css;
    /**
     * Total no of columns for this Form.
     */
    int noOfRows;
    /**
     * max no of columns a row contains.
     */
    int noOfColumns;
    /**
     * Flag indicating whether the form needs to be rendered using 
     * FormRenderer or new CptFormRenderer.
     */
    private boolean isNew;
    /**
     * The auto refresh rate for the Grid data
     */
    private int refreshRate;
    /**
     * The flag to indicate whether form is customizable or not.
     */
    private boolean isCustomizable;
    /**
     * Business object name of the view.
     */
    private String businessObject;
    
    /**
     * Initialize an new instance of DForm
     */
	public Form()
	{
		super();
		setType(FORM);
		isNew = false;
	}
	
    /** 
     * Initialize an new instance of DForm for given parameters.
     */ 
	public Form(String id, HashMap<String,Tab> tabs, List<FormRow> rows)
	{
		super(id);
		setType(FORM);
		this.tabs = tabs;
		this.rows = rows;
	}

    /** 
     * Get the tab mappings. 
     * <p>
     * @return tabs
     *      <code>HashMap</code> containing 
     *      key --> <code>String</code> id of the tab.
     *      value --> <code>DTab</code>  
     * 
     * <java.lang.String, com.capgent.cpt.client.common.dto.DTab> 
     */ 
	public HashMap<String,Tab> getTabs()
	{
		return tabs;
	}

	/**
     * Set the tab mappings.
     * <p>
     * @param tabs
     *      <code>HashMap</code> containing 
     *      key --> <code>String</code> id of the tab.
     *      value --> <code>DTab</code>  
     * tabs <java.lang.String, com.capgent.cpt.client.common.dto.DTab> 
     */ 
	public void setTabs(HashMap<String,Tab> tabs)
	{
		this.tabs = tabs;
	}
	/**
	 * @param tab 
	 * 		adds tab to form
	 */
	public void addTab(Tab tab)
	{
		if (this.tabs == null)
		{
			this.tabs = new HashMap<String,Tab>();
		}
		this.tabs.put(tab.getId(), tab);
	}
	/**
	 * Get the tab configuration for the tab of the form at the given index.
	 * <p>
	 * @param id
	 * 		tab index id.
	 * @return
	 * 		Return <code>DTab</code>
	 */
	public Tab getTab(String id)
	{
		Tab tab = null;
		if (tabs != null)
		{
			tab = (Tab) tabs.get(id);
		}
		return tab;
	}

	/**
	 * Get the default <code>DTab</code>.
	 * <p>
	 * @return tab
	 *     The default <code>DTab</code> configuration.
	 */
	public Tab getDefaultTab()
	{
		Tab tab = null;
		Iterator<String> itr = this.tabs.keySet().iterator(); 
		while (itr.hasNext())
		{
			tab = (Tab) this.tabs.get(itr.next());
			if (tab.isDefault())
			{
				break;
			}
		}
		return tab;
	}
	
	/**
     * Get the row configurations for this form.
     * <p>
     * @return rows 
     *      The <code>List</code> of <code>DFormRow</code>
	 */
    public List<FormRow> getRows()
    {
		return rows;
	}

    /**
     * Set the row configurations for this form.
     * <p>
     * @param rows 
     *      The <code>List</code> of <code>DFormRow</code>
     */
    public void setRows(List<FormRow> rows)
    {
		this.rows = rows;
	}

	/**
	 * Return the number of tabs within this form.
	 * <p>
	 * 
	 * @return size 
	 *      The tab count for this form.
	 */
	public int size()
	{
		int size = 0;
		if (this.tabs != null)
		{
			size = this.tabs.size();
		}
		return size;
	}

    /**
     * Get the reference of the table for the form fetch/save data.
     * <p>
     * @return ref
     *      <code>String</code> reference of the table to be queried 
     *      for this form for data fetch/save.
     */
    public String getObjectRef()
    {
        String ref = datasource.getObjectRef();
        return ref;
    }

    /**
     * Get the from clause for the form specified as part of 
     * data source configuration of the form.
     * <p> 
     * @return ret
     *      <code>ArrayList</code> of from clauses.
     */
    public ArrayList<String> getFromClause()
    {
        ArrayList<String> ret = datasource.getFrom();
        return ret;
    }

    /**
     * Get the primary ids for the form specified as part of 
     * data source configuration of the form.
     * <p> 
     * @return ret
     *      <code>ArrayList</code> holding String of HQL 
     *      references for primary ids.
     */
    public ArrayList<String> getPrimaryIds()
    {
        ArrayList<String> ret = datasource.getPrimaryIds();
        return ret;
    }

    /**
     * Get the fields in the grid group by clause.
     * <p>
     * @return ArrayList 
     *          The <code>List</code> of field object references in the grid group by clause.
     */
    public ArrayList<String> getGroupby()
    {
        return datasource.getGroupby();
    }

    /**
     * Geet the data source configuration for data fetch/save for the form.
     * <p>
     * @param datasource
     *      <code>DDatasource</code>
     */
	public DataSource getDatasource()
	{
		return datasource;
	}
	
    /**
     * Set the data source configuration for data fetch/save for the form.
     * <p>
     * @param datasource
     *      <code>DDatasource</code>
     */
	public void setDatasource(DataSource datasource)
	{
		this.datasource = datasource;
	}

	/**
	 * Set the access mode of the form.
	 */
    public void setAccess(String access)
    {
    }
    
	/**
	 * Gets the list of tab ids.
	 * <p>
	 * @return list
	 * 			The list of tabs ordered by its sequence number.
	 */
	public List<String> getTabIdsBySequence() 
	{
		List<String> list = null;
		if (tabs == null) 
		{	
			list = new ArrayList<String>();
		} 
		else 
		{
			int seq = 0;
			/**
			 * For multiple tabs is form it is required to add dummy values equal to the length of tabs. 
			 * Because Hashmap doesn't give the value in the same order in which it is getting from the xml.
			 * So first to dummy value then add all tabs and after that remove those dummy values.
			 * If we are not doing this then we will get ArrayIndexOutOfBoundException.
			 */
			List<String> dummy = new ArrayList<String>();
			//--- Adding dummy values to the list ---
			for ( ; seq < tabs.size(); seq++)
			{
				dummy.add(seq, "" + seq);
			}
			
			list = new ArrayList<String>(dummy);
			String id;
			Iterator<String> it = tabs.keySet().iterator();
			
			while (it.hasNext()) 
			{
				id = it.next();
				Tab tab = (Tab) tabs.get(id);
				int pos = tab.getSequenceNum();
				list.add(pos, id);
			}
			
			//--- removing dummy values to the list ---
			list.removeAll(dummy);
		}
		return list;
	}
	
	/**
     * Get the style for the form.
     * <p>
     * @return css
     *      The <code>String</code> style for the form.
     */
    public String getCss()
    {
        return css;
    }

    /**
     * Set the style for the form.
     * <p>
     * @param css
     *      The <code>String</code> style for the form.
     */
    public void setCss(String css)
    {
        this.css = css;
    }
    
    /**
	 * Get the tab ids in sequence as per definition. 
	 * <p>
	 * @param tabs
	 * 		<code>HashMap</code> containing 
	 *      key --> <code>String</code> id of the tab.
	 *      value --> <code>DTab</code>  
	 * @return ret
	 * 		List of tab id's in sequence
	 */
	public List<String> getTabIdsBySequence(HashMap<String,Tab> tabs) 
	{
		List<String> ret = null;
		if (tabs == null) 
		{	
			ret = new ArrayList<String>();
		} 
		else 
		{
			int seq = 0;
			/**
			 * For multiple tabs is form it is required to add dummy values equal to the lenght of tabs. 
			 * Because Hashmap doesn't give the vaule in the same order in which it is getting from the xml.
			 * So first to dummy value then add all tabs and after that remove those dummy values.
			 * If we are not doing this then we will get ArrayIndexOutOfBoundException.
			 */
			List<String> dummy = new ArrayList<String>();
			//--- Adding dummy values to the list ---
			for ( ; seq < tabs.size(); seq++)
			{
				dummy.add(seq, "" + seq);
			}
			
			ret = new ArrayList<String>(dummy);
			String id;
			Iterator<String> it = tabs.keySet().iterator();
			
			while (it.hasNext()) 
			{
				id = it.next();
				Tab tab = (Tab) tabs.get(id);
				int pos = tab.getSequenceNum();
				ret.add(pos, id);
			}
			
			//--- removing dummy values to the list ---
			ret.removeAll(dummy);
		}
		return ret;
	}
	/**
	 * Get the total number of rows for this form.
	 * <p>
	 * @return noOfRows
	 * 		Returns total number of row count for this form.
	 * 
	 */
	public int getNoOfRows()
	{
		int tabsSize = tabs.size();
		if ( tabsSize > 1)
		{
			this.noOfRows = this.noOfRows + 1;
		}
		return noOfRows;
	}
	
	/**
	 * Get the total number of columns for this form.
	 * <p>
	 * @return noOfColumns
	 * 		Return total no of columns in row.
	 */
	public int getNoOfColumns()
	{
		return noOfColumns;
	}
	
	/**
	 * Register the row configuration for this form.
	 * <p>
	 * @param row
	 *        <code>DFormRow</code> 
	 */
	public void addRow(FormRow row)
	{
		if (this.rows == null)
		{
			this.rows = new ArrayList<FormRow>();
		}
		this.rows.add(row);
		
		this.noOfRows = this.noOfRows + 1;
		List fields = row.getFields();
		if (fields != null)
		{
		    int columnCount = fields.size();
	        
	        if (columnCount > this.noOfColumns)
	        {
	            this.noOfColumns = columnCount;
	        }    
		}
	}
	
	/**
     * Get the row for the form.
     * <p> 
     * @return row
     *      The <code>DFormRow</code> object.
     * @deprecated
     *      The form now, has list of rows.
     * 
     */
    public FormRow getRow() 
    {
        return row;
    }

    /**
     * Sets the row Object for the form. 
     * <p>
     * @param row
     *      The <code>DFormRow</code> object.
     * @deprecated
     *      The form now, has list of rows.
     */
    public void setRow(FormRow row) 
    {
        this.row = row;
    }

    /**
     * Indicate whether the form is new or old to invoke appropriate renderer.
     * i.e CptFormRenderer if new , FormRenderer otherwise.
     * <p>
     * @return
     *      <code>true</code> if new form <code>false</code> otherwise.
     */
    public boolean isNew()
    {
        return isNew;
    }
    
    /**
     * Set whether the form is new or old to invoke appropriate renderer.
     * i.e CptFormRenderer if new , FormRenderer otherwise.
     * <p>
     * @param
     *      <code>true</code> if new form <code>false</code> otherwise.
     */
    public void setNew(boolean isNew)
    {
        this.isNew = isNew;
    }

    /**
     * Get the auto data refresh rate.
     * <p>
     * @return
     * 		The auto data refresh rate.
     */
    public int getRefreshRate()
	{
		return refreshRate;
	}

    /**
     * Set the auto data refresh rate.
     * <p>
     * @param refreshRate
     * 		The auto data refresh rate.
     */
	public void setRefreshRate(int refreshRate)
	{
		this.refreshRate = refreshRate;
	}
	
	/**
	 * Get the <code>DTab</code> by index number.
	 * <p>
	 * @param index
	 * 		The index number of the <code>DTab</code>.
	 * @return tab
	 * 		The <code>DTab</code> object.
	 */
	public Tab getTab(int index)
	{
		Tab tab = null;
		List<String> tabList = this.getTabIdsBySequence();
		int size = tabList.size();
		if (index < size)
		{
			String tabId =  tabList.get(index).toString();
			tab = (Tab) this.getTab(tabId);
		}
		return tab;
	}
	
	/**
     * Sets the uniqueId for the DForm element and for each DTab element contained within the form.
     * 
     * @param parentId
     *          The uniqueId of the DPanel element.
     */
	public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the dForm if not present already.
	    super.setUniqueId(parentId);

        //iterate the tabs and set the uniqueId for each tab if not assigned already.
	    if (this.tabs != null)
	    {
	        Iterator<String> it = tabs.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                Tab tab = tabs.get(key);
                tab.setUniqueId(this.getUniqueId());
            }
	    }
	    //iterate the rows and set the uniqueId for each row if not assigned already.
        if (this.rows != null)
        {
            Iterator<FormRow> it = this.rows.iterator();
            while(it.hasNext())
            {
                FormRow row = (FormRow)it.next();
                ArrayList <List<Field>> fieldsList = row.getFields();
                Iterator<List<Field>> fieldListIterator = fieldsList.iterator();
                while (fieldListIterator.hasNext())
                {
                    List<Field> fields = (List<Field>)fieldListIterator.next();
                    for(int i =0; i < fields.size(); i++)
                    {
                        Field field = (Field)fields.get(i);
                        field.setUniqueId(this.getUniqueId());
                    }
                }
            }
        }
    }
	
	/**
	 * Get the field of specified id.
	 * <p>
	 * @param fieldId
	 *         The field id.
	 * @return field
	 *         {@link Field}
	 */
	public Field getFieldById(String fieldId)
	{
	    Field field = null;
        Iterator<String> itr = this.tabs.keySet().iterator(); 
        while (itr.hasNext())
        {
            Tab tab = (Tab) this.tabs.get(itr.next());
            field = tab.getFieldById(fieldId);
            if (field != null)
            {
                break;
            }
        }
	    return field;
	}

	/**
	 * Get the customization property of form.
	 * <p>
	 * @return isCustomizable
	 * 		Boolean value returns true if form is customizable otherwise false.
	 */
	public boolean isCustomizable() 
	{
		return isCustomizable;
	}

	/**
	 * Set the customization property of form.
	 * <p>
	 * @Param isCustomizable
	 *  	Set the boolean value true if form is customizable otherwise false.
	 */
	public void setCustomizable(boolean isCustomizable) 
	{
		this.isCustomizable = isCustomizable;
	}
	
	/**
	* Clones this form configuration.
	*/
	public Object clone()
	{
		Form newForm = new Form();
		newForm = (Form) super.clone(newForm);
		if (this.tabs != null)
		{
			HashMap<String, Tab> formTabs = new HashMap<String, Tab>();
			Iterator<String> itr = this.tabs.keySet().iterator();
			while (itr.hasNext())
			{
				String key = itr.next();
				Tab tab = this.tabs.get(key);
				Tab clonedTab = (Tab) tab.clone();
				formTabs.put(key, clonedTab);
			}
			newForm.setTabs(formTabs);
		}

		if (this.row != null)
		{
			FormRow clonedFormRow = (FormRow) this.row.clone();
			newForm.setRow(clonedFormRow);
		}

		if (this.rows != null)
		{
			newForm.setRows(this.rows);
		}

		if (this.datasource != null)
		{
			newForm.setDatasource(this.datasource);
		}

		if (this.css != null)
		{
			newForm.setCss(this.css);
		}
		newForm.noOfRows = this.noOfRows;
		newForm.noOfColumns = this.noOfColumns;
		newForm.setNew(this.isNew);
		newForm.setRefreshRate(this.refreshRate);
		newForm.setCustomizable(this.isCustomizable);
		newForm.setBusinessObject(this.businessObject);
		return newForm;
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
}