package com.simple.configuration.model;

public class Tree extends Node {

	private static final long serialVersionUID = 3550795472436942353L;

	//--- Tree definition from presentation.xsd. By default Tree is a node. ---
	public Tree() {
		super();
		setType(TREE);
	}
	
	/**
     * Sets the uniqueId for the DTree element.
     * 
     * @param parentId
     *          The uniqueId of the DPanel element.
     */
	public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the dTree if not present already.
	    super.setUniqueId(parentId);
    }
}
