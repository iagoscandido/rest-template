package com.iagoscandido.demoresttemplate.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ViaCepDTO {
    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @NotNull
    public static class Response {
        private String cep;
        private String logradouro;
        private String complemento;
        private String bairro;
        private String localidade;
        private String uf;
        private String ibge;
        private String gia;
        private String ddd;
        private String siafi;
    }
}

