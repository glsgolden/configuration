package com.simple.configuration.model;



public interface UIConstants {

	public enum SortOrder { ASCENDING, DESCENDING, NONE }

    public static final int UNDEFINED = -1;
	public static final int GRID = 1;
	public static final int FORM = 2;
	public static final int GRAPH = 3;
	public static final int TREE = 4;
    public static final int MULTIVALUEFIELD = 5;
    public static final int MATCH = 6;
    public static final int HTML = 7;
    public static final int WIZARD = 8;
    public static final int TEMPLATE = 9;
    public static final int WORKFLOW = 10;
    public static final int WORKFLOW_STEP = 11;
    public static final int CONDITION = 12;

	public static final int CENTER = 1;
	public static final int RIGHT = 2;
	public static final int LEFT = 3;
	public static final int TOP = 4;
	public static final int BOTTOM = 5;
	
	public static final int SYSTEM = 1;
	public static final int USER = 2;
	
	public static final int ONE_ONE = 1;
	public static final int ONE_MANY = 2;
	public static final int MANY_ONE = 3;
	public static final int MANY_MANY = 4;

	public static final int ACTIONBAR = 5;
	public static final int SYSTEMBAR = 6;

	public static final int TEXTAREA = 1;
	public static final int TEXTFIELD = 2;
	public static final int LABEL = 3;
	public static final int IMAGE = 4;
	public static final int RADIOBUTTON = 5;
	public static final int CHECKBOX = 6;
	public static final int COMBOBOX = 7;
	public static final int LIST = 8;
    public static final int DOCUMENT = 9;
	public static final int REPORT = 10;
	public static final int SUGGESTIONBOX = 11;
	public static final int BUTTON = 12;
	public static final int ACTION = 13;
	public static final int ATTACHMENT = 14;
	public static final int SPINNER = 15;
	public static final int SUGGESTIONLISTBOX = 16;
	public static final int ASSIGN = 17;

	public static final int ASCENDING = 1;
	public static final int DESCENDING = 2;
	public static final int NONE = 3;

    //--- Constants used for column data type. ---
    public static final int DT_STRING = 1;
    public static final int DT_NUMERIC = 2;
	public static final int DT_DATETIME = 3;
    public static final int DT_IMAGE = 4;
    public static final int DT_BOOLEAN = 5;
    public static final int DT_EMAIL = 6;
    public static final int DT_PHONE = 7;
    public static final int DT_LONGSTRING = 8;
    public static final int DT_TEXTAREA = 9;
    public static final int DT_MONEY = 10;
    public static final int DT_LIST = 11;

    public static final int VISIBLE_ID = 1;
    public static final int PRIMARY_ID = 2;
    public static final int ASSOCIATE_ID = 3;

    //--- server side actions for Grid/Form ---
    public static final int POPULATE = 1;
    public static final int GET = 2;
    public static final int SET = 3;
    public static final int PAGING = 4;
    public static final int GOTO_PAGE = 5;
    public static final int FILTER = 6;
    public static final int SORT = 7;
    public static final int EXPORT_EXCEL = 8;
    public static final int RECORD_COUNTS = 9;
    public static final int SET_AND_CLEAR = 10;

    //--- reports
    public static final int REPORT_LAYOUT_PORTRAIT = 0;
    public static final int REPORT_LAYOUT_LANDSCAPE = 1;

    //--- orientation constants for the navigation bar ---
    public static final String VERTICAL_ORIENTATION = "vertical";
    public static final String HORIZONTAL_ORIENTATION = "horizontal";

    public static final int VER_ORIENTATION = 0;
    public static final int HORI_ORIENTATION = 1;

    public static final int READONLY = 1;
    public static final int READWRITE = 2;

    public static final int TREE_NAVIGATION = 1;
    public static final int FOLDERS_NAVIGATION = 2;
    
    /**
     * This is the default folder from which the theme would be loaded
     * */
    public static final String DEFAULT_THEME_FOLDER = "Default";
    
    //--- Grid rendering constants ---
    public static final int VISIBLE_COLUMNS = 1;
    public static final int HIDDEN_COLUMNS = 2;
    public static final int ALL_COLUMNS = 3;
    //--- Home page ---
    public static final String HOME_PAGE = "5"; 
    //---form customization----
	public static final String CALENDER = "calender";
}
