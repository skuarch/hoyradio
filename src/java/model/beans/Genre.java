package model.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author skuarch
 */
@Entity
@Table(name = "genre")
public class Genre implements Serializable{

    @Id
    @Column(name = "genre_id")    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "genre_name",nullable = false)
    private String name = null;
    
    //==========================================================================
    public Genre() {
    } // end Genre

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "id=" + id + " name=" + name;
    }
    
} // end class