package com.simple.configuration.model;

public class Label extends Id {
	/**
	 * Label is store the text of label.
	 */
	private String label;
	/**
	 * Image stored the image attribute of label.
	 */
	private String image;
	/**
	 * Align stored the align attribute of label.
	 */
	private int align;

	/**
	 * Gets the string value for label.
	 * <p>
	 * 
	 * @return label The text of label.
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the string value for label.
	 * <p>
	 * 
	 * @param label
	 *            The text of label.
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Gets the string value of image.
	 * <p>
	 * 
	 * @return image The image of label.
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets the string value for image.
	 * <p>
	 * 
	 * @param label
	 *            The image of label.
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Get the alignment of label.
	 * <p>
	 * 
	 * @return align The alignment of label.
	 */
	public int getAlign() {
		return align;
	}

	/**
	 * Set the alignment of label.
	 * <p>
	 * 
	 * @param align
	 *            The alignment of label.
	 */
	public void setAlign(int align) {
		this.align = align;
	}

	public Object clone() {
		Label label = new Label();
		label.setLabel(this.label);
		label.setImage(this.image);
		label.setAlign(this.align);
		return label;
	}
}