package com;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by j on 1/16/17.
 */
@javax.persistence.Entity
@Data
@Table(name = "table")
public class E {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String username;

}
