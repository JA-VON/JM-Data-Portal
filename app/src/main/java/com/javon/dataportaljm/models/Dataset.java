package com.javon.dataportaljm.models;

/**
 * @author Javon Davis
 *         Created by Javon Davis on 28/06/2016.
 */

public class Dataset {

    public String name;
    public String shortDescription;

    public Dataset()
    {

    }

    public Dataset(String name, String shortDescription)
    {
        setName(name);
        setShortDescription(shortDescription);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
