package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yu on 2017/4/21.
 */
public class Propertis {
    private List<Property> properties = new ArrayList<Property>();

    public Propertis() {
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void addProperties(Property property) {
        this.properties.add(property);
    }
}
