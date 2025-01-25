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
@Table(name = "teacher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teacher.findAll", query = "SELECT t FROM Teacher t")
    , @NamedQuery(name = "Teacher.findByWeight", query = "SELECT t FROM Teacher t WHERE t.weight = :weight")
    , @NamedQuery(name = "Teacher.findByAi", query = "SELECT t FROM Teacher t WHERE t.ai = :ai")})
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 65535)
    @Column(name = "conferencion")
    private String conferencion;
    @Lob
    @Size(max = 65535)
    @Column(name = "student")
    private String student;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weight")
    private Double weight;
    @Lob
    @Size(max = 65535)
    @Column(name = "mother_father")
    private String motherFather;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AI")
    private Integer ai;

    public Teacher() {
    }

    public Teacher(Integer ai) {
        this.ai = ai;
    }

    public String getConferencion() {
        return conferencion;
    }

    public void setConferencion(String conferencion) {
        this.conferencion = conferencion;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getMotherFather() {
        return motherFather;
    }

    public void setMotherFather(String motherFather) {
        this.motherFather = motherFather;
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
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.ai == null && other.ai != null) || (this.ai != null && !this.ai.equals(other.ai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Teacher[ ai=" + ai + " ]";
    }
    
}
