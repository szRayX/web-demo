package com.ray.base;

import java.io.Serializable;

/**
 * Created on 2016/6/1.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class BaseDomain implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 行版本号
     */
    private Long rowVersion;

    public Long getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(Long rowVersion) {
        this.rowVersion = rowVersion;
    }
}
