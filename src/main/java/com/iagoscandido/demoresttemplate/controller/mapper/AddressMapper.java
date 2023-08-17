package com.iagoscandido.demoresttemplate.controller.mapper;

import com.iagoscandido.demoresttemplate.dto.GetAddressViaCepDTO;
import com.iagoscandido.demoresttemplate.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public Address toAddress (GetAddressViaCepDTO.Response viaCepDTOResponse){
        if (viaCepDTOResponse == null)
            return null;

        Address address = new Address();

        address.setCep(viaCepDTOResponse.getCep());
        address.setLogradouro(viaCepDTOResponse.getLogradouro());
        address.setComplemento(viaCepDTOResponse.getComplemento());
        address.setBairro(viaCepDTOResponse.getBairro());
        address.setLocalidade(viaCepDTOResponse.getLocalidade());
        address.setUf(viaCepDTOResponse.getUf());
        address.setIbge(viaCepDTOResponse.getIbge());
        address.setGia(viaCepDTOResponse.getGia());
        address.setDdd(viaCepDTOResponse.getDdd());
        address.setSiafi(viaCepDTOResponse.getSiafi());
        return address;
    }


}
