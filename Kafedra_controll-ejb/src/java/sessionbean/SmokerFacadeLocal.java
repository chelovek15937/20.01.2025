/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Smoker;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student 2
 */
@Local
public interface SmokerFacadeLocal {

    void create(Smoker smoker);

    void edit(Smoker smoker);

    void remove(Smoker smoker);

    Smoker find(Object id);

    List<Smoker> findAll();

    List<Smoker> findRange(int[] range);

    int count();
    
}
