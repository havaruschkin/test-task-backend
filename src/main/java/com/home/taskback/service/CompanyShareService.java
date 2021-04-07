package com.home.taskback.service;

import com.home.taskback.model.CompanyShare;
import java.util.List;

public interface CompanyShareService {

    List<CompanyShare> findAllCompanyShare();

    void saveCompanyShare(CompanyShare companyShare);

    void updateCompanyShare(CompanyShare companyShare);
}
