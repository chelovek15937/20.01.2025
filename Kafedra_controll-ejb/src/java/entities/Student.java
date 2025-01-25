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
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findByAi", query = "SELECT s FROM Student s WHERE s.ai = :ai")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 65535)
    @Column(name = "smoker")
    private String smoker;
    @Lob
    @Size(max = 65535)
    @Column(name = "teacher")
    private String teacher;
    @Lob
    @Size(max = 65535)
    @Column(name = "conferencion")
    private String conferencion;
    @Lob
    @Size(max = 65535)
    @Column(name = "mother_father")
    private String motherFather;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AI")
    private Long ai;

    public Student() {
    }

    public Student(Long ai) {
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

    public String getConferencion() {
        return conferencion;
    }

    public void setConferencion(String conferencion) {
        this.conferencion = conferencion;
    }

    public String getMotherFather() {
        return motherFather;
    }

    public void setMotherFather(String motherFather) {
        this.motherFather = motherFather;
    }

    public Long getAi() {
        return ai;
    }

    public void setAi(Long ai) {
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.ai == null && other.ai != null) || (this.ai != null && !this.ai.equals(other.ai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Student[ ai=" + ai + " ]";
    }
    
}
