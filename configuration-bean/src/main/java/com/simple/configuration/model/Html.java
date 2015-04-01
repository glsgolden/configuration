package com.simple.configuration.model;

public class Html extends Id
{
    private String src;

    /**
     * Instantiate a new DHTML object.
     */
    public Html()
    {
        super();
        setType(HTML);
    }

    /**
     * Instantiate a new DHTML object.
     * <p>
     * @param src
     *      The HTML page source.
     */
    public Html(String src)
    {
        super();
        setType(HTML);
        this.src = src;
    }

    /**
     * Get the HTML source.
     * <p>
     * @return
     *      The HTML source.
     */
    public String getSrc()
    {
        return src;
    }

    /**
     * Set the HTML source
     * <p>
     * @param src
     *      The HTML source.
     */
    public void setSrc(String src)
    {
        this.src = src;
    }
    
    /**
     * Sets the uniqueId for the DHtml element.
     * 
     * @param parentId
     *          The uniqueId of the DPanel element.
     */
    public void setUniqueId(String parentId)
    {
        //create and set the uniqueId of the dHtml if not present already.
        super.setUniqueId(parentId);
    }
}
