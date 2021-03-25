package com.home.taskback.service.impl;

import com.home.taskback.model.Company;
import com.home.taskback.repository.CompanyRepository;
import com.home.taskback.service.CompanyService;
import java.util.HashSet;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Set<Company> findAllCompany() {
        return new HashSet<>(companyRepository.findAll());
    }
}
