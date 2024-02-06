package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ee */
public class C8131ee implements IJsonExactionHelper {

    /* renamed from: Np */
    private List<DataField> f4149Np;

    public void init(String str) {
        this.f4149Np = (List) new Gson().fromJson(str, new TypeToken<List<DataField>>() {
        }.getType());
    }

    public Field<String> getString(String str) {
        for (DataField next : this.f4149Np) {
            if (next.getName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
