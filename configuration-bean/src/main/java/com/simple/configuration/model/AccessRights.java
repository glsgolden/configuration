package com.simple.configuration.model;


public class AccessRights 
{
	
	
	// Permission to view
	private boolean view;
	// Permission to create new data
	private boolean create;
	// Permission to modify existing data
	private boolean modify;
	// Permision to delete data
	private boolean delete;
	
	public AccessRights() {
	}

	public boolean isCreate() {
		return create;
	}

	public void setCreate(boolean create) {
		this.create = create;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	public boolean isModify() {
		return modify;
	}

	public void setModify(boolean modify) {
		this.modify = modify;
	}

	public boolean isView() {
		return view;
	}

	public void setView(boolean view) {
		this.view = view;
	}

}
