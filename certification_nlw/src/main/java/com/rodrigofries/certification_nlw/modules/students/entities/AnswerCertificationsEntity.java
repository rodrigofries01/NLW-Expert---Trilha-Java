package com.rodrigofries.certification_nlw.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerCertificationsEntity {
  private UUID id;
  private UUID certificationID;
  private UUID studentID;
  private UUID questionID;
  private boolean isCorrect;
}
