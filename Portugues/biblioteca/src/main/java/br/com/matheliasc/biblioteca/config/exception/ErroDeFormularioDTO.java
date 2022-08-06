package br.com.matheliasc.biblioteca.config.exception;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ErroDeFormularioDTO {

    private final String campo;
    private final String erro;
}
