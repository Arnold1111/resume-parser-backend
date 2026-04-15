package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "job_postings")
@Getter
@Setter
@NoArgsConstructor
public class JobPosting {

    @Id
    private String id;

    @Column(nullable = false)
    private String title;

    // DB에 있는 requirement 컬럼으로 매핑
    @Column(columnDefinition = "TEXT")
    private String requirement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruiter_id")
    private Recruiter recruiter;
}