package com.home.taskback.mapper.impl;

import com.home.taskback.dto.CompanyDto;
import com.home.taskback.mapper.CompanyMapper;
import com.home.taskback.model.Company;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public Company toCompony(CompanyDto companyDto) {
        Company company = new Company();
        company.setId(companyDto.getId());
        company.setCompanyName(companyDto.getCompanyName());
        return company;
    }

    @Override
    public CompanyDto toCompanyDto(Company company) {
        CompanyDto companyDto = new CompanyDto();
        companyDto.setId(company.getId());
        companyDto.setCompanyName(company.getCompanyName());
        return companyDto;
    }

    @Override
    public Set<CompanyDto> toCompanyDtos(Set<Company> companies) {
        return companies.stream()
                .map(this::toCompanyDto)
                .collect(Collectors.toSet());
    }
}
