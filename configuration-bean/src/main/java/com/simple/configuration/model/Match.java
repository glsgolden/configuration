package com.simple.configuration.model;

public class Match extends Id
{
    //--- The LHS Grid data set object. ---
    private Grid lhs;
    //--- The RHS Grid data set object. ---
    private Grid rhs;
    //--- Identifier object ref seperating LHS and RHS side data ---
    private String identifier;
    //--- identifier object ref value for LHS ---
    private String lhsIdentifierValue;
    //--- identifier object ref value for RHS ---
    private String rhsIdentifierValue;
    
    
    /**
     * 
     */
    public Match()
    {
        super();
        setType(MATCH);
    }
    
    /**
     * Initialize the DMatch object.
     */
    public Match(String id)
    {
        super(id);
        setType(MATCH);
    }
    
    /**
     * Initialize the DMatch object.
     * <p>
     * @param lhs
     *      The LHS Grid data set object.
     * @param rhs
     *      The RHS Grid data set object.
     */
    public Match(String id, Grid lhs, Grid rhs)
    {
        super(id);
        this.lhs = lhs;
        this.rhs = rhs;
        setType(MATCH);
    }

    /**
     * Get the LHS Grid definition.
     * <p>
     * @return
     *      The LHS Grid definition.
     */
    public Grid getLhs()
    {
        return lhs;
    }

    /**
     * Set the LHS Grid definition.
     * <p>
     * @param lhs
     *      The LHS Grid definition.
     */
    public void setLhs(Grid lhs)
    {
        this.lhs = lhs;
    }

    /**
     * Get the RHS Grid definition.
     * <p>
     * @return
     *      The RHS Grid definition.
     */
    public Grid getRhs()
    {
        return rhs;
    }

    /**
     * Set the RHS Grid definition.
     * <p>
     * @param rhs
     *      The RHS Grid definition.
     */
    public void setRhs(Grid rhs)
    {
        this.rhs = rhs;
    }

    /**
     * Get the identifier object reference for the match. The identifier is the Column whose value seperates the
     * lhs and rhs value.
     * <p>
     * @return
     *      The identifier object reference for the match.
     */
    public String getIdentifier()
    {
        return identifier;
    }

    /**
     * Set the identifier object reference for the match. The identifier is the Column whose value seperates the
     * lhs and rhs value.
     * <p>
     * @param identifier
     *      The identifier object reference for the match.
     */
    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    /**
     * Get the lhs side value for the indentifier object reference for the match.
     * <p>
     * @return
     *      The lhs side value for the identifier object reference for the match.
     */
    public String getLhsIdentifierValue()
    {
        return lhsIdentifierValue;
    }

    /**
     * Set the lhs side value for the indentifier object reference for the match.
     * <p>
     * @param lhsIdentifierValue
     *      The lhs side value for the identifier object reference for the match.
     */
    public void setLhsIdentifierValue(String lhsIdentifierValue)
    {
        this.lhsIdentifierValue = lhsIdentifierValue;
    }

    /**
     * Get the rhs side value for the indentifier object reference for the match.
     * <p>
     * @return
     *      The rhs side value for the identifier object reference for the match.
     */
    public String getRhsIdentifierValue()
    {
        return rhsIdentifierValue;
    }

    /**
     * Set the rhs side value for the indentifier object reference for the match.
     * <p>
     * @param rhsIdentifierValue
     *      The rhs side value for the identifier object reference for the match.
     */
    public void setRhsIdentifierValue(String rhsIdentifierValue)
    {
        this.rhsIdentifierValue = rhsIdentifierValue;
    }
    
    /**
     * clone DMatch Object
     */
    public Object clone()
    {
        Match newMatch = new Match();
        newMatch = (Match) super.clone(newMatch);
        
        newMatch.setLhs((Grid) this.getLhs().clone());
        newMatch.setRhs((Grid) this.getRhs().clone());
        
        newMatch.setIdentifier(this.getIdentifier());
        newMatch.setLhsIdentifierValue(this.getLhsIdentifierValue());
        newMatch.setRhsIdentifierValue(this.getRhsIdentifierValue());
        return newMatch;        
    }
    
    /**
     * Sets the uniqueId for the DMatch element.
     * 
     * @param parentId
     *          The uniqueId of the DPanel element.
     */
    public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the dMatch.
        super.setUniqueId(parentId);
        
        if (this.lhs != null)
        {
            this.lhs.setUniqueId(this.getUniqueId());
        }
        if (this.rhs != null)
        {
            this.lhs.setUniqueId(this.getUniqueId());
        }
    }
    
}
