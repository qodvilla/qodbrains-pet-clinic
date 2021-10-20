package com.qodbrains.qodbrainspetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(Long ID);

    T save(T o);

    void delete(T o);

    void deleteById(ID id);

}
