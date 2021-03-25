package com.home.taskback.mapper.impl;

import com.home.taskback.dto.CompanyShareDto;
import com.home.taskback.mapper.CompanyMapper;
import com.home.taskback.mapper.CompanyShareMapper;
import com.home.taskback.model.CompanyShare;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class CompanyShareMapperImpl implements CompanyShareMapper {

    private final CompanyMapper companyMapper;

    public CompanyShareMapperImpl(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    @Override
    public CompanyShare toComponyShare(CompanyShareDto companyShareDto) {
        CompanyShare companyShare = new CompanyShare();
        companyShare.setId(companyShareDto.getId());
        companyShare.setPrice(companyShareDto.getPrice());
        companyShare.setDate(companyShareDto.getDate());
        companyShare.setCompany(companyMapper.toCompony(companyShareDto.getCompanyDto()));
        return companyShare;
    }

    @Override
    public CompanyShareDto toCompanyShareDto(CompanyShare companyShare) {
        CompanyShareDto companyShareDto = new CompanyShareDto();
        companyShareDto.setId(companyShare.getId());
        companyShareDto.setPrice(companyShare.getPrice());
        companyShareDto.setDate(companyShare.getDate());
        companyShareDto.setCompanyDto(companyMapper.toCompanyDto(companyShare.getCompany()));
        return companyShareDto;
    }

    @Override
    public List<CompanyShareDto> toCompanyShareDtos(List<CompanyShare> companyShares) {
        return companyShares.stream()
                .map(this::toCompanyShareDto)
                .collect(Collectors.toList());
    }
}
