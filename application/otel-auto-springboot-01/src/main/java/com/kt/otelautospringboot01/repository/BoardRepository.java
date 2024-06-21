package com.kt.otelautospringboot01.repository;


import com.kt.otelautospringboot01.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface BoardRepository extends JpaRepository<Board,Long> {

    Page<Board> findAll(Pageable pageable);

}
