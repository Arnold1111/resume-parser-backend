package com.example.demo.controller;

import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/resumes")
public class ResumeController {

    // [POST] /api/v1/resumes/analyze
    @PostMapping("/analyze")
    public Map<String, Object> analyzeResume(@RequestBody Map<String, Object> request) {
        // 프론트에서 넘어오는 데이터(job_id, candidate_name, resume_text)를 받습니다.
        // 향후 이곳에서 LLM 서버를 호출하고 비동기로 분석을 시작합니다.
        
        // 1. 임의의 이력서 ID 생성
        String generatedResumeId = "r_" + UUID.randomUUID().toString().substring(0, 5);

        // 2. 노션 명세서와 동일한 형태의 응답 (분석 진행 중임을 알림)
        return Map.of(
                "resume_id", generatedResumeId,
                "status", "PENDING"
        );
    }
}