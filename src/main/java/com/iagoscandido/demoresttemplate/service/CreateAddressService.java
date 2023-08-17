package com.iagoscandido.demoresttemplate.service;


import com.iagoscandido.demoresttemplate.controller.mapper.AddressMapper;
import com.iagoscandido.demoresttemplate.dto.GetAddressViaCepDTO;
import com.iagoscandido.demoresttemplate.model.Address;
import com.iagoscandido.demoresttemplate.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateAddressService {
    private final AddressRepository repository;
    private final AddressMapper addressMapper;
    private final GetAddressViaCepService getAddressViaCepService;

    public Address execute (String cep) {

        GetAddressViaCepDTO.Response dto = getAddressViaCepService.execute(cep);
        dto.setCep(cepFormatter(dto.getCep()));

        return repository.save(addressMapper.toAddress(dto));
    }

    private String cepFormatter (String cep) {
        return cep.replace("-", "");
    }

}
