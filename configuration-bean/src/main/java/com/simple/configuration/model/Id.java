package com.simple.configuration.model;


public class Id implements UIConstants 
{
    private static final long serialVersionUID = -5471669140755591319L;
	
    /**
     * string representing the Id of the entity.
     */
    private String id;
    
    /**
     * The type of the entity.
     */
	private int type;
	
	/**
	 * string representing the unique Id of the entity.
	 */
	private String uniqueId;

    public Id() 
	{
		this.type = UNDEFINED;
	}

	public Id(String id) 
	{
		this.id = id;
		this.type = UNDEFINED;
	}

	/**
     *  Gets the id of the element.
     *  
     * @return id
     *        id of the element. 
     */
	public String getId() 
	{
		return id;
	}

	/**
     * Sets the id for the element.
     * <p>
     * @param id
     *          The id of the element.
     */
	public void setId(String id) 
	{
		this.id = id;
	}

	/**
     *  Gets the type of the element.
     *  
     * @return type
     *        type of the element. 
     */
	public int getType() 
	{
		return type;
	}

	/**
     * Sets the type for the element.
     * <p>
     * @param type
     *          The type type of the element.
     */
	public void setType(int type) 
	{
		this.type = type;
	}
	
	/**
	 *  Gets the uniqueId of the element.
	 *  
	 * @return uniqueId
	 *        String representing the uniqueId of the element. 
	 */
	public String getUniqueId()
    {
        return uniqueId;
    }

    /**
     * Sets the uniqueId for the element.
     * <p>
     * @param parentId
     *          The unique Id of the parent element.
     */
    public void setUniqueId(String parentId)
    {
        if (this.uniqueId == null)
        {
            if (parentId == null)
            {
                this.uniqueId = this.id;
            }
            else
            {
                this.uniqueId = parentId + "." + this.id;
            }
        }
    }

    /**
     * Sets the attributes for the entity.
     * <p>
     * @return Object
     *          The cloned instance.
     */
    public Object clone(Id entity)
    {
        if (entity == null)
        {
           entity = new Id();
        }
        entity.id = this.id;
        entity.type = this.type;
        entity.uniqueId = this.uniqueId;
        return entity;
    }
}
