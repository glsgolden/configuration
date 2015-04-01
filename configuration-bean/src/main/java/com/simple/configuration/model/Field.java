package com.simple.configuration.model;
/**
 * 
 *
 */
public class Field extends Id 
{
	
	private static final long serialVersionUID = -1753334964815703703L;

	/**
	 * Field definition as per presentation.xsd
	 * Has been deprecated and is a separate field by itself now.
	 */
	protected Label label;
    /**
     * Image url if type of the field is image.
     */
	private String image;
    /**
     * The field type; i.e. textbox, textarea, combobox, listbox, etc 
     */
	private int fieldType;
    /**
     * The object reference used for the field value
     */
	protected String objectRef;
    /**
     * The stylesheet class to be applied for the field
     */
	private String css;
    /**
     * The colspan for the field.
     */
    private int colSpan;
   /**
    * The modes (rwd) in which the field should be visible and actions allowed
    */
    private int mode;
    /**
     * The data type for the field; i.e. numeric, string, datatime, etc.
     */
    public int dataType;
    /**
     * The display format for the value in the field.
     */
    protected String format;
    /**
     * The Tool tip for the field 
     */
    protected String tooltip;
    /**
     * The multi value component for this field. 
     * The multi value field can be used for lookups for 
     * listbox and grid popups.
     */
    protected MultiValueField multiValueField;
    /**
     * Widget to be used for setting data in the field like Calendar.
     */
    protected String widget;
    /**
     * The mode (rwd) in which the widget should be enabled.
     */
    protected int widgetMode;
    /**
     * Flag indicating if the field input is madatory or not.
     */
    protected boolean isRequired;
   /**
    * Flag indicating if the field input is visible or not. 
    * Deprecated now.
    */
    protected boolean isVisible;
    /**
     * Flag indicating if the field input is visible or not.
     */
    private boolean isStatic;
    /**
     * The static data for the field.
     */
    private String data;	
    /**
     * Flag indicating if the field input is function or not.
     */
    private boolean isEval;
    /**
     * The function request.
     */
    private String function;
	/**
	 * Maximum allowed field data length. 
	 */
    protected int maxLength;
    /**
     * Minimum allowed field data length
     */
    protected int minLength;
    /**
     * Length of the widget i.e for (textbox, textarea, listbox etc) 
     */
    protected int width;
    /**
     * Alignment of the data
     */
    protected int dataAlign;
    /**
     * Sequence of the field within the tab
     */
    private int sequenceNum;
    /**
     * data source of the field
     */
    private String dataSource;
    
    /**
     * Flag to indicate column is read only or not.
     */
    protected boolean isReadOnly;
    
    /**
     * Flag indicating if the field is calculated or not.
     */
    protected boolean isCalculated;  
    
    /**
     * Flag indicating if the field is masked or not.
     */
    protected boolean isMasked;    
    
    /**
     * encryption of the field.
     */
    protected String encryption;
    
    /**
     * Actual hql reference for the field.
     */
    protected String hqlref;
    
    /**
     * The sequence of the tab in the layout
     */
    private int tabSequence;
    /**
     * The DDataSet object which holds information of data tag.
     */
    private Dataset dataset;
    /**
     * Flag that indicates the field is a function to
     * be computed value for.
     */
    private boolean isFunction;
    /**
     * Instantiate an empty new <code>DField</code> object.
     */
    public Field() 
    {
		super();
		this.fieldType = UIConstants.UNDEFINED;
	}
    
    /**
     * Instantiate a new <code>DField</code> object.
     */
    public Field(String id) 
    {
		super(id);
	}

    /**
     * Instantiate a new <code>DField</code> object given all the fields.
     * @param label
     *      The label information of field.
     * @param image
     *      The image of field.
     * @param fieldType
     *      The field type.
     * @param objectRef
     *      The field object reference.
     * @param css
     *      The css of field.
     * @param colSpan
     *      The colspan of field.
     * @param mode
     *      The mode of field.
     * @param dataType
     *      The data type of field.
     * @param format
     *      The format of field.
     * @param tooltip
     *      The tooltip of field.
     * @param multiValueField
     *      The multivalue of field.
     * @param widget
     *      The widget of field.
     * @param widgetMode
     *      The widget mode of field.
     * @param isReadOnly
     *      The field is read only or not.
     * @param isCalculated
     *      The field value is calculated or not.
     * @param isMasked
     *      The field is masked or not.
     * @param encryption
     *      The field is encrypt field or not.
     * @param hqlref
     *      The hql ref of field.
     */
	public Field(Label label, String image, int fieldType, String objectRef, String css, int colSpan, int mode, 
                    int dataType, String format, String tooltip, MultiValueField multiValueField, String widget, int widgetMode, boolean isReadOnly,
                    boolean isCalculated, boolean isMasked, String encryption, String hqlref)
    {
        super();
        this.label = label;
        this.image = image;
        this.fieldType = fieldType;
        this.objectRef = objectRef;
        this.css = css;
        this.colSpan = colSpan;
        this.mode = mode;
        this.dataType = dataType;
        this.format = format;
        this.tooltip = tooltip;
        this.multiValueField = multiValueField;
        this.widget = widget;
        this.widgetMode = widgetMode;
        this.isEval = false;
        this.maxLength = -1;
        this.minLength = -1;
        this.width = -1;
        this.isReadOnly = isReadOnly;
        this.isCalculated = false;
        this.isMasked = false;
        this.encryption = encryption;
        this.hqlref = hqlref;
    }

	/**
	 * Gets the css style for the field.
	 * <p>
	 * @return
	 * 		<code>String</code> value of css style.
	 */
    public String getCss() 
    {
		return css;
	}

    /**
	 * Sets the css style for the field.
	 * <p>
	 * @param css
	 * 		<code>String</code> value of css style.
	 */
	public void setCss(String css) 
	{
		this.css = css;
	}

	/**
	 * Gets the image for the field.
	 * <p>
	 * @return
	 * 		<code>String</code> url of image.
	 */
	public String getImage()
	{
		return image;
	}

	/**
	 * Gets the image for the field.
	 * <p>
	 * @param image
	 * 		<code>String</code> url of image.
	 */
	public void setImage(String image) 
	{
		this.image = image;
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
	 * Gets the HQL object reference for the field. eg. InvTxn.ivCusNo
	 * <p>
	 * @return
	 * 		<code>String</code> object reference.
	 */
	public String getObjectRef() 
	{
		return objectRef;
	}

	/**
	 * Sets the object reference for the field.
	 * <p>
	 * @param objectRef
	 * 		<code>String</code> object reference.
	 */
	public void setObjectRef(String objectRef) {
		this.objectRef = objectRef;
	}

	/**
	 * Get the field type for the field.
	 * <p>
	 * @return
	 * 		<code>int</code> value of fieldtype.
	 *        eg UIConstants.TEXTAREA, UIConstants.TEXTFIELD etc.
	 * 
	 */
	public int getFieldType() 
	{
		return fieldType;
	}

	/**
     * Set the field type for the field.
     * <p>
     * @return
     *      <code>int</code> value of fieldtype.
     *        eg UIConstants.TEXTAREA, UIConstants.TEXTFIELD etc.
     * 
     */
	public void setFieldType(int type)
	{
		this.fieldType = type;
	}
    
    /**
     * Get the format for field data for display.
     * <p>
     * @return format
     *      <code>String</code>
     *         Eg. for Date an field : mm/dd/yyyy
     */
    public String getFormat()
    {
        return format;
    }

    /**
     * Set the format for field data for display.
     * <p>
     * @param format
     *      <code>String</code>
     *         Eg. for Date an field : mm/dd/yyyy
     */
    public void setFormat(String format)
    {
        this.format = format;
    }

    /**
     * Get the number of columns that this field spans.
     * <p>
     * @return colSpan
     * <code>int</code> number of colspan.
     */
    public int getColSpan()
    {
        return colSpan;
    }

    /**
     * Set the number of columns that this field spans.
     * <p>
     * @param colSpan
     * <code>int</code> number of colspan.
     */
    public void setColSpan(int colSpan)
    {
        this.colSpan = colSpan;
    }

    /**
     * Get the tooltip text for the field.
     * <p>
     * @return tooltip
     *      <code>String</code> text for tool tip.
     */
    public String getTooltip()
    {
        return tooltip;
    }

    /**
     * Get the tooltip text for the field.
     * <p>
     * @param tooltip
     *      <code>String</code> text for tool tip.
     */
    public void setTooltip(String tooltip)
    {
        this.tooltip = tooltip;
    }

    /**
     * Get the multivalue field object for this field.
     * <p>
     * @return multiValueField 
     *      <code>DMultiValueField</code> object.
     */
    public MultiValueField getMultiValueField()
    {
        return multiValueField;
    }

    /**
     * Set the multivalue field object for this field.
     * <p>
     * @return multiValueField 
     *      <code>DMultiValueField</code> object.
     */
    public void setMultiValueField(MultiValueField multiValueField)
    {
        this.multiValueField = multiValueField;
        this.multiValueField.checkId();
    }

    /**
     * Get access mode for this field.
     * i.e UIConstants.VIEW=3, UIConstants.EDIT=2 or UIConstants.NEW=1
     * <p>
     * @return mode
     *      <code>int</code>
     */
    public int getMode()
    {
        return mode;
    }

    /**
     * Set access mode for this field.
     * i.e UIConstants.VIEW=3, UIConstants.EDIT=2 or UIConstants.NEW=1
     * <p>
     * @param mode
     *      <code>int</code>
     */
    public void setMode(int mode)
    {
        this.mode = mode;
    }

    /**
     * Get the data type for the field.
     * i.e UIConstants.DT_STRING=1, UIConstants.DT_NUMERIC=2, DT_DATETIME and DT_IMAGE=4
     * <p>
     * @return dataType
     *      <code>int</code>
     */
    public int getDataType()
    {
        return dataType;
    }

    /**
     * Set the data type for the field.
     * i.e UIConstants.DT_STRING=1, UIConstants.DT_NUMERIC=2, DT_DATETIME and DT_IMAGE=4
     * <p>
     * @param dataType
     *      <code>int</code>
     */
    public void setDataType(int dataType)
    {
        this.dataType = dataType;
    }

    /**
     * Get the widget for this field.
     * i.e can have calendar, spinner etc.
     * <p>
     * @return widget
     *      <code>String</code> name of the of widget.
     *      i.e calendar, spinner etc.
     */
    public String getWidget()
    {
        return widget;
    }

    /**
     * Set the widget for this field.
     * i.e can have calendar, spinner etc.
     * <p>
     * @param widget
     *      <code>String</code> name of the of widget.
     *      i.e calendar, spinner etc.
     */
    public void setWidget(String widget)
    {
        this.widget = widget;
    }

    /**
     * Get the mode of the widget.
     * i.e UIConstants.VIEW=3, UIConstants.EDIT=2 or UIConstants.NEW=1
     * <p>
     * @return widgetMode
     *      <code>int</code>
     */
    public int getWidgetMode()
    {
        return widgetMode;
    }

    /**
     * Set the mode of the widget.
     * i.e UIConstants.VIEW=3, UIConstants.EDIT=2 or UIConstants.NEW=1
     * <p>
     * @param widgetMode
     *      <code>int</code>
     */
    public void setWidgetMode(int widgetMode)
    {
        this.widgetMode = widgetMode;
    }

    /**
     * Indicates whether this field is an mandatory field.
     * <p>
     * @return isRequired
     *      <code>true</code> if the field is mandatory <code>false</code>
     *      otherwise.    
     */
    public boolean isRequired()
    {
        return isRequired;
    }

    /**
     * Set whether this field is an mandatory field.
     * <p>
     * @param isRequired
     *      <code>true</code> if the field is mandatory <code>false</code>
     *      otherwise.    
     */
    public void setRequired(boolean isRequired)
    {
        this.isRequired = isRequired;
    }

    /**
     * Indicates whether this field is an visible field in the form layout.
     * <p>
     * @return isVisible
     *      <code>true</code> if the field is visible <code>false</code>
     *      otherwise.   
     */
    public boolean isVisible()
    {
        return isVisible;
    }

    /**
     * Set whether this field is an visible field in the form layout.
     * <p>
     * @param isVisible
     *      <code>true</code> if the field is visible <code>false</code>
     *      otherwise.          
     */
    public void setVisible(boolean isVisible)
    {
        this.isVisible = isVisible;
    }

    /**
     * Indicates whether this field is an static field.
     * Static fields have their data supplied statically.
     * i.e when the form is configured. 
     * <p>
     * @return isStatic
     *      <code>true</code> if the field is static <code>false</code>
     *      otherwise.    
     */
    public boolean isStatic()
    {
        return isStatic;
    }

    /**
     * Set whether this field is an static field.
     * Static fields have their data supplied statically.
     * i.e when the form is configured. 
     * <p>
     * @param isStatic
     *      <code>true</code> if the field is static <code>false</code>
     *      otherwise.    
     */
    public void setStatic(boolean isStatic)
    {
        this.isStatic = isStatic;
    }

    /**
     * Get the data for this field.
     * Usually this is the data for an static field.
     * <p>
     * @return data
     * 
     */
    public String getData()
    {
        return data;
    }

    /**
     * Set the data for this field.
     * Usually this is the data for an static field.
     * <p>
     * @param data
     * 
     */
    public void setData(String data)
    {
        this.data = data;
    }
    
    /**
     * Get the HQL/SQL function to be executed on this field's data.
     * <p>
     * @return function
     *      <code>String</code> i.e sum(),avg() etc.
     */
	public String getFunction() 
	{
		return function;
	}

	/**
     * Set the HQL/SQL function to be executed on this field's data.
     * <p>
     * @param function
     *      <code>String</code> i.e sum(),avg() etc.
     */
	public void setFunction(String function) 
	{
		this.function = function;
	}

	/**
	 * Indicates whether this field needs to be evaluated for its data.
	 * <p>
	 * @return isEval
	 *     <code>true</code> if filed data needs to have an 
	 *     function to be executed over it, <code>false</code> otherwise. 
	 */
	public boolean isEval()
	{
		return isEval;
	}

	/**
     * Set whether this field needs to be evaluated for its data.
     * <p>
     * @param isEval
     *     <code>true</code> if filed data needs to have an 
     *     function to be executed over it, <code>false</code> otherwise. 
     */
	public void setEval(boolean isEval) 
	{
		this.isEval = isEval;
	}
    
	/**
     * Get the max length of charac data for the field.
     * <p>
     * @return maxLength
     *      The min length (width) of charac data for the field.
     */
    public int getMaxLength()
    {
        return maxLength;
    }

    /**
     * Set the max length of charac data for the widget.
     * <p>
     * @param maxLength
     *      The max length (width) of charac data for the widget.
     */
    public void setMaxLength(int maxLength)
    {
        this.maxLength = maxLength;
    }

    /**
     * Get the min length of charac data for the widget.
     * <p>
     * @return minLength
     *      The min length (width) of charac data for the widget.
     */
    public int getMinLength()
    {
        return minLength;
    }

    /**
     * Set the min length of charac data for the widget.
     * <p>
     * @param min length
     *      The min length (width) of charac data for the widget.
     */
    public void setMinLength(int minLength)
    {
        this.minLength = minLength;
    }
  
    /**
     * Get the width for the field i.e textfield, textarea, combobox etc.
     * <p>
     * @return width
     *      The width for the widget to be laid out.
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * Set the width for the field i.e textfield, textarea, combobox etc.
     * <p>
     * @param width
     *      The width for the widget to be laid out.
     */
    public void setWidth(int width)
    {
        this.width = width;
    }

    /**
     * Get the alignment for the field i.e textfield, textarea, combobox etc.
     * <p>
     * @return dataAlign
     *      The alignment <code>int</code> UIConstants.LEFT,
     *      UIConstants.RIGHT or UIConstants.CENTER for the widget to be laid out.
     */
    public int getDataAlign()
    {
        return dataAlign;
    }

    /**
     * Set the alignment for the field i.e textfield, textarea, combobox etc.
     * <p>
     * @param dataAlign
     *      The alignment <code>int</code> UIConstants.LEFT,
     *    UIConstants.RIGHT or UIConstants.CENTER for the widget to be laid out.
     */
    public void setDataAlign(int dataAlign)
    {
        this.dataAlign = dataAlign;
    }
   
    /**
     * Get the sequence of field in the tab.
     * <p>
     * @return sequenceNum
     *      <code>int</code> sequence number.
     */
    public int getSequenceNum()
    {
        return sequenceNum;
    }

    /**
     * Set the sequence of field in the tab.
     * <p>
     * @param sequenceNum
     *      <code>int</code> sequence number.
     */
    public void setSequenceNum(int sequenceNum)
    {
        this.sequenceNum = sequenceNum;
    }
    
    /**
     * The string representation of this field. 
     */
    public String toString()
    {
        StringBuffer buff = new StringBuffer();
        buff.append("id - " + getId());
        buff.append("\n");
        buff.append("label - " + this.getLabel());
        buff.append("\n");
        buff.append("objectref - " + objectRef);
        buff.append("\n");
        buff.append("data - " + data);
        buff.append("\n");
        buff.append("isEval - " + isEval);
        buff.append("\n");
        buff.append("function - " + function);
        buff.append("\n");
        buff.append("datatype - " + dataType);
        buff.append("\n");
        buff.append("css - " + css);
        buff.append("\n");
        buff.append("colspan" + this.colSpan);
        buff.append("\n");
        buff.append("fieldtype - " + this.fieldType);
        buff.append("\n");
        buff.append("mode - " + this.mode);
        buff.append("\n");
        buff.append("tooltip - " + this.tooltip);
        buff.append("\n");
        buff.append("isRequired - " + this.isRequired);
        buff.append("\n");
        buff.append("isStatic - " + this.isStatic);
        buff.append("\n");
        buff.append("isReadOnly - " + this.isReadOnly);
        buff.append("\n");

        return buff.toString();
    }

    /**
     * Get the dataSource of field.
     * <p>
     * @return dataSource
     *      <code>String</code> dataSource.
     */
	public String getDataSource() 
	{
		return dataSource;
	}

	/**
     * Set the dataSource of field.
     * <p>
     * @param dataSource
     *      <code>String</code> dataSource.
     */
	public void setDataSource(String dataSource) 
	{
		this.dataSource = dataSource;
	}
	
	/**
	 * Get the read only attribute of column.
	 * <p>
	 * @return isReadOnly
	 * 		The boolean value of read only attribute.
	 */
    public boolean isReadOnly() 
	{
		return isReadOnly;
	}

	/**
	 * Set the read only attribute for column.
	 * <p>
	 * @param isReadOnly
	 * 		Set boolean value to be set as read only.
	 */
    public void setReadOnly(boolean isReadOnly) 
	{
		this.isReadOnly = isReadOnly;
	}
    
    /**
     * Sets the uniqueId for the element.
     * 
     * @param parentId
     *          The unique Id of the tab element.
     */
    public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the DField if not present already.
        super.setUniqueId(parentId);
    }

    /**
     * Get the isCalculated attribute of element.
     * <p>
     * @return isCalculated
     *      boolean value indicating the field is calculated or not.
     */
    public boolean isCalculated()
    {
        return isCalculated;
    }

    /**
     * Set the isCalculated for element.
     * <p>
     * @param isCalculated
     *      boolean value indicating the field is calculated or not.
     */
    public void setCalculated(boolean isCalculated)
    {
        this.isCalculated = isCalculated;
    }

    /**
     * Get the isMasked attribute of element.
     * <p>
     * @return isMasked
     *      boolean value indicating the field is Masked or not.
     */
    public boolean isMasked()
    {
        return isMasked;
    }

    /**
     * Set the isMasked for element.
     * <p>
     * @param isMasked
     *      boolean value indicating the field is Masked or not.
     */
    public void setMasked(boolean isMasked)
    {
        this.isMasked = isMasked;
    }

    /**
     * Get the encryption for the field .
     * <p>
     * @return encryption
     *      The encryption for the element.
     */
    public String getEncryption()
    {
        return encryption;
    }

    /**
     * Set the encryption for the field.
     * <p>
     * @param encryption
     *      The encryption for the element.
     */
    public void setEncryption(String encryption)
    {
        this.encryption = encryption;
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
     * Get the tabSequence.
     * <p>
     * @return tabSequence
     * 		Return tabSequence.
     */
    public int getTabSequence()
    {
        return tabSequence;
    }

    /**
     * Set the tabSequence
     * <p>
     * @param tabSequence
     * 		set tabSequence.
     */
    public void setTabSequence(int tabSequence)
    {
        this.tabSequence = tabSequence;
    }

    /**
     * Get the DDataSet for this DField.
     * <p>
     * @return dataset
     *      <code>DDataSet</code> ddataset;
     */
    public Dataset getDataset()
    {
        return dataset;
    }

    /**
     * Set the DDataSet for this DField.
     * <p>
     * @param ddataset
     *      <code>DDataSet</code> ddataset;
     */
    public void setDataset(Dataset dataset)
    {
        this.dataset = dataset;
    }
    
    /**
     * Flag that indicates the field is a function to
     * be computed value for.
     */
    public boolean isFunction() 
    {
        return isFunction;
    }
    
    /**
     * Flag that sets flag for the field to indicate that
     * feild is a function to
     * be computed value for.
     */
    public void setFunction(boolean isFunction) 
    {
        this.isFunction = isFunction;
    }
    
    /**
     * Clones this field configuration.
     */
    public Object clone()
    {
    	Field field = new Field();
        field = (Field) super.clone(field);
        if (this.label != null)
        {
        	field.setLabel((Label) label.clone());
        }
        field.setImage(this.image);
        field.setFieldType(this.fieldType);
        field.setObjectRef(this.objectRef);
        field.setCss(this.css);
        field.setColSpan(this.colSpan);
        field.setMode(this.mode);
        field.setDataType(this.dataType);
        field.setFormat(this.format);
        field.setTooltip(this.tooltip);        
        
        if (this.getMultiValueField() != null)
        {
        	 field.setMultiValueField((MultiValueField) this.multiValueField.clone());
        }  
        field.setWidget(this.widget);
        field.setWidgetMode(this.widgetMode);
        field.setRequired(this.isRequired);
        field.setVisible(this.isVisible);
        field.setStatic(this.isStatic);
        field.setData(this.data);
        field.setEval(this.isEval);
        field.setFunction(this.function);
        field.setMaxLength(this.maxLength);
        field.setMinLength(this.minLength);
        field.setWidth(this.width);
        field.setDataAlign(this.dataAlign);
        field.setSequenceNum(this.sequenceNum);
        field.setDataSource(this.dataSource);
        field.setReadOnly(this.isReadOnly);
        field.setCalculated(this.isCalculated);
        field.setMasked(this.isMasked);
        field.setEncryption(this.encryption);
        field.setHqlref(this.hqlref);
        field.setTabSequence(this.tabSequence);
        
        Dataset dataset = null;
        if (this.dataset != null)
        {
        	dataset = (Dataset) this.dataset.clone();
        }
        field.setDataset(dataset);                        
        return field;        
    }

}
