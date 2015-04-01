package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Column extends Field
{
    private static final long serialVersionUID = 6293082026352053656L;

    // --- column definition as per presentation.xsd ---
    private String dataFilter;
    private int sortFilter;
    private boolean isEditable;
    private int columnType;
    private String inputType;
    
    /* 
     * New variables added from the display values point of view
     * */

    /**
     * Element to hold the value of the element's display datatype
     * It contains the values from UIConstants :DT_STRING/DT_NUMERIC/DT_DATETIME/DT_IMAGE/DT_BOOLEAN/DT_EMAIL
     * the datatype is image by default
    */
    private int displayValueDataType;

    /**
     * Boolean to indicate whether the display element should be treated as an associate id<br/>
     * in fetching the data.<br/>
     * if <code>true</code>, the value is loaded from the data base<br/>
     * if <code>false</code>, the data is treated &quot;as is&quot;<br/>
     * this value is <code>false</code> by default
     * */
    private boolean hasDisplayValueFromSource;

    /**
     * Boolean to indicate whether the display value should be used or not<br/>
     * if <code>true</code>, this value is shown on screen,<br/>
     * if <code>false</code>, this value is not shown on screen <br/>
     * this value is <code>true</code> by default
     * */
    private boolean isDisplayValueVisible;

    /**
     * Boolean to indicate whether the data fetched from the object ref from the database <br/>
     * should be displayed on the screen.<br/>
     * if <code>true</code>, this value is shown on screen,<br/>
     * if <code>false</code>, this value is not shown on screen <br/>
     * */
    private boolean showData;
    
    private List<String> associateIds;
    /**
     * List holds associate field ids
     */
    private List<String> associateFieldIds;

    private String displayValue;
    private boolean doSummation;
    
    /**
     * To indicate the referred value & mode given as hrf element tag values.
     */
    private ElementReference elementReference;
    
    /**
     * Initializes a newly created object for this class
     */
    public Column()
    {
        super();
        this.columnType = LABEL;
        this.dataType = DT_STRING;
        this.maxLength = -1;
        this.minLength = -1;
        
        //setting default values
        this.showData = true;
        this.displayValueDataType = UIConstants.DT_IMAGE;
        this.hasDisplayValueFromSource = false;
        this.isDisplayValueVisible = true;
    }

    /**
     * Instantiate a new <code>DColumn</code> object for the given parameters.
     * <p>
     * @param id
     *      The column name.
     * @param objectRef
     *      The column refer to object.
     * @param dataFilter
     *      The filter on data of column.
     * @param sortFilter
     *      The sorted order of column.
     * @param isEditable
     *      The column is editable or not.
     * @param width
     *      The width of column.
     * @param format
     *      The format of column.
     * @param href
     *      The href value of column.
     * @param type
     *      The type of column
     * @param label
     *      The label details of column.
     * @param isVisible
     *      The column is visible or not.
     * @param tooltip
     *      The tooltip text of column.
     * @param inputType
     *      The input type of column.
     * @param dataType
     *      The data type of column.
     * @param associateIds
     *      the associate ids of column.
     * @param multivaluefield
     *      The multivalue field of column.
     * @param isReadOnly
     *      The column is read only or not.
     */
    public Column(String id, String objectRef, String dataFilter, int sortFilter, boolean isEditable, int width,
                    String format, String href, int type, Label label, boolean isVisible, String tooltip,
                    String inputType, int dataType, List<String> associateIds, MultiValueField multivaluefield, String displayValue,
                    String widget,boolean isRequired, int widgetMode, int minLength, int maxLength, boolean isReadOnly,
                    boolean isCalculated, boolean isMasked, String encryption, String hqlref)
    {
        super(id);
        this.objectRef = objectRef;
        this.dataFilter = dataFilter;
        this.sortFilter = sortFilter;
        this.isEditable = isEditable;
        this.width = width;
        this.format = format;
        this.columnType = type;
        this.label = label;
        this.isVisible = isVisible;
        this.tooltip = tooltip;
        this.inputType = inputType;
        this.dataType = dataType;
        this.associateIds = associateIds;
        this.multiValueField = multivaluefield;
        this.displayValue = displayValue;
        this.widget = widget;
        this.isRequired = isRequired;
        this.widgetMode = widgetMode;
        this.doSummation = false;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.isReadOnly = isReadOnly;
        this.isCalculated = false;
        this.isMasked = false;
        this.encryption = encryption;
        this.hqlref = hqlref;
        
        
        //setting default values
        this.showData = true;
        this.displayValueDataType = UIConstants.DT_IMAGE;
        this.hasDisplayValueFromSource = false;
        this.isDisplayValueVisible = true;
    }

    public String getDataFilter()
    {
        return dataFilter;
    }

    public void setDataFilter(String dataFilter)
    {
        this.dataFilter = dataFilter;
    }

    public boolean isEditable()
    {
        return isEditable;
    }

    public void setEditable(boolean isEditable)
    {
        this.isEditable = isEditable;
    }

    public int getSortFilter()
    {
        return sortFilter;
    }

    public void setSortFilter(int sortFilter)
    {
        this.sortFilter = sortFilter;
    }

    public int getColumnType()
    {
        return columnType;
    }

    public void setColumnType(int type)
    {
        this.columnType = type;
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

    public String getInputType()
    {
        return inputType;
    }

    public void setInputType(String inputType)
    {
        this.inputType = inputType;
    }

    public List<String> getAssociateIds()
    {
        return associateIds;
    }

    public void setAssociateIds(List<String> associateIds)
    {
        this.associateIds = associateIds;
               
    }

    public void addAssociateId(String objectRef)
    {
        if (this.associateIds == null)
        {
            this.associateIds = new ArrayList<String>();
        }
        this.associateIds.add(objectRef);
    }

    /**
     * This method is for getting the multiValueField object
     * @return DMultiValueField Object
     */
    public MultiValueField getMultivaluefield()
    {
        return multiValueField;
    }

    /**
     * THis method is for setting the MultiValueField object
     * @param multivaluefield
     */
    public void setMultivaluefield(MultiValueField multivaluefield)
    {
        this.multiValueField = multivaluefield;
        this.multiValueField.checkId();
    }
    
    public boolean isDoSummation()
    {
        return doSummation;
    }

    public void setDoSummation(boolean doSummation)
    {
        this.doSummation = doSummation;
    }

    /**
     * This method is for getting the value foe displayValue
     * @return String Object
     */
    public String getDisplayValue()
    {
        return displayValue;
    }

    /**
     * This method is to set the value of displayValue
     * @param displayValue
     */
    public void setDisplayValue(String displayValue)
    {
        this.displayValue = displayValue;
    }
    
    /**
     * Sets the uniqueId for the column element.
     * <p>
     * @param parentId
     *          The uniqueId of the DGrid element.
     */
    public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the DColumn if not present already.
        super.setUniqueId(parentId);
    }

    /**
     * Get associate field ids
     * <p>
     * @return associateFieldIds
     *          List<String>
     */
    public List<String> getAssociateFieldIds()
    {
        return associateFieldIds;
    }

    /**
     * Set associate field ids
     * <p>
     * @param associateFieldIds
	 * 			List<String>		
     */
    public void setAssociateFieldIds(List<String> associateFieldIds)
    {
        this.associateFieldIds = associateFieldIds;
    }
    
    /**
     * Add field id for associate fields .
     * <p>
     * @param fieldId
     *          <code>java.lang.String</code>
     */
    public void addAssociateFieldId(String fieldId)
    {
        if (this.associateFieldIds == null)
        {
            this.associateFieldIds = new ArrayList<String>();
        }
        this.associateFieldIds.add(fieldId);
    }

    /**
     * clone the DColumn object
     */
    public Object clone()
    {
        Column newCol = new Column();
        newCol = (Column) super.clone(newCol);
        newCol.setObjectRef(this.getObjectRef());
        newCol.setDataFilter(this.getDataFilter());
        newCol.setSortFilter(this.getSortFilter());
        newCol.setWidth(this.getWidth());
        newCol.setFormat(this.getFormat());
        newCol.setColumnType(this.getColumnType());
        Label label = (Label) this.getLabelConfig().clone();
        newCol.setLabel(label);
        newCol.setVisible(this.isVisible());
        newCol.setTooltip(this.getTooltip());
        newCol.setInputType(this.getInputType());
        newCol.setDataType(this.getDataType());  
        
        if (this.getAssociateIds() != null)
        {
            newCol.setAssociateIds(this.getAssociateIds());
        }
        if (this.getAssociateFieldIds() != null)
        {
            newCol.setAssociateFieldIds(this.getAssociateFieldIds());
        }
        if (this.getMultivaluefield() != null)
        {
            newCol.setMultivaluefield(this.getMultivaluefield());
        }
        newCol.setDisplayValue(this.getDisplayValue());
        newCol.setDoSummation(this.isDoSummation());
        newCol.setDataType(this.getDataType());
        newCol.setWidget(this.getWidget());
        newCol.setWidgetMode(this.getWidgetMode());
        newCol.setRequired(this.isRequired());
        newCol.setEditable(this.isEditable());
        newCol.setMaxLength(this.maxLength);
        newCol.setMinLength(this.minLength);
        newCol.setDataAlign(this.dataAlign);
        newCol.setId(this.getId());
        newCol.setReadOnly(this.isReadOnly());
        
        newCol.setDisplayValueDataType(this.displayValueDataType);
        newCol.setDisplayValueVisible(this.isDisplayValueVisible);
        newCol.setHasDisplayValueFromSource(this.hasDisplayValueFromSource);
        newCol.setShowData(this.showData);
        newCol.setElementReference(this.elementReference);
        newCol.setData(this.getData());
        newCol.setDataSource(this.getDataSource());
        return newCol;        
    }

	/**
     * Method that returns the display value type<br/>
     * value is one of the constants : UIConstants :DT_STRING/DT_NUMERIC/DT_DATETIME/DT_IMAGE/DT_BOOLEAN/DT_EMAIL
     * displayValueDataType is image by default.
     * @return integer containing display value data type
     * */
    public int getDisplayValueDataType()
    {
        return displayValueDataType;
    }

    /**
     * Method to set the display value data type.<br/>
     * value should be one of the constants : UIConstants :DT_STRING/DT_NUMERIC/DT_DATETIME/DT_IMAGE/DT_BOOLEAN/DT_EMAIL<br/>
     * @param int containing display value data type
     * */
    public void setDisplayValueDataType(int displayValueDataType)
    {
        this.displayValueDataType = displayValueDataType;
    }

    /**
     * Method that returns whether a display value is should on screen 
     * if <code>true</code>, the value is loaded from the data base<br/>
     * if <code>false</code>, the data is treated &quot;as is&quot;<br/>
     * this value is <code>false</code> by default
     * @return boolean containing the value of isDisplayValueVisible
     * */
    public boolean isDisplayValueVisible()
    {
        return isDisplayValueVisible;
    }

    /**
     * Method to set the boolean display value.
     * if <code>true</code>, the value is loaded from the data base<br/>
     * if <code>false</code>, the data is treated &quot;as is&quot;<br/>
     * this value is <code>false</code> by default
     * @param boolean containing the value of displayVisible
     * */
    public void setDisplayValueVisible(boolean displayVisible)
    {
        this.isDisplayValueVisible = displayVisible;
    }

    /**
     * Method to get the value of show data
     * if <code>true</code>, this value is shown on screen,<br/>
     * if <code>false</code>, this value is not shown on screen <br/>
     * @return boolean indicating the value of showData
     * */
    public boolean isShowData()
    {
        return showData;
    }

    /**
     * Method to set the value of the variable show data.
     * if <code>true</code>, this value is shown on screen,<br/>
     * if <code>false</code>, this value is not shown on screen <br/> 
     * @param boolean containing the value of showData
     * */
    public void setShowData(boolean showData)
    {
        this.showData = showData;
    }

    /** Method to indicate that the displayvalue is from database
     * if <code>true</code>, the value is loaded from the data base<br/>
     * if <code>false</code>, the data is treated &quot;as is&quot;<br/>
     * @return boolean indicating the value of hasDisplayValueFromSource
     * */
    public boolean hasDisplayValueFromSource()
    {
        return hasDisplayValueFromSource;
    }

    /** Method to set that whether the displayvalue is from database
     * if <code>true</code>, the value is loaded from the data base<br/>
     * if <code>false</code>, the data is treated &quot;as is&quot;<br/>
     * @param boolean containing the value of displayFromDataSource
     * */
    public void setHasDisplayValueFromSource(boolean displayFromDataSource)
    {
        this.hasDisplayValueFromSource = displayFromDataSource;
    }

    /**
     * Method to indicate that the displayvalue exists
     * if <code>true</code>, displayvalue attribute exists
     * if <code>false</code>, displayvalue attribute does not exists
     * @return boolean indicating whether the display value exists or not.
     * */
    public boolean hasDisplayValue()
    {
        return displayValue != null;
    }

    /**
     * Gets the DElementReference instance.
     * <p>
     * @return
     *      elementReference
     */
    public ElementReference getElementReference()
    {
        return elementReference;
    }

    /**
     * Sets the DElementReference instance.
     * <p>
     * @param elementReference
     */
    public void setElementReference(ElementReference elementReference)
    {
        this.elementReference = elementReference;
    }
}
