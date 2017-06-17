package br.com.integrador.backend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by simonini on 14/06/17.
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PersistableEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    @PrePersist
    private void onCreate() {
        this.createdAt = new Timestamp(new Date().getTime());
    }

    @PreUpdate
    private void onUpdate() {
        this.updatedAt = new Timestamp(new Date().getTime());
    }
}
