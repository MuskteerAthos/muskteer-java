/**
 * FileName:   MyList.java
 * @Description TODO
 * All rights Reserved, Code by Muskteer
 * Copyright MuskteerAthos@gmail.com
 * @author MuskteerAthos
 */
package com.muskteer.java.datastructure.list;

public interface MyList {

    public void add(Object o);

    public void add(int index, Object o);

    public void clear();

    public boolean contains(Object o);

    public Object get(int index);

    public int indexOf(Object o);

    public boolean isEmpty();

    public int lastIndexOf(Object o);

    public boolean remove(Object o);

    public Object remove(int index);

    public Object set(int index, Object o);

    public int size();

}