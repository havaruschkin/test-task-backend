package com.home.taskback.controller;

import com.home.taskback.dto.CompanyDto;
import com.home.taskback.mapper.CompanyMapper;
import com.home.taskback.service.CompanyService;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;
    private final CompanyMapper companyMapper;

    public CompanyController(CompanyService companyService, CompanyMapper companyMapper) {
        this.companyService = companyService;
        this.companyMapper = companyMapper;
    }

    @GetMapping
    public Set<CompanyDto> getAllCompany() {
        return companyMapper.toCompanyDtos(companyService.findAllCompany());
    }
}
