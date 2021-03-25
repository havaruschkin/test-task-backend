package com.home.taskback.mapper;

import com.home.taskback.dto.CompanyShareDto;
import com.home.taskback.model.CompanyShare;
import java.util.List;

public interface CompanyShareMapper {

    CompanyShare toComponyShare(CompanyShareDto companyShareDto);

    CompanyShareDto toCompanyShareDto(CompanyShare companyShare);

    List<CompanyShareDto> toCompanyShareDtos(List<CompanyShare> companyShares);
}
