package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import com.kofax.mobile.sdk._internal.extraction.C7905h;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.g */
public class C8007g implements ExceptionResponse, Serializable {

    /* renamed from: JM */
    public static final String f3799JM = "Message";

    /* renamed from: JN */
    public static final String f3800JN = "Type";

    /* renamed from: JO */
    public static final String f3801JO = "Message";

    /* renamed from: JP */
    public static final String f3802JP = "StackTrace";

    /* renamed from: JQ */
    public static final String f3803JQ = "InnerException";

    /* renamed from: JR */
    private String f3804JR;

    /* renamed from: JS */
    private transient JSONObject f3805JS;

    public C8007g(String str) {
        if (str != null) {
            this.f3804JR = str;
            m3988mF();
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    private C8007g() {
    }

    /* renamed from: d */
    public static C7905h m3987d(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f3800JN, exc.getClass().getName());
            if (exc.getMessage() != null) {
                jSONObject.put("Message", exc.getMessage());
            } else {
                jSONObject.put("Message", exc.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C7905h(0, jSONObject.toString());
    }

    /* renamed from: a */
    public static C7905h m3985a(C7899a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f3800JN, aVar.getClass().getName());
            jSONObject.put("Message", aVar.f3660vK.response);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C7905h(0, jSONObject.toString());
    }

    public String exceptionMessage() {
        return getString("Message");
    }

    public String exceptionType() {
        return getString(f3800JN);
    }

    public String message() {
        return getString("Message");
    }

    public String stackTrace() {
        return getString(f3802JP);
    }

    public ExceptionResponse innerException() {
        JSONObject an = m3986an(f3803JQ);
        if (an == null) {
            return null;
        }
        C8007g gVar = new C8007g();
        gVar.f3805JS = an;
        gVar.f3804JR = this.f3805JS.toString();
        return gVar;
    }

    private String getString(String str) {
        m3988mF();
        return this.f3805JS.optString(str);
    }

    /* renamed from: an */
    private JSONObject m3986an(String str) {
        m3988mF();
        return this.f3805JS.optJSONObject(str);
    }

    /* renamed from: mF */
    private void m3988mF() {
        if (this.f3805JS == null) {
            try {
                this.f3805JS = new JSONObject(this.f3804JR);
            } catch (JSONException e) {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR, e);
            }
        }
    }
}
