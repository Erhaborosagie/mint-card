package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by Osagie Erhabor on 24/02/2020.
 */
@Data
@Entity
public class Cards {

    @Id
    @NotNull
    @JsonIgnore
    private int id;

    @NotNull
    @Column(length = 40, unique = true)
    @JsonIgnore
    private Long cardId;

    @NotNull
    @Column(length = 40)
    private String scheme;

    @NotNull
    @Column(length = 40)
    private String type;

    @Column
    private String bank;
}
