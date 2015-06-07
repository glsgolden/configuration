package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;


/**
 * Represents the business object its properties and associate
 * business objects.
 */
public class CptBusinessObject extends DEntity implements Serializable  
{
	private static final long serialVersionUID = -7897812722023324380L;

	/**
	 * The table label to be displayed to the user.
	 */
	private String label;
	/**
	 * The HQL object reference to be used while storing data parsed by the loader.
	 */
	private String objectRef;

	/**
     * The module for  which the CptBusinessObject will be restricted.
     */
    private String module;

	/**
     * The HQL reference of the Object Name.
     */
	private String hqlRef;
    /**
     * Relationship with the associate class.
     */
	private int link;
	/**
     * Flag to indicate that the field
     * is fixed data sequence field or not.
     */
	private boolean isFixedDataSequence;
	/**
     * Flag to indicate that the field
     * is required field or not.
     */
	private boolean isRequired;
	/**
     * Contain fields map.
     * Field name as key and
     * CptField object as value.
     */
	private Map<String,CptField> fields;
	/**
	 * Associate tables <code>List</code>.
	 */
	private ArrayList<CptBusinessObject> associations;
	/**
	 * Contains the group of CptBusinessObjects.
	 */
	private Map<String,CptBusinessObject> group;
	/**
	 * Holds the list of action identifiers that can 
	 * use this business object as configured
	 * for the data dictionary.
	 */
	private List<String> allowedActions;
	/**
	 * Holds the sorted fields.
	 */
	private Map<String, CptField> sortedFields;

	/**
	 * Flag to indicate whether the CptBusinessObject is customizable.
	 */
	private boolean customizable;
	
	/**
	 * Initializes a new instance of the 
	 * {@link CptBusinessObject}
	 */
	public CptBusinessObject()
	{
		super();
		this.customizable = false;
	}

	/**
	 * Initializes a new instance of the 
	 * {@link CptBusinessObject} for the given parameters.
	 *
	 * @param label
	 * 		The label for the business object.
	 * @param objectRef
	 * 		The mapped object reference for the business object.
	 * @param module
	 * 		The module configured for the business object.
	 * 
	 */
	public CptBusinessObject(String label, String objectRef, String module)
	{
		this.objectRef = objectRef;
		this.label = label;
		this.module = module;
	}

	/**
	 * Get the alias name.
	 * <p>
	 * @return alias.
	 *      The alias name.
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Set the alias name.
	 * <p>
	 * @param alias
	 *      The alias name.
	 */
	public void setLabel(String label)
	{
		this.label = label;
	}

	/**
	 * Get the sortedFields <code>Map<String,CptField></code>.
	 * <p>
	 * @return sortedFields.
	 *     The sortedFields <code>Map<String,CptField></code>.
	 */
	public Map<String,CptField> getFields()
	{
		return sortedFields;
	}
	
	/**
	 * Get the field/sortedField <code>Map<String,CptField></code> basis of isSorted flag.
	 * <p>
	 * @param isSorted
	 * 	boolean type, if flag is true return sortedFields else fields.
	 * @return fields/sortedFields.
	 *     The field/sortedField <code>Map<String,CptField></code>.
	 */
	public Map<String,CptField> getFields(boolean isSorted)
	{
		if (isSorted)
		{
			return sortedFields;
		}
		else
		{
			return fields;
		}
	}

	/**
     * Set the field <code>Map<String,CptField></code>.
     * <p>
     * @param fields.
     *     The field <code>Map<String,CptField></code>.
     */
	public void setFields(Map<String,CptField> fields)
	{
		this.sortedFields = fields;
	}
	
	/**
     * Set the field/sortedFields <code>Map<String,CptField></code>.
     * <p>
     * @param fields.
     *     The field <code>Map<String,CptField></code>.
     */
	public void setFields(Map<String,CptField> fields, boolean isSorted)
	{
		if (isSorted)
		{
			this.sortedFields = fields;
		}
		else
		{
			this.fields = fields;
		}
	}
	/**
	 * Get the object reference.
	 * <p>
	 * @return objectNameRef
	 *     The object reference.
	 */
	public String getObjectRef()
	{
		return objectRef;
	}

	/**
	 * Set the object reference.
	 * <p>
	 * @param objectNameRef
	 *     The object reference.
	 */
	public void setObjectRef(String objectNameRef)
	{
		this.objectRef = objectNameRef;
	}

    /**
     * Get the table association <code>List</code>.
     * <p>
     * @return associations
     *      The table associations.
     */
	public ArrayList<CptBusinessObject> getAssociations()
    {
        return associations;
    }

    /**
     * Set the associations <code>List</code>.
     * <p>
     * @param associations
     *      The table associations.
     */
	public void setAssociations(ArrayList<CptBusinessObject> associations)
    {
        this.associations = associations;
    }

	/**
     * Get the <code>Map</code> of group.
     * <p>
     * @return group
     *          The <code>Map</code> of groups.
     */
	public Map<String, CptBusinessObject> getGroup()
    {
        return group;
    }

	/**
     * Set the <code>Map</code> of group.
     * <p>
     * @param group
     *          The <code>Map</code> of groups.
     */
	public void setGroup(Map<String, CptBusinessObject> group)
    {
        this.group = group;
    }

    /**
     * Get the associated relationship.
     * <p>
     * @return link
     *      The associated relationship.
     */
    public int getLink()
    {
        return link;
    }

    /**
     * Set the associated relationship.
     * <p>
     * @param link
     *      The associated relationship.
     */
    public void setLink(int link)
    {
        this.link = link;
    }

    /**
     * Get the HQL reference of the object.
     * <p>
     * @return hqlRef
     *      The HQL reference.
     */
    public String getHqlRef()
    {
        return hqlRef;
    }

    /**
     * Set the HQL reference of the object.
     * <p>
     * @param hqlRef
     *      The HQL reference.
     */
    public void setHqlRef(String hqlRef)
    {
        this.hqlRef = hqlRef;
    }

    /**
     * Get the boolean value true/false whether field is fixed data sequence or not.
     * <p>
     * @return isFixedDataSequence
     *      <code>boolean</code> true/false value.
     */
    public boolean isFixedDataSequence()
    {
        return isFixedDataSequence;
    }

    /**
     * Set the boolean value true/false whether field is fixed data sequence or not.
     * <p>
     * @param isFixedDataSequence
     *      <code>boolean</code> true/false value.
     */
    public void setFixedDataSequence(boolean isFixedDataSequence)
    {
        this.isFixedDataSequence = isFixedDataSequence;
    }

    /**
     * Get the boolean value true/false whether field is required  or not.
     * <p>
     * @return isRequired
     *      <code>boolean</code> true/false value.
     */
    public boolean isRequired()
    {
        return isRequired;
    }

    /**
     * Set the boolean value true/false whether field is required  or not.
     * <p>
     * @param isRequired
     *      <code>boolean</code> true/false value.
     */
    public void setRequired(boolean isRequired)
    {
        this.isRequired = isRequired;
    }

    /**
     * Add a field to the field <code>List</code>.
     * <p>
     * @param field
     *      The field to be add.
     */
    public void addField(CptField field)
    {
        if (this.fields == null)
        {
            this.fields = new HashMap<String,CptField>();
        }
        String key = field.getId();
        fields.put(key,field);
    }
    
    /**
     * Add a field to the field/sortedField <code>List</code> on the basis of isSorted flag.
     * <p>
     * @param field
     *      The field to be add.
     * @param isSorted
     *      If boolean flag is true added field to sortedField list else fields list.
     */
    public void addField(CptField field, boolean isSorted)
    {   
        String key = field.getId();
        if (isSorted)
        {
        	if (this.sortedFields == null)
            {
            	this.sortedFields = new CptOrderedMap();
            }
        	this.sortedFields.put(key, field);
        }
        else
        {
        	if (this.fields == null)
            {
                this.fields = new HashMap<String,CptField>();
            }
        	this.fields.put(key,field);
        }
    }

    /**
     * Add a association to the association <code>List</code>.
     * <p>
     * @param association
     *      The association to be add.
     */
    public void addAssociation(CptBusinessObject association)
    {
        if (this.associations == null)
        {
            this.associations = new ArrayList<CptBusinessObject>();
        }
        this.associations.add(association);
    }

    /**
     * Add a group to the groups <code>List</code>.
     * <p>
     * @param group
     *      The group to be add.
     */
    public void addGroup(CptBusinessObject group)
    {
        if (this.group == null)
        {
            this.group = new HashMap<String, CptBusinessObject>();
        }
        String label = group.getLabel();
        this.group.put(label, group);
    }

    /**
     * Return the list of object references for the sortedFields in this business object group.
     * <p>
     * @return list
     *      An <code>java.util.List</code> containing String of objectRef i.e Tablename.Fieldname
     *       corresponding to each  <code>CptField<code> object.
     * <java.util.ArrayList<java.lang.String>>
     */
    public List<String> objectRefs()
    {
        List<String> list = null;
        if (this.sortedFields != null && this.sortedFields.size() > 0)
        {
            list = new ArrayList<String>();
            Iterator<String> itr = sortedFields.keySet().iterator();
            for (int i = 0; itr.hasNext(); i++)
            {
                String key = itr.next();
                CptField field = this.sortedFields.get(key);
                int fieldType = field.getFieldType();
                //--- Display only user fields. ---
                if (fieldType == UIConstants.USER)
                {
                    list.add(field.getObjectRef());
                }
            }
        }
        return list;
    }

    /**
     * Return the list of labels for the sortedFields in this business object group.
     * <p>
     * @return list
     *      An <code>java.util.List</code> containing String of objectRef i.e Tablename.Fieldname
     *       corresponding to each  <code>CptField<code> object.
     * <java.util.ArrayList<java.lang.String>>
     */
    public List<String> getLabelsList()
    {
        List<String> list = null;
        if (this.sortedFields != null && this.sortedFields.size() > 0)
        {
            list = new ArrayList<String>();
            Iterator<String> itr = sortedFields.keySet().iterator();
            for (int i = 0; itr.hasNext(); i++)
            {
                String key = itr.next();
                CptField field = this.sortedFields.get(key);
                int fieldType = field.getFieldType();
                //--- Display only user fields. ---
                if (fieldType == UIConstants.USER)
                {
                    list.add(field.getLabel());
                }
            }
        }
        return list;
    }

    /**
     * Return the list of names for the sortedFields in this business object group.
     * <p>
     * @return list
     *      An <code>java.util.List</code> containing String of objectRef i.e Tablename.Fieldname
     *       corresponding to each  <code>CptField<code> object.
     * <java.util.ArrayList<java.lang.String>>
     */
    public List<String> getNamesList()
    {
        List<String> list = null;
        if (this.sortedFields != null && this.sortedFields.size() > 0)
        {
            list = new ArrayList<String>();
            Iterator<String> itr = sortedFields.keySet().iterator();
            for (int i = 0; itr.hasNext(); i++)
            {
                String key = itr.next();
                CptField field = this.sortedFields.get(key);
                int fieldType = field.getFieldType();
                //--- Display only user fields. ---
                if (fieldType == UIConstants.USER)
                {
                    list.add(field.getId());
                }
            }
        }
        return list;
    }

    /**
     * Return the list of data types for the sortedFields in this field group.
     * <p>
     * @return list
     *      An <code>java.util.List</code> containing Integer data type.
     *       corresponding to each  <code>DField<code> object.
     */
    public List<Integer> dataTypes()
    {
        List<Integer> list = null;
        if (this.sortedFields != null && this.sortedFields.size() > 0)
        {
            list = new ArrayList<Integer>();
            Iterator<String> itr = sortedFields.keySet().iterator();
            for (int i = 0; itr.hasNext(); i++)
            {
                String key = itr.next();
                CptField field = this.sortedFields.get(key);
                int fieldType = field.getFieldType();
                //--- Display only user fields. ---
                if (fieldType == UIConstants.USER)
                {
                    list.add(field.getDataType());
                }
            }
        }
        return list;
    }

    /**
     * Get the module name
     * <p>
     * @return module
     *      The module name.
     */
    public String getModule()
    {
        return module;
    }

    /**
     * Set the module.
     * <p>
     * @param module
     *     The module name.
     */
    public void setModule(String module)
    {
        this.module = module;
    }

    /**
     * Returns the CptField for the passed CptField id.
     * <p>
     * @return CptField.
     *          CptField whose unique id matches the passed id param.
     */
    public CptField getField(String id)
    {
        CptField cptField  = null;
        if (this.sortedFields != null)
        {
            cptField = this.sortedFields.get(id);
        }
        return cptField;
    }

    /**
     * Return the List of CptFields which have mandatory tag value as "true".
     *
     * <p>
     * @return CptFields.
     *          List<CptField> which are mandatory.
     */
    public List<CptField> getMandatoryFields()
    {
        //declarations
        List<CptField> cptFields  = new ArrayList<CptField>();;
        CptField cptField = null;

        //iterating the cptFields map & getting the mandatory fields into a list.
        if (this.sortedFields != null)
        {
            Iterator<String> it = this.sortedFields.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                cptField = this.sortedFields.get(key);
                //check if the field is mandatory.
                if (cptField.isMandatory())
                {
                    cptFields.add(cptField);
                }
            }
        }

        //returning the list of mandatory CptFields.
        return cptFields;
    }

    /**
     * Return the List of CptFields which will fulfill the list of condition/criteria passed within
     * a dummy CptField.
     * <p>
     * @param condition
     *     The CptField instance which is set with the criteria flags.
     * @return CptFields.
     *          List<CptField> with the CptField/s matching the conditions sent as param in the dummy CptField.
     */
    public List<CptField> getFieldsBasedOnCriteria(CptField condition)
    {
        //declarations
        List<CptField> cptFields = new ArrayList<CptField>();
        CptField cptField = null;
        boolean isMandatory = false;
        boolean isMasked = false;
        boolean isCalculated = false;
        boolean isFieldType = false;

        //iterating the cptFields map & getting the CptFields(according to the condition)into a list.
        if (this.sortedFields != null)
        {
            Iterator<String> it = this.sortedFields.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                cptField = this.sortedFields.get(key);
                if (cptField.isMandatory() == condition.isMandatory())
                {
                    isMandatory = true;
                }
                if (cptField.isMasked() == condition.isMasked())
                {
                    isMasked = true;
                }
                if (cptField.isCalculated() == condition.isCalculated())
                {
                    isCalculated = true;
                }
                if (cptField.getFieldType() == condition.getFieldType())
                {
                    isFieldType = true;
                }

                //add into the return list only if all the passed criteria in the dummy CptField instance are satisfied.
                if (isMandatory && isMasked && isCalculated && isFieldType)
                {
                    cptFields.add(cptField);
                }
            }
        }
        //returning the list of mandatory CptFields.
        return cptFields;
    }

    /**
     * Return the List of CptFields which have calculated tag value as "true".
     *
     * <p>
     * @return CptFields.
     *          List<CptField> which are calculated.
     */
    public List<CptField> getCalculatedFields()
    {
        //declarations
        List<CptField> fields  = new ArrayList<CptField>();
        CptField field = null;

        //iterating the cptFields map & getting the calculated fields into a list.
        if (this.sortedFields != null)
        {
            Iterator<String> it = this.sortedFields.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                field = this.sortedFields.get(key);
                //check if the field is calculated.
                if (field.isCalculated())
                {
                    fields.add(field);
                }
            }
        }

        //returning the list of calculated CptFields.
        return fields;
    }

    /**
     * Return the List of CptFields which have fieldType as "system".
     *
     * <p>
     * @return CptFields.
     *          List<CptField> which have fieldType as "system".
     */
    public List<CptField> getSystemFields()
    {
        //declarations
        List<CptField> fields = new ArrayList<CptField>();
        CptField field = null;

        //iterating the cptFields map & getting the system fields into a list.
        if (this.sortedFields != null)
        {
            Iterator<String> it = this.sortedFields.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                field = this.sortedFields.get(key);
                //check if the field is system field.
                if (field.getFieldType() == UIConstants.SYSTEM)
                {
                    fields.add(field);
                }
            }
        }

        //returning the list of system CptFields.
        return fields;
    }

    /**
     * Return the List of CptFields which have fieldType as "user".
     *
     * <p>
     * @return CptFields.
     *          List<CptField> which have fieldType as "user".
     */
    public List<CptField> getUserFields()
    {
        //declarations
        List<CptField> fields  = new ArrayList<CptField>();
        CptField field = null;

        //iterating the cptFields map & getting the user fields into a list.
        if (this.sortedFields != null)
        {
            Iterator<String> it = this.sortedFields.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                field = this.sortedFields.get(key);
                //check if the field is user field.
                if (field.getFieldType() == UIConstants.USER)
                {
                    fields.add(field);
                }
            }
        }

        //returning the list of system CptFields.
        return fields;
    }

    /**
     * Return the List of CptFields which are masked.
     *
     * <p>
     * @return CptFields.
     *          List<CptField> which are masked.
     */
    public List<CptField> getMaskedFields()
    {
        //declarations
        List<CptField> cptFields  = null;
        CptField cptField = null;

        //iterating the cptFields map & getting the masked fields into a list.
        if (this.sortedFields != null)
        {
            Iterator<String> it = this.sortedFields.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                cptField = this.sortedFields.get(key);
                //check if the field is masked.
                if (cptField.isMasked())
                {
                    if (cptFields == null)
                    {
                        cptFields  = new ArrayList<CptField>();
                    }
                    cptFields.add(cptField);
                }
            }
        }

        //returning the list of masked CptFields.
        return cptFields;
    }

    /**
     * Return the List of CptFields which are encrypted.
     *
     * <p>
     * @return CptFields.
     *          List<CptField> which are encrypted.
     */
    public List<CptField> getEncryptedFields()
    {
        //declarations
        List<CptField> cptFields  = null;
        CptField cptField = null;

        //iterating the cptFields map & getting the encrypted fields into a list.
        if (this.sortedFields != null)
        {
            Iterator<String> it = this.sortedFields.keySet().iterator();
            while (it.hasNext())
            {
                String key = it.next();
                cptField = this.sortedFields.get(key);
                //check if the field is encrypted.
                if (cptField.getEncryption() != null)
                {
                    if (cptFields == null)
                    {
                        cptFields  = new ArrayList<CptField>();
                    }
                    cptFields.add(cptField);
                }
            }
        }
        //returning the list of encrypted CptFields.
        return cptFields;
    }

    /**
     * Returns the boolean value indicating the presence of the CptField of given id in the CptBusinessObject.
     * <p>
     * @param id
     *     The id of the CptField.
     * @return hasField.
     *          boolean value.    true - if cptField is present in the CptBusinessObject.
     *                            false - if cptField does not exists in the CptBusinessObject.
     */
    public boolean isField(String id)
    {
        boolean isField = false;
        if (this.sortedFields != null)
        {
            if (this.sortedFields.get(id) != null)
            {
                isField = true;
            }
        }
        return isField;
    }

    @Override
    public String toString()
    {
        return label;
    }

    /**
	 * Gets the actions configured for this
	 * business object.
	 * 
	 * @return actions
	 * 		List of action identifiers configured.
	 */
	public List<String> getAllowedActions()
	{
		return allowedActions;
	}

	/**
	 * Sets the actions configured for this
	 * business object.
	 * 
	 * @param allowedActions
	 * 		List of action identifiers configured.
	 */
	public void setAllowedActions(List<String> allowedActions) 
	{
		this.allowedActions = allowedActions;
	}
	
	/**
	 * 	Get the sorted field Map<String, CptField>.
	 * 	<p>
	 * @return sortedFields
	 * 	return the sortedFields Map<String, CptField>.
	 */
	public Map<String, CptField> getSortedFields() 
	{
		return sortedFields;
	}

	/**
	 * 	Set the sorted field Map<String, CptField> into sortedFields instance.
	 * <p>
	 * @param sortedFields
	 * 	Map<String, CptField> type.
	 */
	public void setSortedFields(Map<String, CptField> sortedFields) 
	{
		this.sortedFields = sortedFields;
	}
	
	/**
	 * Adds the associate action configured.
	 *  
	 * @param actionId
	 * 		The action id as specified for application's the 
	 * 		data source for ACT_ID column of the table ACT_HDR.
	 */
	public void addAssociateAction(String actionId)
	{
		if (this.allowedActions == null)
		{
			this.allowedActions = new ArrayList<String>();
		}
		if (!allowedActions.contains(actionId))
		{
			this.allowedActions.add(actionId);
		}
	}
	
	/**
	 * Identifies if the given action identifier
	 * is registered with this business object.
	 * 
	 * @param actionId
	 * 		The action identifier as specified in the
	 * 		ACT_ID column of the ACT_HDR table for
	 * 		application's data source.
	 * 
	 * @return isAllowed
	 * 		true if the given action is configured for this
	 * 		business object, false otherwise.
	 */
	public boolean allowsAction(String actionId)
	{
		boolean isAllowed = false;
		if (allowedActions != null && allowedActions.contains(actionId))
		{
			isAllowed = true;
		}
		return isAllowed;
	}
	
	
	/**
	 * Gets the associate business object for the given label.
	 * 
	 * @param label
	 * 		The {@link String} label of the business object.
	 * @return businessObject
	 * 		The {@link CptBusinessObject}
	 */
	public CptBusinessObject getAssociationForLabel(String label)
	{
		CptBusinessObject businessObject = null;
		Iterator<CptBusinessObject> it = associations.iterator();
		while (it.hasNext())
		{
			businessObject = it.next();
			if (businessObject.getLabel().equals(label))
			{
				break;
			}
		}
		return businessObject;
	}
	
	/**
	 * Returns CptField object for specified objectRef,
	 * If no such field found null is returned.
	 */
	public CptField getFieldForObjectRef(String objectRef)
	{
	    CptField field  = null;
        if (this.sortedFields != null)
        {
            Iterator<String> fieldIds = sortedFields.keySet().iterator();
            while (fieldIds.hasNext())
            {
                String fieldId = fieldIds.next();
                CptField object = sortedFields.get(fieldId);
                if (objectRef != null && objectRef.equals(object.getObjectRef()))
                {
                    field = object;
                    break;
                }
            }
        }
        return field;
	}
	
	/**
	 * Returns the default value for {@link String} fieldId 
	 * @param fieldId
	 *         CptField's Id of corresponding business object. 
	 */
	public String getDefaultValueForField(String fieldId)
    {
	    CptField cptField  = null;
	    String value = null;
        if (this.sortedFields != null)
        {
            cptField = this.sortedFields.get(fieldId);
        }

        if (cptField !=  null)
        {
            value = cptField.getDefaultValue();
        }
        return value;
    }
	
	/**
     * Returns the default value for {@link String} objectRef 
     * @param objectRef
     *         CptField's objectReference of corresponding business object. 
     */
	public String getDefaultValueForObjReference(String objectRef)
	{
	    CptField field  = getFieldForObjectRef(objectRef);
	    String value = null;
	    if (field != null)
	    {
	        value = field.getDefaultValue();
	    }
        return value;
	}
	
	/**
	 * Returns a cloned instance for this business object.
	 * 
	 * @return newBusinessObject
	 * 		The cloned instance of {@link CptBusinessObject} 
	 */
	public Object clone()
	{
		CptBusinessObject newBusinessObject = new CptBusinessObject();
		newBusinessObject.setLabel(label);
		newBusinessObject.setFields(sortedFields);
		newBusinessObject.setAssociations(associations);
		newBusinessObject.setFixedDataSequence(isFixedDataSequence);
		newBusinessObject.setGroup(group);
		newBusinessObject.setHqlRef(hqlRef);
		newBusinessObject.setLink(link);
		newBusinessObject.setModule(module);
		newBusinessObject.setObjectRef(objectRef);
		newBusinessObject.setRequired(isRequired);
		newBusinessObject.setAllowedActions(allowedActions);
		newBusinessObject.setCustomizable(customizable);
		
		return newBusinessObject;
	}
	
    /**
     * Return the list of labels for the sortedFields in this business object group.
     * <p>
	 * @param isUser
	 * 	boolean type, if isUser true return user fields label list, else returns restricted fields label list.
     * @return list
     *  An <code>java.util.List</code> containing String of objectRef i.e Tablename.Fieldname
     *  corresponding to each  <code>CptField<code> object.
     * 	<java.util.ArrayList<java.lang.String>>
     */
    public List<String> getLabelsList(boolean isUser)
    {
        List<String> list = null;
        if (isUser)
        {
        	list = getLabelsList();
        }
        else if (this.sortedFields != null && this.sortedFields.size() > 0)
        {
            list = new ArrayList<String>();
            Iterator<String> itr = sortedFields.keySet().iterator();
            for (int i = 0; itr.hasNext(); i++)
            {
                String key = itr.next();
                CptField field = this.sortedFields.get(key);
                int fieldType = field.getFieldType();
                boolean isCalculated = field.isCalculated();
        		boolean isAggregate = field.isAggregate();
        		//--- Don't add system, calculated and aggregate fields ---
        		if (fieldType == UIConstants.SYSTEM || isCalculated || isAggregate)
        		{
        			continue;
        		}
        		else
        		{
        			list.add(field.getLabel());
        		}
            }
        }
        return list;
    }

    /**
     * Get the list of names for the sortedFields in this business object group.
     * <p>
     * @param isUser
	 *  boolean type, If true return user fields name list, else return restricted fields name list.
     * @return list
     *      An <code>java.util.List</code> containing String of objectRef i.e Tablename.Fieldname
     *       corresponding to each  <code>CptField<code> object.
     * <java.util.ArrayList<java.lang.String>>
     */
    public List<String> getNamesList(boolean isUser)
    {
        List<String> list = null;
        if (isUser)
        {
        	list = getNamesList();
        }
        else if (this.sortedFields != null && this.sortedFields.size() > 0)
        {
            list = new ArrayList<String>();
            Iterator<String> itr = sortedFields.keySet().iterator();
            for (int i = 0; itr.hasNext(); i++)
            {
                String key = itr.next();
                CptField field = this.sortedFields.get(key);
                int fieldType = field.getFieldType();
                boolean isCalculated = field.isCalculated();
        		boolean isAggregate = field.isAggregate();
        		//--- Don't add system, calculated and aggregate fields ---
        		if (fieldType == UIConstants.SYSTEM || isCalculated || isAggregate)
        		{
        			continue;
        		}
        		else
        		{
        			list.add(field.getId());
        		}
            }
        }
        return list;
    }
    
    /**
	* Set the boolean value true/false whether the CptBusinessObject
    * is customizable.
	* @param customize
	* <code>boolean</code> true/false value
	*/
	public void setCustomizable(boolean customize)
	{
		this.customizable = customize;
	}
	
	/**
	 * Get the boolean value true/false whether the CptBusinessObject
	 * is customizable.
	 * @return customize	
	 * <code>boolean</code> true/false value
	 */
	public boolean isCustomizable()
	{
		return this.customizable;
	}  
}