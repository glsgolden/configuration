package com.simple.configuration.model;

public class Condition extends Id
{
    private static final long serialVersionUID = -5801893339443541614L;

    /**
     * <java.lang.String, java.lang.Integer>
     */
    public final static CptOrderedMap LOOKUP;

    //--- int mappings for constants ---
    public static final int EQUAL = 1;
    public static final int NOT_EQUAL = 2;
    public static final int GREATER_THAN = 3;
    public static final int GREATER_EQUAL = 4;
    public static final int LESS_THAN = 5;
    public static final int LESS_EQUAL = 6;
    public static final int EQUALS = 7;
    public static final int NOT_EQUALS = 8;
    public static final int STARTS_WITH = 9;
    public static final int CONTAINS = 10;
    public static final int IN = 11;
    public static final int NOT = 12;
    public static final int AND = 13;
    public static final int OR = 14;
    public static final int NIL = 15;
    public static final int CONSTANT = 16;
    public static final int FORMULA = 17;
    public static final int OBJECTREF = 18;
    public static final int SAME = 19;
    public static final int ANY = 20;
    public static final int SUMOFALL = 21;
    public static final int ENDS_WITH = 22;
    public static final int LIKE = 23;
    public static final int NOT_IN = 24;

    //--- Operator constants ---
    public static final String S_EQUAL = "=";
    public static final String S_NOT_EQUAL = "!=";
    public static final String S_GREATER_THAN = ">";
    public static final String S_GREATER_EQUAL = ">=";
    public static final String S_LESS_THAN = "<";
    public static final String S_LESS_EQUAL = "<=";
    public static final String S_EQUALS = "equals";
    public static final String S_NOT_EQUALS = "not equals";
    public static final String S_STARTS_WITH = "starts with";
    public static final String S_CONTAINS = "contains";
    public static final String S_IN = "IN";
    public static final String S_NOT = "<>";
    public static final String S_NIL = "NIL";
    public static final String S_ENDS_WITH = "ends with";
    public static final String S_LIKE = "LIKE";
    public static final String S_NOT_IN = "NOT IN";

    //--- Rules -  LHS/RHS type constants ---
    public static final String S_CONSTANT = "constant";
    public static final String S_FORMULA = "formula";
    public static final String S_OBJECTREF = "variable";

    //--- Rules - Occurances constants ---
    public static final String S_OCCUR_ANY = "any";
    public static final String S_OCCUR_SUMOFALL = "sumOfAll";

    //--- logical join constants ---
    public static final String S_AND = "AND";
    public static final String S_OR = "OR";

    //--- parenthesis ---
    public static final String OPEN_PARENTHESIS = "(";
    public static final String CLOSE_PARENTHESIS = ")";

    /**
     * required look ups stored in an map.
     */
    static
    {
        LOOKUP = new CptOrderedMap();
        LOOKUP.put(S_AND, new Integer(AND));
        LOOKUP.put(S_OR, new Integer(OR));
        LOOKUP.put(S_EQUAL, new Integer(EQUAL));
        LOOKUP.put(S_NOT_EQUAL, new Integer(NOT_EQUAL));
        LOOKUP.put(S_GREATER_THAN, new Integer(GREATER_THAN));
        LOOKUP.put(S_GREATER_EQUAL, new Integer(GREATER_EQUAL));
        LOOKUP.put(S_LESS_THAN, new Integer(LESS_THAN));
        LOOKUP.put(S_LESS_EQUAL, new Integer(LESS_EQUAL));
        LOOKUP.put(S_EQUALS, new Integer(EQUALS));
        LOOKUP.put(S_NOT_EQUALS, new Integer(NOT_EQUALS));
        LOOKUP.put(S_STARTS_WITH, new Integer(STARTS_WITH));
        LOOKUP.put(S_CONTAINS, new Integer(CONTAINS));
        LOOKUP.put(S_ENDS_WITH, new Integer(ENDS_WITH));
        LOOKUP.put(S_CONSTANT, new Integer(CONSTANT));
        LOOKUP.put(S_FORMULA, new Integer(FORMULA));
        LOOKUP.put(S_OBJECTREF, new Integer(OBJECTREF));
        LOOKUP.put(S_OCCUR_ANY, new Integer(ANY));
        LOOKUP.put(S_OCCUR_SUMOFALL, new Integer(SUMOFALL));
        LOOKUP.put(S_IN, new Integer(IN));
        LOOKUP.put(S_NOT, new Integer(NOT));
        LOOKUP.put(S_NIL, new Integer(NIL));
        LOOKUP.put(S_LIKE, new Integer(LIKE));
        LOOKUP.put(S_NOT_IN, new Integer(NOT_IN));
    }

    /**
     * The type of LHS condition expression. It can be an object ref, formula, constant, or list of condition objects.
     */
    private int lhsType;

    /**
     * The LHS object for the condition expression. This can be an object reference of a dataset or a constant variable.
     * This can be a <code>List</code> of <code>Condition</code> objects too.
     */
    private String lhs;

    /**
     * The lhs Formula object.
     */
    private Formula lhsFormula;

    /**
     * The expression operator. This can be ==, >, <, >=, <=, <>, startsWith, like.
     */
    private int operator;

    /**
     * The type of RHS condition expression. It can be an object ref, formula, constant, or list of condition objects.
     */
    private int rhsType;

    /**
     * The RHS object for the condition expression. This can be an object reference of a dataset or a constant variable.
     * This can be a <code>List</code> of <code>Condition</code> objects too.
     */
    private String rhs;

    /**
     * The rhs Formula object.
     */
    private Formula rhsFormula;

    /**
     * This is the logical join between condition expression. possible choices are AND and OR.
     */
    private int logicalJoin;

    /**
     * The lhs occurance type. This can be same=1, any=2, sumOfAll=3.
     */
    private int lhsOccurence;

    /**
     * The rhs occurance type. This can be same=1, any=2, sumOfAll=3.
     */
    private int rhsOccurence;

    /**
     * String to hold Open parenthesis
     */
    private String beginParenthesis;

    /**
     * String to hold Close parenthesis
     */
    private String closeParenthesis;

    /**
     * LHS data type
     * i.e. numeric = 2, string = 1, datatime = 3, etc.
     */
    private int lhsDataType;
    /**
     * RHS data type
     * i.e. numeric = 2, string = 1, datatime = 3, etc.
     */
    private int rhsDataType;
    /**
     * LHS field Id 
     */
    private String lhsId;
    /**
     * RHS field Id
     */
    private String rhsId;
    /**
     * Set the operation.
     */
    private String operation;
    /**
     * Set the relationship.
     */
    private String join;
    /**
     * The rhs dataset.
     * {@link Dataset}
     */
    private Dataset rhsDataset;
    /**
     * The boolean flag to indicate
     * the condition is static or dynamic.
     */
    private boolean isStatic;
    /**
     * The boolean flag to indicate
     * the condition is dependent on other or not.
     */
    private boolean isDependent;
    
    /**
     * Get an instance of the <code>Condition</code> object.
     */
    public Condition()
    {
        this.logicalJoin = NIL;
        this.lhsOccurence = SAME;
        this.rhsOccurence = SAME;
    }

    /**
     * Get an instance of the <code>Condition</code> object given the following parameters.
     * <p>
     * @param lhs
     *          The LHS object for the condition expression.
     * @param operator
     *          The expression operator.
     * @param rhs
     *          The RHS object for the condition expression.
     * @param logicalJoin
     *          The logical join between consition expressions.
     */
    public Condition(String lhs, int operator, String rhs, int logicalJoin)
    {
        super();
        this.lhs = lhs;
        this.operator = operator;
        this.rhs = rhs;
        this.logicalJoin = logicalJoin;
    }

    /**
     * Get the LHS object for the condition expression.
     * <p>
     * @return <code>java.lang.String</code>
     *      the object reference for the LHS object.
     *
     */
    public String getLhs()
    {
        return lhs;
    }

    /**
     * Set the LHS object for the condition expression.
     * <p>
     * @param <code>java.lang.String</code>
     *      the object reference for the LHS object.
     *
     */
    public void setLhs(String data)
    {
        this.lhs = data;
        setLhsOccurence();
    }

    /**
     * Get the logical join between condition expression. possible choices are AND and OR.
     * <p>
     * @return int
     *      the corresponding int value mapped to the join value in the look-up map.
     */
    public int getLogicalJoin()
    {
        return logicalJoin;
    }

    /**
     * Set the logical join between condition expression. possible choices are AND and OR.
     * <p>
     * @param int
     *      the corresponding int value mapped to the join value in the look-up map.
     */
    public void setLogicalJoin(int logicalJoin)
    {
        this.logicalJoin = logicalJoin;
        String stJoin = (String) LOOKUP.getKey(new Integer(logicalJoin));
        this.join = stJoin;
    }

    /**
     * Get the logical join between condition expression. possible choices are AND and OR.
     * <p>
     * @return int
     *      the corresponding int value mapped to the operator value in the look-up map.
     */
    public int getOperator()
    {
        return operator;
    }

    /**
     * Set the logical join between condition expression. possible choices are AND and OR.
     * <p>
     * @param int
     *      the corresponding int value mapped to the operator value in the look-up map.
     */
    public void setOperator(int operator)
    {
        this.operator = operator;
        String op = (String) LOOKUP.getKey(new Integer(operator));
        this.operation = op;
    }

    /**
     * Set the expression operator.
     * <p>
     * @param operator <code>java.lang.String</code>
     *  The operator can be ==, >, <, >=, <=, <>, startsWith, like, IN.
     *  the int value mapped to the param String, from the look-up map.
     */
    public void setOperator(String operator)
    {
        if (LOOKUP.containsKey(operator))
        {
            Integer opr = (Integer) LOOKUP.get(operator);
            this.operator = opr.intValue();
            this.operation = operator;
        }
        else
        {
            this.operator = EQUALS;
        }
    }

    /**
     * Get the RHS object for the condition expression.
     * <p>
     * @return <code>java.lang.String</code>
     *      the object reference for the RHS object.
     *
     */
    public String getRhs()
    {
        return rhs;
    }

    /**
     * Set the RHS object for the condition expression.
     * <p>
     * @param <code>java.lang.String</code>
     *      the object reference for the RHS object.
     *
     */
    public void setRhs(String data)
    {
        if (this.rhsDataset == null)
        {
            this.rhsDataset = new Dataset();
        }
        this.rhsDataset.setDatavalue(data);
        this.rhs = data;
        setRhsOccurence();
    }

    /**
     * Set the logical join between condition expression,
     * given the equivalent String representation.
     * Possible choices are AND and OR.
     * <p>
     * @param <code>java.lang.String</code>
     *      sets an int value corresponding to the param string, from the look-up map.
     */
    public void setLogicalJoin(String join)
    {
        if (LOOKUP.containsKey(join))
        {
            Integer opr = (Integer) LOOKUP.get(join);
            this.logicalJoin = opr.intValue();
        }
        else
        {
            this.logicalJoin = NIL;
        }
    }

    /**
     * Get the LHS formula.
     * <p>
     * @return <code>com.capgent.cpt.client.common.dto.Formula</code>
     *      the formula object containing the formula details.
     */
    public Formula getLhsFormula()
    {
        return lhsFormula;
    }

    /**
     * Set the LHS formula object.
     * <p>
     * @param lhsFormula <code>com.capgent.cpt.client.common.dto.Formula</code>
     *      the formula object containing the formula details.
     *
     */
    public void setLhsFormula(Formula lhsFormula)
    {
        this.lhsFormula = lhsFormula;
    }

    /**
     * Get the type of LHS condition expression for the LHS object.
     * <p>
     * @return int
     *      gets an int value corresponding to string value mapped in the look-up map.
     *
     */
    public int getLhsType()
    {
        return this.lhsType;
    }

    /**
     * Set the type of LHS expression; i.e. "constant", "formula", or "variable". Default is "constant".
     * <p>
     * @param type <code>java.lang.String</code>
     *      The LHS Type; i.e. "constant", "formula", or "variable"
     */
    public void setLhsType(String type)
    {
        if (LOOKUP.containsKey(type))
        {
            Integer opr = (Integer) LOOKUP.get(type);
            this.lhsType = opr.intValue();
        }
        else
        {
            this.lhsType = CONSTANT;
        }
    }

    /**
     * Set the type of LHS expression; i.e. Condition.CONSTANT, Condition.FORMULA, or Condition.OBJECTREF.
     * Default is Condition.CONSTANT
     * <p>
     * @param type <code>java.lang.String</code>
     *      The LHS Type; i.e. Condition.CONSTANT, Condition.FORMULA, or Condition.OBJECTREF.
     */
    public void setLhsType(int lhsType)
    {
        this.lhsType = lhsType;
    }

    /**
     * Get the RHS formula.
     * <p>
     * @return <code>com.capgent.cpt.client.common.dto.Formula</code>
     *      the formula object containing the formula details.
     */
    public Formula getRhsFormula()
    {
        return rhsFormula;
    }

    /**
     * Set the RHS formula object.
     * <p>
     * @param rhsFormula <code>com.capgent.cpt.client.common.dto.Formula</code>
     *      the formula object containing the formula details.
     *
     */
    public void setRhsFormula(Formula rhsFormula)
    {
        this.rhsFormula = rhsFormula;
    }

    /**
     * Get the type of RHS condition expression for the RHS object.
     * <p>
     * @return int
     *      gets an int value corresponding to string value mapped in the look-up map.
     *
     */
    public int getRhsType()
    {
        return this.rhsType;
    }

    /**
     * Set the type of RHS expression; i.e. "constant", "formula", or "variable". Default is "constant".
     * <p>
     * @param type <code>java.lang.String</code>
     *      The RHS Type; i.e. "constant", "formula", or "variable"
     */
    public void setRhsType(String type)
    {
        if (LOOKUP.containsKey(type))
        {
            Integer opr = (Integer) LOOKUP.get(type);
            this.rhsType = opr.intValue();
        }
        else
        {
            this.rhsType = CONSTANT;
        }
    }

    /**
     * Set the type of RHS expression; i.e. Condition.CONSTANT, Condition.FORMULA, or Condition.OBJECTREF.
     * Default is Condition.CONSTANT
     * <p>
     * @param type <code>java.lang.String</code>
     *      The RHS Type; i.e. Condition.CONSTANT, Condition.FORMULA, or Condition.OBJECTREF.
     */
    public void setRhsType(int rhsType)
    {
        this.rhsType = rhsType;
    }

   /**
     * Get the LHS occurence type. It can be Condition.SAME, Condition.ANY, or Condition.SUMOFALL.
     * By default it is Condition.SUMOFALL. Used by relational rules.
     * <p>
     * @return int
     *      the LHS occurence type. It can be Condition.SAME, Condition.ANY, or Condition.SUMOFALL.
     */
    public int getLhsOccurence()
    {
        return lhsOccurence;
    }

    /**
     * Set the LHS occurence type to Any or SumOfAll. By default the value is set as same.
     * if LHS occurence type is present then extract the lhs value from the "(" ")" brackets.
     * Used for relation rules.
     */
    private void setLhsOccurence()
    {
        int begin = lhs.indexOf('(');
        int end = lhs.lastIndexOf(')');
        //--- Check if lhs has occurence type defined. ---
        if (begin != -1)
        {
            String occurenceType = lhs.substring(begin+1, end);
            if (LOOKUP.containsKey(occurenceType))
            {
                //--- Set the occurence type ---
                Integer occur = (Integer) LOOKUP.get(occurenceType);
                this.lhsOccurence = occur.intValue();
                this.setLhsOccurence(this.lhsOccurence);
                //--- Extract the lhs value ---
                this.lhs = lhs.substring(end+1, this.lhs.length());
            }
        }
    }

    /**
     * Set the LHS Occurence type; i.e. SAME, ANY, SUMOFALL.
     * <p>
     * @param occurence
     *      The int type for the LHS Occurence; i.e SAME, ANY, SUMOFALL
     */
    public void setLhsOccurence(int occurence)
    {
        this.lhsOccurence = occurence;
    }

    /**
     * Get the RHS occurence type. It can be Condition.SAME, Condition.ANY, or Condition.SUMOFALL.
     * By default it is Condition.SUMOFALL. Used by relational rules.
     * <p>
     * @return int
     *      the RHS occurence type. It can be Condition.SAME, Condition.ANY, or Condition.SUMOFALL.
     */
    public int getRhsOccurence()
    {
        return rhsOccurence;
    }

    /**
     * Set the RHS occurence type to SAME, ANY, SUMOFALL. By default the value is set as same.
     * if RHS occurence type is present then extract the lhs value from the "(" ")" brackets.
     * Used for relation rules.
     */
    private void setRhsOccurence()
    {
        int begin = rhs.indexOf('(');
        int end = rhs.lastIndexOf(')');
        //--- Check if lhs has occurence type defined. ---
        if (begin != -1)
        {
            String occurenceType = rhs.substring(begin+1, end);
            if (LOOKUP.containsKey(occurenceType))
            {
                //--- Set the occurence type ---
                Integer occur = (Integer) LOOKUP.get(occurenceType);
                this.rhsOccurence = occur.intValue();
                //--- Extract the lhs value ---.
                this.rhs = rhs.substring(end+1, this.rhs.length());
            }
            this.setRhsOccurence(this.rhsOccurence);
        }
    }

    /**
     * Set the RHS Occurence type; i.e. SAME, ANY, SUMOFALL.
     * <p>
     * @param occurence
     *      The int type for the RHS Occurence; i.e SAME, ANY, SUMOFALL
     */
    public void setRhsOccurence(int occurence)
    {
        this.rhsOccurence = occurence;
    }

    /**
     * Get Open parenthesis, if any.
     * <p>
     * @return
     *      Open Parenthesis, if any. Or null.
     */
    public String getBeginParenthesis()
    {
        return beginParenthesis;
    }

    /**
     * Set Open parenthesis, if any.
     * <p>
     * @param parenthesis
     *      Open Parenthesis, if any. Or null.
     */
    public void setBeginParenthesis(String parenthesis)
    {
        this.beginParenthesis = parenthesis;
    }

    /**
     * Get Close parenthesis, if any.
     * <p>
     * @return
     *      Close Parenthesis, if any. Or null.
     */
    public String getCloseParenthesis()
    {
        return closeParenthesis;
    }

    /**
     * Set Close parenthesis, if any.
     * <p>
     * @param parenthesis
     *      Close Parenthesis, if any.
     */
    public void setCloseParenthesis(String closeParenthesis)
    {
        this.closeParenthesis = closeParenthesis;
    }

    /**
     * get LHS data type 
     * @return int
     *      i.e. numeric = 2, string = 1, datatime = 3, etc.
     */
    public int getLhsDataType()
    {
        return lhsDataType;
    }

    /**
     * set LHS data type
     * @param dataType
     *          int i.e. numeric = 2, string = 1, datatime = 3, etc.
     */
    public void setLhsDataType(int lhsDataType)
    {
        this.lhsDataType = lhsDataType;
    }
    
    /**
     * get RHS field data type
     * @return int
     *           i.e. numeric = 2, string = 1, datatime = 3, etc.
     */
    public int getRhsDataType()
    {
        return rhsDataType;
    }

    /**
     * Set RHS field data type
     * @param rhsDataType
     *          int i.e. numeric = 2, string = 1, datatime = 3, etc.
     */
    public void setRhsDataType(int rhsDataType)
    {
        this.rhsDataType = rhsDataType;
    }

    /**
     * Get LHS field id
     * @return lhsId
     *          String
     */
    public String getLhsId()
    {
        return lhsId;
    }

    /**
     * Set LHS field id
     * @param lhsId
     *          String
     */
    public void setLhsId(String lhsId)
    {
        this.lhsId = lhsId;
    }

    /**
     * Get RHS field id
     * @return rhsId
     *          String
     */
    public String getRhsId()
    {
        return rhsId;
    }

    /**
     * Set RHS field id
     * @param rhsId
     *          String
     */
    public void setRhsId(String rhsId)
    {
        this.rhsId = rhsId;
    }

    /**
     * Deep clone the current object.
     * <p>
     * @return Object
     *      Deep clone of the current object.
     */
    public Object clone()
    {
        Condition newVal = new Condition(this.lhs, this.operator, this.rhs, this.logicalJoin);
        newVal = (Condition)super.clone(newVal);
        newVal.setLhsType(new Integer(this.lhsType).toString());
        newVal.setRhsType(new Integer(this.rhsType).toString());
        newVal.setLhsFormula(this.lhsFormula);
        newVal.setRhsFormula(this.rhsFormula);
        newVal.setBeginParenthesis(this.beginParenthesis);
        newVal.setCloseParenthesis(this.closeParenthesis);
        newVal.setLhsDataType(this.lhsDataType);
        newVal.setRhsDataType(this.rhsDataType);
        newVal.setLhsId(this.lhsId);
        newVal.setRhsId(this.rhsId);
        return newVal;
    }

    /**
     * Get the operation for condition.
     * <p>
     * @return operation
     *      The operator(=, > etc.) for the condition
     */
    public String getOperation()
    {
        return operation;
    }

    /**
     * Set the operation for condition.
     * <p>
     * @param operation
     *       The operator(=, > etc.) for the condition
     */
    public void setOperation(String operation)
    {
        this.operation = operation;
        Integer op = (Integer) LOOKUP.get(operation);
        this.operator = op.intValue();
    }    

    /**
     * Get the relationship between conditions.
     * <p>
     * @return join
     *      The relation (AND/OR).
     */
    public String getJoin()
    {
        return join;
    }

    /**
     * Set the relationship between conditions.
     * <p>
     * @param join
     *      The relation (AND/OR).
     */
    public void setJoin(String join)
    {
        this.join = join;
        Integer lJoin = (Integer) LOOKUP.get(join);
        this.logicalJoin = lJoin.intValue();
    }

    /**
     * Get the lhs dataset.
     * <p>
     * @return lhsDataset.
     *      {@link Dataset}
     */
    public Dataset getRhsDataset()
    {
        return rhsDataset;
    }

    /**
     * Set the lhs dataset.
     * <p>
     * @param lhsDataset.
     *      {@link Dataset}
     */
    public void setRhsDataset(Dataset rhsDataset)
    {
        this.rhsDataset = rhsDataset;
    }

    /**
     * The boolean flag.
     * <p>
     * @return isStaic
     *      Returns true if condition is static.
     *      Return false if condition is dynamic.
     */
    public boolean isStatic()
    {
        if (this.rhsDataset != null)
        {
            isStatic = this.rhsDataset.isStatic();
        }
        return isStatic;
    }

    /**
     * The boolean flag.
     * <p>
     * @param isStaic
     *      The boolan value.
     */
    public void setStatic(boolean isStatic)
    {
        this.isStatic = isStatic;
    }

    /**
     * The boolean flag.
     * <p>
     * @return isDependent
     *      The boolan value.
     */
    public boolean isDependent()
    {
        if (this.rhsDataset != null)
        {
            if (this.rhsDataset.getDatasource() != null)
            {
                isDependent = true;
            }
        }
        return isDependent;
    }

    /**
     * The boolean flag.
     * <p>
     * @param isDependent
     *      The boolan value.
     */
    public void setDependent(boolean isDependent)
    {
        this.isDependent = isDependent;
    }
}