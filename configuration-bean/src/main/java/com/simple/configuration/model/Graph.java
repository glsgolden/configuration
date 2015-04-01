package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Graph extends Id
{
	private static final long serialVersionUID = -1475327674539414574L;
	
	//--- Graph Constants ---//
	static final int LABEL_ALIGN_HORIZONTAL = 0;
	static final int LABEL_ALIGN_VERTICAL = 1;
	static final int LABEL_ALIGN_SLANT = 2;	
	// for back ground image  
	static final int HORIZONTAL_ALIGN_LEFT = 0;
	static final int HORIZONTAL_ALIGN_CENTER = 1;
	static final int HORIZONTAL_ALIGN_RIGHT = 2;	
	static final int VERTICAL_ALIGN_TOP = 0;
	static final int VERTICAL_ALIGN_MIDDLE = 1;
	static final int VERTICAL_ALIGN_BOTTOM = 2;	
	
	//--- Graph definition as per graph.xsd ---
	private String gridRef;
	//---  The data source. Is specified only if the
	//--- the graph is independent of any grid.
	private DataSource dataSource;
	private List<String> xRef;
    private String yRef;
    private String zRef;
   
	//--- Graph width and Height settings ---
    private int width;
    private int height;
    /**
     * graph type i.e., bar, line, linedot 
     */
    private String graphType;
    
    /**
     *     1.	title : text, {style-info}
     *     a.	text  : required
     *     b.	style-info - css style parameters  : required
     *     Allowed css properties:
     *      - font-size
     *      - color
     *      - background-color
     *      - background-color
     *      - text-align
     *	    - margin
     *		- margin-left
     *      - margin-right
     *      - margin-top
     *      - margin-bottom
     *      - padding
     *      - padding-left
     *      - padding-right
     *      - padding-top
     *	    - padding-bottom
     *	
     *	e.g.: title=Pie Chart~{font-size: 18px; color: #d01f3c}
     */
    private String title;
    
    /**
     *	colors=#FF8000~#F1CF0E~#0000FF~#00FF00~#808080&" 
     */
    private String colors;
    
    /**
     * legend details for x-axis ---
     * a.	text : required
     * b.	font-size : required
     * c.	color : optional (default :  black)
     * e.g.: &x_legend=Time of day~#736AFF~12& 
     */
    private String xLegend;
    
    /**
     * legend details for y-axis ---
     * a.	text : required
     * b.	font-size : required
     * c.	color : optional (default :  black)
     * e.g.: &y_legend=Time of day~#736AFF~12& 
     */
    private String yLegend;

    /**
     * a.	distance between labels and the y-axis : required
     * b.	length of the lines from y-axis towards label : required
     * c.	no. of steps on y-axis : optional (default : 2)
     * 
     * e.g.: &y_ticks=5~10~6&
     */
    private String yTicks;

    /**
     *	x_label_style 
     *    a.	font-size : required
     *    b.	color : optional  (default :  black)
     *    c.	orientation (0,1,2) : optional (default is 0 )
     *    i.	0 - horizontal
     *    ii.	1 - vertical
     *    iii.	2 - slant
     *    d.	NO OF STEPS FOR X: optional
     *    If the value is 3, only every 3rd label is shown on the x-axis even though only 
     *    values for all labels are plotted
     *    Default: x-axis steps for each x_label
     *    e.	Color for steps in x - color of the y-axis for the steps : optional (default : y_grid_color)
     *    e.g.: &x_label_style=13~0x9933CC~0~6&
     *    &y_label_style=none& - removes the labels on y-axis
     */
    private String xLabelStyle;

//    private String xLabelStepGridColor;
    
    /**
     * y_label_style
     *    a.	font-size : required
     *    b.	color : optional  (default :  black)
     *    c.	orientation (0,1,2) : optional (default is 0 )
     *    i.	0 - horizontal
     *    ii.	1 - vertical
     *    iii.	2 - slant
     *    d.	NO OF STEPS FOR X: optional
     *    If the value is 3, only every 3rd label is shown on the x-axis even though only 
     *    values for all labels are plotted
     *    Default: x-axis steps for each x_label
     *    e.	Color for steps in x - color of the y-axis for the steps : optional (default : y_grid_color)
     *    e.g.: &x_label_style=13~0x9933CC~0~6&
     *    &y_label_style=none& - removes the labels on y-axis
     */
    private String yLabelStyle;
    
    //--- labels on x-axis ---//
    private String xLabels;

    //-- x-axis steps --//
    private String xAxisSteps;
    
    //--- minimum value for y-axis --- default 0//
    private String yMin;

    //--- maximum value for y-axis ---//
    private String yMax;
    
    /**
     * String of String values for the graph
     */
    private String values;
    
    /**
     * String of String link for the Graph
     */
    private String links;
    
    /**
     * a.	#x_label# - label on x-axis
     * b.	#val#
     * c.	#key# - bar label 
     * d.	#x_legend#
     * Default: x <br> y
     */
    private String toolTip;
    
    //--- background color of the graph ---//
    private String backgroundColor;
    // -- background image URL : optional
    private String backgroundImage;
    //--- Horizontal alignment for the background image ---//
    private String backgroundImageX;
    //--- Vertical alignment for the background image ---//
    private String backgroundImageY;
    //--- color for horizontal grid lines, optional (default: #F5E1AA)---// 
    private String xGridColor;
    //--- color for vertical grid lines, optional (default: #F5E1AA)---// 
    private String yGridColor;
    //--- color for x-axis, optional (default : #784016)---// 
    private String xAxisColor;
    //--- color for y-axis, optional (default : #784016)---// 
    private String yAxisColor;
    
    /**
     * bar [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.	bar-label : optional
     *    	d.	bar-label font size : required if bar label present
     */
    private String bars;

    /**
     * bar_glass [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     */
    private String barGlasses;
    
    /**
     * bar_3d [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     */
    private String bar3d;
    
    /**
     * bar_Arrows [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     */
    private String barArrows;

    /**
     * line_dot[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     * e.	diameter of the dot : required
     */
    private String lineDots;

    /**
     * line[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     */
    private String lines;

    /**
     * line_hollow[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     * e.	diameter of the dot : required
     */
    private String lineHollows;
    
    /**
     * area_hollow[_#] : 
     * a.	width of the line  : optional (default : 1px)
     * b.	diameter of the dot : required
     * c.	opaqueness : required
     * d.	color : required
     * e.	area-label : optional
     * f.	label font size : required if line label present
     * g.	color of area under the graph-line : optional
     */
    private String areaHollows;

    /**
     * pie[_#] :
     * a.	opaqueness : optional (default : 100)
     * b.	border-color : optional (default : black)
     * c.	label-color : optional (default : black) 
     */
    private String pies;
    
    //-- labels for pie chart
    private String pieLabels;
    
    //--- boolean to show second y-axis ---//
    private String showY2; 
    //--- color for the 2nd y-axis ---// 
    private String y2AxisColor;
    
    //--- y2_label_style ---//
    private String y2LabelStyle;
    
    /**
     * -- comma-separated line no.s on y2 axis
     * Which lines (their serial no.) will be plotted on y2axis : optional
     */
    private String y2Lines;
    
    //-- minimum value for y-axis, optional (default : y_min)
    private String y2Min;

    //-- maximum value for y-axis, optional (default : y_max)
    private String y2Max;
    
    private String y2Legend;
    
    //--- height of the 3D - x axis ---// 
    private String xAxis3D;
    //--- x column labels specified as 
    //--- Data Dictionary id's ---//
    private List<String> xColumns;
	
	/**
     * 	x_ticks :  length of the line from x-axis towards the labels : required
     *     E.g. :
     *     title=Pie Chart~{font-size: 18px; color: #d01f3c}
     *		x_axis_steps=1
     *    &y_ticks=5~10~5&
     *    &line=3~#87421F&
     *    &y_min=0&
     *    &y_max=20&
     *    &pie=180~#FFFFFF~#000000& 
     *    &values=33.75~48.85~17.41& &links=javascript:loadGraph('OR1');~javascript:loadGraph('OR2');~javascript:loadGraph('OR3');&
     *    &colours=#316B9F~#A8C6CF~#7F7F7F&
     *    &tool_tip=#val#%25&
     *    &bg_colour=#FFFFFF& 	 
     */
    private String xTicks;
    
	public Graph()
	{
		super();
		setType(GRAPH);
	}

    /**
     * Get background color of the graph
     * @return String
     * 				hash code for the color
     */
	public String getBackgroundColor()
	{
		return backgroundColor;
	}
	
	/**
	 * Set background color for the graph
	 * @param backgroundColor - String
	 * 								hash code for the color 		
	 */
	public void setBackgroundColor(String backgroundColor)
	{
		this.backgroundColor = this.getGraphElement("bg_colour", backgroundColor);
	}
	
	/**
	 * Get background image URL of the graph
	 * @return String
	 * 				URL for the background image
	 */
	public String getBackgroundImage()
	{
		return backgroundImage;
	}
	
	/**
	 * Set background image URL for the graph
	 * @param backgroundImage - String
	 * 								URL for the background image
	 */
	public void setBackgroundImage(String backgroundImage)
	{
		this.backgroundImage = this.getGraphElement("bg_image", backgroundImage);
	}
	
	/**
	 * Get background image horizontal alignment 
	 * @return String
	 */
	public String getBackgroundImageX()
	{
		return backgroundImageX;
	}
	
	/**
	 * Set background image horizontal alignment 
	 * @param backgroundImageX String
	 * 
	 */
	public void setBackgroundImageX(String backgroundImageX)
	{
		this.backgroundImageX = this.getGraphElement("bg_image_x", backgroundImageX);
	}
	
	/**
	 * Get background image vertical alignment 
	 * @return String
	 */
	public String getBackgroundImageY()
	{
		return backgroundImageY;
	}
	
	/**
	 * Set background image vertical alignment 
	 * @param backgroundImageY String
	 */
	public void setBackgroundImageY(String backgroundImageY)
	{
		this.backgroundImageY = this.getGraphElement("bg_image_y", backgroundImageY);
	}	
	
	
	/**
	 * Check whether to show 2nd y-axis on the right 
	 * @return boolean
	 */
	public String isShowY2()
	{
		return showY2;
	}
	
	/**
	 * Set String to show 2nd y-axis on the right
	 * @param showY2 - String
	 */
	public void setShowY2(String showY2)
	{
		this.showY2 = this.getGraphElement("show_y2", showY2);
	}
	
	/**
	 * Get tooltip format string
	 * @return String
	 * a.	#x_label# - label on x-axis
	 * b.	#val#
	 * c.	#key# - bar label 
	 * d.	#x_legend#
	 * Default: x <br> y
	 */
	public String getToolTip()
	{
		return toolTip;
	}
	
	/**
	 * Set tooltip format string
	 * 	for e.g. #x_label# ,#val#
	 * @param toolTip
	 */
	public void setToolTip(String toolTip)
	{
		this.toolTip = this.getGraphElement("tool_tip", toolTip);
	}
	
	/**
	 * Get height of the 3D x-axis
	 * @return String
	 */
	public String getXAxis3D()
	{
		return xAxis3D;
	}
	
	/**
	 * Set height of the 3D x-axis
	 * @param axis3D - String
	 */
	public void setXAxis3D(String axis3D)
	{
		xAxis3D = this.getGraphElement("x_axis_3d", axis3D);
	}

	/**
	 * Get color for the x-axis
	 * @return String - hash code for the color
	 */
	public String getXAxisColor()
	{
		return xAxisColor;
	}
	
	/**
	 * Set color for the x-axis
	 * @param axisColor - String
	 * 						hash code for the color
	 */
	public void setXAxisColor(String axisColor)
	{
		xAxisColor = this.getGraphElement("x_axis_colour", axisColor);
	}

	/**
	 * Get color for the horizontal grid lines
	 * @return String - hash code for the color
	 */
	public String getXGridColor()
	{
		return xGridColor;
	}
	
	/**
	 * Set color for the horizontal grid lines
	 * @param gridColor - String 
	 * 						hash code for the color
	 */
	public void setXGridColor(String gridColor)
	{
		xGridColor = this.getGraphElement("x_grid_colour", gridColor);
	}
	
	/**
	 * Get color for the x-axis for the x-label steps
	 * @return String - hash code for color
	 */
/*	public String getXLabelStepGridColor()
	{
		return xLabelStepGridColor;
	}
	
	*//**
	 * Set color for the x-axis for the x-label steps
	 * @param labelStepGridColor - String 
	 * 									hash code for color
	 *//*
	public void setXLabelStepGridColor(String labelStepGridColor)
	{
		xLabelStepGridColor = labelStepGridColor;
	}*/
	
	/**
	 * Get color for the y-axis on the right
	 * @return String - hash code for the color
	 */
	public String getY2AxisColor()
	{
		return y2AxisColor;
	}
	
	/**
	 * Set color for the y-axis on the right
	 * @param axisColor - String
	 * 						hash code for the color
	 */
	public void setY2AxisColor(String axisColor)
	{
		y2AxisColor = this.getGraphElement("y2_axis_colour", axisColor);
	}
	
	/**
	 * Get legend for the 2nd y-axis on the right
	 * @return
	 */
	public String getY2Legend()
	{
		return y2Legend;
	}
	
	/**
	 * Set legend for the 2nd y-axis on the right
	 * @param legend
	 */
	public void setY2Legend(String legend)
	{
		y2Legend = this.getGraphElement("y2_legend", legend);
	}
	
	/**
	 * Get maximum y value for the y-axis on the right
	 * @return String 
	 */
	public String getY2Max()
	{
		return y2Max;
	}
	
	/**
	 * Set maximum y value for the y-axis on the right
	 * @param max String
	 */
	public void setY2Max(String max)
	{
		y2Max = this.getGraphElement("y2_max", max);
	}
	
	/**
	 * Get minimum y value for the y-axis on right
	 * @return String
	 */
	public String getY2Min()
	{
		return y2Min;
	}
	
	/**
	 * Set minimum y value for the y-axis on right
	 * @param min String
	 */
	public void setY2Min(String min)
	{
		y2Min = this.getGraphElement("y2_min", min);
	}
	
	/**
	 * Get color of the y-axis
	 * @return String - hash code for the color
	 */
	public String getYAxisColor()
	{
		return yAxisColor;
	}
	
	/**
	 * Set color for the y-axis
	 * @param axisColor - String
	 * 						hash code for the color
	 */
	public void setYAxisColor(String axisColor)
	{
		yAxisColor = this.getGraphElement("y_axis_colour", axisColor);
	}
	
	/**
	 * Get color for the vertical grid lines
	 * @return String - hash code for the color
	 */
	public String getYGridColor()
	{
		return yGridColor;
	}
	
	/**
	 * Set color for the vertical grid lines
	 * @param gridColor - String
	 * 						hash code for the color
	 */
	public void setYGridColor(String gridColor)
	{
		yGridColor = this.getGraphElement("y_grid_colour", gridColor);
	}
	
	/**
	 * Get the maximum value on y-axis
	 * @return String
	 */
	public String getYMax()
	{
		return yMax;
	}
	
	/**
	 * Set the maximum value on y-axis
	 * @param max - String
	 */
	public void setYMax(String max)
	{
		yMax = this.getGraphElement("y_max", max);
	}
	
	/**
	 * Get the minimum y-axis value 
	 * @return String
	 */
	public String getYMin()
	{
		return yMin;
	}
	
	/**
	 * Set the minimum y-axis value 
	 * @param min String
	 */
	public void setYMin(String min)
	{
		yMin = this.getGraphElement("y_min", min);
	}
	
    /**
     * -- get comma-separated line no.s on y2 axis
     * Which lines (their serial no.) will be plotted on y2axis : optional
     */
	public String getY2Lines()
	{
		return y2Lines;
	}

    /**
     * -- set comma-separated line no.s on y2 axis
     * Which lines (their serial no.) will be plotted on y2axis : optional
     */
	public void setY2Lines(String lines)
	{
		y2Lines = this.getGraphElement("y2_lines", lines);
	}
	
	/**
	 * get x-axis steps
	 * @return String 
	 */
	public String getXAxisSteps()
	{
		return xAxisSteps;
	}
	
	/**
	 * set x-axis steps
	 * @param axisSteps
	 */
	public void setXAxisSteps(String axisSteps)
	{
		xAxisSteps = this.getGraphElement("x_axis_steps", axisSteps);
	}
	
	/**
     *  get y_label_style String
     *    a.	font-size : required
     *    b.	color : optional  (default :  black)
     *    c.	orientation (0,1,2) : optional (default is 0 )
     *    i.	0 - horizontal
     *    ii.	1 - vertical
     *    iii.	2 - slant
     *    d.	NO OF STEPS FOR X: optional
     *    If the value is 3, only every 3rd label is shown on the x-axis even though only 
     *    values for all labels are plotted
     *    Default: x-axis steps for each x_label
     *    e.	Color for steps in x - color of the y-axis for the steps : optional (default : y_grid_color)
     *    e.g.: &x_label_style=13~0x9933CC~0~6&
     *    &y_label_style=none& - removes the labels on y-axis
     */
	public String getYLabelStyle()
	{
		return yLabelStyle;
	}

	public void setYLabelStyle(String labelStyle)
	{
		yLabelStyle = this.getGraphElement("y_label_style", labelStyle);
	}

    /**  get Title
     *     1.	title : text, {style-info}
     *     a.	text  : required
     *     b.	style-info - css style parameters  : required
     *     Allowed css properties:
     *      - font-size
     *      - color
     *      - background-color
     *      - background-color
     *      - text-align
     *	    - margin
     *		- margin-left
     *      - margin-right
     *      - margin-top
     *      - margin-bottom
     *      - padding
     *      - padding-left
     *      - padding-right
     *      - padding-top
     *	    - padding-bottom
     *	
     *	e.g.: title=Pie Chart~{font-size: 18px; color: #d01f3c}
     */
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = this.getGraphElement("title", title);
	}

    /**
     * get xLegend String
     * legend details for x-axis ---
     * a.	text : required
     * b.	font-size : required
     * c.	color : optional (default :  black)
     * e.g.: &x_legend=Time of day~#736AFF~12& 
     */
	public String getXLegend()
	{
		return xLegend;
	}

	public void setXLegend(String legend)
	{
		xLegend = this.getGraphElement("x_legend", legend);
	}

    /**
     * get yLegend String
     * legend details for y-axis ---
     * a.	text : required
     * b.	font-size : required
     * c.	color : optional (default :  black)
     * e.g.: &y_legend=Time of day~#736AFF~12& 
     */
	public String getYLegend()
	{
		return yLegend;
	}

	public void setYLegend(String legend)
	{
		yLegend = this.getGraphElement("y_legend", legend);
	}

    /**
     * get y_Ticks String
     * a.	distance between labels and the y-axis : required
     * b.	length of the lines from y-axis towards label : required
     * c.	no. of steps on y-axis : optional (default : 2)
     * 
     * e.g.: &y_ticks=5~10~6&
     */
	public String getYTicks()
	{
		return yTicks;
	}

	public void setYTicks(String ticks)
	{
		yTicks = this.getGraphElement("y_ticks", ticks);
	}

    /**
     *	get x_label_style String 
     *    a.	font-size : required
     *    b.	color : optional  (default :  black)
     *    c.	orientation (0,1,2) : optional (default is 0 )
     *    i.	0 - horizontal
     *    ii.	1 - vertical
     *    iii.	2 - slant
     *    d.	NO OF STEPS FOR X: optional
     *    If the value is 3, only every 3rd label is shown on the x-axis even though only 
     *    values for all labels are plotted
     *    Default: x-axis steps for each x_label
     *    e.	Color for steps in x - color of the y-axis for the steps : optional (default : y_grid_color)
     *    e.g.: &x_label_style=13~0x9933CC~0~6&
     *    &y_label_style=none& - removes the labels on y-axis
     */
	public String getXLabelStyle()
	{
		return xLabelStyle;
	}

	public void setXLabelStyle(String labelStyle)
	{
		xLabelStyle = this.getGraphElement("x_label_style", labelStyle);
	}

    /**
     * get bar [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.	bar-label : optional
     *    	d.	bar-label font size : required if bar label present
     */
	public String getBars()
	{
		return bars;
	}
    /**
     * set bar [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.	bar-label : optional
     *    	d.	bar-label font size : required if bar label present
     */
	public void setBars(String bars)
	{
		this.bars = this.getGraphElement("bar", bars);
	}

    /**
     * get bar_glass [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     */
	public String getBarGlasses()
	{
		return barGlasses;
	}
    /**
     * set bar_glass [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     */
	public void setBarGlasses(String barGlasses)
	{
		this.barGlasses = this.getGraphElement("bar_glass", barGlasses);
	}

    /**
     * get bar_3d [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     *    
     */
	public String getBar3d() 
	{
		return bar3d;
	}

	/**
     * set bar_3d [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     */
	public void setBar3d(String bar3d)
	{
		this.bar3d = this.getGraphElement("bar_3d", bar3d);
	}
	
    /**
     * get bar_arrow [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     *    
     */
	public String getBarArrows()
	{
		return barArrows;
	}

	/**
     * set bar_arrow [_#] : 
     *    	a.	opaqueness : optional (default : 100)
     *    	b.	bar-color : optional (default : black)
     *    	c.  border-color : optional (default : black)
     *    	d.	bar-label : optional
     *    	e.	bar-label font size : required if bar label present
     */
	public void setBarArrows(String barArrows)
	{
		this.barArrows = this.getGraphElement("bar_arrow", barArrows);
	}

    /**
     * get line_dot[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     * e.	diameter of the dots : required
     * 
     */
	public String getLineDots()
	{
		return lineDots;
	}

	/**
     * set line_dot[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     * e.	diameter of the dot : required
     */
	public void setLineDots(String lineDots)
	{
		this.lineDots = this.getGraphElement("line_dot", lineDots);
	}

	/**
     * get line[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     */
	public String getLines()
	{
		return lines;
	}
	
    /**
     * set line[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     */

	public void setLines(String lines)
	{
		this.lines = this.getGraphElement("line", lines);
	}

	/**
     * get line_hollow[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     * e.	diameter of the dot : required
     */
	public String getLineHollows()
	{
		return lineHollows;
	}

    /**
     * set line_hollow[_#]  : line with dots
     * a.	width of line in pixels : optional  (default : 1px)
     * b.	color : optional (default : black)
     * c.	line-label : optional
     * d.	label font size : required if line label present
     * e.	diameter of the dot : required
     */
	public void setLineHollows(String lineHollows)
	{
		this.lineHollows = this.getGraphElement("line_hollow", lineHollows);
	}

    /**
     * get area_hollow[_#] : String of String
     * a.	width of the line  : optional (default : 1px)
     * b.	diameter of the dot : required
     * c.	opaqueness : required
     * d.	color : required
     * e.	area-label : optional
     * f.	label font size : required if line label present
     * g.	color of area under the graph-line : optional
     */
	public String getAreaHollows()
	{
		return areaHollows;
	}

    /**
     * set area_hollow : String of String
     * a.	width of the line  : optional (default : 1px)
     * b.	diameter of the dot : required
     * c.	opaqueness : required
     * d.	color : required
     * e.	area-label : optional
     * f.	label font size : required if line label present
     * g.	color of area under the graph-line : optional
     */
	public void setAreaHollows(String areaHollows)
	{
		this.areaHollows = this.getGraphElement("area_hollow", areaHollows);
	}

    /**
     * get pie : String of String
     * a.	opaqueness : optional (default : 100)
     * b.	border-color : optional (default : black)
     * c.	label-color : optional (default : black) 
     */
	public String getPies()
	{
		return pies;
	}

    /**
     * set pie : String of String
     * a.	opaqueness : optional (default : 100)
     * b.	border-color : optional (default : black)
     * c.	label-color : optional (default : black) 
     */
	public void setPies(String pies)
	{
		this.pies = this.getGraphElement("pie", pies);
	}
	
	//-- get labels for pie chart
	public String getPieLabels()
	{
		return pieLabels;
	}

	//-- set labels for pie chart
	public void setPieLabels(String pieLabels)
	{
		this.pieLabels = this.getGraphElement("pie_labels", pieLabels);
	}

	/**
	 * get Y2LabelStyle for the graph
	 * @return String
	 */
	public String getY2LabelStyle()
	{
		return y2LabelStyle;
	}
	/**
	 * set Y2LabelStyle for the graph
	 * @param String
	 */
	public void setY2LabelStyle(String labelStyle)
	{
		y2LabelStyle = this.getGraphElement("y2_label_style", labelStyle);
	}

    /**
     * 	x_ticks :  length of the line from x-axis towards the labels : required
     *     E.g. :
     *     title=Pie Chart~{font-size: 18px; color: #d01f3c}
     *		x_axis_steps=1
     *    &y_ticks=5~10~5&
     *    &line=3~#87421F&
     *    &y_min=0&
     *    &y_max=20&
     *    &pie=180~#FFFFFF~#000000& 
     *    &values=33.75~48.85~17.41& &links=javascript:loadGraph('OR1');~javascript:loadGraph('OR2');~javascript:loadGraph('OR3');&
     *    &colours=#316B9F~#A8C6CF~#7F7F7F&
     *    &tool_tip=#val#%25&
     *    &bg_colour=#FFFFFF&
     *    
     *    @return String 	 
     */
	public String getXTicks()
	{
		return xTicks;
	}

	/**
     * 	x_ticks :  length of the line from x-axis towards the labels : required
     *     E.g. :
     *     title=Pie Chart~{font-size: 18px; color: #d01f3c}
     *		x_axis_steps=1
     *    &y_ticks=5~10~5&
     *    &line=3~#87421F&
     *    &y_min=0&
     *    &y_max=20&
     *    &pie=180~#FFFFFF~#000000& 
     *    &values=33.75~48.85~17.41& &links=javascript:loadGraph('OR1');~javascript:loadGraph('OR2');~javascript:loadGraph('OR3');&
     *    &colours=#316B9F~#A8C6CF~#7F7F7F&
     *    &tool_tip=#val#%25&
     *    &bg_colour=#FFFFFF&
     *    
     */
	public void setXTicks(String ticks)
	{
		xTicks = this.getGraphElement("x_ticks", ticks);
	}

	/**
	 * get String of values for the bar, barglasses, etc  
	 * @return String of String values
	 */
	public String getValues()
	{
		return values;
	}

	/**
	 * set String of values for the bar, barglasses, etc  
	 * @return String of String values
	 */
	public void setValues(String values)
	{
		this.values = this.getGraphElement("values", values);
	}

	/**
	 * get Links String for graph
	 * @return String of String
	 */
	public String getLinks()
	{
		return links;
	}

	/**
	 * set Links String for graph
	 * 
	 */
	public void setLinks(String links)
	{
		this.links = this.getGraphElement("links", links);
	}
	
	/**
	 * get x_labels for the  graph
	 * @return String x_labels
	 */
	public String getXLabels()
	{
		return xLabels;
	}

	/**
	 * Set x_labels for the graph
	 * @param labels
	 */
	public void setXLabels(String labels)
	{
		this.xLabels = this.getGraphElement("x_labels", labels);
	}

	/**
	 *  get graph type i.e. bar, barGlass,line etc.
	 * @return String graphType
	 */
	public String getGraphType()
	{
		return graphType;
	}

	/**
	 *  set graph type i.e. bar, barGlass,line etc.
	 * @return String graphType
	 */
	public void setGraphType(String graphType)
	{
		this.graphType = graphType;
	}

	/**
	 * get colors for the graph
	 * @return String
	 * 
     *	colors=#FF8000~#F1CF0E~#0000FF~#00FF00~#808080&" 
     */
	public String getColors()
	{
		return colors;
	}

	/**
	 * set colors for the graph
	 * @param String
	 * 
     *	colors=#FF8000~#F1CF0E~#0000FF~#00FF00~#808080&" 
     */
	public void setColors(String colors)
	{
		this.colors = this.getGraphElement("colours", colors);
	}

	/**
	 * Gets the referenced associated grid.
	 * <p>
	 * @return
	 * 		String representing the ID of the 
	 * 		grid that is associated. Used to form the query for
	 * 		graph data fetch. 
	 */
	public String getGridRef() 
	{
		return gridRef;
	}

	/**
	 * Sets the referenced associated grid.
	 * <p>
	 * @param
	 * 		String representing the ID of the 
	 * 		grid that is associated. Used to form the query for
	 * 		graph data fetch. 
	 */
	public void setGridRef(String gridRef) 
	{
		this.gridRef = gridRef;
	}
	
	/**
	 * Gets the data source for the graph data fetch.
	 * <p>
	 * @param dataSource 
	 * 		The {@link DataSource} dataSource 
	 * 		for the graph data fetch. The graph has choice
	 * 		to associate with a grid or to own a data source.
	 */
	public DataSource getDataSource() 
	{
		return dataSource;
	}

	/**
	 * Sets the data source for the graph data fetch.
	 * <p>
	 * @param dataSource 
	 * 		The {@link DataSource} dataSource 
	 * 		for the graph data fetch.The graph has choice
	 * 		to associate with a grid or to own a data source.
	 */
	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
	}
	
	/**
	 * Gets the set of column labels
	 * configured for X-axis.
	 * @return xColumn 
	 * 		List of X-axis column labels.
	 */
	public List<String> getXColumns() 
	{
		return xColumns;
	}

	/**
	 * Sets the set of column labels
	 * configured for X-axis.
	 * @param xColumn 
	 * 		List of X-axis column labels.
	 */
	public void setXColumns(List<String> xColumn) 
	{
		this.xColumns = xColumn;
	}
	
	/**
	 * Gets the object references X-axis.
	 * <p>
	 * @param
	 * 		List of Strings representing X-axis object references
	 * 		for the column to be fetched data for.	 
	 */
	public List<String> getXRef() 
	{
		return xRef;
	}

	/**
	 * Sets the object references X-axis.
	 * <p>
	 * @param
	 * 		List of Strings representing X-axis object references
	 * 		for the column to be fetched data for.	 
	 */
	public void setXRef(List<String> ref) 
	{
		xRef = ref;
	}
	
	/**
	 * gets the object reference Y-axis.
	 * <p>
	 * @param
	 * 		String representing Y-axis object references
	 * 		for the column to be fetched data for.	 
	 */
	public String getYRef() 
	{
		return yRef;
	}
	
	/**
	 * Sets the object reference Y-axis.
	 * <p>
	 * @param
	 * 		String representing Y-axis object references
	 * 		for the column to be fetched data for.	 
	 */
	public void setYRef(String ref) 
	{
		yRef = ref;
	}

	/**
	 * Gets the object reference Z-axis.
	 * <p>
	 * @param
	 * 		String representing Z-axis object references
	 * 		for the column to be fetched data for.	 
	 */
	public String getZRef() 
	{
		return zRef;
	}

	/**
	 * Sets the object reference Z-axis.
	 * <p>
	 * @param
	 * 		String representing Z-axis object references
	 * 		for the column to be fetched data for.	 
	 */
	public void setZRef(String ref) 
	{
		zRef = ref;
	}
	
	/**
	 * Gets String to show 2nd y-axis on the right.
	 * @return showY2 
	 * 		String value.
	 */
	public String getShowY2() 
	{
		return showY2;
	}
	
	/**
	 * Gets the given width, which is in pixels.
	 * <p>
	 * @return width
	 * 		The width in pixel for the graph.
	 */
	public int getWidth() 
	{
		return width;
	}
	
	/**
	 * Sets the given width, which is in pixels.
	 * <p>
	 * @param width
	 * 		The width in pixel for the graph.
	 */
	public void setWidth(int width) 
	{
		this.width = width;
	}
	
	/**
	 * Gets the given height, which is in pixels.
	 * <p>
	 * @return height
	 * 		The height in pixel for the graph.
	 */
	public int getHeight() 
	{
		return height;
	}
	
	/**
	 * Sets the given height, which is in pixels.
	 * <p>
	 * @param height
	 * 		The height in pixel for the graph.
	 */
	public void setHeight(int height) 
	{
		this.height = height;
	}

	/**
	 * Get the formatted graph element which is compatible to .swf file.
	 * <p>
	 * @param name
	 * 			The name of the element.
	 * @param data
	 * 			The data for that element.
	 * @return elemData
	 * 			The formatted <code>String</code>
	 */
	private String getGraphElement(String name, String data)
	{
		StringBuffer elemData = new StringBuffer();
		if (data != null && data.length() > 0)
		{
			elemData.append("&");
			elemData.append(name);
			elemData.append("=");
			elemData.append(data);
			elemData.append("&");
		}
		return elemData.toString();
	}
	
	/**
	 * Get the formatted data for the Chart.
	 * <p>
	 * @return data
	 * 			The formatted data.
	 */
	public String getFormattedGraphData()
	{
		StringBuffer data = new StringBuffer("local:\\\\\\\\");
		data.append(formattedCommonData());
		if ("pie".equals(graphType))
		{
			data.append(formatPieData());
		}
		else
		{
			data.append(formatLineBarData());
		}
		this.appendData(data, values);
		this.appendData(data, links);
		return data.toString();
	}
	
	/**
	 * Get the formatted common data for all the charts.
	 * <p>
	 * @return data
	 * 			The formatted data.
	 */
	private StringBuffer formattedCommonData()
	{
		StringBuffer data = new StringBuffer();
		this.appendData(data, title);
		this.appendData(data, toolTip);
		this.appendData(data, backgroundColor);
		this.appendData(data, backgroundImage);
		this.appendData(data, backgroundImageX);
		this.appendData(data, backgroundImageY);
		return data;
	}
	
	/**
	 * Get the formatted Pie Chart data.
	 * <p> 
	 * @return data.
	 * 			The formatted Pie Chart data.
	 */
	private StringBuffer formatPieData()
	{
		StringBuffer data = new StringBuffer();
		this.appendData(data, pies);
		this.appendData(data, pieLabels);
		this.appendData(data, colors);
		return data;
	}

	/**
	 * Get the formatted Line, Bar Chart data.
	 * <p>
	 * @return data
	 * 			The formatted data.
	 */
	private StringBuffer formatLineBarData()
	{
		StringBuffer data = new StringBuffer();
		this.appendData(data, bars);
		this.appendData(data, barGlasses);
		this.appendData(data, bar3d);
		this.appendData(data, barArrows);
		this.appendData(data, lines);
		this.appendData(data, lineHollows);
		this.appendData(data, lineDots);
		this.appendData(data, areaHollows);
		this.appendData(data, xLegend);
		this.appendData(data, yLegend);
		this.appendData(data, yTicks);
		this.appendData(data, xLabelStyle);
		this.appendData(data, yLabelStyle);
		this.appendData(data, xAxisSteps);
		this.appendData(data, xLabels);
		this.appendData(data, yMin);
		this.appendData(data, xGridColor);
		this.appendData(data, yGridColor);
		this.appendData(data, xAxisColor);
		this.appendData(data, yAxisColor);
		this.appendData(data, showY2);
		this.appendData(data, y2AxisColor);
		this.appendData(data, y2LabelStyle);
		this.appendData(data, y2Lines);
		this.appendData(data, y2Min);
		this.appendData(data, y2Max);
		this.appendData(data, y2Legend);
		this.appendData(data, xAxis3D);
		this.appendData(data, xTicks);
		this.appendData(data, yMax);
		return data;
	}
	
	/**
	 * Append the data.
	 * <p>
	 * @param data
	 * 			The <code>StringBuffer</code> object into value is to be append.
	 * @param value
	 * 			The value to be appended.
	 */
	private void appendData(StringBuffer data, String value)
	{
		if (value != null)
		{
			data.append(value);
		}
	}
	
	/**
     * Sets the uniqueId for the DGraph element.
     * 
     * @param parentId
     *          The uniqueId of the DPanel element.
     */
	public void setUniqueId(String parentId)
    {
	    super.setUniqueId(parentId);
    }
	
	/**
	 * Add the x-axis object reference.
	 * <p>
	 * @param xRef
	 *     The x-axis object reference.
	 */
	public void addXRef(String xRef)
	{
	    if (this.xRef == null)
	    {
	        this.xRef = new ArrayList<String>();
	    }
	    this.xRef.add(xRef);
	}
	/**
	 * Adds the x-axis column labels.
	 * <p>
	 * @param xColumn
	 *     The x-axis column label.
	 */
	public void addXColumn(String xColumn)
	{
	    if (this.xColumns == null)
	    {
	        this.xColumns = new ArrayList<String>();
	    }
	    this.xColumns.add(xColumn);
	}
}
