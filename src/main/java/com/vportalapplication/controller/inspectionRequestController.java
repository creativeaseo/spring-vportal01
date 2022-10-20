package com.vportalapplication.controller;

import com.vportalapplication.exception.ResourceNotFoundException;
import com.vportalapplication.model.InspectionRequest;
import com.vportalapplication.repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/inspection")
public class inspectionRequestController {

    @Autowired
    private InspectionRepository inspectionRepository;

    @GetMapping
    public List<InspectionRequest> getAllInspectionRequest() {
        return inspectionRepository.findAll();
    }

    // 점검문의 생성 REST API
    @PostMapping
    public InspectionRequest createInspectionRequest(@RequestBody InspectionRequest inspectionRequest) {
        return inspectionRepository.save(inspectionRequest);
    }

    // 점검문의 등록 글 확인 REST API
    @GetMapping("{id}")
    public ResponseEntity<InspectionRequest> getInspectionRequestById(@PathVariable Long id) {
        InspectionRequest inspectionRequest = inspectionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("아이디가 존재하지 않습니다."));
        return ResponseEntity.ok(inspectionRequest);
    }



}
