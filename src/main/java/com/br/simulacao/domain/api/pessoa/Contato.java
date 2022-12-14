package com.br.simulacao.domain.api.pessoa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Contato {
    private String logradouro;
    private String email;
    private String celular;

}
