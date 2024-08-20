package org.example.repository.book.jpa;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public class JpaBookRepository {
}
