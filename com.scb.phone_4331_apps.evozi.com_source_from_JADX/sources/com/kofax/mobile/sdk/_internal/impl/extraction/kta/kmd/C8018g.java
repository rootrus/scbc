package com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.g */
public class C8018g extends C8017f {

    /* renamed from: JV */
    private static final String f3849JV = "UserId";

    /* renamed from: JW */
    private static final String f3850JW = "LogOnProtocol";

    /* renamed from: JX */
    private static final String f3851JX = "UnconditionalLogOn";

    /* renamed from: JY */
    private static final String f3852JY = "userIdentityWithPassword";
    private static final String METHOD_NAME = "LogOnWithPassword";
    private static final String PASSWORD = "Password";
    private static final String SERVICE_NAME = "UserService.svc";

    public C8018g(String str, CertificateValidatorListener certificateValidatorListener) {
        super(str, certificateValidatorListener);
    }

    /* renamed from: x */
    public C8016e mo54417x(String str, String str2) throws IOException, JSONException, C7899a {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f3849JV, str);
        jSONObject2.put(PASSWORD, str2);
        jSONObject2.put(f3850JW, 7);
        jSONObject2.put(f3851JX, true);
        jSONObject.put(f3852JY, jSONObject2);
        return new C8016e(new JSONObject(execute("UserService.svc/json/LogOnWithPassword", jSONObject)).getJSONObject(KtaJsonExactionHelper.OBJECT).getString("SessionId"));
    }
}
