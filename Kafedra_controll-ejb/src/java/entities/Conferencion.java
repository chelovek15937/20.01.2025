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
@Table(name = "conferencion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conferencion.findAll", query = "SELECT c FROM Conferencion c")
    , @NamedQuery(name = "Conferencion.findByAi", query = "SELECT c FROM Conferencion c WHERE c.ai = :ai")})
public class Conferencion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 65535)
    @Column(name = "teacher")
    private String teacher;
    @Lob
    @Size(max = 65535)
    @Column(name = "student")
    private String student;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AI")
    private Integer ai;

    public Conferencion() {
    }

    public Conferencion(Integer ai) {
        this.ai = ai;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
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
        if (!(object instanceof Conferencion)) {
            return false;
        }
        Conferencion other = (Conferencion) object;
        if ((this.ai == null && other.ai != null) || (this.ai != null && !this.ai.equals(other.ai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Conferencion[ ai=" + ai + " ]";
    }
    
}
