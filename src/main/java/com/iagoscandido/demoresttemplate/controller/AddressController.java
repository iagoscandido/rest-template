package com.iagoscandido.demoresttemplate.controller;

import com.iagoscandido.demoresttemplate.dto.CreateAddressDTO;
import com.iagoscandido.demoresttemplate.dto.GetAddressViaCepDTO;
import com.iagoscandido.demoresttemplate.model.Address;
import com.iagoscandido.demoresttemplate.repository.AddressRepository;
import com.iagoscandido.demoresttemplate.service.CreateAddressService;
import com.iagoscandido.demoresttemplate.service.GetAddressViaCepService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    private final GetAddressViaCepService getAddressViaCepService;
    private final CreateAddressService createAddressService;
    private final AddressRepository repository;

    @GetMapping("/{cep}")
    @ResponseStatus(HttpStatus.OK)
    public GetAddressViaCepDTO.Response getCep(@PathVariable String cep) {
        return getAddressViaCepService.execute(cep);
    }

    @GetMapping("/all")
    public List<Address> getAll() {
        return repository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateAddressDTO.Response createAddress(
            @Valid @RequestBody CreateAddressDTO.Request requestBody
    ) {
        String cep =  requestBody.getCep();

        Address address = createAddressService.execute(cep);

        return new CreateAddressDTO.Response(address.getId().toString());
    }
}


