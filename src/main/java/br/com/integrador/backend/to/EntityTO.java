package br.com.integrador.backend.to;

import br.com.integrador.backend.model.PersistableEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by simonini on 18/06/17.
 */
@Builder
public class EntityTO {

    @Getter
    @Setter
    private PersistableEntity entity;

    private List<EntityError> errorList;

    public void addError(String message) {
        this.errorList.add(EntityError.of(message));
    }

    public boolean hasError() {
        return !this.errorList.isEmpty();
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
