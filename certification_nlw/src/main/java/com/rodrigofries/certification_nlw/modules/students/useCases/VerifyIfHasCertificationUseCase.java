package com.rodrigofries.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rodrigofries.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
  public boolean execute(VerifyHasCertificationDTO dto) {
    if (dto.getEmail().equals("email@email.com") && dto.getTechnology().equals("JAVA")) {
      return true;
    }
    return false;
  }
}
