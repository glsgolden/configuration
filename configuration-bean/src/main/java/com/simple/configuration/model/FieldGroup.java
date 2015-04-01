package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

public class FieldGroup extends Id
{
	private static final long serialVersionUID = -4272197323254185758L;

	/**
     * The group label.
     */
    private Label label;
    
    /** 
     * <com.capgent.cpt.client.common.dto.DField> 
     */ 
	private ArrayList fields;

    public FieldGroup()
    {
    }
	
    /**
     * Instantiate a new <code>DFieldGroup</code> object given all the fields.
     * <p>
     * @param fields
     *      The collection of number of field.
     * @param label
     *      The label of fieldgroup.
     */
    public FieldGroup(ArrayList fields, Label label)
    {
        this.fields = fields;
        this.label = label;
    }

    /** 
     * <com.capgent.cpt.client.common.dto.DField> 
     */ 
	public ArrayList getFields()
    {
		return fields;
	}

    /** 
     * fields <com.capgent.cpt.client.common.dto.DField> 
     */ 
	public void setFields(ArrayList fields) 
    {
		this.fields = fields;
	}
	
	public void addField(Field field)
    {
		if (this.fields == null) 
        {
			this.fields = new ArrayList();
		}
		this.fields.add(field);
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
	*        The text of label.
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
	 * Return the number of fields in the field group.
     * <p>
	 * @return int The number of fields in the field group.
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
     * Returnn the list of labels for the fields in this field group.
     * <p>
     * @return list
     *      An <code>java.util.List</code> containing String of labels corresponding to each  <code>DField<code> object.
     * <java.util.ArrayList<java.lang.String>>      
     */
    public List labels()
    {
        List list = new ArrayList();
        for (int i = 0; fields != null && i < this.size(); i++)
        {
            Field field = (Field) fields.get(i);
            list.add(field.getLabel());
        }
        return list;
    }
    
    /**
     * Returnn the list of object references for the fields in this field group.
     * <p>
     * @return list
     *      An <code>java.util.List</code> containing String of objectRef i.e Tablename.Fieldname
     *       corresponding to each  <code>DField<code> object.
     * <java.util.ArrayList<java.lang.String>>      
     */
    public List objectRefs()
    {
        List list = new ArrayList();
        for (int i = 0; fields != null && i < this.size(); i++)
        {
            Field field = (Field) fields.get(i);
            list.add(field.getObjectRef());
        }
        return list;
    }
    
    /**
     * Return the list of data types for the fields in this field group.
     * <p>
     * @return list
     *      An <code>java.util.List</code> containing Integer data type.
     *       corresponding to each  <code>DField<code> object.
     * <java.util.ArrayList<java.lang.Integer>>         
     */
    
    public List dataTypes()
    {
        List list = new ArrayList();
        for (int i = 0; fields != null && i < this.size(); i++)
        {
            Field field = (Field) fields.get(i);
            int type = field.getDataType();
            list.add(new Integer(type));
        }
        return list;
    }
}
