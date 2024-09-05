package com.example.gestcantineada.service.mapper;

public interface EntityMapper<D,E> {

    D toDto(E entity);
    E toEntity(D dto);
}
