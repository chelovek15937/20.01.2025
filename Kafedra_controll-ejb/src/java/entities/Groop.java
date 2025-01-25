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
@Table(name = "groop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groop.findAll", query = "SELECT g FROM Groop g")
    , @NamedQuery(name = "Groop.findByWeight", query = "SELECT g FROM Groop g WHERE g.weight = :weight")
    , @NamedQuery(name = "Groop.findByAi", query = "SELECT g FROM Groop g WHERE g.ai = :ai")})
public class Groop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 65535)
    @Column(name = "smoker")
    private String smoker;
    @Lob
    @Size(max = 65535)
    @Column(name = "teacher")
    private String teacher;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weight")
    private Double weight;
    @Lob
    @Size(max = 65535)
    @Column(name = "textbook_plant")
    private String textbookPlant;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AI")
    private Integer ai;

    public Groop() {
    }

    public Groop(Integer ai) {
        this.ai = ai;
    }

    public String getSmoker() {
        return smoker;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
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
        if (!(object instanceof Groop)) {
            return false;
        }
        Groop other = (Groop) object;
        if ((this.ai == null && other.ai != null) || (this.ai != null && !this.ai.equals(other.ai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Groop[ ai=" + ai + " ]";
    }
    
}
