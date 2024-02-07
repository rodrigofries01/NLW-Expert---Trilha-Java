package com.rodrigofries.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
  private UUID id;
  private String email;
  private List<CertificationStudentEntity> CertificationStudentEntity;
}
