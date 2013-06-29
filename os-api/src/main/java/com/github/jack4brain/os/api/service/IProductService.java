package com.github.jack4brain.os.api.service;

import com.github.jack4brain.os.api.domain.IProduct;
import com.github.jack4brain.os.api.exception.ServiceException;

import java.util.List;

/**
 * @author jack4brain
 */
public interface IProductService<Obj extends IProduct> {

    Obj findById(Long id) throws ServiceException;

    List<Obj> findAll() throws ServiceException;
}
