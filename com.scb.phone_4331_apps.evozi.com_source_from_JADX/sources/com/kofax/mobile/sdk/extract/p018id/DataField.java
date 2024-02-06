package com.kofax.mobile.sdk.extract.p018id;

import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import java.io.Serializable;

/* renamed from: com.kofax.mobile.sdk.extract.id.DataField */
public class DataField extends Field<String> implements Serializable {
    public DataField(String str, String str2, double d, FieldLocation fieldLocation) {
        super(str, str2, d, fieldLocation);
    }

    public static DataField fromExtractorField(com.kofax.android.abc.document.Field field) {
        return new DataField(field.getLabel(), field.getValue(), (double) field.getConfidence(), new FieldLocation((double) field.getRectangle().left, (double) field.getRectangle().top, (double) field.getRectangle().width(), (double) field.getRectangle().height()));
    }

    public double getConfidence() {
        return super.getConfidence();
    }

    public String getObject() {
        String str = (String) super.getObject();
        if (str != null) {
            return str.trim();
        }
        return null;
    }
}
