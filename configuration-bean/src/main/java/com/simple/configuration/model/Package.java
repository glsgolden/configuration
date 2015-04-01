package com.simple.configuration.model;

import java.util.*;


public class Package extends Id 
{

	private static final long serialVersionUID = 4246460146055601616L;

	// --- Package definition as per presentation.xsd ---
	private boolean isDefault;
	private String image;
	private String rolloverImage;
	/**
	 * The package name.
	 */
	private String packageName;
	private Toolbar systembar;
	private int sequenceNum;
	private boolean isHidden;
	/** 
     */
	private Map<String, Module> modules;

	// --- variables required for user access rights. ---
	private String name;
	private AccessRights rights;
	private ElementReference elementReference;
	/**
	 * Boolean flag is used to determine whether the currentPackage is homePage
	 * or Not?
	 */
	private boolean isHomePage;

	public Package() {
		this.isHidden = false;
	}

	/** 
     */
	public Package(String id, boolean isDefault, String image,
			String rolloverImage, Toolbar systembar,
			Map<String, Module> modules) {
		super(id);
		this.isDefault = isDefault;
		this.image = image;
		this.rolloverImage = rolloverImage;
		this.systembar = systembar;
		this.modules = modules;
		this.isHidden = false;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * <java.lang.String, com.capgent.cpt.client.common.dto.DModule>
	 */

	public Map<String, Module> getModules() {
		return modules;
	}

	public Module getModule(String id) {
		Module mod = null;
		if (this.modules != null) {
			mod = this.modules.get(id);
		}
		return mod;
	}

	/**
	 * <java.lang.String>
	 */

	public List<String> getModuleIdsBySequence() {
		List<String> list = null;
		try {
			if (modules == null) {
				list = new ArrayList<String>();
			} else {
				// int size = modules.size();
				list = new ArrayList<String>();
				String id = null;
				Iterator<String> it = modules.keySet().iterator();
				/*
				 * There can be multiple modules in the application. The
				 * sequences of the modules can be 1,2, 3, 4. A user who has
				 * access to all modules will work fine. But if a user has
				 * access to only 2,4 then inorder to make this work we add null
				 * to the array list and make its size equivalent to the module
				 * sequence. Once the sequences are set we remove the null
				 * entries so that null, 2, null,4 becomes 2,4.
				 */
				while (it.hasNext()) {
					id = it.next();
					Module mod = modules.get(id);
					int pos = mod.getSequenceNum();
					if (pos > list.size()) {
						while (list.size() <= pos) {
							list.add(null);
						}
					}
					list.add(pos - 1, id);
					list.remove(pos);
				}
				while (list.contains(null)) {
					list.remove(null);
				}
			}
		} catch (Exception e) {
			
		}
		return list;
	}

	/** 
     */
	public void setModules(Map<String, Module> modules) {
		this.modules = modules;
	}

	public void addModule(Module module) {
		if (this.modules == null) {
			this.modules = new HashMap<String, Module>();
		}

		this.modules.put(module.getId(), module);
	}

	public String getRolloverImage() {
		return rolloverImage;
	}

	public void setRolloverImage(String rolloverImage) {
		this.rolloverImage = rolloverImage;
	}

	public Toolbar getSystembar() {
		return systembar;
	}

	public void setSystembar(Toolbar systembar) {
		this.systembar = systembar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccessRights getRights() {
		return rights;
	}

	public void setRights(AccessRights rights) {
		this.rights = rights;
	}

	public int getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(int sequenceNum) {
		this.sequenceNum = sequenceNum;
	}

	/**
	 * Return the number of modules contained in the package.
	 * 
	 * @return int The number of modules contained in the package.
	 */
	public int size() {
		int size = 0;
		if (this.modules != null) {
			size = this.modules.size();
		}
		return size;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * Get the list of Views present in this Package identified by the viewId.
	 * <p>
	 * 
	 * @return Map of views present in this package. Key -> viewId, Value ->
	 *         DView.
	 */
	public Map<String, View> getViews() 
	{
		return null;
	}

	/**
	 * Gets default module of a package
	 * <p>
	 * 
	 * @param currentPackage
	 *            <code>DPackage</code> object
	 * @return <code>DModule</code> object
	 */
	public Module getDefaultModule() {
		List<String> sequencedModules = getModuleIdsBySequence();
		Module module = null;
		int size = this.modules.size();
		boolean foundDefault = false;
		for (int i = 0; i < size; i++) {
			module = (Module) modules.get(sequencedModules.get(i));
			if (module != null && module.isDefault()) {
				foundDefault = true;
				break;
			}
		}
		if (!foundDefault) {
			module = (Module) modules.get(sequencedModules.get(0).toString());
		}
		return module;
	}

	/**
	 * Sets the uniqueId for the element.
	 * <p>
	 * 
	 * @param parentId
	 *            The unique Id of the parent element.
	 */
	public void setUniqueId(String parentId) {
		// --- set the uniqueId of the package same as the id of the package.
		// ---
		super.setUniqueId(parentId);

		// --- iterate the DModules and set the uniqueId for each module if not
		// assigned already. ---
		if (this.modules != null) {
			Iterator<String> it = modules.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				Module module = modules.get(key);
				module.setUniqueId(this.getUniqueId());
			}
		}
	}

	/**
	 * Gets the package name.
	 * <p>
	 * 
	 * @return packageName; The package name.
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * Sets the package name.
	 * <p>
	 * 
	 * @param packageName
	 *            The package name.
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * Gets the Element Reference.
	 * <p>
	 * 
	 * @return elementReference
	 */
	public ElementReference getElementReference() {
		return elementReference;
	}

	/**
	 * Sets the Element Reference.
	 * <p>
	 * 
	 * @param elementReference
	 */
	public void setElementReference(ElementReference elementReference) {
		this.elementReference = elementReference;
	}

	/**
	 * Set the home page.
	 * <p>
	 * 
	 * @param isHomePage
	 *            Flag indicates whether the current Package is homePage or not?
	 */
	public void setHomePage(boolean isHomePage) {
		this.isHomePage = isHomePage;
	}

	/**
	 * Get the home page.
	 * <p>
	 * 
	 * @return isHomePage Flag indicates whether the current Package is homePage
	 *         or not?
	 */
	public boolean isHomePage() {
		return this.isHomePage;
	}
}
