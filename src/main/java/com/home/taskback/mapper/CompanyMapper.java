package com.home.taskback.mapper;

import com.home.taskback.dto.CompanyDto;
import com.home.taskback.model.Company;
import java.util.Set;

public interface CompanyMapper {

    Company toCompony(CompanyDto companyDto);

    CompanyDto toCompanyDto(Company company);

    Set<CompanyDto> toCompanyDtos(Set<Company> companies);
}
