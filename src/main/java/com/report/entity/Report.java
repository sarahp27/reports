package com.report.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long patient_id;

    private enum category {
        Antisocial,
        Avoidant,
        Borderline,
        Dependent,
        Histrionic,
        Narcissistic,
        Obsessive_compulsive,
        Paranoid
    };

    private String survey_form_link;
    private Date created;
    private Date updated;

}
