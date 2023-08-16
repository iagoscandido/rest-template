package com.iagoscandido.demoresttemplate.controller;

import com.iagoscandido.demoresttemplate.dto.ViaCepDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/{cep}")
    public ViaCepDTO.Response getAddress (@PathVariable String cep){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ViaCepDTO.Response> responseEntity =
                restTemplate
                        .getForEntity
                        (String.format("https://viacep.com.br/ws/%s/json/", cep), ViaCepDTO.Response.class);
        return responseEntity.getBody();
    }

}
