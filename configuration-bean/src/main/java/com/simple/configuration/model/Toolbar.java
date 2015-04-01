package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Toolbar extends Id
{

    private static final long serialVersionUID = -3275043352873378014L;

    // --- Toolbar definition as per presentation.xsd ---
    private List<Button> buttons;
    
    /**
     * Flag to set if the tool bar is to be displayed
     */
    private boolean render;
    
    /**
     * Flag to indicate if the toolbars are to come on the same line
     */
    private boolean merged;
    
    /**
     * Background stylesheet css (future)
     */
    private String background; 

    public Toolbar()
    {
        super();
        this.buttons = new ArrayList<Button>();
        this.render = true;
        this.merged = false;
    }

    /**
     */
    public Toolbar(String id, List<Button> buttons)
    {
        super(id);
        this.buttons = buttons;
    }

    /**
     */
    public List<Button> getButtons()
    {
        return buttons;
    }

    /**
     */
    public void setButtons(List<Button> buttons)
    {
        this.buttons = buttons;
    }

    public void addButton(Button button)
    {
        if (this.buttons == null)
        {
            this.buttons = new ArrayList<Button>();
        }

        this.buttons.add(button);
    }

    /**
     * Get DButton object for the passed action id
     * @param id 
     *      String action id 
     * @return
     *      (@link DButon)
     */
    public Button getButton(String id)
    {
        if (this.buttons != null)
        {
            int count = this.buttons.size();
            for (int i = 0; i < count; i++)
            {
                Button button = this.buttons.get(i);
                if (button.getId().equals(id))
                {
                    return button;
                }
            }
        }
        return null;
    }
    
    /**
     * Return the number of buttons in the toolbar.
     * 
     * @return int The number of buttons in the toolbar.
     */
    public int size()
    {
        int size = 0;
        if (this.buttons != null)
        {
            size = this.buttons.size();
        }
        return size;
    }

	public boolean isRender() 
	{
		return render;
	}

	public void setRender(boolean render) 
	{
		this.render = render;
	}

	public boolean isMerged() 
	{
		return merged;
	}

	public void setMerged(boolean merged) 
	{
		this.merged = merged;
	}

	public String getBackground() 
	{
		return background;
	}

	public void setBackground(String background) 
	{
		this.background = background;
	}
    
    
}
