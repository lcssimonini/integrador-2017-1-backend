package br.com.integrador.backend.model;

import org.apache.commons.lang.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by simonini on 14/06/17.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PersistableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(columnDefinition = "serial")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    private transient List<EntityError> errorList;

    @PrePersist
    private void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    private void onUpdate() {
        this.updatedAt = new Date();
    }

    public void addError(String message) {
        this.errorList.add(EntityError.of(message));
    }

    public boolean hasError() {
        return !this.errorList.isEmpty();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private static class EntityError {

        private String message;

        private EntityError() {}

        public static EntityError of(String message) {
            if (!StringUtils.isEmpty(message)) {
                throw new IllegalArgumentException("mensagem nao pode ser vazia");
            }
            EntityError error = new EntityError();
            error.message = message;
            return error;
        }
    }
}
