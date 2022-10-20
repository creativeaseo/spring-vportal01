package com.vportalapplication.repository;

import com.vportalapplication.model.InspectionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionRepository extends JpaRepository <InspectionRequest, Long> {
}
