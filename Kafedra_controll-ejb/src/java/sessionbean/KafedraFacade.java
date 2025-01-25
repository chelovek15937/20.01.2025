/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Kafedra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Student 2
 */
@Stateless
public class KafedraFacade extends ConferenceFacadeLocal<Kafedra> implements KafedraFacadeLocal {

    @PersistenceContext(unitName = "kafedra-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KafedraFacade() {
        super(Kafedra.class);
    }
    
}
