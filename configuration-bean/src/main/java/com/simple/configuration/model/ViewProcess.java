package com.simple.configuration.model;

public class ViewProcess extends Id
{
    /**
     * The name of class that holds routines for required 
     * process.
     */
    private String className;
    /**
     *  The name of method that needs to be 
     *  applied for the process. 
     *  processes.
     */
    private String methodName;
    /**
     * Type of process 
     * 1 - transform
     * 2 - validate
     */
    private int processType;
    
    /**
     * Initialize an new instance of DviewProcess.
     */
    public ViewProcess(){}
    
    /** 
     * Converts the DViewProcess into a String of the following format:<br/>
     * <code>DViewProcess[className=&lt;value&gt;,methodName=&lt;value&gt;,..]</code>
     * <p>Please note that {@link #valueOf(String)} method is dependent on the output generated here.
     */
    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder("DViewProcess[");        
        str.append("className=" + getClassName() + ",");
        str.append("methodName=" + getMethodName() + ",");
        str.append("processType=" + String.valueOf(processType));
        str.append("]");
        return str.toString();
    }
    
    /**
     * Method that converts a String to a DAttachInformation object,
     * <p> Note that this string is based on the {@link #toString()} method
     *  
     * @param strAttachInformation the DAttachInformation String to be converted into an object
     * 
     * @return DAttachInformation based on the String processed, function will return null if parsing fails.
     */
    public static ViewProcess valueOf(String strDViewProcess)
    {
    	ViewProcess dViewProcess = new ViewProcess();
        try
        {
            if (!(strDViewProcess.startsWith("DViewProcess[") && strDViewProcess.endsWith("]")))
            {
                throw new IllegalArgumentException("Invalid String");
            }
            strDViewProcess = strDViewProcess.substring(13, strDViewProcess.length() - 1);
            String[] mainTokens = strDViewProcess.split(",");
            for (int mainTokenWalker = 0; mainTokenWalker < mainTokens.length; mainTokenWalker++)
            {
                String[] attribValue = mainTokens[mainTokenWalker].split("=");
                if (attribValue[0].equalsIgnoreCase("className"))
                {
                    String value = attribValue[1];
                    dViewProcess.setClassName(value);
                }
                else if (attribValue[0].equalsIgnoreCase("methodName"))
                {
                    String value = attribValue[1];
                    dViewProcess.setMethodName(value);
                }
                else if (attribValue[0].equalsIgnoreCase("processType"))
                {
                    String value = attribValue[1];
                    int pType = Integer.parseInt(value);
                    dViewProcess.setProcessType(pType);
                }
                else
                {
                    throw new IllegalArgumentException("Invalid property: " + attribValue[0]);
                }
            }
            
        } catch (Exception e)
        {
            //System.out.println("Exception " + e);
            return null;
        }
        return dViewProcess;
    }
    
    /**
     * Get name of class that holds routines for required 
     * process.
     * <p>
     * @return className
     *      <code>String</code> fully qualified name of the class.
     */
    public String getClassName()
    {
        return className;
    }
    
    /**
     * Set name of class that holds routines for required 
     * process.
     * <p>
     * @param className
     *      <code>String</code> fully qualified name of the class.
     */
    public void setClassName(String className)
    {
        this.className = className;
    }
    
    /**
     * Get name of method that needs to be applied to the
     * process.
     * <p>
     * @return methodName
     *      <code>String</code> name of the method.
     */
    public String getMethodName()
    {
        return methodName;
    }

    /**
     * Set name of method that needs to be applied to the
     * process.
     * <p>
     * @param methodName
     *      <code>String</code> name of the method.
     */
    public void setMethodName(String methodName)
    {
        this.methodName = methodName;
    }
    
    /**
     * Get the process type
     * i.e  VALIDATE_PROCESS_TYPE = 2;
     *      TRANSFORM_PROCESS_TYPE = 1;
     * <p>
     * @return processType
     */
    public int getProcessType()
    {
        return processType;
    }
    
    /**
     * Set the process type
     * i.e  VALIDATE_PROCESS_TYPE = 2;
     *      TRANSFORM_PROCESS_TYPE = 1;
     * <p>
     * @return processType
     */
    public void setProcessType(int processType)
    {
        this.processType = processType;
    }   
    
    public static void main(String[] args)
    {
    	ViewProcess process = new ViewProcess();
    	process.setClassName("GridHelper");
    	process.setMethodName("setInvoice");
    	process.setProcessType(1);
    	System.out.println(process);
    	ViewProcess process2 = ViewProcess.valueOf(process.toString());
    	System.out.println(process2);
    }
}