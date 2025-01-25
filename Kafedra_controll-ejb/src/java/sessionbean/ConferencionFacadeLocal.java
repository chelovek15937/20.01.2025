/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Conferencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student 2
 */
@Local
public interface ConferencionFacadeLocal {

    void create(Conferencion conferencion);

    void edit(Conferencion conferencion);

    void remove(Conferencion conferencion);

    Conferencion find(Object id);

    List<Conferencion> findAll();

    List<Conferencion> findRange(int[] range);

    int count();
    
}
