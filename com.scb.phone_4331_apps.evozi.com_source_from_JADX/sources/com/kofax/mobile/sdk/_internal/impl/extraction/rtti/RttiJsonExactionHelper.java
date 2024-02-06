package com.kofax.mobile.sdk._internal.impl.extraction.rtti;

import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk.capture.model.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RttiJsonExactionHelper implements IJsonExactionHelper {
    public static final String CONFIDENCE = "confidence";
    public static final String FIELDS = "fields";
    public static final String HEIGHT = "height";
    public static final String LEFT = "left";
    public static final String NAME = "name";
    public static final String TEXT = "text";
    public static final String TOP = "top";
    public static final String WIDTH = "width";

    /* renamed from: JJ */
    private String f4211JJ;

    /* renamed from: SN */
    private transient Map<String, JSONObject> f4212SN;

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper$a */
    public static class C8173a extends Field<String> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C8173a(java.lang.String r17, org.json.JSONObject r18) {
            /*
                r16 = this;
                r0 = r18
                java.lang.String r1 = "text"
                java.lang.String r4 = r0.optString(r1)
                java.lang.String r1 = "confidence"
                double r5 = r0.optDouble(r1)
                java.lang.String r1 = "left"
                double r8 = r0.optDouble(r1)
                java.lang.String r1 = "top"
                double r10 = r0.optDouble(r1)
                com.kofax.mobile.sdk.capture.model.FieldLocation r1 = new com.kofax.mobile.sdk.capture.model.FieldLocation
                java.lang.String r2 = "width"
                double r12 = r0.optDouble(r2)
                java.lang.String r2 = "height"
                double r14 = r0.optDouble(r2)
                r7 = r1
                r7.<init>(r8, r10, r12, r14)
                r2 = r16
                r3 = r17
                r2.<init>(r3, r4, r5, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper.C8173a.<init>(java.lang.String, org.json.JSONObject):void");
        }
    }

    public void init(String str) {
        if (str != null) {
            this.f4211JJ = str;
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    public C8173a getString(String str) {
        JSONObject jSONObject = m4427qH().get(str);
        if (jSONObject == null) {
            return null;
        }
        return new C8173a(str, jSONObject);
    }

    /* renamed from: qH */
    private Map<String, JSONObject> m4427qH() {
        String optString;
        Map<String, JSONObject> map = this.f4212SN;
        if (map == null || map.isEmpty()) {
            this.f4212SN = new HashMap();
            try {
                JSONArray optJSONArray = ((JSONObject) new JSONArray(this.f4211JJ).get(0)).optJSONArray(FIELDS);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                            if (!optString.isEmpty()) {
                                this.f4212SN.put(optString, optJSONObject);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                C0767k.m1823e(e);
            }
        }
        return this.f4212SN;
    }
}
