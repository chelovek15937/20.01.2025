/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Student 2
 */
@Entity
@Table(name = "kafedra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kafedra.findAll", query = "SELECT k FROM Kafedra k")
    , @NamedQuery(name = "Kafedra.findByAi", query = "SELECT k FROM Kafedra k WHERE k.ai = :ai")})
public class Kafedra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 65535)
    @Column(name = "name")
    private String name;
    @Lob
    @Size(max = 65535)
    @Column(name = "groop")
    private String groop;
    @Lob
    @Size(max = 65535)
    @Column(name = "textbook_plants")
    private String textbookPlants;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AI")
    private Integer ai;

    public Kafedra() {
    }

    public Kafedra(Integer ai) {
        this.ai = ai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroop() {
        return groop;
    }

    public void setGroop(String groop) {
        this.groop = groop;
    }

    public String getTextbookPlants() {
        return textbookPlants;
    }

    public void setTextbookPlants(String textbookPlants) {
        this.textbookPlants = textbookPlants;
    }

    public Integer getAi() {
        return ai;
    }

    public void setAi(Integer ai) {
        this.ai = ai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ai != null ? ai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kafedra)) {
            return false;
        }
        Kafedra other = (Kafedra) object;
        if ((this.ai == null && other.ai != null) || (this.ai != null && !this.ai.equals(other.ai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Kafedra[ ai=" + ai + " ]";
    }
    
}
