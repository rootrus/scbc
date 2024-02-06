package com.kofax.mobile.sdk._internal.extraction;

import com.kofax.mobile.sdk.capture.model.Field;
import java.io.Serializable;

public interface IJsonExactionHelper extends Serializable {
    Field<String> getString(String str);

    void init(String str);
}
