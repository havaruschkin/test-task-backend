package com.home.taskback.service;

import com.home.taskback.model.Company;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public interface CompanyService {

    Set<Company> findAllCompany();
}
