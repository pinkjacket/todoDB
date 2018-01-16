package models;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.util.PrimitiveIterator;

/**
 * Created by Guest on 1/16/18.
 */
public class Category {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category(String name, int id){
        this.name = name;
        this.id = id;
    }
}
