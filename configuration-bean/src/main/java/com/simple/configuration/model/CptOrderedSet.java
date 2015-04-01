package com.simple.configuration.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * This class is an implmentation for an ordered Set.
 *
 */
public class CptOrderedSet implements Set
{
    private ArrayList value;
    
    /**
     * Initialize a new CptOrderedSet Object.
     *
     */
    public CptOrderedSet()
    {
        this.value = new ArrayList();
    }
    
    /**
     * 
     * Returns the number of key-value mappings in this map. 
     * @return int The number of key-value mappings in this map.
     */

    public int size()
    {
       return this.value.size();
    }

    /**
     * clears all the key - value mappings from this map.
     */
    public void clear()
    {
        this.value.clear();
    }
    

    /**
    * checks if this map contains any key-value mappings. 
    * @return boolean - true if this map is empty false otherwise.
    */
    public boolean isEmpty()
    {
        boolean ret = false;
        if (this.value.size() == 0)
        {
            ret = true;
        }
        return ret;
    }

    /**
     * Returns an array containing all of the elements in this set. 
     * @return Object[] ret - an array containing all of the elements in this set.
     * @throws ArrayStoreException - the runtime type of a is not a supertype of the runtime type of every element in this set. 
         NullPointerException - if the specified array is null.
    */
    public Object[] toArray() throws ArrayStoreException, NullPointerException
    {
        Object[] ret = new Object[this.value.size()];
        for (int i=0; i<this.value.size(); i++)
        {
            ret[i] = this.value.get(i);
        }
        return ret;
    }
    
    /**
     * Returns an array containing all of the elements in this set.
     * @param Object[] arg0 - the array into which the elements of this set are to be stored.
     * @return Object[] arg0 - an array containing the elements of this set. 
     */
                     
     public Object[] toArray(Object[] arg0) throws ArrayStoreException, NullPointerException
     {
         for (int i=0; i<this.value.size(); i++)
         {
             arg0[i] = this.value.get(i);
         }
         return arg0;
     }

    /**
     * Adds the specified element to this set if it is not already present.
     * If this set already contains the specified element, the call leaves this set unchanged and returns false. 
     * @param Object arg0 - element to be added to this set.
     * @return boolean true if this set did not already contain the specified element.  
    */
    public boolean add(Object arg0) throws UnsupportedOperationException, ClassCastException, 
    NullPointerException, IllegalArgumentException
    {
        boolean ret = false;
        if (!this.value.contains(arg0))
        {
            this.value.add(arg0);
            ret = true;
        }
        return ret;
    }

    /**
     * Returns true if this set contains the specified element.
     * @return boolean ret - true if this set contains the specified element.
     */
    public boolean contains(Object arg0) throws ClassCastException, NullPointerException 
    {
        boolean ret = false;
        if (this.value.contains(arg0))
        {
            ret = true;
        }
        return ret;
    }

    /**
     * Removes the specified element from this set if it is present.
     * @param Object arg0 - object to be removed from this set, if present. 
     */
    public boolean remove(Object arg0) throws ClassCastException, NullPointerException, UnsupportedOperationException
    {
        boolean ret = true;
        int index = this.value.indexOf(arg0);
        this.value.remove(index);
        return ret;
    }
    
    /**
     * Returns an iterator over the elements in this set.The elements returned will be in order.
     * 
     */
    public Iterator iterator()
    {
        return this.value.iterator();
    }

    /**
     * Adds all of the elements in the specified collection to this set if they're not already present.
     * @param Collection collection - collection whose elements are to be added to this set.
     * @return boolean ret - true if this set changed as a result of the call. 
     */
    public boolean addAll(Collection collection)
    {
        boolean ret = false;
        Iterator it = collection.iterator();
        while (it.hasNext())
        {
            this.value.add(it.next());
            ret = true;
        }
        return ret;
    }

    /**
     * Returns true if this set contains all of the elements of the specified collection.
     * @param Collection collection - collection to be checked for containment in this set.
     * @return boolean ret - true if this set contains all of the elements of the specified collection. 
     */
    public boolean containsAll(Collection collection) throws ClassCastException, NullPointerException
    {
        boolean ret = true;
        Iterator itr = collection.iterator();
        Object obj = null;
       
        while (itr.hasNext())
        {
            obj = itr.next();
            if (!this.value.contains(obj))
            {
                ret = false;
                break;
            }
        }
        return ret;
    }

    /**
     * Removes from this set all of its elements that are contained in the specified collection.
     * @param Collection collection - collection that defines which elements will be removed from this set.
     * @return boolean ret - true if this set changed as a result of the call. 
     */
    public boolean removeAll(Collection collection) throws ClassCastException, NullPointerException, UnsupportedOperationException
    {
        boolean ret = false;
        Iterator itr = collection.iterator();
        Object obj = null;
        while (itr.hasNext())
        {
            obj = itr.next();
            if (this.value.contains(obj))
            {
                this.value.remove(obj);
                ret = true;
            }
        }
        return ret;
    }

    /**
     * Retains only the elements in this set that are contained in the specified collection.
     * @param Collection collection -  collection that defines which elements this set will retain.
     * @return boolean ret - true if this collection changed as a result of the call. 
     */
    public boolean retainAll(Collection collection) throws ClassCastException, NullPointerException, UnsupportedOperationException
    {
         boolean ret = false;
         Iterator itr = collection.iterator();
         Object obj = null;
         while (itr.hasNext())
         {
             obj = itr.next();
             if (!this.value.contains(obj))
             {
                 this.value.remove(obj);
                 ret = true;
             }
         }
         return ret;
    }
    
    /**
     * Returns a string representation all the elements contained in this set.
     * @return String buff - a string representation of the object.
    */
    public String toString()
    {
        StringBuffer buff = new StringBuffer("\n{");
        for (int i = 0; i<value.size(); i++)
        {
            buff.append(value.get(i));
            if (i < value.size()-1)
            {
                buff.append(",");
            }
        }
        buff.append("}\n");
        return buff.toString();
    }
    
 
    public static void main(String[] args)
    {
       CptOrderedSet set = new CptOrderedSet();
       set.add("Omnicom");
       set.add("Porternovelli");
       set.add("Doremus");
       
       //--- test code ---
       //System.out.println("Contains = "+set.contains("Ohio"));
       
    }
}