package com.kofax.mobile.sdk._internal.impl.extraction.rtti;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.extraction.C7905h;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.rtti.f */
public class C8183f implements ExceptionResponse, Serializable {

    /* renamed from: JM */
    public static final String f4228JM = "exceptionMessage";

    /* renamed from: JN */
    public static final String f4229JN = "exceptionType";

    /* renamed from: JO */
    public static final String f4230JO = "message";

    /* renamed from: JP */
    public static final String f4231JP = "stackTrace";

    /* renamed from: JQ */
    public static final String f4232JQ = "innerException";

    /* renamed from: JR */
    private String f4233JR;

    /* renamed from: JS */
    private transient JSONObject f4234JS;

    public C8183f(String str) {
        if (str != null) {
            this.f4233JR = str;
            m4446mF();
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    private C8183f() {
    }

    /* renamed from: d */
    public static C7905h m4445d(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f4230JO, exc.toString());
            jSONObject.put(f4229JN, exc.getClass().getName());
            jSONObject.put(f4228JM, exc.getMessage());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C7905h(0, jSONObject.toString());
    }

    public String exceptionMessage() {
        return getString(f4228JM);
    }

    public String exceptionType() {
        return getString(f4229JN);
    }

    public String message() {
        return getString(f4230JO);
    }

    public String stackTrace() {
        return getString(f4231JP);
    }

    public ExceptionResponse innerException() {
        JSONObject an = m4444an(f4232JQ);
        if (an == null) {
            return null;
        }
        C8183f fVar = new C8183f();
        fVar.f4234JS = an;
        fVar.f4233JR = this.f4234JS.toString();
        return fVar;
    }

    private String getString(String str) {
        m4446mF();
        return this.f4234JS.optString(str);
    }

    /* renamed from: an */
    private JSONObject m4444an(String str) {
        m4446mF();
        return this.f4234JS.optJSONObject(str);
    }

    /* renamed from: mF */
    private void m4446mF() {
        if (this.f4234JS == null) {
            try {
                this.f4234JS = new JSONObject(this.f4233JR);
            } catch (JSONException e) {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR, e);
            }
        }
    }
}
