package tn.esponline.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Entreprise implements Serializable {
    @Id
    private long id;

}
