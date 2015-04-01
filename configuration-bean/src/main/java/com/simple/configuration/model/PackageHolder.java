package com.simple.configuration.model;

import java.util.Map;

/**
 * List of packages existing in the system. 
 */
public class PackageHolder extends Id
{
    /**
     * Map of packages available in the system keyed by Package Id.
     */
    private Map<String,Package> packages;
    
    /**
     * Initialize a new object.
     */
    public PackageHolder()
    {
    }
   
    /**
     * Get all the packages avaiable in the system.
     * <p>
     * @return
     *      Map of all packages avaiable in the system keyed by package id.
     */
    public Map<String, Package>  getPackages()
    {
        return packages;
    }
   
    /**
     * Set all the packages avaiable in the system keyed by package id.
     * <p>
     * @param packages
     *      Map of all packages avaiable in the system keyed by package id.
     */
    public void setPackages(Map<String,Package> packages)
    {
        this.packages = packages;
    }
}
