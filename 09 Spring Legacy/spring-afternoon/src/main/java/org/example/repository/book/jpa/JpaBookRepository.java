package org.example.repository.book.jpa;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Repository
@Slf4j
public class JpaBookRepository {
    private final EntityManager em;

    public List<Book> findAll() {
        String jpql = "select b from Book b";
        List<Book> bookList = em.createQuery(jpql, Book.class).getResultList();
        return bookList;
    }

    public Book save(Book book) {
        em.persist(book);
        return book;
    }

    public Book findById(Long id) {
        return em.find(Book.class, id);
    }

    public void delete(Long id) {
        Book book = em.find(Book.class, id);
        if (book != null) em.remove(book);
    }
}
