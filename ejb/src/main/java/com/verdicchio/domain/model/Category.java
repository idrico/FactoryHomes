package com.verdicchio.domain.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by anonymous on 20/11/15.
 */
@Entity
@XmlRootElement
@Table(name = "Category", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Category implements Serializable {

    @Id
    @Column( nullable = false)
    @GeneratedValue
    private Long id;
    private String name;

    public long getId() {
        return this.id.longValue();
    }

    public void setId(long id) {
        this.id = Long.valueOf(id);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!id.equals(category.id)) return false;
        return  name.equals(category.name);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();

        return result;
    }
}