package org.example.p02_rest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Integer> {
    List<Memo> findAllByOrderByWriterAsc();
}