package com.rodrigofries.certification_nlw.modules.students.repositories;

import java.util.UUID;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rodrigofries.certification_nlw.modules.students.entities.CertificationStudentEntity;

@Repository // -> Não obrigatório, pois, por exterder uma JPAREPOSITORY ele ja sabe que é um
            // repositorio
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {

  @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
  List<CertificationStudentEntity> findBySudentEmailAndTechnology(String email, String technology);
}
