package com.iagoscandido.demoresttemplate.service;


import com.iagoscandido.demoresttemplate.dto.GetAddressViaCepDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class GetAddressViaCepService {

    public GetAddressViaCepDTO.Response execute (String cep){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GetAddressViaCepDTO.Response> responseEntity =
                restTemplate
                        .getForEntity
                                (String.format("https://viacep.com.br/ws/%s/json/", cep), GetAddressViaCepDTO.Response.class);
        return responseEntity.getBody();


    }
}
