package com.drew.metadata;

import com.drew.lang.CompoundException;

public class MetadataException extends CompoundException {
    public MetadataException(String str) {
        super(str);
    }
}
