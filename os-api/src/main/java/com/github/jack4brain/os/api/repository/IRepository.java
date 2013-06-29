package com.github.jack4brain.os.api.repository;

import com.github.jack4brain.os.api.domain.IStoredObject;

import java.util.List;

/**
 * @author jack4brain
 */
public interface IRepository<Obj extends IStoredObject> {

    List<Obj> findAll();

    Obj findOne(String uuid);

    long count();

    boolean exists(String uuid);

    Obj save(Obj object);

    void delete(String uuid);

}
