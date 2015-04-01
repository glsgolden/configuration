package com.simple.configuration.model;

public interface CptClientConstants
{
    //--- NUMERIC CONSTANTS ---
    
    //--- dimensions ---
    static final int CORNER_iWIDTH = 20;
    static final int CORNER_iHEIGHT = 25;
    //--- dimensions for right click popup ---  
    static final String POPUPCORNER_WIDTH = "19px";
    static final String POPCORNER_HEIGHT = "19px";
      
    //--- charac length ---
    static final int FROM_TEXT = 100;
    static final int TO_TEXT = 1000;
    static final int BODY_TEXT = 4000;
    
    //--- pagination ---
    static final int GOTO_FIRST = 0;
    static final int GOTO_NEXT = 1;
    static final int GOTO_PREVIOUS = 2;
    static final int GOTO_LAST = 3;
    
    //--- sort ---
    static final int SORT_NONE = 0;
    static final int SORT_ASCENDING = 1;
    static final int SORT_DESCENDING = 2;
    
    //--- modes ---
    static final int NEW_MODE = 1;
    static final int EDIT_MODE = 2;
    static final int VIEW_MODE = 3;
    static final int DISABLE_MODE = 4;

    //--- accessory numeric constants (alphabetical order) ---
    static final int ACTION_DETAILS = 4;
    static final int ACCESS_DETAILS = 2;
    static final int DATA_DETAILS = 3;
    static final int GET_GENERIC_DETAILS = 2;
    static final int GET_ROLE_DETAILS = 3;
    static final int LIST_ROLES = 1;
    static final int SAVE_ROLE = 4;
    static final int USER_DETAILS = 1;
    
    // --- constants for the folder selection---
    static final int FOLDER_SELECTED = 1;
    static final int FOLDER_PARTIAL_SELECTED = 2;
    static final int FOLDER_DESELECTED = 0;
     
    //--- STRING CONSTANTS ---
    /**
     * to reprsent the current system date
     */
    public static final String SYSDATE = "sysdate";
    public static final String USER = "User";
    public static final String ROLE = "Role";
    public static final String USER_ACTION = "User";
    public static final String SYSTEM_ACTION = "System";
    
  //--- tooltips (alphabetical order) ---
    public static final String TOOLTIP_BACK = "Back";
    public static final String TT_BROWSE = "Browse";
    public static final String TOOLTIP_CLOSE = "Close";
    public static final String TOOLTIP_CANCEL = "Cancel";
    public static final String TOOLTIP_CLEAR = "Clear";
    public static final String TOOLTIP_EXCEL = "Export to Excel";
    public static final String TOOLTIP_EDITTEMPLATE = "Edit Template";
    public static final String TOOLTIP_EDIT = "Edit";
    public static final String TOOLTIP_FILTER = "Column Data Filter";
    public static final String TT_GENERATE_REPORT = "Show Report";
    public static final String TT_MOVELEFT = "Move Left";
    public static final String TT_MOVE_ALLLEFT = "Move All Left";
    public static final String TT_MOVE_ALLRIGHT = "Move All Right";
    public static final String TT_MOVETOP = "Move Top";
    public static final String TT_MOVEBOTTOM = "Move Last";
    public static final String TOOLTIP_MOVEUP = "Move Up";
    public static final String TOOLTIP_MOVEDOWN = "Move Down";
    public static final String TT_MINIMIZE = "Minimize";
    public static final String TOOLTIP_MOVERIGHT = "Move Right";
    public static final String TOOLTIP_NEW = "New";
    public static final String TOOLTIP_NEWTEMPLATE = "New Template";
    public static final String TOOLTIP_NEXT = "Next";
    public static final String TOOLTIP_PDF_REPORT = "PDF Report Generator";
    public static final String TOOLTIP_SAVE = "Save";
    public static final String TOOLTIP_TEMPLATE = "Templates";
    public static final String TT_EDITREPORT = "Edit Report";
    public static final String TT_NEWREPORT = "New Report";
    public static final String TT_RUNREPORT = "Show Report";
    public static final String TOOLTIP_OK = "Ok";
    public static final String TOOLTIP_TODO = "To Do";
    public static final String CENT_PERCENT = "100%";
    public static final String PX = "px";
    public static final String TT_REPORT = "Report";
    public static final String TT_MAXIMIZE = "Maximize";
    public static final String TOOLTIP = "tooltip";
    public static final String CAPTION = "caption";
    
    public static final String VIEWTYPE_USER = "user";
    public static final String VIEWTYPE_SYSTEM = "system";
    
    public static final String TAB_WIDTH = "125px";
    public static final String TASK = "Todo";
    

	//-- Data Dictionary Form --
	public static final String DATADICTIONARY_FORM = "datadictionaryForm";
	

	 //--- Form customization constants. --
	public static String SAVE_CUSTOMIZATION = "SaveCustomization";

	 //--- Form customization constants. --
	public static String CANCEL_CUSTOMIZATION = "CancelCustomization";
	public static String EMPTY = "empty";
	public static final String DATADICTIONARY = "DATADICTIONARY";
	public static final String STATUS_DETAILS = "statusDetails";
	public static final String AMPERSAND = "amp*~";
	
	 //--- Form customization constants. ---
	public static String CUSTOMIZE = "Customize";
    
    
    //--- action constants ---
    public static final int ADD_COMMENTS = 1;
    public static final int SEND_EMAIL = 2;
    public static final int CHANGE_STATE = 3;
    public static final int VIEW_TASKS = 4;
    public static final int TO_DO = 5;
    public static final int SERVICE_CALL = 6;
    public static final int SERVICE_MAIL = 7;
    public static final int INVOICE_DETAILS = 8;
    public static final int ASSIGN_TO = 9;
    public static final int TEMPLATES = 10;
    public static final int ROLES_WIZARD = 11;
    public static final int USER_WIZARD = 12;
    public static final int TRIGGER_MATCH = 13;
    public static final int FORCE_MATCH = 14;
    public static final int UNMATCH = 15;
    public static final int GENERATE_INVOICE = 16;
    public static final int PAY = 17;
    public static final int DATA_UPLOAD = 18;
    public static final int ATTACH = 28;
    public static final int BANK_DETAILS = 29;
    public static final int DEALER = 30;
    public static final int GENERATE_IDOC = 31;
    public static final int DATA_IMPORT_EXPORT_WIZARD = 32;
	public static final int DISPUTE = 33;
    public static final int PAY_PROMISE = 34;
    public static final int START_WORKFLOW_ACTION = 1024;
    public static final int NEW_VOICE_CALL = 1042;
    public static final int UNDO_CHECKOUT = 35;
    public static final int CHECK_IN = 36;
    public static final int CHECK_OUT = 37;
    public static final int REPLY = 38;
    public static final int REPLYALL = 39;
    public static final int FORWARD = 57;
    public static final int COMPOSE = 58;
    public static final int ASSIGN_TRANSACTION = 40;
    public static final int WORKFLOW_EDITOR = 42;
    public static final int MARK_AS_COMPLETED = 43;
    public static final int MARK_AS_SKIPPED = 44;
    public static final int GENERATE_REPORT = 46;
    public static final int PDF_TEMPLATES = 47;
    public static final int ALERT = 48;
    public static final int VIEW_CUSTOMIZATION = 49;
    public static final int NEW_TODO = 5;
    public static final int MOVE_TO_FOLDER = 1026;
    //--- ActionBar label width. ---
    public static final int LABEL_WIDTH = 65;
    public static final int UPLOAD_LOGO = 50;
    public static final int ADD_FOLDER = 52;
    public static final int RENAME_FOLDER = 53;
    public static final int DELETE_FOLDER = 54;
    public static final int SHARE = 55;
    public static final int PRINT = 56;
    public static final int EXECUTE_WORKFLOW = 59;
    
    //-- grid right click static action Ids
    public static final int RENAME = 50;
    public static final int SORTASCENDING = 51;
    public static final int SORTDESCENDING = 52;
    public static final int HIDE = 53;
    public static final int ADDCOLUMN = 54;
    public static final int RESETSORT = 55;
    
	//-- form right click static action Ids
    public static final int HIDEFIELD = 0; 
    public static final int ADDFIELD = 1;
    public static final int UPARROW = 1001;
    public static final int DOWNARROW = 1002;
    
    //-- right click label constants
    static final String SORTDESCENDING_MENU = "Sort Descending";
    static final String ADDCOLUMN_MENU = "Add Column";
    static final String HIDE_MENU = "Hide";
    static final String RENAME_MENU = "Rename";
    static final String SORTASCENDING_MENU = "Sort Ascending";
    static final String RESETSORT_MENU = "Reset";
    static final String ADDFOLDER_MENU = "Add Folder";
    static final String DELETE_MENU = "Delete";
    
	//-- right click label constants for form
    static final String HIDEFIELD_MENU = "Hide Field";
    static final String ADDFIELD_MENU = "Add Field"; 
    
    
    //--- accessory string constants (alphabetical order) ---
    static final String ACCRTXN_AROUTAMT = "AccrTxn.arOutamt";
    static final String ACTION_RIGHTS  = "Actions Rights";
    static final String VIEW_RIGHTS  = "View Rights";
    static final String ALL_REPORTS = "allreports";
    static final String ASSIGN  = "Assign User";
    static final String ACCESS_RIGHTS  = "Access Rights";
    static final String CONFIG  = "Configuration";
    static final String CST_ID = "cstId";
    static final String DATA_SOURCE = "dataSource";
    static final String DAYS_PAST_DUE = "DaysPastDue";
    static final String DRILL_GRID = "drillGrid";
    static final String DVIEW ="dView";
    static final String DATA_RIGHTS  = "Data Rights";
    static final String DATAIMPORT_SELTXNTPE = "selTxnType";
    static final String DATAIMPORT_SELTMPLNAME = "selImportTemplate";
    static final String DATAIMPORT_TXNTPE = "txnType";
    static final String DATAIMPORT_NEWTMPLNAME = "newTmpl";
    static final String DATAIMPORT_ATTACHMENTS = "attachments";
    static final String DATAIMPORT_PAYMENTS = "payments";
    static final String DATAIMPORT_CUSTOMER = "customer";
    static final String DATAIMPORT_INVOICE = "invoice";
    static final String DATAIMPORT_COLLECTIONS = "collections";
    static final String DATAIMPORT_CONTACTS = "contacts";
    static final String DATAIMPORT_MATCHINVOICES = "match invoices";
    static final String DATAIMPORT_MATCHREMITTANCES = "match remittances";
    static final String DATAIMPORT_IDOCGENERATION = "idoc generation";
    static final String DATAIMPORT_ACCRECIEVABLES = "Account Receivables";
    static final String DATAIMPORT_PAYMENTOPTIONS = "pmtopt";
    static final String DATAIMPORT_AR = "AR";
    static final String IMPORT_TMPLNAME = "importTemplate";
    static final String INVTXN_DUEDAYS = "InvTxn.noOfdaysPastDue";
    static final String INV_OPEN_AMT = "InvOpenAmt";
    static final String INV_AMT = "InvAmt";
    static final String INV_DUE_DATE = "InvDueDate";
    static final String IV_ID = "ivId";
    static final String IV_DATE = "ivDate";
    static final String IV_GPINVNO = "ivGpinvno";
    static final String INVOICE_IDS = "invoiceIds";
    static final String INVOICE_DETAILS_VIEW ="Invoice Details";
    static final String MAIL_TEMPLATE_VIEW = "mailTemplate";
    static final String MODULE_NAME = "moduleName";
    static final String NONE = "none";
    static final String OBJECTGROUPS = "objectgroups";
    static final String PR_NAME = "prName";
    static final String PERFECT_MATCH = "M";
    static final String PARTIAL_MATCH = "P";
    static final String PENDING_MATCH = "";
    static final String SERVICE_CALL_VIEW ="Call";
    static final String SELIMPORT_TMPLNAME = "selImportTemplate";
    static final String TO_DO_VIEW = "toDo";
    static final String US_ID = "usId";
    static final String US_NAME = "usName";
    static final String US_EMAIL = "usEmail";
    static final String USER_VIEW = "Edit User";
    static final String UN_MATCH = "U";
    static final String YYYY_MM_DD = "yyyy-mm-dd";
    static final String FILE_SEPARATOR = "file.separator";
    static final String TRANSFORM = "transform";
    static final String MAPPING = "Mapping.xml";
    static final int INV_TXN = 1;
    static final int CST_HDR = 2;
    static final String PAY_PROMISE_VIEWNEW = "payPromise";
    static final String PAY_PROMISE_VIEWEDIT = "payPromiseEdit";
    static final String PAY_PROMISE_NEW_ACCOUNTVIEW = "payPromiseAccount";
    static final String PAY_PROMISE_EDIT_ACCOUNTVIEW = "payPromiseEditAccount";
    static final String DISPUTES_VIEWNEW = "disputes";
    static final String DISPUTES_VIEWEDIT = "disputesEdit";
    static final String DISPUTES_NEW_ACCOUNTVIEW = "disputesAccount";
    static final String DISPUTES_EDIT_ACCOUNTVIEW = "disputesEditAccount";
	static final String SINGLE_QUOTE = "'";
	static final String SINGLE_QUOTE_ESC_CHAR = "''";
	static final String CLEAR_BUTTON_ID = "clear";
	static final String CANCEL_BUTTON_ID = "cancel";
	static final String NEXT_BUTTON_ID = "next";
    static final String BACK_BUTTON_ID = "back";
    static final String SAVE_BUTTON_ID = "save";
    static final String DEAFULT_ROW_HEIGHT = "20px";
    static final String V = "v";
    static final String TABSELECTED = "tabselected";
    static final String TABDESELECTED = "tabdeselected";
    static final String REMINDERS_VIEW = "Reminders";
    static final String TODOPANEL_VIEW = "Todo Form";
    static final String ADDCOMMENTS_VIEW = "Add Comments";
    static final String HISTORY_VIEW = "History View";
    static final String PAYMENT_PROMISED = "Payment Promised";
    static final String UPLOAD = "upload";

    // Object-related constants
    static final String USRCST_LNKHDR = "UsrcstLnkhdr";
    static final String USRCSTLNKHDR_WFERT = "UsrcstLnkhdr.usWfert";
    static final String USRCSTLNKHDR_ACCRT = "UsrcstLnkhdr.usAccrt";
    static final String USRCSTLNKHDR_CRTDDT = "UsrcstLnkhdr.ucCrtddt";
    static final String USRCSTLNKHDR_CRTDBY = "UsrcstLnkhdr.ucCrtdby";
    static final String USRCSTLNKHDR_UID = "UsrcstLnkhdrPK.usUid";
    static final String USRCSTLNKHDR_REFID = "UsrcstLnkhdrPK.refId";
    static final String USRCSTLNKHDR_REFNAME = "UsrcstLnkhdr.refName";
    static final String ACTHDR_ACTID = "ActHdr.actId";
    static final String ACTHDR_ACTNAME = "ActHdr.actName";
    static final String ACTHDR_ACTACTIVE = "ActHdr.actActive";
    static final String ACTHDR_ACTTYPE = "ActHdr.actTpe";
    static final String ACT_HDR = "ActHdr";
    static final String AGECATEGORY_HQLREF = "AgeHdr.ageCategory";
    static final String ATTMTSLOG = "AttmtsLog";
    static final String ATTMTSLOG_ALOGID = "AttmtsLog.alogId";
    static final String CSTHDR = "CstHdr";
    static final String CSTHDR_CSID = "CstHdr.csId";
    static final String CST_ID_REF = "CstHdr.csId";
    static final String CSTHDR_CSNAME = "CstHdr.csName";
    static final String CSTHDR_IDWITHREF = "CstHdr.nameWithRef";
    static final String CSTPEHDR_CSNAME = "CstpeHdr.csName";
    static final String CST_AGEHDR = "CstAgehdr";
    static final String CST_AGEHDR_CSID = "CstAgehdr.csId";
    static final String CST_AGEHDR_TOTALOPENAMT = "CstAgehdr.totalOpenAmt";
    static final String INV_CURR = "InvTxn.ivCurr";
    static final String INVTXN_IVGPIINVNO = "InvTxn.ivGpinvno";
    static final String INVTXN = "InvTxn";
    static final String INVSUMDET = "InvsumDet";
    static final String INVSRDET = "InvsrDet";
    static final String ADDHDR = "AddHdr";
    static final String ADDHDR_ADID = "AddHdr.adId";
    static final String INVTXN_IVTLAMT = "InvTxn.ivTlamt";
    static final String INVTXNPK_IVID = "InvTxnPk.ivId";
    static final String INVTXNPK_IVDATE = "InvTxnPk.ivDate";
    static final String INVTXN_MOD_BY = "InvTxn.ivModby";
    static final String INVTXN_MOD_DT = "InvTxn.ivModdt";
    static final String INVTXN_ASSG_TPE = "InvTxn.ivAssgtpe";
    static final String INVTXN_ASSGN_TO = "InvTxn.ivAssgnto";
    static final String INVTXN_IVDUEDATE = "InvTxn.ivDuedate";
    static final String INVTXN_NOOFDAYSPASTDUE = "InvTxn.noOfdaysPastDue";
    static final String CMTSLOG_CMACTION = "CmtsLog.cmAction";
    static final String CMTSLOG_CMTEXT = "CmtsLog.cmText";
    static final String INV_PAID_AMT = "PyttxnDet.paidAmount";
    static final String INV_TXNDET = "InvtxnDet";
    static final String PRTYHDR_PRNAME = "PrtyHdr.prName";
    static final String PRTYHDR_PRID = "PrtyHdr.prId";
    static final String STSHDR_STNAME = "StsHdr.stName";
    static final String STSHDR_STID = "StsHdr.stId";
    static final String STSHDR_STICON = "StsHdr.stIcon";
    static final String STSHDR = "StsHdr";
    static final String TODOLOG = "TodoLog";
    static final String TODOLOGDT = "TodoLogdt";
    static final String TODOLOGDT_TOSTR2 = "TodoLogdt.toStr2";
    static final String TODOLOGDT_IVID = "TodoLogdt.toIvid";
    static final String TODO_TLOGID = "TodoLog.tlogId";
    static final String TODO_IVID = "TodoLog.toIvid";
    static final String TODO_CLOSED = "TodoLog.closed";
    static final String USRHDR_UID = "UsrHdr.usUid";
    static final String USRHDR_USNAME = "UsrHdr.usFname";
    static final String USRHDR_USTYPE = "UsrHdr.usType";
    static final String USRHDR_USACTIVE = "UsrHdr.usActive";    
    static final String INVTXN_IVSTR2 = "InvTxn.ivStr2";
    static final String INVTXN_IVSTR3 = "InvTxn.ivStr3";
	static final String ATTMTSLOG_ATISINV = "AttmtsLog.atIsinv";
	static final String ATTMTSLOG_ATDESC = "AttmtsLog.atDesc";
	static final String ATTMTSLOG_ATURL = "AttmtsLog.atUrl";
	static final String INVTXN_EMAILBODY = "InvTxn.emailBody";
	static final String INVNOTE ="InvNote";
	static final String INVNOTE_IVSTR2 = "InvNote.ivStr2";
	static final String INVNOTE_IVSTR1 = "InvNote.ivStr1";
	static final String RL_HDR = "RlHdr";
	static final String RLHDR_RlName = "RlHdr.rlName";
	static final String RLHDR_RlId = "RlHdr.rlId";
	static final String USR_HDR = "UsrHdr";
	static final String RLHDR_RLLNKHDRS = "RlHdr.rlLnkhdrs";
    static final String TODO_TOTPE = "TodoLog.toTpe";
    static final String REMINDERS_LOG = "RemindersLog";
    static final String USRHDR_IDWITHNAME = "UsrHdr.idWithName";
    static final String USRHDR_EMAILWITHNAME = "UsrHdr.emailWithName";
    static final String USRHDR_USEMAIL = "UsrHdr.usEmail";
    static final String TODOLOG_DUEDTE = "TodoLog.toDuedte";
    static final String TODOLOG_REMDTE = "TodoLog.toRemdte";
    static final String RL_LNKHDR = "RlLnkhdr";
	static final String TODOLOGDT_TOAMT = "TodoLogdt.toAmt";
	static final String TODOLOGDT_TOIVDATE = "TodoLogdt.toIvdate";
	static final String TODOLOGDT_TOAMT1 = "TodoLogdt.toAmt1";
	static final String STSLOG_STID = "StsLog.stId";
	static final String STSLOG_STTXNTPE = "StsLog.stTxntpe";
    static final String WFEHDR_WFEID = "WfeHdr.wfeId";
    static final String WFEHDR_WFENAME = "WfeHdr.wfeName";
    static final String FILE_INFORMATION = "FileInformation";
    static final String FILE_CONFIGURATION = "FileConfiguration";
	static final String ATTMTSLOG_ATVER = "AttmtsLog.atVer";
    static final String ATTMTSLOG_ATCRTDBY = "AttmtsLog.atCrtdby";
    static final String ATTMTSLOG_ATCRTDDT = "AttmtsLog.atCrtddt";
    static final String TODOLOG_ASSIGNTO = "TodoLog.toAssgnto";
    static final String TODOLOG_ASSIGNTPE = "TodoLog.toAssgtpe";
    static final String TODOLOG_TODESC = "TodoLog.toDesc";
    static final String TODOLOG_SUBJ = "TodoLog.toSubj";    
    static final String TODOLOG_REMINDEREMAIL = "TodoLog.toReminderEmail";
    static final String TODOLOG_ACTIVE = "TodoLog.toActive";
    static final String TODOLOG_CLOSED = "TodoLog.toClosed";
    static final String CSTHDR_CSREF1 = "CstHdr.csRef1";
    static final String TODOLOG_TODATE1 = "TodoLog.toDate1";
    static final String TODOLOG_TOSTR6 = "TodoLog.toStr6";
    static final String FLDLOG = "FldLog";
	static final String FldLog_FLDID = "FldLog.fldId";
	static final String FldLog_FLDTYPE = "FldLog.fldType";
	static final String FldLog_ID = "FldLog.id";
	static final String FldLog_FLID = "FldLog.flId";
	static final String FldLog_FLDCRTDBY = "FldLog.fldCrtdby";
	static final String FldLog_FLDCRTDDT = "FldLog.fldCrtddt";
	static final String FldLog_FLDMODBY = "FldLog.fldModby";
	static final String FldLog_FLDMODDDT = "FldLog.fldModdt";
	static final String INVTXN_IVTYPE = "InvTxn.ivType";
	static final String TODOLOGDT_TODETID = "TodoLogdt.toDetid";
	static final String LDRLOG = "LdrLog";
    static final String LDRLOG_LDURL = "LdrLog.ldUrl";
    static final String LDRLOG_LDID = "LdrLog.ldId";
    static final String EMLOG_EMTYPE = "EmLog.emType";
    static final String EMLOG = "EmLog";
    static final String EMLOG_EMSNDR = "EmLog.emSndr";
    static final String EMLOG_EMSUBJECT = "EmLog.emSubject";
    static final String EMLOG_EMAILBODY = "EmLog.emailBody";
    static final String EMLOG_EMID = "EmLog.emId";
    static final String EMLOG_EMRCVR = "EmLog.emRcvr";
    static final String EMLOG_EMMSGDET = "EmLog.emMsgdet";
    static final String EMLOG_EMDTE = "EmLog.emDte";
    static final String EMLOG_EMURL = "EmLog.emUrl";
    static final String EMLOG_EMREADFLAGIMAGE = "EmLog.emReadFlagImage";
    static final String WFEHDR = "WfeHdr";
	
    //---new constants ---
    static final String TT_SAVE_REPORT = "Save Report";
    
    // Report constants
    static final String INVOICE_TEMPLATE_REPORT_ID = "RPC_004";
    static final String XML_ENCODING = "windows-1252";

    static final String SELECTED_RECORD_NUMBERS = "selectedRecordNumbers";
    static final String SELECTED_RECORDS_PK = "selectedRecordsPk";
    static final String SELECTED_RECORDS = "selectedRecords";

    static final String OPEN_TASK = "Open";
    static final String SKIPPED_TASK = "Skipped";
    static final String CLOSED_TASK = "Closed";

    //--- application commands ---
	static final String CLEAR = "clear";
	static final String CANCEL = "cancel";
	static final String NEXT = "next";
    static final String BACK = "back";
    static final String SAVE = "save";
    static final String NEW = "new";
    static final String EDIT = "edit";
    static final String DELETE = "delete";
    static final String SAVENEXT = "savenext";
    static final String ATTACHCMD = "attach";
    static final String COPY = "copy";
    static final String PASTE = "paste";
    static final String CUT = "cut";
    static final String EXPORT = "export";
    static final String HELP = "help";
    static final String LOGOFF = "logoff";
    static final String EXIT = "exit";
    static final String REMINDERS = "reminders";
    static final String USRHDR_USLNAME = "UsrHdr.usLname";
    static final String CONTACTUS = "contactus";
    static final String BLOG = "blog";

    //--- used as key for setting template data into filter ---
    static final String TEMPLATEPRIMARYDATA = "templatePrimaryData";

    /**
     * constant string for assign button tooltip
     */
    public static final String ASSIGN_TIP = "Assign Transaction(s) to Users";

    public static final String DELIM = "delim";
    public static final String GRID_ID = "gridId";
    public static final String EXPORT_TO_EXCEL = "exportToExcel";
    public static final String EXPORT_TO_TEXT = "exportToText";
    public static final String EXPORT_TO_PDF = "exportToPdf";
    public static final String ID = "id";
    public static final String EXPORT_TEMPLATE_To_PDF = "exportTemplateToPdf";
    public static final String MAXLIMIT = "maxlimit";
    public static final String PAGESIZE = "pageSize";
    public static final String MAILBOX = "mailbox";
    public static final String FORMAT = "format";
    public static final String CENTRALLYALIGNEDTEXT ="centrallyAlignedTabText";

    /**
     * constants for delimiters/seperators.
     */
    public static final String COMMA = ",";
    public static final String DEFAULT_DATEFORMAT = "mm/dd/yyyy";

    public static final String DATETIMEFORMAT_KEY = "datetimeformat";
    public static final String NUMBERFORMAT_KEY = "numberformat";    

    // Assign type constants
    static final String TODO_ASSIGN_TYPE_USER = "User";
    static final String TODO_ASSIGN_TYPE_ROLE = "Role";
    public static final int VALIDATE_PROCESS_TYPE = 2;
    public static final int TRANSFORM_PROCESS_TYPE = 1;
    
    //-- Action bar slider constants.
    /** Height when the left or right align is specified on action */
    static final int LEFT_RIGHT_HEIGHT = 30;
    /**  Height when the top or bottom align is specified on action */
    static final int TOP_BOTTOM_HEIGHT = 46;
    
    //Minimum screen height to be occupied by client excluding header panel
    static final int MINIMUM_CLIENT_HEIGHT = 300;
    static final int MANIMUM_CLIENT_WIDTH = 999;
    
    //--- Grid function constants. ---
    static final int FUNC_FILTER = 1;
    static final int FUNC_EXPORT_TO_EXCEL = 2;
    static final int FUNC_CREATE_REPORT = 3;
    static final int FUNC_EXPORT_TO_TEXT = 4;
    static final int FUNC_UNCHECK_ALL = 5;
    static final int FUNC_DELETE_ROW = 6;
    static final int FUNC_ADD_ROW = 7;
    static final int FUNC_PAGE_SIZE = 8;
    
    public static final String ACCOUNT = "Account";
    //--- Todo invoice, account label and textbox constants. ---
    public static final String INVOICE_LABEL = "invoiceLabel";
    public static final String ACCOUNT_LABEL = "accountLabel";
    public static final String INVOICE_TEXTBOX = "invoiceTextbox";
    public static final String ACCOUNT_TEXTBOX = "accountTextbox";
    public static final String INVOICE = "Invoice";
    
    static final String _FILTER = "_filter";
    static final String _DATA = "_data";
    static final String _SYSDATE = "_sysdate";
    public static final String MODULE_MENU = "moduleMenu";
    
    //--- Add the constant for grid cell widget ---
    final int DATA_DISPLAY_TEXT = 0;
    final int DATA_TEXT_DISPLAY_WIDGET = 1;
    final int DISPLAY_TEXT_DATA_WIDGET = 2;
    final int DATA_DISPLAY_WIDGET = 3;
    final int DATA_TEXT = 4;
    final int DATA_WIDGET = 5;
    final int ATTMTS_WIDGET = 6;
    final int DISPLAY_TEXT = 7;
    final int DISPLAY_WIDGET = 8;
    final int DATA_PHONE_TEXT = 9;
    
    //--- Used for resetting sort map ---
    public static final int COLUMN_HIDE = 0;
    public static final int COLUMN_UNHIDE = 1;
    public static final String URL_SEPARATOR = "/";
    
    //--- css and constants for grid paging buttons ---
    final int MOVE_FIRST = 1;
    final int MOVE_LAST = 2;
    final int MOVE_NEXT = 3;
    final int MOVE_PREVIOUS = 4;
    
    final int PAGE_MULTIPLY_SIZE = 25;
    final int SCROLLBARSPACE = 16;
    final int SCROLLBARWIDTH = 25;
    
    //---Length constants.
    static final int LENGTH_100 = 100;
    static final int LENGTH_18 = 18;
    
    
    //--- used for lock and user icon placed in  top right corner.---
    static final int PORTAL = 1;
    static final int NORMAL = 0;
    
    //--- User Login types ---
    public static final int NORMAL_LOGIN = 0;
    public static final int OPENID_LOGIN = 1;
    public static final int SSO_LOGIN = 2;
    //--- Is essentially OpenID login, this is just used to identify the click ---
    public static final int GOOGLEMARKETPLACE_LOGIN = 3;
    
    public static String USER_GOOGLE_EMAILID  = "UserGoogleEmailId";
   
    //--- Task type Constatnts. ---
    public static final String PROMISE = "Pay Promise";
    public static final String DISPUTES = "Exceptions";
    public static final String PROMISE_UPDATE = "Promise(s) updated successfully.";
    public static final String DISPUTE_UPDATE = "Dispute(s) updated successfully.";
    public static final String PROMISE_FAILED = "Promise(s) update failed.";
    public static final String DISPUTE_FAILED = "Dispute(s) update failed.";
    
	
		//--- Length constants for DataIEWizard ---
	public static final int ROW_LIMIT = 15;
	 //--- Holding EmLog.emType value
	static final String IN = "IN";
    
	//--- separator is used to separate field label and ID.
	public static final String FIELD_SEPARATOR = "~";
	
	
	//--- field dataTypes
	static final String DF_STRING = "string";
	static final String DF_BOOLEAN = "boolean";
	static final String DF_MONEY = "money";
	static final String DF_NUMERIC = "numeric";
	static final String DF_LIST = "list";
	static final String DF_PHONE = "phone";
	static final String DF_DATETIME = "datetime";
	static final String DF_EMAIL = "email";
	static final String DF_IMAGE = "image";
	
	
	 //--- Form customization constants. ---
    static final int STATUS = 3;
    public static final int ACTIONDROPDOWN = 2;
    
    //--- file formats ---
    static final String XLS = "xls";
	static final String DOC = "doc";
	static final String PDF = "pdf";
	static final String HTML = "html";
	
	//--- maximum number of columns allowed for configuring report ---
    static final int ALLOWED_REPORT_COLUMNS = 30;
    
    // --- Assign To Action ---
    static final int ASSIGNTO_USER = 1;
    static final int ASSIGNTO_ROLE = 2;
    
    //--- Report Category Constants ---
	static final int TABULAR_REPORT = 1;
	static final int HIERARCHICAL_REPORT = 2;
	static final String MAINOBJECTREF = "mainobjectref";
}

