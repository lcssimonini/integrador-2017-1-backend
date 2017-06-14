package br.com.integrador.backend.model;

import javax.persistence.*;

/**
 * Created by simonini on 14/06/17.
 */
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    private Cargo cargo;

    private TimeScrum time;
}
