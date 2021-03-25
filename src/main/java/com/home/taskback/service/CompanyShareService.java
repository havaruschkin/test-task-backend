package com.home.taskback.service;

import com.home.taskback.model.CompanyShare;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public interface CompanyShareService {

    List<CompanyShare> findAllCompanyShare();

    CompanyShare findCompanyShareById(Long id);

    void saveCompanyShare(CompanyShare companyShare);

    void updateCompanyShare(CompanyShare companyShare);
}
