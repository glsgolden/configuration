package com.simple.configuration.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The Formula class holding the definition of the formula used. 
 */
public class Formula
{
    /**
     * 
     */
    private static final long serialVersionUID = -3507167723836868335L;
    
    //--- LHS for the formula ---
    private String lhs;
    //--- RHS for the formula ---
    private String rhs;
    //--- The formula operator ---
    private int operator;
    //--- The type of LHS for the formula ---
    private int lhsType;
    //--- The type of RHS for the formula ---
    private int rhsType;
    //--- LHS percentage ---
    private float lhsPercent;
    //--- RHS percentage ---
    private float rhsPercent;
    //--typeArgs <java.lang.String, java.lang.Integer> 
    /**
     * 
     * <java.lang.String,java.lang.Integer>
     */

    private Map<String,Integer> operators;
    //--- More information regarding the formula ---
    private String info1;
 
    //--- Constants used for lhs and rhs type ---
    public static final int FORMULA = 1;
    public static final int CONSTANT = 2;
    public static final int OBJREF = 3;
    
    //--- Constants used for operator ---
    public static final int ADD = 1;
    public static final int SUB = 2;
    public static final int DIV = 3;
    public static final int MUL = 4;
    public static final int MOD = 5;
    public static final int PERCENT = 6;
    public static final int ABS = 7;
    
    //--- Constants used for actual strings used in formula statement ---
    public static final String S_ADD = "+";
    public static final String S_SUB = "-";
    public static final String S_MUL = "*";
    public static final String S_DIV = "/";
    public static final String S_MOD = "\\";
    public static final String S_PERCENT = "%";
    public static final String S_ABS = "abs";
    public static final String S_CONCAT = "concat";
    public static final String BEGIN = "(";
    public static final String END = ")";
    
    /**
     * Instantiate the Formula object.
     */
    public Formula()
    {
        operators = new HashMap<String,Integer>();
        operators.put(S_ADD,new Integer(ADD));
        operators.put(S_SUB,new Integer(SUB));
        operators.put(S_MUL,new Integer(MUL));
        operators.put(S_DIV,new Integer(DIV));
        operators.put(S_MOD,new Integer(MOD));
        operators.put(S_PERCENT,new Integer(PERCENT));
        operators.put(S_ABS,new Integer(ABS));
    }

    /**
     * Get the LHS for the formula.
     * @return The LHS for the formula.
     */
    public String getLhs()
    {
        return lhs;
    }

    /**
     * Set the LHS for the formula.
     * @param The LHS for the formula.
     */
    public void setLhs(String lhs)
    {
        this.lhs = lhs;
    }

    /**
     * Get the formula operator.
     * @return The formula operator.
     */
    public int getOperator()
    {
        return operator;
    }

    /**
     * Set the formula operator.
     * @param The formula operator.
     */
    public void setOperator(int operator)
    {
        this.operator = operator;
    }
    
    /**
     * Get the formula operator given the equivalent String representation.
     * @param The String formula operator.
     */
    public void setOperator(String opr)
    {
        Integer operatorValue = (Integer) operators.get(opr);
        this.operator = operatorValue.intValue();
    }

    /**
     * Get the RHS for the formula.
     * @return The RHS for the formula.
     */
    public String getRhs()
    {
        return rhs;
    }

    /**
     * Set the RHS for the formula.
     * @param The RHS for the formula.
     */
    public void setRhs(String rhs)
    {
        this.rhs = rhs;
    }

    /**
     * Get percent value for LHS.
     * @return percent value for LHS.
     */
    public float getLhsPercent()
    {
        return lhsPercent;
    }

    /**
     * Set percent value for LHS.
     * @param percent value for LHS.
     */
    public void setLhsPercent(float lhsPercent)
    {
        this.lhsPercent = lhsPercent;
    }

    /**
     * Get percent value for RHS.
     * @return percent value for RHS.
     */
    public float isRhsPercent()
    {
        return rhsPercent;
    }

    /**
     * Set percent value for RHS.
     * @param percent value for RHS.
     */
    public void setRhsPercent(float rhsPercent)
    {
        this.rhsPercent = rhsPercent;
    }
    
    /**
     * Get percent value for RHS.
     * @return percent value for RHS.
     */
    public float getRhsPercent()
    {
        return rhsPercent;
    }

    /**
     * Get the type of LHS for the formula; i.e. Constant, object ref or another formula.
     * @return the type of LHS for the formula.
     */
    public int getLhsType()
    {
        return lhsType;
    }

    /**
     * Set the type of LHS for the formula; i.e. Constant, object ref or another formula.
     * @param the type of LHS for the formula.
     */
    public void setLhsType(int lhsType)
    {
        this.lhsType = lhsType;
    }

    /**
     * Get the type of RHS for the formula; i.e. Constant, object ref or another formula.
     * @return the type of RHS for the formula.
     */
    public int getRhsType()
    {
        return rhsType;
    }

    /**
     * Set the type of RHS for the formula; i.e. Constant, object ref or another formula.
     * @param the type of RHS for the formula.
     */
    public void setRhsType(int rhsType)
    {
        this.rhsType = rhsType;
    }
    
    /**
     * Get more information regarding the formula.
     * <p>
     * @return More information regarding the formula.
     */
    public String getInfo1()
    {
        return info1;
    }

    /**
     * Set more information regarding the formula.
     * <p>
     * @param info1
     *              More information regarding the formula.
     */
    public void setInfo1(String info1)
    {
        this.info1 = info1;
    }

    /**
     * Get the String representation of the formula object.
     */
    public String toString()
    {
        StringBuffer buff = new StringBuffer();
        buff.append("lhs - ");
        buff.append(lhs);
        buff.append(", type - ");
        buff.append(lhsType);
        if (lhsPercent > 0.0 )
        {
            buff.append(", percent - ");
            buff.append(lhsPercent);
        }
        buff.append("\nrhs - ");
        buff.append(rhs);
        buff.append(", type - ");
        buff.append(rhsType);
        if (rhsPercent > 0.0)
        {
            buff.append(", percent - ");
            buff.append(rhsPercent);
        }
        buff.append("\noperator - ");
        buff.append(operator);
        if (info1 != null)
        {
            buff.append("\ninfo1 - ");
            buff.append(info1);
        }
        return buff.toString();
    }
    
}
