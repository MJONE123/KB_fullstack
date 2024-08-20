package org.example.repository.book.mybatis;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookRepository {
    private final BookMapper bookMapper;

    

}
