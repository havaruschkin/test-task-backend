package com.home.taskback.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CompanyShareDto {

    private long id;
    private CompanyDto companyDto;
    private int price;
    private LocalDate date;
}
