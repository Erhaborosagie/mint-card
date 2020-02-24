package com.example.demo.model;

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
    private int id;

    @NotNull
    @Column(length = 40, unique = true)
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
