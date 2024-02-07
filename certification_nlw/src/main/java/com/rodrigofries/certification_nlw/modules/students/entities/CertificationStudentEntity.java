package com.rodrigofries.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
  private UUID id;
  private UUID studentID;
  private String technology;
  private int grate;
  List<AnswerCertificationsEntity> answerCertificationsEntity;
}
