package com.example.cafe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CAFES")
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAFE_ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "VISIBILITY")
    private Boolean visibility;
    @Column(name = "USE_NAME_OPTION")
    private Boolean useNameOption;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "MANAGER_ID")
    private Long managerId;
    @Column(name = "JOIN_QUESTION_YN")
    private Boolean joinQuestionYn;
    @Column(name = "JOIN_QUESTION")
    private String joinQuestion;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt; //테스트 하기 편하도록 String으로 임의로 바꿔 놓음 -> 추후 DATE로 변환 필요
}

