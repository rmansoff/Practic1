package com.rmans.practice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rmans.practice1.model.Procedure;


@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
}
