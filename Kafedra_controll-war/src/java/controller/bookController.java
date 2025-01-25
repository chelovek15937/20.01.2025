/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Book;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import sessionbean.BookFacadeLocal;


/**
 *
 * @author Student
 */
@Named(value = "bookController")
@SessionScoped
public class bookController implements Serializable {

    /**
     * Creates a new instance of bookController
     */
    public bookController() {
    }

    @EJB
    private BookFacadeLocal booksFacade;
    private Book book = new Book();
    private String name;
    private String author;
    private Integer year;
    private String category;
    private long price;

    public BookFacadeLocal getBooksFacade() {
        return booksFacade;
    }

    public void setBooksFacade(BookFacadeLocal booksFacade) {
        this.booksFacade = booksFacade;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    

    private Book selectedBook;

    public Book getSelectedBook() {
        return selectedBook;
    }

    public void setSelectedBook(Book selectedBook) {
        this.selectedBook = selectedBook;
    }

    public void emptyVariables() {
        this.author = "";
        this.category = "";
        this.name = "";
        this.price = 0;
        this.year = 0;
    }

    public String createBook() {
        this.book.setAuthor(this.author);
        this.book.setCategory(this.category);
        this.book.setName(this.name);
        this.book.setPrice((int) this.price);
        this.book.setYear(this.year);
        this.booksFacade.create(this.book);
        this.emptyVariables();
        return "start.xhtml?faces-redirect=true";
    }

    public List<Book> getAllBooks() {
        return this.booksFacade.findAll();
    }

    public String updateBook(Book book) {
        this.booksFacade.edit(this.book);
        return "start.xhtml?faces-redirect=true";
    }

    public String deleteBook(Book book) {
        this.booksFacade.remove(book);
        return "start.xhtml?faces-redirect=true";
    }

}
