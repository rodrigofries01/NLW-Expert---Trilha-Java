package com.rodrigofries.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofries.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.rodrigofries.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {

  @Autowired
  private CertificationStudentRepository certificationStudentRepository;

  public boolean execute(VerifyHasCertificationDTO dto) {
    var result = this.certificationStudentRepository.findBySudentEmailAndTechnology(dto.getEmail(),
        dto.getTechnology());
    if (!result.isEmpty()) {
      return true;
    }
    return false;
  }
}
