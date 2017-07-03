package br.com.integrador.backend.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by simonini on 01/07/17.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Objeto não encontrado")  // 404
class EntityNotFoundException extends RuntimeException {
}