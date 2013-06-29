package com.github.jack4brain.os.api.domain;

/**
 * @author jack4brain
 */
public interface IProduct extends IStoredObject {

    String getTitle();

    void setTitle(String title);

    String getMetaInfo();

    void setMetaInfo(String metaInfo);

    Long getCount();

    void setCount(Long count);

    Double getPrice();

    void setPrice(Double price);
}