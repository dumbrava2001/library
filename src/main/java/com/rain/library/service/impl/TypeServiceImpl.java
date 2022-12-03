package com.rain.library.service.impl;

import com.rain.library.model.entity.Type;
import com.rain.library.model.request.TypeRequestDTO;
import com.rain.library.model.response.TypeResponseDTO;
import com.rain.library.repository.TypeRepository;
import com.rain.library.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TypeServiceImpl implements TypeService {

    private TypeRepository typeRepository;

    @Override
    public List<TypeResponseDTO> getAllTypes() {
        List<Type> allTypes = typeRepository.findAll();
        return allTypes.stream()
                .map(this::createResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void addType(TypeRequestDTO typeRequest) {
        Type newType = createTypeFromDTO(typeRequest);
        typeRepository.save(newType);
    }

    private TypeResponseDTO createResponseDTO(Type type) {
        return TypeResponseDTO.builder()
                .type(type.getType())
                .build();
    }

    private Type createTypeFromDTO(TypeRequestDTO typeRequest) {
        return Type.builder()
                .type(typeRequest.getTypeName())
                .build();
    }
}
