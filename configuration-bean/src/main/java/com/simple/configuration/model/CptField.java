package com.simple.configuration.model;

import java.io.Serializable;


public class CptField implements Serializable
{
	private static final long serialVersionUID = -655847130427285705L;

    /**
     * Field id.
     */
	private String id;
	/**
	 * Field label.
	 */
    private String label;
    /**
     * Field object reference.
     */
    private String objectRef;
    /**
     * Actual hql reference for the field.
     */
    private String hqlref;
    /**
     * Field data type.
     */
    private int dataType;
    /**
     * Data format.
     */
    private String format;
    /**
     * Data alignment.
     */
    private int alignment;
    /**
     * Field type.
     */
    private int fieldType;
    /**
     * Minimum data length.
     */
    private int minLength;
    /**
     * Maximum data length.
     */
    private int maxLength;
    /**
     * Flag to indicate that the field
     * is mandatory or not.
     */
    private boolean isMandatory;
    /**
     * Flag to indicate that the field
     * is masked or not.
     */
    private boolean isMasked;

    /**
     * Flag to indicate that the field
     * is calculated field or not.
     */
    private boolean isCalculated;

    /**
     * Field Encryption.
     */
    private String encryption;

    /**
     * Field's label's locale.
     */
    private String locale;

    /**
     * Label of the CptBusinessObject which contains this CptField.
     */
    private String businessObjectLabel;
    
    /**
     * Flag to indicate that the field is aggregate function field or not.
     */
    private boolean isAggregate;

    /**
     * Field object reference.
     */
    private String defaultValue;
    
    /**
     * Tooltip of the Object Reference.
     */
    private String toolTip;
    
    /**
     * Flag to indicate whether the field is customizable field or not.
     */
    private boolean customizable;
    
    /**
     * Flag to indicate whether the field is editable or not.
     */
    private boolean editable;
    
    /**
     * Flag to indicate whether the field is hidden or not.
     */
    private boolean hidden;   
        
    public CptField()
	{
		super();
        this.alignment = UIConstants.LEFT;
        this.fieldType = UIConstants.USER;
        this.minLength = 0;
        this.maxLength = 0;
        this.isMandatory = false;
        this.isMasked = false;
        this.isCalculated = false;
        this.isAggregate = false;
        this.customizable = false;
        this.editable = true;
        this.hidden = false;        
	}

    public CptField(String id, String label, String objectRef, String hqlref, int dataType, String format,
                    int alignment, int fieldType, int minLength, int maxLength, boolean isMandatory, boolean isMasked, boolean isAggregate, boolean customize, boolean editable, boolean hidden)
    {
        super();
        this.id = id;
        this.label = label;
        this.objectRef = objectRef;
        this.hqlref = hqlref;
        this.dataType = dataType;
        this.format = format;
        this.alignment = alignment;
        this.fieldType = fieldType;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.isMandatory = isMandatory;
        this.isMasked = isMasked;
        this.isAggregate = isAggregate;
        this.customizable = customize;
        this.editable = editable;
        this.hidden = hidden;
    }

    /**
     * Get the field id.
     * <p>
     * @return id
     *      The field id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Set the field id.
     * <p>
     * @param id
     *      The field id.
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Get the field label.
     * <p>
     * @return label
     *      The field label.
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * Set the field label.
     * <p>
     * @param label
     *      The field label.
     */
    public void setLabel(String label)
    {
        this.label = label;
    }

    /**
     * Get the object reference.
     * <p>
     * @return objectRef
     *      The object reference.
     */
    public String getObjectRef()
    {
        return objectRef;
    }

    /**
     * Set the object reference.
     * <p>
     * @param objectRef
     *      The object reference.
     */
    public void setObjectRef(String objectRef)
    {
        this.objectRef = objectRef;
    }

    /**
     * Get the hql reference.
     * <p>
     * @return hqlref
     *      The hql reference.
     */
    public String getHqlref()
    {
        return hqlref;
    }

    /**
     * Set the hql reference.
     * <p>
     * @param hqlref
     *      The hql reference.
     */
    public void setHqlref(String hqlref)
    {
        this.hqlref = hqlref;
    }

    /**
     * Get the field data type.
     * <p>
     * @return dataType
     *      The field data type.
     */
    public int getDataType()
    {
        return dataType;
    }

    /**
     * Get the field data type.
     * <p>
     * @param dataType
     *      The field data type.
     */
    public void setDataType(int dataType)
    {
        this.dataType = dataType;
    }

    /**
     * Get the data format.
     * <p>
     * @return format
     *      The data format.
     */
    public String getFormat()
    {
        return format;
    }

    /**
     * Get the data format.
     * <p>
     * @param format
     *      The data format.
     */
    public void setFormat(String format)
    {
        this.format = format;
    }

    /**
     * Get the data alignment.
     * <p>
     * @return alignment
     *      The data alignment.
     */
    public int getAlignment()
    {
        return alignment;
    }

    /**
     * Set the data alignment.
     * <p>
     * @param alignment
     *      The data alignment.
     */
    public void setAlignment(int alignment)
    {
        this.alignment = alignment;
    }

    /**
     * Get the field type.
     * Field type indicate that the field is
     * system field or user field.
     * <p>
     * @return fieldType
     *      The field type.
     */
    public int getFieldType()
    {
        return fieldType;
    }

    /**
     * Set the field type.
     * Field type indicate that the field is
     * system field or user field.
     * <p>
     * @param fieldType
     *      The field type.
     */
    public void setFieldType(int fieldType)
    {
        this.fieldType = fieldType;
    }

    /**
     * Get the minimum length of the data.
     * <p>
     * @return minLength
     *      The minimum length of the data.
     */
    public int getMinLength()
    {
        return minLength;
    }

    /**
     * Set the minimum length of the data.
     * <p>
     * @param minLength
     *      The minimum length of the data.
     */
    public void setMinLength(int minLength)
    {
        this.minLength = minLength;
    }

    /**
     * Get the maximum length of the data.
     * <p>
     * @return maxLength
     *      The maximum length of the data.
     */
    public int getMaxLength()
    {
        return maxLength;
    }

    /**
     * Set the maximum length of the data.
     * <p>
     * @param maxLength
     *      The maximum length of the data.
     */
    public void setMaxLength(int maxLength)
    {
        this.maxLength = maxLength;
    }

    /**
     * Get the boolean value true/false whether field is mandatory or not.
     * <p>
     * @return isMandatory
     *      <code>boolean</code> true/false value.
     */
    public boolean isMandatory()
    {
        return isMandatory;
    }

    /**
     *  Set the boolean value true/false whether field is mandatory or not.
     * <p>
     * @param isMandatory
     *      <code>boolean</code> true/false value.
     */
    public void setMandatory(boolean isMandatory)
    {
        this.isMandatory = isMandatory;
    }

    /**
     * Get the boolean value true/false whether field is masked or not.
     * <p>
     * @return isMasked
     *      <code>boolean</code> true/false value.
     */
    public boolean isMasked()
    {
        return isMasked;
    }

    /**
     * Set the boolean value true/false whether field is masked or not.
     * <p>
     * @param isMasked
     *      <code>boolean</code> true/false value.
     */
    public void setMasked(boolean isMasked)
    {
        this.isMasked = isMasked;
    }

    /**
     * Get the boolean value true/false whether field is calculated or not.
     * <p>
     * @return isCalculated
     *      <code>boolean</code> true/false value.
     */
    public boolean isCalculated()
    {
        return isCalculated;
    }

    /**
     * Set the boolean value true/false whether field is calculated or not.
     * <p>
     * @param isCalculated
     *      <code>boolean</code> true/false value.
     */
    public void setCalculated(boolean isCalculated)
    {
        this.isCalculated = isCalculated;
    }

    /**
     * Get the encryption of the field.
     * <p>
     * @return encryption
     *      The encryption value( that is 1/2) of the data.
     */
    public String getEncryption()
    {
        return encryption;
    }

    /**
     * Set the encryption(1-one way/2-two way) value of the field.
     * <p>
     * @param encryption
     *      The encryption value of the data.
     */
    public void setEncryption(String encryption)
    {
        this.encryption = encryption;
    }

    /**
     * Get the locale of the value for the field label text to be displayed.
     * <p>
     * @return locale
     *      The locale value('en'/'fr') value for the field label text to be displayed.
     */
    public String getLocale()
    {
        return locale;
    }

    /**
     * Set the locale value('en'/'fr') value for the field label text to be displayed.
     * <p>
     * @param locale
     *      The locale value specified by the user.
     */
    public void setLocale(String locale)
    {
        this.locale = locale;
    }

    /**
     * Get the label value of the CptBusinessObject for the field label.
     * <p>
     * @return businessObjectLabel
     *      The label value of the CptBusinessObject.
     */
    public String getBusinessObjectLabel()
    {
        return businessObjectLabel;
    }

    /**
     * Set the label value of the CptBusinessObject corresponding to this CptField.
     * <p>
     * @param businessObjectLabel
     *      The label value of the CptBusinessObject.
     */
    public void setBusinessObjectLabel(String businessObjectLabel)
    {
        this.businessObjectLabel = businessObjectLabel;
    }

    /**
     * Set the boolean value true/false whether field is aggregate or not.
     * <p>
     * @param isAggregate
     *      <code>boolean</code> true/false value.
     */
    public boolean isAggregate()
    {
        return isAggregate;
    }

    /**
     * Set the boolean value true/false whether field is aggregate or not.
     * <p>
     * @param isAggregate
     *      <code>boolean</code> true/false value.
     */
    public void setAggregate(boolean isAggregate)
    {
        this.isAggregate = isAggregate;
    }
    
    /**
     * Get the default value.
     * <p>
     * @return defaultValue
     *      The  default value for field object as data.
     */
    public String getDefaultValue()
    {
        return defaultValue;
    }

    /**
     * Set the default value.
     * <p>
     * @param defaultValue
     *      The  default value for field object as data.
     */
    public void setDefaultValue(String defaultValue)
    {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return id;
    }

    /**
     * Get the tooltip text for the field.
     * <p>
     * @return tooltip
     *      <code>String</code> text for tool tip.
     */
	public String getToolTip() 
	{
		return toolTip;
	}

	/**
     * Set the tooltip text for the field.
     * <p>
     * @param tooltip
     *      <code>String</code> text for tool tip.
     */
	public void setToolTip(String toolTip) 
	{
		this.toolTip = toolTip;
	}	
	    
    /**
	 * Set the boolean value true/false whether the field is customizable or not
	 * @param customize
	 * <code>boolean</code> true/false value
	 */	
	public void setCustomizable(boolean customizable)
	{
		this.customizable = customizable;		
	}
    
	/**
	 * Get the boolean value true/false whether the field is customizable or not
	 * @return customize
	 * <code>boolean</code> true/false value
	 */
	public boolean isCustomizable()
	{
		return this.customizable;
	}
	
	/**
	 * Set the boolean value true/false whether the Field is editable or not
	 * @param editable
	 * <code>boolean</code> true/false value
	 */
	public void setEditable(boolean editable)
	{
		this.editable = editable;
	}
	
	/**
	 * Get the boolean value true/false whether the Field is editable or not
	 * @param editable
	 * <code>boolean</code> true/false value
	 */
	public boolean isEditable()
	{
		return this.editable;
	}
	
	/**
	 * Set the boolean value true/false whether the Field is hidden or not
	 * @param hidden
	 * <code>boolean</code> true/false value
	 */
	public void setHidden(boolean hidden)
	{
		this.hidden = hidden;
	}
	
	/**
	 * Get the boolean value true/false whether the Field is hidden or not
	 * @param hidden
	 * <code>boolean</code> true/false value
	 */
	public boolean isHidden()
	{
		return this.hidden;
	}
}