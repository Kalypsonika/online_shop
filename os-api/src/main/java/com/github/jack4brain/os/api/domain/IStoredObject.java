package com.github.jack4brain.os.api.domain;

import java.io.Serializable;

/**
 * @author jack4brain
 */
public interface IStoredObject extends Serializable {

    String getUuid();

    void setUuid(String uuid);
}
