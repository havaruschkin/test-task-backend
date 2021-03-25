package com.home.taskback.controller;

import com.home.taskback.dto.CompanyShareDto;
import com.home.taskback.mapper.CompanyShareMapper;
import com.home.taskback.service.CompanyShareService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companyShare")
public class CompanyShareController {

    private final CompanyShareService companyShareService;
    private final CompanyShareMapper companyShareMapper;

    public CompanyShareController(CompanyShareService companyShareService, CompanyShareMapper companyShareMapper) {
        this.companyShareService = companyShareService;
        this.companyShareMapper = companyShareMapper;
    }

    @GetMapping
    public List<CompanyShareDto> getAllCompanyShare() {
        return companyShareMapper.toCompanyShareDtos(companyShareService.findAllCompanyShare());
    }

    @PostMapping
    public void saveCompanyShare(@RequestBody CompanyShareDto companyShareDto) {
        companyShareService.saveCompanyShare(companyShareMapper.toComponyShare(companyShareDto));
    }

    @PutMapping
    public void updateCompanyShare(@RequestBody CompanyShareDto companyShareDto) {
        companyShareService.updateCompanyShare(companyShareMapper.toComponyShare(companyShareDto));
    }
}
