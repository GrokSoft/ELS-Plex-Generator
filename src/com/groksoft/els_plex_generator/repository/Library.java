package com.groksoft.els_plex_generator.repository;

import java.util.Vector;

/**
 * The type Library.
 */
public class Library
{
    /**
     * Transient hash map for item look-ups
     */
//    public transient Multimap<String, Integer> itemMap;
    public transient com.google.common.collect.ArrayListMultimap<String, Integer> itemMap;
    /**
     * One or more Items.
     */
    public Vector<Item> items;
    /**
     * The library Name.
     */
    public String name;
    /**
     * One or more Sources.
     */
    public String[] sources;

    public Library()
    {
    }

}
