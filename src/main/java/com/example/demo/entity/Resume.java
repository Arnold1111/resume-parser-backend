package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "resumes")
@Getter
@Setter
@NoArgsConstructor
public class Resume {

    @Id
    private String id;

    @Column(name = "candidate_name")
    private String candidateName;

    @Column(name = "resume_text", columnDefinition = "TEXT")
    private String resumeText;

    private String status;

    @Column(name = "applied_at")
    private LocalDateTime appliedAt;

    @Column(name = "recruitment_status")
    private String recruitmentStatus;

    // DB 컬럼명에 맞춰 job_posting_id가 아닌 job_id로 수정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id")
    private JobPosting jobPosting;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruiter_id")
    private Recruiter recruiter;
}