package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Grid configurations parsed for the given view XML.
 */
public class Grid extends Id implements UIConstants
{
    private static final long serialVersionUID = -9162352349738662474L;
    /**
     * List of Column objects in DGrid
     */
    private List<Column> columns;
    /**
     * Main Object Reference for the Grid 
     */
    private String objectRef;
    /**
     * The name of the module for the grid.
     */
    private String moduleref;
    /**
     * List containing Grid Where clause 
     */
    private ArrayList<String> whereClause;
    /**
     * List of field ids for where clause
     */
    private ArrayList<String> whereClauseLhsIds;
    /**
     * List of Primary Keys
     */
    private ArrayList<String> primaryIds;
    /**
     * List holds field ids for the primary fields
     */
    private ArrayList<String> primaryFieldIds;
    /**
     * List of AssociateKeys 
     */
    private ArrayList<String> allAssociateIds;
    /**
     * List containing grid from clause
     */
    private ArrayList<String> fromClause;
    /**
     * List holds the object references for order by clause.
     */
    private ArrayList<String> orderbyClause;
    /**
     * List holds the sort order for the entries in orderByClause List; i.e. A, D or NA.
     */
    private ArrayList<Integer> orderbySort;
    /**
     * List holds field ids for the order by fields
     */
    private ArrayList<String> orderbyIds;
    /**
     * List holds the group by object references.
     */
    private ArrayList<String> groupby;
    /**
     * List of group by field ids 
     */
    private ArrayList<String> groupbyIds;
    /**
     * The configured right click menu.
     */
    private Toolbar menu;
    /**
     * The base view configured page size.
     */
    private int basePageSize;
    /**
     * Flag indicating if the grid has 
     * selection of records enabled.
     */
    private boolean enableSelection;
    /**
     * Flag indicating if grid can
     * be exported into an PDF document.
     */
    private boolean enableExportToPdf;
    /**
     * Flag indicating if grid can
     * be exported into an excel document.
     */
    private boolean enableExportToExcel;
    /**
     * Flag indicating if grid has filter
     * function configured.
     */
    private boolean enableFilter;
    /**
     * Flag indicating if grid has sort
     * function configured.
     */
    private boolean enableSort;
    /**
     * Flag indicating if grid is editable.
     */
    private boolean editable;
    /**
     * The current page size configured 
     * for the grid.
     */
    private int pageSize;
    /**
     * Flag to indicate if grid is configured to have
     * select all record function.
     */
    private boolean isSelectAll;
    /**
     * indicates whether refId for edit mode is specified or not. 
     */
    private boolean isEdit;
    /**
     * Indicates whether refId for new mode is specified or not. 
     */
    private boolean isNew;
    /**
     * The auto refresh rate for the Grid data
     */
    private int refreshRate;
    /**
     * Flag to indicate whether grid can add new record.
     */
    private boolean canAddRow;
    /**
     * Flag to indicate whether grid can delete record.
     */
    private boolean canDeleteRow;
    /**
     * Flag to indicate whether grid displays record bar.
     */
    private boolean showRecordBar;
    /**
     * Flag to indicate whether grid displays pagination bar.
     */
    private boolean showPageBar;
    /**
     * Flag indicating if grid can
     * be exported into an text document.
     * The text can have delimiter to 
     * be specified option.
     */
    private boolean enableExportToText;
    /**
     * Flag to indicate whether data access rights 
     * should be applied with parent entity or not.
     */
    private boolean inheritFromParent;
    /**
     * To indicate the referred value & mode given as hrf element tag values.
     */
    private List<ElementReference> elementReferences;
    /**
     * List of visible columns.
     */
    private List<Column> visibleColumns;
    /**
     * The SQL hint for the grid.
     */
    private String sqlHint;
    
    /**
     * Business object name of the view that
	 * holds this grid.
     */
    private String businessObject;
    
    /**
     * Process configuration for the view.
     */
    private List<ViewProcess> processes;
    
    /**
     *  Flag set to true if columns of grid is a function name
     *  to be evaluated for column value, false otherwise.
     *  A grid can either have all the columns 
     *  with object reference or function and not
     *  an combination of both. 
     */
    private boolean hasFunctions;
    
    /**
     * Initializes a new instance of the Grid.
     */
    public Grid()
    {
        super();
        enableSelection = true;
        enableExportToExcel = true;
        enableExportToPdf = true;
        enableFilter = true;
        enableSort = true;
        pageSize = 25;
        editable = false;
        isSelectAll = false;
        canAddRow = true;
        canDeleteRow = false;
        showRecordBar = true;
        showPageBar = true;
        enableExportToText = true;
        inheritFromParent = false;
        setType(GRID);
    }
    
    /**
     * Initialize new instance of DGridfor the
     * given parameters.
     * <p>
     * @param id 
     *      <code>String</code> id for the grid.
     * @param columns
     *      <code>List</code> {@link Column}
     */
    public Grid(String id, List<Column> columns)
    {
        super(id);
        enableSelection = true;
        enableExportToExcel = true;
        enableExportToPdf = true;
        enableFilter = true;
        enableSort = true;
        editable = false;
        pageSize = 25;
        isSelectAll = false;
        canAddRow = true;
        canDeleteRow = false;
        showRecordBar = true;
        showPageBar = true;
        enableExportToText = true;
        inheritFromParent = false;
        setType(GRID);
        this.columns = columns;
    }

    /**
     * Get the columns.
     * <p>
     * @return columns
     *      <code>List</code> of columns.
     *      
     */
    public List<Column> getColumns()
    {
        return getColumns(ALL_COLUMNS);
    }
    
    /**
     * Returns List of {@link Column}
     * those with column as a object reference.
     * @return
     *      List of {@link Column}
     */
    public List<Column> getColumnsWithObjectRef()
    {
        List<Column> columnsWithObjectRef = new ArrayList<Column>();
        List<Column> columns = getColumns(ALL_COLUMNS);
        for (Column column : columns)
        {
            if (!column.isFunction())
            {
                columnsWithObjectRef.add(column);
            }
        }
        return columnsWithObjectRef;
    }


    /**
     * Get List of Column Object References
     * <p>
     * @return list
     *      <code>List</code> of column object References.
     *      
     */
    public List<String> getColumnObjRefs()
    {
        return getColumnObjRefs(ALL_COLUMNS);
    }

    /**
     * Get List of Column Data Types
     * <p>
     * @return list
     *      <code>List</code> of column data types.
     *      
     */
    public List<Integer> getColumnDataType()
    {
        return getColumnDataType(ALL_COLUMNS);
    }
    
    /**
     * Get List of Column Format
     * <p>
     * @return list
     * 		<code>java.util.List</code> of column format.
     */
    public List<String> getColumnFormats()
    {
        return getColumnFormats(ALL_COLUMNS);
    }

    /**
     * Get List of Column Labels
     * <p>
     * @return list
     *      <code>List</code> of column labels.
     * 
     */
    public List<String> getColumnLabels()
    {
        return getColumnLabels(ALL_COLUMNS);
    }

    /**
     * Return DColumn object for the given column position.
     * <p>
     * @param index
     *         The column position.
     * @return {@link Column} 
     */
    public Column getColumn(int index)
    {
        return this.columns.get(index);
    }

    /**
     * Sets the columns {@link Column} configured for the grid.
     * <p>
     * @param columns
     * 		The list of columns.
     */
    public void setColumns(List<Column> columns)
    {
        this.columns = columns;
        this.visibleColumns = null;
    }
    
    /**
     * Adds DColumn object in the columns List.
     * <p>
     * @param columnDef
     *            the DColumn object to be added in List.
     */
    public void addColumn(Column columnDef)
    {
        if (this.columns == null)
        {
            this.columns = new ArrayList<Column>();
        }

        this.columns.add(columnDef);

        if (this.allAssociateIds == null)
        {
            this.allAssociateIds = new ArrayList<String>();
        }

        List<String> assocIds = columnDef.getAssociateIds();
        if (assocIds != null)
        {
            for (int i = 0; i < assocIds.size(); i++)
            {
                String id = assocIds.get(i);
                if (!this.allAssociateIds.contains(id))
                {
                    this.allAssociateIds.add(id);
                }
            }
        }
    }

    /**
     * Get No. of columns in the DGrid Object 
     * <p>
     * @return size
     *      <code>int</code> No. of columns in List
     */
    public int size()
    {
        int size = 0;
        if (this.columns != null)
        {
            size = this.columns.size();
        }
        return size;
    }

    /**
     * Gets the module reference for this grid.
     * @return moduleref
     *      <code>String</code> module name.
     */
    public String getModuleRef()
    {
        return moduleref;
    }

    /**
     * Gets the module reference for this grid.
     * @param moduleref
     *      <code>String</code> module name.
     */
    public void setModuleRef(String moduleref)
    {
        this.moduleref = moduleref;
    }
     
    /**
     * Main Object Reference for the Grid.
     * <p>
     * @return objectRef
     *      <code>java.lang.String</code> object reference of grid.  
     */
    public String getObjectRef()
    {
        return objectRef;
    }

    /**
     * Set main Object Reference for the Grid.
     * <p>
     * @param objectRef
     *          Main Object Reference for the Grid
     */
    public void setObjectRef(String objectRef)
    {
        this.objectRef = objectRef;
    }

    /**
     * Get List containing Grid Where clause.
     * <p>
     * @return whereClause
     *          List containing Grid Where clause
     *          
     */
    public ArrayList<String> getWhereClause()
    {
        return whereClause;
    }

    /**
     * Set List containing Grid Where clause.
     * <p>
     * @param whereClause
     *          List containing Grid Where clause
     *          
     * whereClause <java.lang.String>
     */
    public void setWhereClause(ArrayList<String> whereClause)
    {
        this.whereClause = whereClause;
    }

    /**
     * Add Where clause to the Grid.
     * <p>
     * @param where
     *          <code>java.lang.String</code> Grid Where clause
     */
    public void addWhereClause(String where)
    {
        if (this.whereClause == null)
        {
            this.whereClause = new ArrayList<String>();
        }
        this.whereClause.add(where);
    }

    /**
     * Get List of AssociateKeys.
     * <p>
     * @return allAssociateIds
     *          List of AssociateKeys
     *          
     */
    public ArrayList<String> getAllAssociateIds()
    {
        return getAllAssociateIds(ALL_COLUMNS);
    }

    /**
     * Set List of AssociateKeys.
     * <p>
     * @param allAssociateIds
     *          List of AssociateKeys
     *          
     * allAssociateIds <java.lang.String>
     */
    public void setAllAssociateIds(ArrayList allAssociateIds)
    {
        this.allAssociateIds = allAssociateIds;
    }

    /**
     * Get List of Primary Ids.
     * <p>
     * @return primaryIds
     *      <code>java.util.ArrayList</code>  primary Ids.  
     */
    public ArrayList<String> getPrimaryIds()
    {
        return primaryIds;
    }

    /**
     * Set List of Primary Ids.
     * <p>
     * @param primaryIds
     *          List of Primary Ids
     *          
     * primaryIds <java.lang.String>
     */
    public void setPrimaryIds(ArrayList primaryIds)
    {
        this.primaryIds = primaryIds;
    }

    /**
     * Add Primary Ids in DGrids primary Ids List.
     * <p>
     * @param objectRef
     *         Primary Ids in DGrids primary Ids List.
     *          
     * objectRef <java.lang.String>
     */
    public void addPrimaryId(String objectRef)
    {
        if (this.primaryIds == null)
        {
            this.primaryIds = new ArrayList<String>();
        }
        this.primaryIds.add(objectRef);
    }

    /**
     * Get List containing grid from clause.
     * <p>
     * @return fromClause
     *          List containing grid from clause
     *          
     */
    public ArrayList<String> getFromClause()
    {
        return fromClause;
    }
    

	/**
     * Set List containing grid from clause.
     * <p>
     * @param fromClause
     *          List containing grid from clause
     *          
     * fromClause <java.lang.String>
     */
    public void setFromClause(ArrayList fromClause)
    {
        this.fromClause = fromClause;
    }

    /**
     * Add objectRef as a from clause in the  list containing grid from clause.
     * <p>
     * @param fromClause
     *          Add objectRef as a from clause in the  list containing grid from clause
     */
    public void addFromClause(String objectRef)
    {
        if (this.fromClause == null)
        {
            this.fromClause = new ArrayList<String>();
        }
        this.fromClause.add(objectRef);
    }

    /**
     * Get List containing the grid order by clause.
     * <p>
     * @return orderbyClause
     *          ArrayList<String> containing the grid order by clause
     *          
     */
    public ArrayList<String> getOrderbyClause()
    {
        return orderbyClause;
    }

    /**
     * Set List containing the grid order by clause.
     * <p>
     * @param orderbyClause
     *          ArrayList<String> containing the grid order by clause
     *          
     */
    public void setOrderbyClause(ArrayList<String> orderbyClause)
    {
        this.orderbyClause = orderbyClause;
    }

    /**
     * Adds the order by clause for the give
     * column and the sort direction.
     * <p>
     * @param objectRef
     *      The order by column.
     * @param sort
     *      The sort direction i.e ASC or DESC
     */
    public void addOrderbyClause(String objectRef, int sort)
    {
        if (this.orderbyClause == null)
        {
            this.orderbyClause = new ArrayList<String>();
            this.orderbySort = new ArrayList<Integer>();
        }
        this.orderbyClause.add(objectRef);
        this.orderbySort.add(new Integer(sort));
    }

    /**
     * Get flag to indicate if selection grid is rendered.
     * <p>
     * @return enableSelection
     *     flag to indicate if selection grid is rendered
     */
    public boolean isEnableSelection()
    {
        return enableSelection;
    }

    /**
     * Set flag to indicate if selection grid is rendered.
     * <p>
     * @param enableSelection
     *          flag to indicate if selection grid is rendered
     */
    public void setEnableSelection(boolean enableSelection)
    {
        this.enableSelection = enableSelection;
    }

    /**
     * Get flag to indicate if Export to excel provided
     * <p>
     * @return enableExportToExcel
     *          flag to indicate if Export to excel provided
     */
    public boolean isEnableExportToExcel()
    {
        return enableExportToExcel;
    }

    /**
     * Set flag to indicate if Export to excel provided
     * <p>
     * @param enableExportToExcel
     *          flag to indicate if Export to excel provided
     */
    public void setEnableExportToExcel(boolean enableExportToExcel)
    {
        this.enableExportToExcel = enableExportToExcel;
    }

    /**
     * Get flag to indicate if Export to PDF provided
     * <p>
     * @return enableExportToPdf
     *          flag to indicate if Export to PDF provided
     */
    public boolean isEnableExportToPdf()
    {
        return enableExportToPdf;
    }

    /**
     * Set flag to indicate if Export to PDF provided
     * <p>
     * @param enableExportToPdf
     *          flag to indicate if Export to PDF provided
     */
    public void setEnableExportToPdf(boolean enableExportToPdf)
    {
        this.enableExportToPdf = enableExportToPdf;
    }

    /**
     * Get flag to indicate if filter is activated
     * <p>
     * @return enableFilter
     *          flag to indicate if filter is activated
     */
    public boolean isEnableFilter()
    {
        return enableFilter;
    }

    /**
     * Set flag to indicate if filter is activated
     * <p>
     * @param enableFilter
     *          flag to indicate if filter is activated
     */
    public void setEnableFilter(boolean enableFilter)
    {
        this.enableFilter = enableFilter;
    }

    /**
     * Get flag to indicate if sort is activated
     * <p>
     * @return enableSort
     *          flag to indicate if sort is activated
     */
    public boolean isEnableSort()
    {
        return enableSort;
    }

    /**
     * Set flag to indicate if sort is activated
     * <p>
     * @param enableSort
     *          flag to indicate if sort is activated
     */
    public void setEnableSort(boolean enableSort)
    {
        this.enableSort = enableSort;
    }

    /**
     * Get the page size for the grid.
     * <p>
     * @return
     *      The Grid page size.
     */
    public int getPageSize()
    {
        return pageSize;
    }

    /**
     * Set the page size for the grid.
     * <p>
     * @param pageSize
     *      The Grid Page size.
     */
    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }
    
    /**
     * Find the the column type, whether it is VISIBLE, PRIMARY, or ASSOCIATE.
     * <p>
     * @param objectref
     *      The column object reference.
     * @return
     *      The column type, whether it is VISIBLE, PRIMARY, or ASSOCIATE
     */
    public int findColumnType(Object objectref)
    {
        int list = VISIBLE_ID;
        if (columns.contains(objectref))
        {
            list = VISIBLE_ID;
        }
        if (primaryIds.contains(objectref))
        {
            list = PRIMARY_ID;
        } else if (allAssociateIds.contains(objectref))
        {
            list = ASSOCIATE_ID;
        }
        return list;
    }

    /**
     * Check if grid is editable or not.
     * <p>
     * @return boolean
     *        <code>true</code> if grid is editable,
     *        else <code>false</code>.
     */
    public boolean isEditable()
    {
        return this.editable;
    }

    /**
     * Set if grid is editable or not.
     * <p>
     * @param editable
     *        <code>true</code> if grid is editable,
     *        else <code>false</code>.
     */
    public void setEditable(boolean editable)
    {
        this.editable = editable;
    }

    /**
     * Get the sort order for the fields in the order by clause.
     * <p>
     * @return
     *      <code>ArrayList</code> containing the sort order
     *      for the fields in the order by clause, corresponding to the 
     *      object references in orderbyClause.
     */
    public ArrayList<Integer> getOrderbySort()
    {
        return orderbySort;
    }

    /**
     * Set the sort order for the fields in the order by clause.
     * <p>
     * @param orderbySort
     *     <code>ArrayList</code> containing the sort order for 
     *     the fields in the order by clause, corresponding to the 
     *     object references in orderbyClause.
     */
    public void setOrderbySort(ArrayList<Integer> orderbySort)
    {
        this.orderbySort = orderbySort;
    }

    /**
     * Add object reference to group by clause.
     * <p>
     * @param data
     *          The field reference to be added in the group by clause
     */
    public void addGroupby(String data)
    {
        if (this.groupby == null)
        {
            this.groupby = new ArrayList<String>();
        }
        this.groupby.add(data);
    }

    /**
     * Get the fields in the grid group by clause.
     * <p>
     * @return ArrayList 
     *          The <code>List</code> of field object 
     *          references in the grid group by clause.
     */
    public ArrayList<String> getGroupby()
    {
        return groupby;
    }

    /**
     * Set the fields in the grid group by clause.
     * <p>
     * @param groupby 
     *          The <code>List</code> of field object
     *          references in the grid group by clause.
     */
    public void setGroupby(ArrayList groupby)
    {
        this.groupby = groupby;
    }
    
    /**
     * Is grid select all set for the grid 
     * i.e the select all the records displayed.
     * <p>
     * @return
     *      The select all flag <code>true</code> or <code>false</code>
     */
    public boolean isSelectAll()
    {
        return isSelectAll;
    }

    /**
     * Set the select all flag as true or false for the grid.
     * <p>
     * @param isSelectAll
     *      The select all flag <code>true</code> or <code>false</code>
     */
    public void setSelectAll(boolean isSelectAll)
    {
        this.isSelectAll = isSelectAll;
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
     * Set true if refId for New mode is specified  else returns false.
     * <p>
     * @param isNew
     *      The isNew flag <code>true</code> or <code>false</code>
     */
	public void setIsNew(boolean isNew)
	{
		this.isNew = isNew;
	}

	 /**
     * Check whether the add new record flag for this grid.
     * <p> 
     * @return isAddRow
     * 		<code>true</code> if record can be added, <code>false</code>
     * 		otherwise.
     */
    public boolean canAddRow()
    {
        return canAddRow;
    }

    /**
     * Set the add new record flag for this grid.
     * <p> 
     * @param isAddRow
     * 		<code>true</code> if record can be added, <code>false</code>
     * 		otherwise.
     */
    public void setAddRow(boolean isAddRow)
    {
        this.canAddRow = isAddRow;
    }

    /**
     * Check whether the delete record flag for this grid.
     * <p> 
     * @return isDeleteRow
     * 		<code>true</code> if record can be deleted, <code>false</code>
     * 		otherwise.
     */
    public boolean canDeleteRow()
    {
        return canDeleteRow;
    }

    /**
     * Set the delete record flag for this grid.
     * <p> 
     * @param isDeleteRow
     * 		<code>true</code> if record can be deleted, <code>false</code>
     * 		otherwise.
     */
    public void setDeleteRow(boolean isDeleteRow)
    {
        this.canDeleteRow = isDeleteRow;
    }
    
    /**
     * Check whether the record bar for this grid.
     * <p> 
     * @return isRecordBar
     * 		<code>true</code> if record is required to display, <code>false</code>
     * 		otherwise.
     */
    public boolean showRecordBar()
    {
        return showRecordBar;
    }

   /**
    * Set the record bar for this grid.
    * <p> 
    * @param isRecordBar
    * 		<code>true</code> if record is required to display, 
    *       <code>false</code> otherwise.
    */
    public void setRecordBar(boolean isRecordBar)
    {
        this.showRecordBar = isRecordBar;
    }
    
    /**
     * Get the isShowPageBar value to indicate display
     * of page bar as true/false
     * <p> 
     * @return showPageBar
     * 		<code>true</code> if page bar is required to display, 
     *      <code>false</code> otherwise.
     */
	public boolean isShowPageBar() {
		return showPageBar;
	}

    /**
    * Set the value for showPageBar flag for the grid.
    * <p> 
    * @param showPageBar
    * 		boolean value to indicate display of page bar in grid.
    */
	public void setPageBar(boolean showPageBar) {
		this.showPageBar = showPageBar;
	}
	
	/**
     * Get flag to indicate if Export to text provided
     * <p>
     * @return enableExportToText
     *          flag to indicate if Export to text provided
     */
    public boolean isEnableExportToText()
    {
        return enableExportToText;
    }

    /**
     * Set flag to indicate if Export to text provided
     * <p>
     * @param enableExportToText
     *          flag to indicate if Export to text provided
     */
    public void setEnableExportToText(boolean enableExportToText)
    {
        this.enableExportToText = enableExportToText;
    }
    
    /**
     * Get the right click menu options for the grid.
     * <p>
     * @return  menu
     *      <code>DToolbar</code> holding the list of <code>DButton</code>
     *      as actions available.
     */
    public Toolbar getMenu()
    {
        return menu;
    }

    /**
     * Save the right click Menu options for the grid.
     * <p>
     * @param  menu
     *      <code>DToolbar</code> holding the list of <code>DButton</code>
     *      as actions available.
     */
    public void setMenu(Toolbar menu)
    {
        this.menu = menu;
    }
    
    /**
     * Get flag to indicate parent enIds to be added as a part of data access rights or not.
     * <p>
     * @return inheritFromParent
     *          flag to indicate parent enIds to be added as a part of data access rights or not.
     */
    public boolean inheritFromParent()
    {
        return inheritFromParent;
    }

    /**
     * Set flag to indicate parent enIds to be added as a part of data access rights or not.
     * <p>
     * @param inheritFromParent
     *          flag to indicate parent enIds to be added as a part of data access rights or not.
     */
    public void setInheritFromParent(boolean inheritFromParent)
    {
        this.inheritFromParent = inheritFromParent;
    }
    
    /**
     * Get List of Column Object References who are eligible to save data.
     * <p>
     * @return columns
     *      <code>java.util.List</code> of column object References.
     *      
     */
    public List<String> getColumnObjRefsToSave()
    {    	
    	List<String> columns = new ArrayList<String>();
		List<Column> columnDefs = getColumns();
		Column column = null;
        int noOfColumns = getColumnObjRefs().size();
        for (int colIdx = 0; colIdx < noOfColumns; colIdx++)
        {
            column = (Column)columnDefs.get(colIdx);
            String ref = column.getObjectRef();
            boolean isReadOnly = column.isReadOnly();            
            //--- If column is read only, then we will ignore the column object reference. ---
            if (!isReadOnly)
            {	
            	columns.add(ref);
            }
        }
    	return columns;
    }
    
    /**
     * Get List of Column Data Types, only for the columns who are eligible to save data.
     * <p>
     * @return list
     *      <code>java.util.List</code> of column data types.
     *      
     */
    public List<Integer> getColumnDataTypesToSave()
    {
    	List<Integer> list = new ArrayList<Integer>();
		List<Column> columnDefs = getColumns();
		Column column = null;
        int noOfColumns = getColumnObjRefs().size();
        for (int colIdx = 0; colIdx < noOfColumns; colIdx++)
        {
            column = (Column)columnDefs.get(colIdx);
            int dataType = column.getDataType();
            boolean isReadOnly = column.isReadOnly();
            //--- If column is read only, then we will ignore the data type of that column. ---
            if (!isReadOnly)
            {
            	list.add(dataType);
            }
        }
    	return list;
    }
    
    /**
     *  Check All column for MVF exist or not.
     * @return
     * 		true if MVF Definition exist else false.
     */
    public boolean hasLookupForLists()
    {
    	boolean ret = false;
		int count = columns.size();
		for (int i = 0; i < count; i++)
		{
			Column columnConfig = columns.get(i);			
			MultiValueField multivalueField = columnConfig.getMultivaluefield();
			if (multivalueField != null)
			{
				int type = columnConfig.getColumnType();
				if (type == COMBOBOX || type == SUGGESTIONBOX || type == SUGGESTIONLISTBOX)
				{
					ret = true;
					break;
				}
			}
		}
		return ret;
    }
    
    /**
     * Get list of All column for which MVF exist, has static false and Column type COMBOBOX.
     * @return
     * 		Return List of DColumn object.
     */
    public List<Column> getLookupsForLists()
    {
    	List<Column> mvfColumnConfigs = new ArrayList<Column>();
    	int count = columns.size();
		for (int i = 0; i < count; i++)
		{
			Column columnConfig = columns.get(i);			
			MultiValueField mvf = columnConfig.getMultivaluefield();
			if (mvf != null)
			{
				boolean isStatic = mvf.isStaticFlag();
				int type = columnConfig.getColumnType();
				int pageSize = mvf.getPageSize();
				//-- the pageSize not equal zero then only we add to MVF lookup list 
				if (type == COMBOBOX && isStatic == false && pageSize != 0)
				{
					mvfColumnConfigs.add(columnConfig);
				}
			}
		}
		return mvfColumnConfigs;
    }
    
    /**
     * Sets the uniqueId for the DGrid element and for each DColumn element contained within the grid.
     * 
     * @param parentId
     *          The uniqueId of the DPanel element.
     */
    public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the dGrid if not present already.
        super.setUniqueId(parentId);
        
        //iterate the dColumns and set the uniqueId for each dColumn if not assigned already.
        if (this.columns != null)
        {
            Iterator<Column> it = columns.iterator();
            while(it.hasNext())
            {
                Column dColumn = it.next();
                dColumn.setUniqueId(this.getUniqueId());
            }
        }
    }

    /**
     * Get List of field ids for orderBy fields
     * @return orderbyIds
	 *			ArrayList<String>
     */
    public ArrayList<String> getOrderbyIds()
    {
        return orderbyIds;
    }

    /**
     * Set List of field Ids for orderBy fields
     * @param orderbyIds
     *          ArrayList<String>
     */
    public void setOrderbyIds(ArrayList<String> orderbyIds)
    {
        this.orderbyIds = orderbyIds;
    }

    /**
     * Add field id for order by fields.
     * <p>
     * @param fieldId
     *          <code>java.lang.String</code>
     */
    public void addOrderbyIds(String fieldId)
    {
        if (this.orderbyIds == null)
        {
            this.orderbyIds = new ArrayList<String>();
        }
        this.orderbyIds.add(fieldId);
    }
    
    /**
     * Get list of field Ids for primaryId fields
     * @return primaryFieldIds
	 * 			ArrayList<String>
     */
    public ArrayList<String> getPrimaryFieldIds()
    {
        return primaryFieldIds;
    }

    /**
     * Set list of field ids for primary fields
     * @param primaryFieldIds 
     *          ArrayList<String>
     */
    public void setPrimaryFieldIds(ArrayList<String> primaryFieldIds)
    {
        this.primaryFieldIds = primaryFieldIds;
    }

    /**
     * Add field id for primary ids.
     * <p>
     * @param fieldId
     *          <code>java.lang.String</code>
     */
    public void addPrimaryFieldIds(String fieldId)
    {
        if (this.primaryFieldIds == null)
        {
            this.primaryFieldIds = new ArrayList<String>();
        }
        this.primaryFieldIds.add(fieldId);
    }
    
    /**
     * Get list of field ids for where object references
     * @return whereClauseLhsIds
	 *			ArrayList<String>
     */
    public ArrayList<String> getWhereClauseLhsIds()
    {
        return whereClauseLhsIds;
    }

    /**
     * Set list of field ids for where field object references
     * @param whereClauseLhsIds
     *      	ArrayList<String>
     */
    public void setWhereClauseLhsIds(ArrayList<String> whereClauseLhsIds)
    {
        this.whereClauseLhsIds = whereClauseLhsIds;
    }

    /**
     * Add field id for whereClause.
     * <p>
     * @param fieldId
     *          <code>java.lang.String</code>
     */
    public void addWhereClauseLhsIds(String fieldId)
    {
        if (this.whereClauseLhsIds == null)
        {
            this.whereClauseLhsIds = new ArrayList<String>();
        }
        this.whereClauseLhsIds.add(fieldId);
    }

    /**
     * Get List of group by field ids
     * @return groupbyIds
	 *			ArrayList<String>
     */
    public ArrayList<String> getGroupbyIds()
    {
        return groupbyIds;
    }

    /**
     * Set List of group by field ids
     * @param groupbyIds
	 * 			ArrayList<String>
     */
    public void setGroupbyIds(ArrayList<String> groupbyIds)
    {
        this.groupbyIds = groupbyIds;
    }

    /**
     * Add field id for Group by field.
     * <p>
     * @param fieldId
     *          <code>java.lang.String</code>
     */
    public void addGroupbyIds(String fieldId)
    {
        if (this.groupbyIds == null)
        {
            this.groupbyIds = new ArrayList<String>();
        }
        this.groupbyIds.add(fieldId);
    }
    
    /**
     * Gets the page size configured for the base view.
     * <p>
     * @return originalPageSize
     *      <code>int<code> the base view configured page size.
     *      In case the view is customized, options to
     *      configure the page size is restricted to this 
     *      original page size.
     */
    public int getBasePageSize()
    {
        return basePageSize;
    }

    /**
     * Sets the page size configured for the base view.
     * <p>
     * @param originalPageSize
     *      <code>int<code> the base view configured page size.
     *      In case the view is customized, options to
     *      configure the page size is restricted to this 
     *      original page size.
     */
    public void setBasePageSize(int originalPageSize)
    {
        this.basePageSize = originalPageSize;
    }

    /**
     * Clones this grid configuration.
     */
    public Object clone()
    {
        Grid newGrid = new Grid();
        newGrid = (Grid) super.clone(newGrid);
        newGrid.setObjectRef(this.getObjectRef());
        newGrid.setModuleRef(this.getModuleRef());    
        //--- clone the where clause ---    
        if (this.whereClause != null)
        {
            newGrid.setWhereClause((ArrayList<String>) this.whereClause.clone());
        }
        //--- clone the where clause LHS field ids ---
        if (this.whereClauseLhsIds != null)
        {
            newGrid.setWhereClauseLhsIds((ArrayList<String>) this.whereClauseLhsIds.clone());
        }
        //--- clone the order by object refs ---
        if (this.orderbyClause != null)
        {
            newGrid.setOrderbyClause((ArrayList<String>)  this.orderbyClause.clone());
        }
        //--- clone the order by fields ids ---
        if (this.orderbyIds != null)
        {
            newGrid.setOrderbyIds((ArrayList<String>) this.orderbyIds.clone());
        }
        //--- clone the order by sort
        if (this.orderbySort != null)
        {
            newGrid.setOrderbySort((ArrayList<Integer>) this.orderbySort.clone());
        }        
        //--- clone the primary ids
        if (this.primaryIds != null)
        {
            newGrid.setPrimaryIds((ArrayList<String>) this.primaryIds.clone());
        }
        //--- clone the primary field ids 
        if (this.primaryFieldIds != null)
        {
            newGrid.setPrimaryFieldIds((ArrayList<String>) this.primaryFieldIds.clone());
        }
        //--- clone all associate Ids
        if (this.allAssociateIds != null)
        {
            newGrid.setAllAssociateIds((ArrayList) this.allAssociateIds.clone());
        }
        //--- clone the from clause object references
        if (this.fromClause != null)
        {
            newGrid.setFromClause((ArrayList<String>) this.fromClause.clone());
        }
        //--- clone the group by object references
        if (this.groupby != null)
        {
            newGrid.setGroupby((ArrayList<String>) this.groupby.clone());
        }
        //--- clone the group by field ids
        if (this.groupbyIds != null)
        {
            newGrid.setGroupbyIds((ArrayList<String>) this.groupbyIds.clone());
        }
        ArrayList<Column> newCols = new ArrayList<Column>();
        ArrayList<Column> cols = (ArrayList<Column>) this.getColumns();
        if (cols != null)
        {
            int size = cols.size();
            for (int i=0; i<size; i++)
            {
                Column col = cols.get(i);
                if (col != null)
                {
                    newCols.add((Column) col.clone());
                }
            }
        }
        //--- grid menu ---
        Toolbar menu = this.getMenu();
        newGrid.setMenu(menu);
        newGrid.setColumns(newCols);
        newGrid.setEnableExportToExcel(this.isEnableExportToExcel());
        newGrid.setEnableExportToPdf(this.isEnableExportToPdf());
        newGrid.setEnableFilter(this.isEnableFilter());
        newGrid.setEnableSelection(this.isEnableSelection());
        newGrid.setEnableSort(this.isEnableSort());
        newGrid.setEditable(this.isEditable());
        newGrid.setPageSize(this.getPageSize());
        newGrid.setSelectAll(this.isSelectAll);
        newGrid.setRefreshRate(this.refreshRate);
        newGrid.setIsEdit(this.isEdit);
        newGrid.setIsNew(this.isNew);
        newGrid.setAddRow(this.canAddRow);
        newGrid.setDeleteRow(this.canDeleteRow);
        newGrid.setRecordBar(this.showRecordBar);
        newGrid.setPageBar(this.showPageBar);
        newGrid.setEnableExportToText(this.isEnableExportToText());
        newGrid.setInheritFromParent(this.inheritFromParent());
        newGrid.setBasePageSize(this.basePageSize);
        newGrid.setElementReferences(this.elementReferences);
        newGrid.setSqlHint(this.sqlHint);
        newGrid.setBusinessObject(this.businessObject);
        newGrid.setProcesses(this.processes);
        return newGrid;        
    }

    /**
     * Gets the List of DElementReference instances.
     * <p>
     * @return
     *      elementReference
     */
    public List<ElementReference> getElementReferences()
    {
        return elementReferences;
    }

    /**
     * Sets the List of DElementReference instances.
     * <p>
     * @param elementReference
     *           - List of DElementReference instances
     */
    public void setElementReferences(List<ElementReference> elementReferences)
    {
        this.elementReferences = elementReferences;
    }

    /**
     * add the DElementReference instance into List
     * <p>
     * @param elementReference
     */
    public void addElementReference(ElementReference elementReference, View view)
    {
        if (this.elementReferences == null)
        {
            this.elementReferences = new ArrayList<ElementReference>();
        }
        this.elementReferences.add(elementReference);
        //-- set View.isEdit/isNew true/false based on the mode.
        int mode = elementReference.getMode(); 
        if (mode == CptClientConstants.NEW_MODE)
        {
            view.setIsNew(true);
        }
        else if (mode == CptClientConstants.EDIT_MODE)
        {
            view.setIsEdit(true);
        }
    }
 
    /**
     * Get List of Column Object References based on visibility.
     * <p>
     * @param visibility
     * 		int value specifying the visibility.
     * @return list
     *      <code>List</code> of column object References.
     *      
     */
    public List<String> getColumnObjRefs(int visibility)
    {
        List<String> list = new ArrayList<String>();
        int size = this.columns.size();
        for (int i = 0; i < size; i++)
        {
            Column col = columns.get(i);
            String val = col.getObjectRef();
            processVisibilty(visibility, val, col, list);
        }
        return list;
    }

    /**
     * Get the columns based on visibility.
     * <p>
     * @param visibility
     * 		int value specifying the visibility.
     * @return columns
     *      <code>List</code> of columns.
     *      
     */
    public List<Column> getColumns(int visibility)
    {
    	List<Column> list = new ArrayList<Column>();
    	if (visibility == ALL_COLUMNS)
    	{
    		return this.columns;
    	}
    	if (visibility == VISIBLE_COLUMNS && this.visibleColumns != null)
    	{
    		return this.visibleColumns;
    	}
    	if (columns != null)
    	{
    		int size = this.columns.size();
	    	for(int i = 0; i < size; i++)
	    	{
	            Column col = columns.get(i);
	            boolean isVisible = col.isVisible();
	            switch (visibility) 
	            {
					case VISIBLE_COLUMNS:
						if (isVisible)
						{
							list.add(col);
						}
						break;
					case HIDDEN_COLUMNS:
						if (!isVisible)
						{
							list.add(col);
						}
						break;
	            }
	    	}
	    	
    	}
    	if (visibility == VISIBLE_COLUMNS)
		{
			this.visibleColumns = list;
		}
        return list;
    }

    /**
     * Returns List of {@link Column}
     * those with column as a function.
     * @return
     *      List of {@link Column}
     */
    public List<Column> getColumnsWithFunctions()
    {
    	List<Column> columnsWithFunctions = new ArrayList<Column>();
    	if (columns != null)
    	{
    		for (Column column : columns)
    		{
    			if (column.isFunction())
    			{
    				columnsWithFunctions.add(column);
    			}
    		}
    	}
    	return columnsWithFunctions;
    }
    
    /**
     * Get List of Column Data Types base on visibility
     * <p>
     * @param visibility
     * 		int value specifying the visibility.
     * @return list
     *      <code>List</code> of column data types.
     *      
     */
    public List<Integer> getColumnDataType(int visibility)
    {
        List<Integer> list = new ArrayList<Integer>();
        int size = this.columns.size();
        for (int i = 0; i < size; i++)
        {
            Column col = columns.get(i);
            boolean isVisible = col.isVisible();
            switch (visibility) 
            {
				case ALL_COLUMNS:
					list.add(new Integer(col.getDataType()));
					break;
				case VISIBLE_COLUMNS:
					if (isVisible)
					{
						list.add(new Integer(col.getDataType()));
					}
					break;
				case HIDDEN_COLUMNS:
					if (!isVisible)
					{
						list.add(new Integer(col.getDataType()));
					}
					break;
            }
        }
        return list;
    }

    /**
     * Get List of Column Format
     * <p>
     * @param visibility
     * 		int value specifying the visibility.
     * @return list
     * 		<code>java.util.List</code> of column format.
     */
    
    public List<String> getColumnFormats(int visibility)
    {
    	List<String> list = new ArrayList<String>();
        int size = this.columns.size();
        for (int i = 0; i < size; i++)
        {
            Column col = columns.get(i);
            String val = col.getFormat();
            processVisibilty(visibility, val, col, list);
        }
        return list;
    }

    /**
     * Get List of Column Labels
     * <p>
     * @param visibility
     * 		int value specifying the visibility.
     * @return list
     *      <code>List</code> of column labels.
     * 
     */
    public List<String> getColumnLabels(int visibility)
    {
        List<String> list = new ArrayList<String>();
        int size = this.columns.size();
        for (int i = 0; i < size; i++)
        {
            Column col = columns.get(i);
            String val = col.getLabel();
            processVisibilty(visibility, val, col, list);
        }
        return list;
    }

    /**
     * Get List of AssociateKeys based on visibility.
     * <p>
     * @param visibility
     * 		int value specifying the visibility.
     * @return allAssociateIds
     *          List of AssociateKeys
     *          
     */
    public ArrayList<String> getAllAssociateIds(int visibility)
    {
    	ArrayList<String> list = new ArrayList<String>();
    	if (visibility == ALL_COLUMNS)
    	{
    		return allAssociateIds;
    	}
    	else
    	{
        	int size = columns.size();
        	for (int j = 0; j < size; j++)
        	{
        		Column column = columns.get(j);
        		boolean isVisible = column.isVisible();
                switch (visibility) 
                {
    				case VISIBLE_COLUMNS:
    					if (isVisible)
    					{
    						addAssociateKeys(list, column);
    					}
    					break;
    				case HIDDEN_COLUMNS:
    					if (!isVisible)
    					{
    						addAssociateKeys(list, column);
    					}
    					break;
                }
        	}
    	}
        return list;
    }

    /**
     * Delete the visible column list, so that it can be recreated.
     */
    public void resetVisibleColumns()
    {
    	this.visibleColumns = null;
    }
    
    /**
     * Add associated keys of the DColumn in the list.
     * <p>
     * @param list
     * 		The list in which the keys are put.
     * @param columnDef
     * 		DColumn from where the associated keys are extracted.
     * 		
     */
	private void addAssociateKeys(ArrayList<String> list, Column columnDef) 
	{
		List<String> assocIds = columnDef.getAssociateIds();
		if (assocIds != null)
		{
		    for (int i = 0; i < assocIds.size(); i++)
		    {
		        String id = assocIds.get(i);
		        if (!list.contains(id))
		        {
		            list.add(id);
		        }
		    }
		}
	}
	
	/**
     * Check column visibility and put the given value accordingly in the list.
     * <p>
     * @param visibility
     *      A UIConstant value denoting whether to all columns or visible columns or hidden columns.
     * @param value
     *      The value that is to be added the list.
     * @param column
     *      DColumn object.
     * @param list
     *      The <code>List</code> of object references.
     */
    private void processVisibilty(int visibility, String value, Column column, List<String> list)
    {
        boolean isVisible = column.isVisible();
        switch (visibility) 
        {
            case ALL_COLUMNS:
                list.add(value);
                break;
            case VISIBLE_COLUMNS:
                if (isVisible)
                {
                    list.add(value);
                }
                break;
            case HIDDEN_COLUMNS:
                if (!isVisible)
                {
                    list.add(value);
                }
                break;
        }
    }

	/**
	 * Get the SQL hint.
	 * <p>
	 * @return sqlHint
	 * 		The SQL hint.
	 */
    public String getSqlHint() 
	{
		return sqlHint;
	}

    /**
	 * Set the SQL hint.
	 * <p>
	 * @param sqlHint
	 * 		The SQL hint.
	 */
    public void setSqlHint(String sqlHint) 
	{
		this.sqlHint = sqlHint;
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
	
    public List<ViewProcess> getProcesses()
	{
		return processes;
	}

	public void setProcesses(List<ViewProcess> processes)
	{
		this.processes = processes;
	}

	/**
     * Store the ok/save process to be applied for this grid.
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
     * Sets the flag as true for grid with columns that have data
     * computed of a function.
     * 
     * @param hasFunctions
     *      True if columns of grid is a function name
     *      to be evaluated for column value, false otherwise.    
     */
    public void setHasFunctions(boolean hasFunctions)
    {
        this.hasFunctions = hasFunctions;
    }
    
    /**
     * Identifies the grid with columns that have data
     * computed of a function.
     * 
     * @return hasFunctions
     *      True if columns of grid is a function name
     *      to be evaluated for column data, false otherwise.
     */
    public boolean hasFunctions()
    {
        return this.hasFunctions;
    }
    
}