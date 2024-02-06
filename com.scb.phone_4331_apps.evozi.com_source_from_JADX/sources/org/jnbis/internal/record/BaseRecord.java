package org.jnbis.internal.record;

import java.io.Serializable;

public abstract class BaseRecord implements Serializable {
    private String logicalRecordLength;

    public String getLogicalRecordLength() {
        return this.logicalRecordLength;
    }

    public void setLogicalRecordLength(String str) {
        this.logicalRecordLength = str;
    }
}
