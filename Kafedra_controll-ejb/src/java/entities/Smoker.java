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
@Table(name = "smoker")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Smoker.findAll", query = "SELECT s FROM Smoker s")
    , @NamedQuery(name = "Smoker.findByWeight", query = "SELECT s FROM Smoker s WHERE s.weight = :weight")
    , @NamedQuery(name = "Smoker.findByAi", query = "SELECT s FROM Smoker s WHERE s.ai = :ai")})
public class Smoker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 65535)
    @Column(name = "groop")
    private String groop;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weight")
    private Double weight;
    @Lob
    @Size(max = 65535)
    @Column(name = "textbook_plant")
    private String textbookPlant;
    @Lob
    @Size(max = 65535)
    @Column(name = "Name_mother_father")
    private String namemotherfather;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AI")
    private Integer ai;

    public Smoker() {
    }

    public Smoker(Integer ai) {
        this.ai = ai;
    }

    public String getGroop() {
        return groop;
    }

    public void setGroop(String groop) {
        this.groop = groop;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getTextbookPlant() {
        return textbookPlant;
    }

    public void setTextbookPlant(String textbookPlant) {
        this.textbookPlant = textbookPlant;
    }

    public String getNamemotherfather() {
        return namemotherfather;
    }

    public void setNamemotherfather(String namemotherfather) {
        this.namemotherfather = namemotherfather;
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
        if (!(object instanceof Smoker)) {
            return false;
        }
        Smoker other = (Smoker) object;
        if ((this.ai == null && other.ai != null) || (this.ai != null && !this.ai.equals(other.ai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Smoker[ ai=" + ai + " ]";
    }
    
}
