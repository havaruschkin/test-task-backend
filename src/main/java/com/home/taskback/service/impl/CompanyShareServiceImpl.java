package com.home.taskback.service.impl;

import com.home.taskback.model.CompanyShare;
import com.home.taskback.repository.CompanyShareRepository;
import com.home.taskback.service.CompanyShareService;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CompanyShareServiceImpl implements CompanyShareService {

    private final CompanyShareRepository companyShareRepository;

    public CompanyShareServiceImpl(CompanyShareRepository companyShareRepository) {
        this.companyShareRepository = companyShareRepository;
    }

    public List<CompanyShare> findAllCompanyShare() {
        return new ArrayList<>(companyShareRepository.findAll());
    }

    public CompanyShare findCompanyShareById(Long id) {
        return companyShareRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public void saveCompanyShare(CompanyShare companyShare) {
        companyShareRepository.save(companyShare);
    }

    public void updateCompanyShare(CompanyShare companyShare) {
        companyShareRepository.findById(companyShare.getId())
                .map(share -> {
                    share.setDate(companyShare.getDate());
                    share.setPrice(companyShare.getPrice());
                    share.setCompany(companyShare.getCompany());
                    return share;
                });
    }
}
