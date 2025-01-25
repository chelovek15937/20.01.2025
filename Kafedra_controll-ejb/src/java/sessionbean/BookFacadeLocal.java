/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Book;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author директор
 */
@Local
public interface BookFacadeLocal {

    /**
     *
     * @param book
     */
    void create(Book book);

    /**
     *
     * @param book
     */
    void edit(Book book);

    /**
     *
     * @param book
     */
    void remove(Book book);

    /**
     *
     * @param id
     * @return
     */
    Book find(Object id);

    /**
     *
     * @return
     */
    List<Book> findAll();

    /**
     *
     * @param range
     * @return
     */
    List<Book> findRange(int[] range);

    /**
     *
     * @return
     */
    int count();
    
}
