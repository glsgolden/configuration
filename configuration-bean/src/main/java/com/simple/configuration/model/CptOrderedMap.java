package com.simple.configuration.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * This class is an implmentation for an ordered Map.
 */
public class CptOrderedMap implements Map
{
    private ArrayList key;
    private ArrayList value;
     
    /**
     * Initialize a new CptOrderedMap Object.
     */
    public CptOrderedMap()
    {
        this.key = new ArrayList();
        this.value = new ArrayList();
    }
    
    /**
     * Initialize a new CptOrderedMap Object for a given size.
     * <p>
     * @param size
     * 		The initial size for the Map.
     */
    public CptOrderedMap(int size)
    {
        this.key = new ArrayList(size);
        this.value = new ArrayList(size);
    }
    
    /**
     * 
     * Returns the number of key-value mappings in this map. 
     * @return int ret - The number of key-value mappings in this map.
     */

    public int size()
    {
        int ret = 0;
        ret = key.size();
        return ret;
    }

    /**
     * clears all the key - value mappings from this map.
     */
    public void clear()
    {
        key.clear();
        value.clear();
    }

    /**
     * checks if this map contains any key-value mappings. 
     * @return boolean ret - true if this map is empty false otherwise.
     */
    public boolean isEmpty()
    {
        boolean ret = true;
        int size = key.size();
        if (size != 0)
        {
            ret = false;
        }
        return ret;
    }
    
    /**
     * checks if this map contains a mapping for the specified key.
     * @return boolean ret - true if this map contains the specified key, false otherwise.
     */

    public boolean containsKey(Object objKey)
    {
        boolean ret = false;
        int index = key.indexOf(objKey);
        if (index != -1)
        {
           ret = true;
        }
        return ret;
    }

    /**
     * checks if this map contains a mapping for the specified value.
     * @return boolean ret - true if this map contains the specified value, false otherwise.
     */
    public boolean containsValue(Object objVal)
    {
        boolean ret = false;
       
        int index = value.indexOf(objVal);
        if (index != -1)
        {
            ret = true;
        }
        return ret;
    }

    /**
     * Returns a collection view of the values contained in this map.
     * @return Collection value - <code>ArrayList</code>object containing all the values in this map.
     */
    public Collection values()
    {      
        return value;
    }

    /**
     *  Copies all of the mappings from the specified map to this map.
     *  @param Map map - The Map object.
     */
    public void putAll(Map map) throws NullPointerException
    {        
        Set keySet = map.keySet();
        Iterator itr = keySet.iterator();
        Object obj = null;
        while (itr.hasNext())
        {
            obj = itr.next();
            if (key.contains(obj))
            {
                value.set(key.indexOf(obj), map.get(obj));
            }
            else
            {
                key.add(obj);
                value.add(map.get(obj));
            }
        }
    }
    public Iterator iterator()
    {
        return this.key.iterator();
    }

    /**
     * Returns a set view of the mappings contained in this map. 
     * @return Set ret - The HashSet object.
     */
    public Set entrySet()
    {
         CptOrderedSet ret = new CptOrderedSet();
         CptOrderedMap mapping = new CptOrderedMap();
         Iterator itr = key.iterator();
         Object keyObj = null;
         Object valueObj = null;
         
         while (itr.hasNext())
         {
             keyObj = itr.next();
             valueObj = value.get(key.indexOf(keyObj));
             mapping.put(keyObj, valueObj);
         }
         ret.add(mapping);
         return ret;
    }

    /**
     * Returns a set view of the keys contained in this map.
     * @return Set ret - <code>CptOrderedSet</code> object. 
     *  
     */
    public Set keySet()
    {
        CptOrderedSet ret = new CptOrderedSet();
        ret.addAll(key);
        return ret;
    }

    /**
     * Returns the value to which this map maps the specified key. Returns null if the map contains no mapping for this key.
     * @return Object ret - The value for the key specified.
     */
    public Object get(Object obj)
    {
        Object ret = null;
        if (key.contains(obj))
        {
            ret = value.get(key.indexOf(obj));
        }
        return ret;
    }

    /**
     * Removes the mapping for this key from this map if it is present.
     * @return Object ret - previous value associated with specified key, or null if there was no mapping for key. 
     */
    public Object remove(Object obj)
    {
        Object ret = null;
        int index = key.indexOf(obj);
        if (index != -1)
        {
        	ret = value.get(index);
        	key.remove(index);
        	value.remove(index);
        }
        return ret;
    }

    /**
     * Associates the specified value with the specified key in this map.
     * @param Object objKey - the key, Object objValue - the value to be associated with the key.
     */
    public Object put(Object objKey, Object objVal)
    {
        Object ret = null;
        if (key.contains(objKey))
        {
            int index = key.indexOf(objKey);
            ret = value.get(index);
            value.set(index, objVal);
        }
        else
        {
            key.add(objKey);
            value.add(objVal);
        }
        return ret;
    }
    
    /**
     * Returns a string representation all the key - value mappings contained in this map.
     * @return String buff - a string representation of the object.
    */
    public String toString()
    {
        StringBuffer buff = new StringBuffer("\n{");
        for (int i = 0; i<key.size(); i++)
        {
            buff.append(key.get(i));
            buff.append("=");
            buff.append(value.get(i));
            if (i < key.size()-1)
            {
                buff.append(",");
            }
        }
        buff.append("}\n");
        return buff.toString();
    }
    
    /**
     * Get the key for the corresponding value.
     * <p>
     * 
     * @param value
     *      the value present in Map
     * @return
     *      The corresponding key which matches first.
     */
    public Object getKey(Object value)
    {
        Object key = null;
        int valueIndex = this.value.indexOf(value);
        if (valueIndex != -1)
        {
            key = this.key.get(valueIndex);
        }
        return key;
    }
    
    /**
     * Get index for given key.
     * @param objKey
     * 		Object objKey - the key
     * @return
     * 		Return index for given key.
     */
    public int getIndexOfKey(Object objKey)
    {
    	int index = key.indexOf(objKey);
    	return index;
    }
    
    /**
     * Get the List of key stored in the
     * map.
     * <p>
     * @return key
     *      <code>ArrayList</code> of key stored 
     *       for this map.
     */
    public ArrayList getKeys()
    {
        return key;
    }

    /**
     * Get the List of values stored in the
     * map.
     * <p>
     * @return value
     *      <code>ArrayList</code> of value stored 
     *       for this map.
     */
    public ArrayList getValues()
    {
        return value;
    }    
}