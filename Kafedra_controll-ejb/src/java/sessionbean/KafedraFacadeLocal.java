/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Kafedra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student 2
 */
@Local
public interface KafedraFacadeLocal {

    void create(Kafedra kafedra);

    void edit(Kafedra kafedra);

    void remove(Kafedra kafedra);

    Kafedra find(Object id);

    List<Kafedra> findAll();

    List<Kafedra> findRange(int[] range);

    int count();
    
}
