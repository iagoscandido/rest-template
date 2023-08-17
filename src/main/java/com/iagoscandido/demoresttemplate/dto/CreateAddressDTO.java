package com.iagoscandido.demoresttemplate.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class CreateAddressDTO {

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @NotNull
    public static class Request {
        @NotEmpty
        String cep;

    }

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @NotNull
    public static class Response {
        String id;
    }
}
