package br.com.integrador.backend.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by simonini on 14/06/17.
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @NotEmpty(message = "Login não pode ser vazio")
    private String login;

    @NotEmpty(message = "Senha não pode ser vazia")
    private String senha;

    private Funcionario funcionario;
}
