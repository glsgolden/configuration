package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiValueField extends Id
{
	/**
	 * The columns for this MVF.
	 */
	private List<Column> columns;
	/**
	 * The static enumeration value
	 */
	private List<String> constantValues;
	/**
	 * The boolean value for static element
	 */
	private boolean isStatic;
	/**
	 * The int value for access permission
	 */
	private int mode;
	/**
	 * <code>DDatasource</code> object containing forms objectref, fromclause, Groupby and primaryId   
	 */
	private DataSource datasource;
	/**
	 *  sets the number of suggestions to show at one time.
	 */
	private int pageSize;

	/**
	 *  Indicate MVF is editable or not.
	 */
	private boolean isEditable;

	/**
	 *  Indicate MVF has key-value or only value.
	 */
	private boolean hasId;

	/**
	 * <code>CptOrderedMap</code> object containing static MVF enum constant values.
	 */
	private CptOrderedMap data;

	/**
	 * Initialize new instance of DMultivaluefield.
	 */
	public MultiValueField()
	{
		super();
		this.pageSize = 10;
		setType(MULTIVALUEFIELD);
	}

	/**
	 * Initialize new instance of DMultivaluefield for given paramters.
	 * <p>
	 * @param id
	 *      The <code>String</code> id. 
	 * @param columns
	 *      The <code>List</code> of <code>DColumns</code>
	 */
	public MultiValueField(String id, List<Column> columns)
	{
		super(id);
		setType(MULTIVALUEFIELD);
		this.columns = columns;
		this.pageSize = 10;
	}

	/**
	 * This method is for getting the list of columns.
	 * <p>
	 * @return columns
	 *      The <code>List</code> of <code>DColumns</code>
	 */
	public List<Column> getColumns()
	{
		return columns;
	}

	/**
	 * Get object references for the columns.
	 * <p>
	 * @return ret
	 *      The <code>List</code> of <code>String</code> HQL references for columns.
	 */
	public List<String> getColumnObjRefs() 
	{
		List<String> ret = new ArrayList<String>();
		for (int i=0; columns!=null && i<columns.size(); i++)
		{
			Column col = columns.get(i);
			ret.add(col.getObjectRef());
		}
		return ret;
	}

	/**
	 * Get the display column names.
	 * <p>
	 * @return ret 
	 *       The <code>List</code> of <code>String</code> column labels.
	 * <java.lang.String>
	 */
	public List<String> getColumnLabels() 
	{
		List<String> ret = new ArrayList<String>();
		int count = columns.size();
		for (int i = 0; columns != null && i<count; i++)
		{
			Column col = columns.get(i);
			ret.add(col.getLabel());
		}
		return ret;
	}

	/**
	 * Get the MVF column configuration at the given index.
	 * <p>
	 * @param index
	 *        The position of the MVF column.
	 * @return 
	 *        The <code>DColumn</code> configuration.
	 */
	public Column getColumn(int index)
	{
		Column column = this.columns.get(index);
		return column; 
	}

	/**
	 * Get the MVF columns configurations.
	 * <p>
	 * @param columns
	 *      The <code>List</code> of <code>DColumns</code>.
	 * columns <com.capgent.cpt.client.common.dto.DColumn>
	 */
	public void setColumns(List<Column> columns)
	{
		this.columns = columns;
	}

	/**
	 * Register the MVF column.
	 * <p>
	 * @param columnDef
	 *      The MVF column configuration.
	 */
	public void addColumn(Column columnDef)
	{
		if (this.columns == null)
		{
			this.columns = new ArrayList<Column>();
		}
		this.columns.add(columnDef);
	}

	/**
	 * The size of the MVF columns.
	 * <p>
	 * @return size
	 *      The count of MVF columns.
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
	 * Get the MVF object reference for the data fetch/save.
	 * <p>
	 * @return ref
	 *      <code>String</code> HQL object reference.
	 */
	public String getObjectRef()
	{
		String ref = this.datasource.getObjectRef();
		return ref;
	}

	/**
	 * Set the MVF object reference for the data fetch/save.
	 * <p>
	 * @param ref
	 *      <code>String</code> HQL object reference.
	 */
	public void setObjectRef(String ref)
	{
		this.datasource.setObjectRef(ref);
	}

	/**
	 * Get the from clause for the MVF.
	 * <p>
	 * @return from clause
	 *        The <code>ArrayList</code> of from clauses.    
	 */
	public ArrayList<String> getFromClause()
	{
		return this.datasource.getFrom();
	}

	/**
	 * Set the from clause for the MVF.
	 * <p>
	 * @param from clause
	 *        The <code>ArrayList</code> of from clauses.    
	 */
	public void setFromClause(ArrayList<String> fromClause)
	{
		this.datasource.setFrom(fromClause);
	}

	/**
	 * Register the from clause for the MVF.
	 * <p>
	 * @param objectRef 
	 *        The from HQL reference.
	 */        
	public void addFromClause(String objectRef)
	{
		if (this.datasource.getFrom() == null)
		{
			ArrayList fromClause = new ArrayList();
			this.datasource.setFrom(fromClause);
		}
		this.datasource.getFrom().add(objectRef);
	}

	/**
	 * Get the order by sort clause for the MVF.
	 * <p>
	 * @return orderBySort 
	 *        The <code>ArrayList</code> of order by sort columns HQL references.    
	 */
	public ArrayList<Integer> getOrderBySort()
	{
		return this.datasource.getOrderbySort();
	}

	/**
	 * Set the order by sort clause for the MVF.
	 * <p>
	 * @param orderBySort 
	 *        The <code>ArrayList</code> of order by sort columns HQL references.    
	 */
	public void setOrderBySort(ArrayList<Integer> orderBySort)
	{
		this.datasource.setOrderbySort(orderBySort);
	}

	/**
	 * Get the order by clause for the MVF.
	 * <p>
	 * @return orderByClause 
	 *        The <code>ArrayList</code> of order by columns HQL references.    
	 */
	public ArrayList<String> getOrderByClause()
	{
		return this.datasource.getOrderby();
	}

	/**
	 * Set the order by clause for the MVF.
	 * <p>
	 * @param orderByClause 
	 *        The <code>ArrayList</code> of order by columns HQL references.    
	 */
	public void setOrderByClause(ArrayList<String> orderByClause)
	{
		this.datasource.setOrderby(orderByClause);
	}

	/**
	 * Register the order by clause for the MVF and the sort order.
	 * <p>
	 * @param objectRef 
	 *        The order by column HQL reference.
	 * @param sort
	 *        The sort order i.e Ascending, Descending or NA.
	 */
	public void addOrderByClause(String objectRef, int sort)
	{
		if (this.datasource.getOrderby() == null)
		{
			ArrayList orderbyClause = new ArrayList();
			ArrayList orderbySort = new ArrayList();
			this.datasource.setOrderby(orderbyClause);
			this.datasource.setOrderbySort(orderbySort);
		}
		this.datasource.getOrderby().add(objectRef);
		this.datasource.getOrderbySort().add(new Integer(sort));
	}

	/**
	 * Get the constant values.
	 * <p>
	 * @param constantValues
	 *      The <code>ArrayList</code> of constant values.
	 *      
	 */
	public List<String> getConstantValues()
	{
		return constantValues;
	}

	/**
	 * Set the constant values.
	 * <p>
	 * @param constantValues
	 *      The <code>ArrayList</code> of constant values.
	 *      
	 */
	public void setConstantValues(List<String> constantValues)
	{
		this.constantValues = constantValues;
	}

	/**
	 * Register the static values for the MVF i.e combobox.
	 * <p>
	 * @param constantValues.
	 *      The constant values supplied.
	 */
	public void addConstantValues(String value)
	{
		if (this.constantValues == null)
		{
			this.constantValues = new ArrayList<String>();
		}
		this.constantValues.add(value);
		if (this.isStatic)
		{
			if (this.data == null)
			{
				data = new CptOrderedMap();
			}
			int separatorIndex = value.indexOf('~');
			if (separatorIndex != -1)
			{
				String splitData[] = value.split("~");
				this.data.put(splitData[0], splitData[1]);
			}
			else
			{
				this.data.put(value, value);
			}
		}
	}

	/**
	 * Indicates if MVF is static.
	 * <p>
	 * @return staticFlag
	 *      <code>true</code> if static i.e data is supplied statically
	 *      <code>false</code> otherwise.
	 */
	public boolean isStaticFlag()
	{
		return isStatic;
	}

	/**
	 * Set the flag indicating if MVF is static.
	 * <p>
	 * @param staticFlag
	 *      <code>true</code> if static i.e data is supplied statically
	 *      <code>false</code> otherwise.
	 */
	public void setStaticFlag(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	/**
	 * Get the mode for MVF.
	 * <p>
	 * @return mode
	 *      <code>int</code>
	 *      i.e UIConstants.VIEW=3, UIConstants.EDIT=2 or UIConstants.NEW=1
	 */
	public int getMode()
	{
		return mode;
	}

	/**
	 * Set the mode for MVF.
	 * <p>
	 * @param mode
	 *      <code>int</code>
	 *      i.e UIConstants.VIEW=3, UIConstants.EDIT=2 or UIConstants.NEW=1
	 */
	public void setMode(int mode)
	{
		this.mode = mode;
	}

	/**
	 * Clone for the <code>DMultiValueField</code>
	 */
	public Object clone()
	{
		MultiValueField mvf = new MultiValueField();
		mvf = (MultiValueField) super.clone(mvf);
		mvf.setDatasource(this.datasource);
		/*List<DColumn> columns =  this.getColumns();
        List<DColumn> newColumns = new ArrayList<DColumn>();
        if (columns != null)
        {
            int size = columns.size();
            for (int i=0; i<size;i++)
            {
                DColumn col = columns.get(i);
                if (col != null)
                {
                    newColumns.add((DColumn) col.clone());               
                }
            }
        }*/
		mvf.setColumns(this.columns);
		mvf.setConstantValues(this.constantValues);
		mvf.setMode(this.mode);
		mvf.setStaticFlag(isStatic);
		mvf.setHasId(this.hasId);
		mvf.setEditable(this.isEditable);
		mvf.setPageSize(this.pageSize);
		mvf.setData(this.data);
		return mvf;        
	}

	/**
	 * Get the data source for the MVF.
	 * Holds the data fetch details for MVF.
	 * <p>
	 * @return datasource
	 *      <code>DDatasource</code>
	 */
	public DataSource getDatasource()
	{
		return datasource;
	}

	/**
	 * Set the data source for the MVF.
	 * Holds the data fetch details for MVF.
	 * <p>
	 * @param datasource
	 *      <code>DDatasource</code>
	 */
	public void setDatasource(DataSource datasource)
	{
		this.datasource = datasource;
	}

	/**
	 * Get the primary ids for the MVF. 
	 * <p>
	 * @return primaryId
	 *      The <code>List</code> of <code>String</code> primaryId.
	 */
	public ArrayList<String> getPrimaryIds()
	{
		return datasource.getPrimaryIds();
	}

	/**
	 * Get the where clause for the MVF.
	 * <p>
	 * @return where
	 *      The <code>List</code> of <code>String</code> where clause.
	 */
	public ArrayList<String> getWhereClause()
	{
		return datasource.getWhere();
	}

	/**
	 * Get the number of suggestions/values to display in the multi value field at a given time.
	 * <p>
	 * @return pageSize
	 *      The number of suggestions/values.
	 */
	public int getPageSize()
	{
		return pageSize;
	}

	/**
	 * Set the number of suggestions/values to display in the multi value field at a given time.
	 * <p>
	 * @param pageSize
	 *      The number of suggestions/values.
	 */
	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	/**
	 * Indicates if MVF is editable.
	 * <p>
	 * @return staticFlag
	 *      <code>true</code> if editable.
	 *      <code>false</code> otherwise.
	 */
	public boolean isEditable() 
	{
		return isEditable;
	}

	/**
	 * Set the flag indicating if MVF is editable.
	 * <p>
	 * @param staticFlag
	 *      <code>true</code> if editable.
	 *      <code>false</code> otherwise.
	 */
	public void setEditable(boolean isEditable) 
	{
		this.isEditable = isEditable;
	}

	/**
	 * Indicates if MVF has support for key-value or only value.
	 * <p>
	 * @return staticFlag
	 *      <code>true</code> if support key-value.
	 *      <code>false</code> otherwise.
	 */
	public boolean hasId() 
	{
		return hasId;
	}

	/**
	 * Set the flag indicating if MVF has support for key-value or only value.
	 * <p>
	 * @param hasId
	 *      <code>true</code> if support key-value.
	 *      <code>false</code> otherwise.
	 */
	public void setHasId(boolean hasId)
	{
		this.hasId = hasId;
	}

	/**
	 * Set the flag indicating if MVF has support for key-value or only value.
	 */
	public void checkId() 
	{
		boolean isStatic = this.isStaticFlag();
		if (isStatic)
		{
			List<String> values = this.getConstantValues();
			Iterator<String> iter = values.iterator();
			while (iter.hasNext())
			{
				String value = iter.next();
				if (value != null )
				{
					int pos = value.indexOf("~");
					if (pos != -1)
					{
						this.hasId = true;
						break;
					}					
				}
			}
		}
		else
		{
			int noOfColumns = this.getColumnObjRefs().size();
			if (noOfColumns >= 2)
			{
				this.hasId = true;
			}
		}

		if (this.hasId)
		{
			this.isEditable = false;
		}
	}

	/**
	 * Get value for the given key.
	 * <p>
	 * @param key
	 * 		key to search in data.
	 * @return
	 * 		Return value for key.
	 */
	public String getValue(String key)
	{
		String value = null;
		if (this.data != null)
		{
			value = (String) this.data.get(key);
		}
		return value;
	}

	/**
	 * Get data object containing static MVF enum constant values.
	 * <p>
	 * @return data
	 * 		Return <code>CptOrderedSet</code> object.
	 */
	public CptOrderedMap getData() 
	{
		return data;
	}

	public void setData(CptOrderedMap data)
	{
		this.data = data;
	}

	/**
	 * Get key for the given value.
	 * <p>
	 * @param value
	 * 		value to search in data.
	 * @return
	 * 		Return key for value.
	 */
	public String getKey(String value)
	{
		String key = null;
		if (this.data != null)
		{
			key = (String) this.data.getKey(value);
		}
		return key;
	}

	/**
	 * Check given value present in data, return true if present otherwise false.
	 * <p>
	 * @param value
	 * 		value to search in data.
	 * @return
	 * 		<code>true</code> if given value , <code>false</code> otherwise
	 */
	public boolean containsKey(String value)
	{
		boolean flag = false;
		if (this.data != null)
		{
			flag = this.data.containsValue(value);
		}
		return flag;
	}
}
