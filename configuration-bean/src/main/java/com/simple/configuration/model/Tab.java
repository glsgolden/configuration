package com.simple.configuration.model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Tab definition as per presentation.xsd 
 */
public class Tab extends Id
{

    private static final long serialVersionUID = -7104277951619607617L;
    /**
     * The display label for the tab.
     */
    private Label label;
    /**
     * 
     * The list of row configurations for this tab.
     * <com.capgent.cpt.client.common.dto.DFormRow>
     */
    private ArrayList<FormRow> rows;
    /**
     * Flag indicating if tab is the default tab.
     */
    private boolean isDefault;
    /**
     * The sequence of the tab in the layout
     */
    private int sequenceNum;
    /**
     * The primary id field for the tab.
     */
    private String primaryField;
    /**
     * Flag indicating if tab is a multivalued tab.
     */
    private boolean isMultiValue;
    /**
     * The order by sort columns.
     */
    private ArrayList orderbySort;
    /**
     * Total no of rows for this tab.
     */
    private int noOfRows;
    /**
     * Default row size in pixels
     */
    private int rowHeight;
    /**
     * Total no of columns for this tab.
     */
    private int noOfColumns;
    /**
     * List of size for each column in this tab. <java.lang.Integer>
     */
    private List columnSizes;
    /**
     * The tab <code>DDatasource</code> object
     * 
     */
    private DataSource datasource;
    /**
     * The css for the tab.
     */
    private String css;
    /**
     * List of columns HQL refs for this tab fields <java.lang.String>
     */
    private List columns;
    
    /**
     * Contains all fields of DFormRow of current DTab.
     * Key = Field Id, value = DField object.
	 */
	private Map<String, Field> fields;
	/**
	 * The flag to indicate whether tab is customizable or not.
	 */
	private boolean isCustomizable;
	
	/**
	 * Initialize an new instance of DTab for given parameters.
	 */
	public Tab() 
	{
		this.noOfRows = 0;
		this.noOfColumns = 0;
	}

	/**
	 * Initialize a new instance of DTab for the given parameters.
	 * @param rows
	 *            The rows of tab.
	 * @param label
	 *            The label informatin of tab.
	 * @param isDefault
	 *            the tab is default or not.
	 * @param primaryField
	 *            The primary field of tab.
	 * @param isMultiValue
	 *            The tab has multivalue field or not.
	 */
	public Tab(ArrayList rows, Label label, boolean isDefault, String primaryField, boolean isMultiValue) 
	{
		this.rows = rows;
		this.label = label;
		this.isDefault = isDefault;
		this.primaryField = primaryField;
		this.isMultiValue = isMultiValue;
		this.noOfRows = 0;
		this.noOfColumns = 0;
	}

	/**
	 * Get the row configurations for this tab.
	 * <p>
	 * 
	 * @return rows <code>ArrayList</code> of <code>DFormRow</code>
	 *         <com.capgent.cpt.client.common.dto.DFormRow>
	 */
	public ArrayList getRows() 
	{
		return rows;
	}

	/**
	 * Set the row configurations for this Tab.
	 * <p>
	 * 
	 * @param rows
	 *            <code>ArrayList</code> holding <code>DFormRow</code>
	 *            configurations. rows
	 *            <com.capgent.cpt.client.common.dto.DFormRow>
	 */
	public void setRows(ArrayList rows) 
	{
		this.rows = rows;
	}

	/**
	 * Register a row for this tab.
	 * <p>
	 * 
	 * @param row
	 *            <code>DFormRow</code> configuration.
	 */
	public void addRow(FormRow row) 
	{
		if (this.rows == null) 
		{
			this.rows = new ArrayList<FormRow>();
		}
		this.rows.add(row);
		row.setTabSequence(this.sequenceNum);
		// --- for accounting no of rows and columns for a tab ---
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

		if (this.columns == null) 
		{
			this.columns = new ArrayList();
		}
		List temp = row.getColumns();
		if (temp != null) 
		{
			int size = temp.size();
			for (int i = 0; i < size; i++) 
			{
				String ref = (String) temp.get(i);
				if (ref != null && ref.length() > 0) 
				{
					if (!this.columns.contains(ref))
					{
						columns.add(ref);
					}
				}
			}
		}
	}

	/**
	 * Get List of columns HQL refs for this all the fields in this tab.
	 * <p>
	 * 
     * @return columns <code>List</code> of <code>String</code> HQL
     *         references.
	 */
	public List getColumns() 
	{
		return this.columns;
	}

	/**
	 * Gets the string value for label.
	 * <p>
     * @return label
     *      The text of label.
	 */
	public String getLabel() 
	{
		String label = this.label.getLabel();
		return label;
	}

	/**
	 * Sets the string value for label.
	 * <p>
	 * @param label
	 *            The text of label.
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
	 * Indicate whether the tab is the default tab.
	 * <p>
	 * 
     * @return isDefault <code>true</code> if is default tab
     *         <code>false</code> otherwise.
	 */
	public boolean isDefault() 
	{
		return isDefault;
	}

	/**
	 * Set whether the tab is the default tab.
	 * <p>
	 * 
	 * @param isDefault
	 *            <code>true</code> if is default tab <code>false</code>
	 *            otherwise.
	 */
	public void setDefault(boolean isDefault) 
	{
		this.isDefault = isDefault;
	}

	/**
	 * Get the primary field for the tab.
	 * <p>
	 * 
	 * @return primaryField <code>String</code> primary field reference.
	 */
	public String getPrimaryField() 
	{
		return primaryField;
	}

	/**
	 * Set the primary field for the tab.
	 * <p>
	 * 
	 * @param primaryField
	 *            <code>String</code> primary field reference.
	 */
	public void setPrimaryField(String primaryField) 
	{
		this.primaryField = primaryField;
	}

	/**
	 * Indicate whether the tab is an multivalued.
	 * <p>
	 * 
	 * @return isMultiValue <code>true</code> if is multivalue tab
	 *         <code>false</code> otherwise.
	 * 
	 */
	public boolean isMultiValue() 
	{
		return isMultiValue;
	}

	/**
	 * Set whether the tab is an multivalued.
	 * <p>
	 * 
	 * @param isMultiValue
	 *            <code>true</code> if is multivalue tab <code>false</code>
	 *            otherwise.
	 * 
	 */
	public void setMultiValue(boolean isMultiValue) 
	{
		this.isMultiValue = isMultiValue;
	}

	/**
	 * Get the no of row count for this tab.
	 * <p>
	 * 
	 * @return size <code>int</code> row count.
	 */
	public int size() 
	{
		int size = 0;
		if (this.rows != null) 
		{
			size = this.rows.size();
		}
		return size;
	}

	/**
	 * Get the sequence of the tab in the layout.
	 * <p>
	 * 
	 * @return seq <code>int</code> sequence of the tab.
	 */
	public int getSequenceNum() 
	{
		return sequenceNum;
	}

	/**
	 * Set the sequence of the tab in the layout.
	 * <p>
	 * 
	 * @param seq
	 *            <code>int</code> sequence of the tab.
	 */
	public void setSequenceNum(int sequenceNum) 
	{
		this.sequenceNum = sequenceNum;
	}

	/**
	 * Get the tab datasource. The configuration for data fetch for the tab.
	 * <p>
	 * 
	 * @return datasource <code>DDatasource</code>
	 */
	public DataSource getDatasource() 
	{
		return datasource;
	}

	/**
	 * Set the tab datasource.
	 * <p>
	 * 
	 * @param datasource
	 *            <code>DDatasource</code> object
	 */
	public void setDatasource(DataSource datasource) 
	{
		this.datasource = datasource;
	}

	/**
	 * Get the total no of rows for this tab.
	 * <p>
	 * 
	 * @return noOfRows <code>int</code> number of rows.
	 */
	public int getNoOfRows() 
	{
		return noOfRows;
	}

	/**
	 * Get the total no of maximmum columns for this tab.
	 * <p>
	 * 
	 * @return noOfColumns <code>int</code> number of columns.
	 */
	public int getNoOfColumns() 
	{
		return this.columnSizes.size();
	}

	/**
	 * Get the size corresponding to each columns of the tab.
	 * <p>
	 * 
	 * @return columnSizes <code>List</code> of column sizes.
	 */
	public List getColumnSizes() 
	{
		return columnSizes;
	}

	/**
	 * Set the size corresponding to each columns of the tab.
	 * <p>
	 * 
	 * @param columnSizes
	 *            <code>List</code> of column sizes.
	 */
	public void setColumnSizes(List columnSizes) 
	{
		this.columnSizes = columnSizes;
	}

	/**
	 * Store size for column of this tab.
	 * <p>
	 * 
	 * @param size
	 *            the size of the column.
	 */
	public void addColumnSize(int size) 
	{
		if (this.columnSizes == null) 
		{
			this.columnSizes = new ArrayList();
		}
		this.columnSizes.add(new Integer(size));
	}

	/**
	 * Get the default row height for the tab in pixels.
	 * <p>
	 * 
	 * @return The default row height for the tab in pixels.
	 */
	public int getRowHeight() 
	{
		return rowHeight;
	}

	/**
	 * Set the default row height for the tab in pixels.
	 * <p>
	 * 
	 * @param rowHeight
	 *            The default row height for the tab in pixels.
	 */
	public void setRowHeight(int rowHeight) 
	{
		this.rowHeight = rowHeight;
	}

	/**
	 * Get the tab css.
	 * <p>
	 * 
	 * @return The tab css.
	 */
	public String getCss() 
	{
		return css;
	}

	/**
	 * Set the tab css.
	 * <p>
	 * 
	 * @param css
	 *            The tab css.
	 */
	public void setCss(String css)
	{
		this.css = css;
	}

	/**
	 * Get the form fields.
	 * <p>
	 * 
	 * @return allFields The <code>List</code> of fields.
	 */
	public List getFields() 
	{
		List allFields = null;
		if (fields != null) 
		{
			allFields = ((CptOrderedMap) this.fields).getValues();
		}
		return allFields;
	}

	/**
	 * Gets the <code>DField</code> object based on the object reference given.
	 * <p>
	 * @param objectReference
	 *            object reference of the field which are we need.
     * @return
     *      <code>DField</code> object corresponding to the given object refernce String
     *      there is no corresponding object reference it returns null.
	 */
	public Field getField(String objectReference) 
	{
		Field field = null;
		List fields = this.getFields();
        if (fields != null)
        {
			Iterator fieldItr = fields.iterator();
			while (fieldItr.hasNext()) 
			{
				field = (Field) fieldItr.next();
				if (objectReference.equals(field.getObjectRef())) 
				{
					return field;
				}
			}
		}
		return null;
	}

	/**
     * Sets the uniqueId for the Dtab element and for each DField element contained within the tab.
	 * 
	 * @param parentId
	 *            The uniqueId of the DForm element.
	 */
	public void setUniqueId(String parentId) 
	{
		// create and set the uniqueId of the DTab if not present already.
		super.setUniqueId(parentId);

        //iterate the Elements and set the uniqueId for each Element if not assigned already.
		List<Field> fields = getFields();
		if (fields != null) 
		{
			Iterator<Field> it = fields.iterator();
			while (it.hasNext()) 
			{
				Field field = (Field) it.next();
				field.setUniqueId(this.getUniqueId());
			}
		}
	}

	/**
     * Gets the data types for fields configured 
     * for this tab.
	 * <p>
     * @return dataTypes
     *      The {@link List} of data type for each
     *      field of this tab.
	 */
	public List<Integer> getDataTypes() 
	{
		List<Integer> dataTypes = new ArrayList<Integer>();
		Iterator<String> it = columns.iterator();
		while (it.hasNext()) 
		{
			String objectRef = it.next();
			Field field = getField(objectRef);
			dataTypes.add(field.getDataType());
		}
		return dataTypes;
	}

	/**
     * Gets the data formats  for fields configured 
     * for this tab.
	 * <p>
     * @return dataFormats
     *      The {@link List} of data format for each
     *      field of this tab.
	 */
	public List<String> getDataFormats() 
	{
		List<String> dataFormats = new ArrayList<String>();
		Iterator<String> itr = columns.iterator();
		while (itr.hasNext()) 
		{
			String objectRef = itr.next();
			Field field = getField(objectRef);
			dataFormats.add(field.getFormat());
		}
		return dataFormats;
	}

	/**
	 * Gets the <code>DField</code> object based on its Id.
	 * <p>
	 * @param fieldId
	 *            Id of the field which are we need.
     * @return
     *      <code>DField</code> object corresponding to the given Id String
     *      there is no corresponding field for given fieldId it returns null.
	 */
    public Field getFieldById(String fieldId)
    {
		Field field = null;
		if (fields != null) 
		{
			field = fields.get(fieldId);
		}
		return field;
	}

	/**
	 * Adds a <code>DField</code> object in DTab.
	 * @param field
	 *            <code>DField</code> object to be added in DTab.
	 */
	public void addField(Field field) 
	{
		if (fields == null) 
		{
			fields = new CptOrderedMap();
		}
		String id = field.getId();
		this.fields.put(id, field);
	}

	/**
     * Gets the <code>DField</code> object based on the MultiValueFiled Id given.
	 * <p>
	 * @param datasourceId
	 *            MultiValueFiled Id of the field which are we need.
     * @return  fieldConfig
     *      <code>DField</code> object corresponding to the given MultiValueFiled Id String
     *      there is no corresponding MultiValueFiled Id it returns null.
	 */
	public Field getFieldByDataSourceId(String datasourceId) 
	{
		List<Field> fields = this.getFields();
		Field field = null;
		if (fields != null) 
		{
			Iterator<Field> fieldItr = fields.iterator();
			while (fieldItr.hasNext()) 
			{
				field = fieldItr.next();
				MultiValueField multiValueField = field.getMultiValueField();
				if (multiValueField != null) 
				{
					String mvfId = multiValueField.getId();
					if (mvfId.equals(datasourceId)) 
					{
						return field;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get the customization property of tab.
	 * <p>
	 * @return isCustomizable
	 * 		Boolean value returns true if tab is customizable otherwise false.
	 */
	public boolean isCustomizable() 
	{
		return isCustomizable;
	}

	/**
	 * Set the customization property of tab.
	 * <p>
	 * @Param isCustomizable
	 *  	Set the boolean value true if tab is customizable otherwise false.	 
	 */
	public void setCustomizable(boolean isCustomizable) 
	{
		this.isCustomizable = isCustomizable;
	}

	/**
	 * Clones this tab configuration.
	 */
	public Object clone() 
	{
		Tab newTab = new Tab();
		newTab = (Tab) super.clone(newTab);
		newTab.setLabel(this.label);
		newTab.setCss(this.css);
		if (this.rows != null) 
		{
			ArrayList<FormRow> rows = new ArrayList<FormRow>();			
			for (FormRow row : this.rows) 
			{
				FormRow newRow = (FormRow) row.clone();
				rows.add(newRow);
				List<List<Field>> fieldList = newRow.getFields();
				if (fieldList != null)
				{
					for (List<Field> fieldWrap : fieldList)
					{
						if (fieldWrap != null)
						{
							for (Field fld : fieldWrap)
							{
								if (newTab.fields == null)
								{
									newTab.fields = new CptOrderedMap();
								}
								newTab.fields.put(fld.getId(), fld);
							}
						}
					}
				}
			}
			newTab.setRows(rows);
		}

		if (this.columnSizes != null) 
		{
			newTab.setColumnSizes(this.columnSizes);
		}

		if (this.datasource != null) 
		{
			newTab.setDatasource(this.datasource);
		}

		if (this.columns != null) 
		{
			List<String> columns = new ArrayList<String>();
			columns.addAll(this.columns);
			newTab.columns = columns;
		}

		newTab.setDefault(this.isDefault);
		newTab.setPrimaryField(this.primaryField);
		newTab.setSequenceNum(this.sequenceNum);
		newTab.setMultiValue(this.isMultiValue);
		newTab.setRowHeight(this.rowHeight);
		newTab.setCustomizable(this.isCustomizable);
		newTab.noOfRows = this.noOfRows;
		newTab.noOfColumns = this.noOfColumns;
		return newTab;
	}

	/**
	 * Adds a row for this tab.
	 * <p>
	 * 
	 * @param row
	 *            <code>DFormRow</code> configuration.
	 */
	public void insertRow(FormRow row, int position) 
	{
		if (this.rows == null) 
		{
			this.rows = new ArrayList<FormRow>();
		}
		this.rows.add(position, row);
		row.setTabSequence(this.sequenceNum);
		// --- for accounting no of rows and columns for a tab ---
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

		if (this.columns == null) 
		{
			this.columns = new ArrayList();
		}
		List temp = row.getColumns();
		if (temp != null) 
		{
			int size = temp.size();
			for (int i = 0; i < size; i++) 
			{
				String ref = (String) temp.get(i);
				if (ref != null && ref.length() > 0) 
				{
					if (!this.columns.contains(ref)) 
					{
						columns.add(ref);
					}
				}
			}
		}
	}
	
	/**
	 * Get the Map of fields.
	 * Key - object reference, Value - DField
	 * <p>
	 * @return fields
	 * 		The Map of fields.
	 */
	public Map getFieldMap()
	{
		return this.fields;
	}
	
	/**
	 * Clear the tab.
	 */
	public void clear()
	{
		this.fields = null;
		this.rows = null;
		this.noOfRows = 0;
		this.columns = null;
	}
}
