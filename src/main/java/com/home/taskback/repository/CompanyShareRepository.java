package com.home.taskback.repository;

import com.home.taskback.model.CompanyShare;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompanyShareRepository extends JpaRepository<CompanyShare, Long> {
}
