package com.hburak.projects.quizcms.domain.dto.quiz;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizGetDTO {
    private Long id;
    private String name;
    private String description;
    private Long languageId;
    private Long platformId;
}
