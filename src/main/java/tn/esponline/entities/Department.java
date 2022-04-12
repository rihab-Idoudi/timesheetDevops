package tn.esponline.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Department implements Serializable {
    @Id
    private long id;

    public Department () {}

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }
}
