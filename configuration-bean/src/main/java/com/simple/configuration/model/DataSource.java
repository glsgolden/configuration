package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends Id
{
    private static final long serialVersionUID = 5057435591415470378L;
    /**
     * 
     */
    private String objectRef;
    /**
     * 
     */
    private ArrayList<String> from;
    /**
     * 
     */
    private ArrayList<String> where;
    /**
     * List of field IDs for where fields
     */
    private List<String> whereClauseLhsIds;
    /**
     * 
     */
    private ArrayList<String> primaryIds;
    /**
     * List of field IDs for primary fields
     */
    private List<String> primaryFieldIds;
    /**
     * 
     */
    private ArrayList<String> groupby;
    /**
     * List of field IDs for groupBy fields 
     */
    private List<String> groupbyIds;
    /**
     * List holds the object references for order by clause.
     */
    private ArrayList<String> orderby;
    /**
     * List of field IDs for orderBy fields
     */
    private List<String> orderbyIds;
    /**
     * List holds the sort order for the entries in 
     * orderByClause List; i.e. A, D or NA.
     * {@link Integer}
     */
    private ArrayList<Integer> orderbySort;
    /** 
     * The data source name.
     */
    private String name; 
    /**
     * Flag to indicate whether data Access rights
     * should be applied with parent enIds or not.
     */
    private boolean inheritFromParent;
    /**
     * List of conditions.
     */
    private List<Condition> conditions;
    /**
     * The SQL hint.
     */
    private String sqlHint;
    
    /**
     * Initialize new instance of {@link DataSource}
     */
    public DataSource()
    {
        this.inheritFromParent = false; 
    }
    
	/**
     * Gets the object reference for Form
     * 
     * @return String value
     */
	public String getObjectRef()
	{
		return objectRef;
	}
	
	/**
     * Sets the value for objectRef for the Form
     * @param objectRef
     */
	public void setObjectRef(String objectRef)
	{
		this.objectRef = objectRef;
	}
	
    /**
     * Gets the list of from ObjectRef
     * @return ArrayList of objectRef
     */
	public ArrayList<String> getFrom()
	{
		return from;
	}
	
    /**
     * Sets the list of from ObjectRef
     * @param from
     */
	public void setFrom(ArrayList<String> from)
	{
		this.from = from;
	}

	/**
     * Gets the list of where ObjectRef
     * @return ArrayList of objectRef
     */
	public ArrayList<String> getWhere()
	{
		return where;
	}

    /**
     * Sets the list of where ObjectRef
     * @param where
     */
	public void setWhere(ArrayList<String> where)
	{
		this.where = where;
	}

    /**
     * Gets the list of Primary IDs
     * @return primaryIds
     *      List of primary IDs
     */
	public ArrayList<String> getPrimaryIds()
	{
		return primaryIds;
	}
	
	/**
     * Sets the list of Primary IDs
     * @param primaryIds
     *      List of primary IDs
     */
	public void setPrimaryIds(ArrayList<String> primaryIds)
	{
		this.primaryIds = primaryIds;
	}

    /**
     * Get the fields in the group by clause.
     * <p>
     * @return groupby 
     *       List of group by configured.
     */
	public ArrayList<String> getGroupby()
	{
		return groupby;
	}

    /**
     * Set the fields for group by clause.
     * <p>
     * @param groupby 
     *         List of group by configured.
     */
	public void setGroupby(ArrayList<String> groupby)
	{
		this.groupby = groupby;
	}

    /**
     * Get the fields in the order by clause.
     * <p>
     * @return ArrayList 
     *          List of order by configured.
     */
	public ArrayList<String> getOrderby()
	{
		return orderby;
	}

    /**
     * Set the fields for order by clause.
     * <p>
     * @param orderby 
     *          List of order by configured.
     */
	public void setOrderby(ArrayList<String> orderby)
	{
		this.orderby = orderby;
	}
    
	/**
     * Registers the from object reference.
     * 
     * @param objectRef
     */
    public void addFrom(String objectRef)
    {
        if (this.from == null)
        {
            this.from = new ArrayList<String>();
        }
        if (!this.from.contains(objectRef))
        {
            this.from.add(objectRef);
        }
    }

	/**
     * Adds the where object reference.
     * @param objectRef
     */
    public void addWhere(String where)
    {
        if (this.where == null)
        {
            this.where = new ArrayList<String>();
        }
        this.where.add(where);
    }
    
    /**
     * Adds the list of Primary IDs
     * @param objectRef
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
     * Add object reference to group by clause.
     * <p>
     * @param data
     *      The field reference to be added in 
     *      the group by clause
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
     * Get the sort order for the order by claUse object references.
     * <p>
     * @return orderbySort 
     *       List entries containing UIConstants.ACESNDING, 
     *       UIConstants.DESCENDING, or UIConstants.NONE 
     *       corresponding to object references in orderbyClause List.
     */
	public ArrayList<Integer> getOrderbySort()
	{
		return orderbySort;
	}

    /**
     * Set the sort order for the order by clause object references.
     * <p>
     * @param orderBySort 
     *          List entries containing UIConstants.ACESNDING, 
     *          UIConstants.DESCENDING, UIConstants.NONE corresponding to 
     *          object references in orderbyClause List.
     */
	public void setOrderbySort(ArrayList<Integer> orderbySort)
	{
		this.orderbySort = orderbySort;
	}
	
    /**
     * Add the object reference for the columns to be used in the order
     * by clause for the query to fetch data for multiple-value field.
     * <p>
     * @param objectRef 
     *          The column object reference used for the order by clause.
     * @param sort
     *          The sort order; Ascending, Descending or NA.
     */
    public void addOrderByClause(String objectRef, int sort)
    {
        if (this.orderby == null)
        {
            this.orderby = new ArrayList<String>();
            this.orderbySort = new ArrayList<Integer>();
        }
        this.orderby.add(objectRef);
        this.orderbySort.add(Integer.valueOf(sort));
    }
    
    /**
     * Get the name.
     * @return String value
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Set the name.
     * @param String name
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * Get flag to indicate parent enIds to be added as a part 
     * of data access rights or not.
     * <p>
     * @return inheritFromParent
     *      flag to indicate parent enIds to be added as a
     *      part of data access rights or not.
     */
    public boolean inheritFromParent() 
    {
        return inheritFromParent;
    }

    /**
     * Set flag to indicate parent enIds to be added as a part
     * of data access rights or not.
     * <p>
     * @param inheritFromParent
     *       flag to indicate parent enIds to be added 
     *       as a part of data access rights or not.
     */
    public void setInheritFromParent(boolean inheritFromParent) 
    {
        this.inheritFromParent = inheritFromParent;
    }

    /**
     * Get Where clause field ids
     * <p>
     * @return whereClauseLhsIds
     *          List<String>
     */
    public List<String> getWhereClauseLhsIds()
    {
        return whereClauseLhsIds;
    }

    /**
     * Set Where clause field ids
     * <p>
     * @param whereClauseLhsIds
     *           List<String>
     */
    public void setWhereClauseLhsIds(List<String> whereClauseLhsIds)
    {
        this.whereClauseLhsIds = whereClauseLhsIds;
    }

    /**
     * Add field id for Where fields .
     * <p>
     * @param fieldId
     *     The field ID.
     */
    public void addWhereClauseLhsId(String fieldId)
    {
        if (this.whereClauseLhsIds == null)
        {
            this.whereClauseLhsIds = new ArrayList<String>();
        }
        this.whereClauseLhsIds.add(fieldId);
    }
    
    /**
     * Get primary field IDs
     * <p>
     * @return primaryFieldIds
     *          List<String>
     */
    public List<String> getPrimaryFieldIds()
    {
        return primaryFieldIds;
    }

    /**
     * Set primary field IDs
     * <p>
     * @param primaryFieldIds
     *          List<String>
     */
    public void setPrimaryFieldIds(List<String> primaryFieldIds)
    {
        this.primaryFieldIds = primaryFieldIds;
    }

    /**
     * Add field id for primary id fields .
     * <p>
     * @param fieldId
     *         The field ID
     */
    public void addPrimaryFieldId(String fieldId)
    {
        if (this.primaryFieldIds == null)
        {
            this.primaryFieldIds = new ArrayList<String>();
        }
        this.primaryFieldIds.add(fieldId);
    }

    /**
     * Get group by field IDs.
     * <p>
     * @return groupbyIds
     *     LList containing configured group by IDs.
     */
    public List<String> getGroupbyIds()
    {
        return groupbyIds;
    }

    /**
     * Set group by field IDs.
     * <p>
     * @param groupbyIds
     *      List<String>
     */
    public void setGroupbyIds(List<String> groupbyIds)
    {
        this.groupbyIds = groupbyIds;
    }

    /**
     * Add field id for group by fields .
     * <p>
     * @param fieldId
     *       List of configured group by IDs.
     */
    public void addGroupbyId(String fieldId)
    {
        if (this.groupbyIds == null)
        {
            this.groupbyIds = new ArrayList<String>();
        }
        this.groupbyIds.add(fieldId);
    }
    
    /**
     * Get order by field IDs.
     * <p>
     * @return orderbyIds
     *      List<String>
     */
    public List<String> getOrderbyIds()
    {
        return orderbyIds;
    }

    /**
     * Set order by field IDs.
     * <p>
     * @param orderbyIds
     *       List<String>
     */
    public void setOrderbyIds(List<String> orderbyIds)
    {
        this.orderbyIds = orderbyIds;
    }
    
    /**
     * Add field id for order by fields .
     * <p>
     * @param fieldId
     *     The field ID.
     */
    public void addOrderbyId(String fieldId)
    {
        if (this.orderbyIds == null)
        {
            this.orderbyIds = new ArrayList<String>();
        }
        this.orderbyIds.add(fieldId);
    }

    /**
     * Get the List<Condition>.
     * <p>
     * @return condition
     * 	    List of {@link Condition}} 
     */
	public List<Condition> getConditions() 
	{
		return conditions;
	}

	/**
     * Set the List<Condition>.
     * <p>
     * @param condition
     * 		 List of {@link Condition}} 
     */
	public void setConditions(List<Condition> conditions) 
	{
		this.conditions = conditions;
	}
	
	/**
	* Add condition in conditions list .
	* <p>
	* @param condition
	* 	 List of {@link Condition}} 
	*/
	public void addCondition(Condition condition)
	{
	    if (this.conditions == null)
	    {
	        this.conditions = new ArrayList<Condition>();
	    }
	    this.conditions.add(condition);
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
}