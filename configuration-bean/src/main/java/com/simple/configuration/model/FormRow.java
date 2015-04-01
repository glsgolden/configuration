package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The row configuration.
 */
public class FormRow 
{
	private static final long serialVersionUID = 2696780555240451777L;
	/**
	 * The row alignment in the layout. 
	 */
    private int alignment;
    /** 
     * The number of columns for this row.
     */ 
	private ArrayList<List<Field>> fields;
	/**
	 * The rowspan for this row.
	 */
    private int rowSpan;
    /**
     * The height of the row in pixels. 
     */
    private int height;
    /**
     * The css for the tab.
     */
    private String css;

    /**
     * <java.lang.String> 
     */
    List columns;
    /**
     * The id for the row.
     */
    private String id;
    
    /**
     * Instantiate a new instance of the row with default values.
     */
	public FormRow()
	{
	}
	
    /** 
     * Instantiate a new instance of the row for the given parameters.
     * fields <com.capgent.cpt.client.common.dto.DField> 
     */ 
	public FormRow(int alignment, ArrayList fields, int rowSpan) 
	{
        this.alignment = alignment;
		this.fields = fields;
        this.rowSpan = rowSpan;
	}

    /** 
     * Get the filed elements contained in this row.
     * <p>
     * @return fields
     *      The <code>ArrayList</code> of <code>DField</code>
     * <com.capgent.cpt.client.common.dto.DField> 
     */ 
	public ArrayList getFields() 
	{
		return fields;
	}

    /** 
     * Set the filed elements contained in this row.
     * <p>
     * @return fields
     *      The <code>ArrayList</code> of <code>DField</code> 
     * fields <com.capgent.cpt.client.common.dto.DField> 
     */ 
	public void setFields(ArrayList fields) 
	{
		this.fields = fields;
	}
	
	/**
     * Register the field element for this row.
     * <p> 
     * @param field
     *      <code>DField</code> object
	 */
    public void addField(Field field) 
    {
		if (this.fields == null) 
		{
			this.fields = new ArrayList<List<Field>>();
		}
		List<Field> fieldWrap = new ArrayList<Field>();
        fieldWrap.add(field);
        this.fields.add(fieldWrap);
        
        if (this.columns == null)
        {
            columns = new ArrayList();
        }
        String ref = field.getObjectRef();
        if (!columns.contains(ref))
        {
            columns.add(ref);
        }
	}
   
    /**
     * Get the column configurations for this row.
     * <p>
     * @return columns
     *      <code>List</code> of columns for this row.
     */
    public List getColumns()
    {
        return this.columns;
    }
    
    
    /**
     * Get the alignment for the row.
     * <p>
     * @return alignment
     *      The alignment of the row within the layout.
     * @deprecated
     *      The alignment of the row in the layout.
     *      
     */
    public int getAlignment() 
    {
		return alignment;
	}

    /**
     * Set the alignment for the row.
     * <p>
     * @param alignment
     *      The alignment of the row within the layout.
     * @deprecated
     *      The alignment of the row in the layout.
     *      
     */
	public void setAlignment(int alignment) 
	{
		this.alignment = alignment;
	}

    /**
     * Add the fieldgroup that belongs to the this row.
     * <p>
     * @param fieldgroup
     *      The <code>DFieldGroup</code>
     */
	public void addFieldGroup(FieldGroup fieldgroup) 
	{
		if (this.fields == null) 
		{
			this.fields = new ArrayList<List<Field>>();
		}
		this.fields.add(fieldgroup.getFields());
	}

	/**
	 * Return the number of fields contained in a row.
	 * <p>
	 * @return size 
	 *         The number of fields contained in a row.
	 */
	public int size() 
	{
		int size = 0;
		if (this.fields != null) 
		{
			size = this.fields.size();
		}
		return size;
	}
    
    /**
     * Get the number of rowSpan for this row.
     * <p> 
     * @return rowSpan
     *          
     */
    public int getRowSpan()
    {
        return rowSpan;
    }

    /**
     * Set the number of rows the are spanned by this row.
     * <p>
     * @param rowSpan
     *      <code>int</code> number of rows spanned.
     */
    public void setRowSpan(int rowSpan)
    {
        this.rowSpan = rowSpan;
    }
    
    /**
     * Get the height set for this row.
     * <p>
     * @return height
     *      The height in pixels for this row.
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * Set the height for this row.
     * <p>
     * @return height
     *      The height in pixels for this row.
     */
    public void setHeight(int height)
    {
        this.height = height;
    }

    /**
     * Get the css for the row
     * <p>
     * @return css
     *      <code>String</code> the row css as per the configuration.
     */
    public String getCss()
    {
        return css;
    }

    /**
     * Set the css for the row
     * <p>
     * @param css
     *      <code>String</code> the row css as per the configuration.
     */
    public void setCss(String css)
    {
        this.css = css;
    }

    /**
     * Set the sequenceNum for each field of form row.
     * <p>
     * @param sequenceNum
     * 		The <code>int<code> sequenceNum.
     */
    public void setTabSequence(int sequenceNum)
    {
        int size = (this.fields == null ? 0 : this.fields.size());
        for (int i = 0; i < size; i++)
        {
        	List<Field> fieldWrap = this.fields.get(i);
        	int wrap_size = (fieldWrap == null ? 0 : fieldWrap.size());
        	for (int j = 0; j < wrap_size; j++)
            {
        		Field field = fieldWrap.get(j);
        		field.setTabSequence(sequenceNum - 1);
            }
        }
    }
    
    /**
     * Clones this DFormRow configuration.
     */
    public Object clone()
    {
    	FormRow newFormRow = new FormRow();
    	newFormRow.setAlignment(this.alignment);
    	newFormRow.setRowSpan(this.rowSpan);
    	newFormRow.setHeight(this.height);
    	newFormRow.setCss(this.css);
    	newFormRow.setId(this.id);
    	if (this.fields != null) 
    	{
    		ArrayList<List<Field>> newFields = new ArrayList<List<Field>>();
    		for (List<Field> fieldWrap : this.fields) 
    		{
    			if (fieldWrap != null)
    			{
    				List<Field> newFieldWrap = new ArrayList<Field>();
    				for (Field newField : fieldWrap) 
    				{
    					Field cloneField = (Field) newField.clone();
    					newFieldWrap.add(cloneField);
    				}
    				newFields.add(newFieldWrap);
    			}
    		}
    		newFormRow.setFields(newFields);
    	}

    	if (this.columns != null) 
    	{
    		List<String> columns = new ArrayList<String>();
    		columns.addAll(this.columns);
    		newFormRow.columns = columns;
    	}
    	return newFormRow;
    }

    /**
     * Get the id of the row
     * <p>
     * 
     * @return id the row id
     */
    public String getId() 
    {
    	return id;
    }
    /**
     * Get the customization property of tab.
     * <p>
     * 
     * @param id to set row id	 
     */
    public void setId(String id) 
    {
    	this.id = id;
    }   
}
