package controller;

import entities.Conferencion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.ConferenceFacadeLocal;

@Named(value = "ConferenceController")
@SessionScoped
public class ConferenceController implements Serializable {

    @EJB
    private ConferenceFacadeLocal conferenceFacade;

    private Conferencion selectedConference;
    private Conferencion conference = new Conferencion();
    private String teacher;
    private String student;
    //private int AI;

    public ConferenceController() {
    }

    public Conferencion getSelectedConference() {
        return selectedConference;
    }

    public void setSelectedConference(Conferencion selectedConference) {
        this.selectedConference = selectedConference;
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

    //public Integer getAi() {
    //    return AI;
    //}

    //public void setAi(Integer AI) {
    //    this.AI = AI;
    //}

    public List<Conferencion> getAllConference() {
        return this.conferenceFacade.findAll();
    }

    public void emptyVariables() {
    //    this.AI = 0;
        this.conference = null;
        this.conferenceFacade = null;
        this.selectedConference = null;
        this.student = "";
    }

    public String createConference() {
        this.conference.setStudent(this.student);
        this.conference.setTeacher(this.teacher);
        this.conferenceFacade.create(this.conference);
        this.emptyVariables();
        return "index.xhtml?faces-redirect=true";
    }

    public String updateConference() {
        this.conferenceFacade.edit(this.selectedConference);
        return "index.xhtml?faces-redirect=true";
    }

    public String deleteConference(Conferencion conference) {
        this.conferenceFacade.remove(conference);
        return "index.xhtml?faces-redirect=true";
    }
}
