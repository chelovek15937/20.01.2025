/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Groop;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student 2
 */
@Local
public interface GroopFacadeLocal {

    void create(Groop groop);

    void edit(Groop groop);

    void remove(Groop groop);

    Groop find(Object id);

    List<Groop> findAll();

    List<Groop> findRange(int[] range);

    int count();
    
}
