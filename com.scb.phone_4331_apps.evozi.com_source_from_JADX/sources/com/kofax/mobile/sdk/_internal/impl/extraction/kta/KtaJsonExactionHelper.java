package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class KtaJsonExactionHelper implements IJsonExactionHelper {
    public static final String CONFIDENCE = "Confidence";
    public static final String FIELDS = "Fields";
    public static final String NAME = "Name";
    public static final String OBJECT = "d";
    public static final String RETURNED_DOCUMENT_FIELDS = "ReturnedDocumentFields";
    private static final String TAG = KtaJsonExactionHelper.class.getSimpleName();
    public static final String VALUE = "Value";

    /* renamed from: JJ */
    private String f3739JJ;

    /* renamed from: JK */
    private transient Map<String, JSONObject> f3740JK;

    public void init(String str) {
        if (str != null) {
            this.f3739JJ = str;
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    public Field<String> getString(String str) {
        if (this.f3740JK == null) {
            buildNameMap();
        }
        JSONObject jSONObject = this.f3740JK.get(str);
        try {
            return new Field(str, jSONObject.getString(VALUE), jSONObject.getDouble(CONFIDENCE), new FieldLocation(0.0d, 0.0d, 0.0d, 0.0d));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public void buildNameMap() {
        JSONArray jsonFields = getJsonFields(this.f3739JJ);
        this.f3740JK = new HashMap();
        int i = 0;
        while (i < jsonFields.length()) {
            JSONObject optJSONObject = jsonFields.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(NAME);
                if (optString != null) {
                    this.f3740JK.put(optString, optJSONObject);
                    i++;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public JSONArray getJsonFields(String str) {
        try {
            return new JSONObject(str).getJSONObject(OBJECT).getJSONArray(RETURNED_DOCUMENT_FIELDS).getJSONObject(0).getJSONArray(RETURNED_DOCUMENT_FIELDS);
        } catch (JSONException e) {
            C0767k.m1821e(TAG, "Exception while getting fields", (Throwable) e);
            return new JSONArray();
        }
    }
}
