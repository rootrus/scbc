package com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.json.JSONObject;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.a */
public class C8012a extends C8017f {

    /* renamed from: KF */
    private static final String f3834KF = "GetDocument";

    /* renamed from: KG */
    private static final String f3835KG = "DeleteDocument";

    /* renamed from: KH */
    private static final String f3836KH = "Station";

    /* renamed from: KI */
    private static final String f3837KI = "reportingData";

    /* renamed from: KJ */
    private static final String f3838KJ = "documentId";

    /* renamed from: KK */
    private static final String f3839KK = "ignoreError";

    /* renamed from: Kf */
    private static final String f3840Kf = "sessionId";
    private static final String SERVICE_NAME = "CaptureDocumentService.svc";

    public C8012a(String str, CertificateValidatorListener certificateValidatorListener) {
        super(str, certificateValidatorListener);
    }

    /* renamed from: v */
    public String mo54408v(String str, String str2) throws SocketTimeoutException, UnknownHostException, IllegalArgumentException, IOException, XmlPullParserException, Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f3840Kf, str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f3836KH, JSONObject.NULL);
        jSONObject.put(f3837KI, jSONObject2);
        jSONObject.put(f3838KJ, str2);
        return execute("CaptureDocumentService.svc/json/GetDocument", jSONObject);
    }

    /* renamed from: w */
    public String mo54409w(String str, String str2) throws SocketTimeoutException, UnknownHostException, IllegalArgumentException, IOException, XmlPullParserException, Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f3840Kf, str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f3836KH, JSONObject.NULL);
        jSONObject.put(f3837KI, jSONObject2);
        jSONObject.put(f3838KJ, str2);
        jSONObject.put(f3839KK, true);
        return execute("CaptureDocumentService.svc/json/DeleteDocument", jSONObject);
    }
}
