package com;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

/**
 * Created by j on 1/16/17.
 */
@javax.persistence.Entity
@Data
@Getter
@Table(name = "table")
public class E {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="username")
    private String username;

}
