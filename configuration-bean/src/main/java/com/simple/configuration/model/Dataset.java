package com.simple.configuration.model;



public class Dataset extends Id implements CptClientConstants
{
    /**
     * Indicates type of data i.e. CONSTANT or
     * OBJECTREF or FORMULA.
     */
    private int valueType;
    /**
     * Stores the value of data tag.
     */
    private String dataValue;
    /**
     * Stores the data source of data tag.
     */
    private String dataSource;
    /**
     * Stores the formula of data tag.
     */
    private String formula;
    /**
     * Flag that identifies whether
     * the data set is static.
     */
    private boolean isStatic;
	
	/**
     * Initialize a new instance of {@link Dataset}
     */
	public Dataset()
	{
		this.isStatic = true;
	}
	
	/**
     * Get the valueType for this DDataSet.
     * <p>
     * @return valueType
     * 		<code>int</code> type;
     */
	public int getValueType() 
	{
		return valueType;
	}
	
	/**
     * Set the valueType for this DDataSet.
     * <p>
     * @param valueType
     * 		<code>int</code> type;
     */
	public void setValueType(int valueType) 
	{
		this.valueType = valueType;
	}
	
	/**
     * Get the data value for this DDataSet.
     * <p>
     * @return dataValue
     * 		<code>String</code> data value;
     */
	public String getDatavalue() 
	{
		return dataValue;
	}
	
	/**
     * Set the data value for this DDataSet.
     * <p>
     * @param datavalue
     * 		<code>String</code> data value;
     */
	public void setDatavalue(String datavalue) 
	{
	    this.valueType = Condition.CONSTANT;
	    int startIndex = datavalue.indexOf("{");
        int endIndex = datavalue.indexOf("}");
        if (startIndex != -1)
        {
            datavalue = datavalue.substring(startIndex + 1, endIndex);
            this.valueType = Condition.OBJECTREF;
        }
        else if (datavalue.equals(_FILTER) || datavalue.equals(_DATA) || datavalue.equals(_SYSDATE))
        {
            this.valueType = Condition.OBJECTREF;
        }
    	else if (this.formula != null)
    	{
    	    //--- Check for Formula ---
    	    this.valueType = Condition.FORMULA;
    	}
		this.dataValue = datavalue;
	}
	
	/**
     * Get the data source for this DDataSet.
     * <p>
     * @return data source
     * 		<code>String</code> data source;
     */
	public String getDatasource() 
	{
		return dataSource;
	}
	
	/**
     * Set the data source for this DDataSet.
     * <p>
     * @param datasource
     * 		<code>String</code> data source;
     */
	public void setDatasource(String dataSource) 
	{
		this.dataSource = dataSource;
	}
	
	/**
     * Get the formula for this DDataSet.
     * <p>
     * @return formula
     * 		<code>String</code> formula;
     */
	public String getFormula() 
	{
		return formula;
	}
	
	/**
     * Set the formula for this DDataSet.
     * <p>
     * @param formula
     * 		<code>String</code> formula;
     */
	public void setFormula(String formula) 
	{
		this.formula = formula;
	}

	/**
     * Get the boolean isStatic for this DDataSet.
     * <p>
     * @return isStatic
     * 		<code>boolean</code> isStatic;
     */
	public boolean isStatic() 
	{
		if (this.dataSource != null)
		{
		    isStatic = false;
		}
	    return isStatic;
	}

	/**
     * Set the boolean isStatic for this DDataSet.
     * <p>
     * @param isStatic
     * 		<code>boolean</code> isStatic;
     */
	public void setStatic(boolean isStatic) 
	{
		this.isStatic = isStatic;
	}
	
    /**
     * Clones this field configuration.
     */
    public Object clone()
    {
    	Dataset data = new Dataset();
    	data = (Dataset) super.clone(data);
    	data.setValueType(valueType);
    	data.setDatavalue(dataValue);
    	data.setDatasource(dataSource);
    	data.setFormula(formula);
    	data.setStatic(isStatic);    	
    	return data;
    }
}