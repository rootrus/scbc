package com.kofax.mobile.sdk._internal.impl.extraction.kta;

import com.kofax.mobile.sdk._internal.impl.extraction.C7992j;
import com.kofax.mobile.sdk._internal.impl.extraction.NetworkClient;
import com.kofax.mobile.sdk.extract.server.ExtractionServerException;
import com.kofax.mobile.sdk.extract.server.LoginCredentials;
import com.kofax.mobile.sdk.extract.server.ServerExtractionParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.LendingIssuerAdapter$IssuerViewHolder;

public class KtaServiceCaller extends NetworkClient implements C7995a {
    private static final String DATA = "Data";

    /* renamed from: ID */
    private static final String f3741ID = "Id";

    /* renamed from: JT */
    private static final String f3742JT = "UserService.svc";

    /* renamed from: JU */
    private static final String f3743JU = "LogOnWithPassword";

    /* renamed from: JV */
    private static final String f3744JV = "UserId";

    /* renamed from: JW */
    private static final String f3745JW = "LogOnProtocol";

    /* renamed from: JX */
    private static final String f3746JX = "UnconditionalLogOn";

    /* renamed from: JY */
    private static final String f3747JY = "userIdentityWithPassword";

    /* renamed from: JZ */
    private static final String f3748JZ = "JobService.svc";

    /* renamed from: Ka */
    private static final String f3749Ka = "CreateJobSyncWithDocuments";

    /* renamed from: Kb */
    private static final String f3750Kb = "CreateJobWithDocumentsAndProgress2";

    /* renamed from: Kc */
    private static final String f3751Kc = "processIdentityName";

    /* renamed from: Kd */
    private static final String f3752Kd = "syncProcessMap";

    /* renamed from: Ke */
    private static final String f3753Ke = "variablesToReturn";

    /* renamed from: Kf */
    private static final String f3754Kf = "sessionId";

    /* renamed from: Kg */
    private static final String f3755Kg = "processIdentity";

    /* renamed from: Kh */
    private static final String f3756Kh = "InputVariables";

    /* renamed from: Ki */
    private static final String f3757Ki = "jobWithDocsInitialization";

    /* renamed from: Kj */
    private static final String f3758Kj = "Base64Data";

    /* renamed from: Kk */
    private static final String f3759Kk = "DeleteDocument";

    /* renamed from: Kl */
    private static final String f3760Kl = "DocumentGroup";

    /* renamed from: Km */
    private static final String f3761Km = "DocumentName";

    /* renamed from: Kn */
    private static final String f3762Kn = "DocumentTypeId";

    /* renamed from: Ko */
    private static final String f3763Ko = "FieldsToReturn";

    /* renamed from: Kp */
    private static final String f3764Kp = "FilePath";

    /* renamed from: Kq */
    private static final String f3765Kq = "FolderId";

    /* renamed from: Kr */
    private static final String f3766Kr = "FolderTypeId";

    /* renamed from: Ks */
    private static final String f3767Ks = "RuntimeFields";

    /* renamed from: Kt */
    private static final String f3768Kt = "PageDataList";

    /* renamed from: Ku */
    private static final String f3769Ku = "ReturnAllFields";

    /* renamed from: Kv */
    private static final String f3770Kv = "PageImageDataCollection";

    /* renamed from: Kw */
    private static final String f3771Kw = "Documents";

    /* renamed from: Kx */
    private static final String f3772Kx = "RuntimeDocumentCollection";

    /* renamed from: Ky */
    private static final String f3773Ky = "ReturnFullTextOcr";

    /* renamed from: Kz */
    private static final String f3774Kz = "StoreFolderAndDocuments";
    private static final String MIME_TYPE = "MimeType";
    private static final String NAME = "Name";
    private static final String PASSWORD = "Password";
    private static final String START_DATE = "StartDate";
    private static final String VALUE = "Value";
    private static final String VERSION = "Version";

    /* renamed from: Jy */
    private ServerExtractionParameters f3775Jy;

    public enum JOB_TYPE {
        CREATE_JOB_SYNC_WITH_DOCUMENTS,
        CREATE_JOB__WITH_DOCUMENTS_AND_PROGRESS2
    }

    /* renamed from: a */
    public String mo54384a(LoginCredentials loginCredentials) {
        try {
            String concat = loginCredentials.getServerUrl().concat("UserService.svc/json/LogOnWithPassword");
            return new JSONObject(mo54369a(mo54370a(loginCredentials.getTimeOutParameters().getTimeOut(), loginCredentials.getTimeOutParameters().getUnit(), concat, loginCredentials.getCertificateValidatorListener()), m3948a(mo54371am(concat), m3949a(m3960u(loginCredentials.getKtaUserName(), loginCredentials.getKtaPassword()))))).getJSONObject(KtaJsonExactionHelper.OBJECT).getString("SessionId");
        } catch (ExtractionServerException e) {
            throw e;
        } catch (Exception e2) {
            throw new ExtractionServerException(0, e2.toString());
        }
    }

    /* renamed from: my */
    public String mo54386my() {
        try {
            JOB_TYPE mG = m3959mG();
            String a = m3946a(mG);
            String a2 = C7992j.m3944a(this.f3775Jy.getImageBytes().get(0)[0]);
            ArrayList arrayList = new ArrayList();
            for (byte[] MediaBrowserCompat$ItemReceiver : this.f3775Jy.getImageBytes()) {
                arrayList.add(LendingIssuerAdapter$IssuerViewHolder.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
            }
            return m3947a(mG, a, a2, arrayList, mo54370a(this.f3775Jy.getTimeOutParameters().getTimeOut(), this.f3775Jy.getTimeOutParameters().getUnit(), a, this.f3775Jy.getCertificateValidationListener()));
        } catch (ExtractionServerException e) {
            throw e;
        } catch (Exception e2) {
            throw new ExtractionServerException(0, e2.toString());
        }
    }

    /* renamed from: a */
    public void mo54385a(ServerExtractionParameters serverExtractionParameters) {
        String serverUrl = serverExtractionParameters.getServerUrl();
        if (!serverUrl.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(serverUrl);
            sb.append("/");
            serverUrl = sb.toString();
        }
        this.f3775Jy = new ServerExtractionParameters(serverUrl, serverExtractionParameters.getImages(), serverExtractionParameters.getImageBytes(), serverExtractionParameters.getCertificateValidationListener(), serverExtractionParameters.getParameters(), serverExtractionParameters.getTimeOutParameters());
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller$1 */
    static /* synthetic */ class C79941 {

        /* renamed from: KA */
        static final /* synthetic */ int[] f3776KA;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller$JOB_TYPE[] r0 = com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller.JOB_TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3776KA = r0
                com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller$JOB_TYPE r1 = com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller.JOB_TYPE.CREATE_JOB_SYNC_WITH_DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3776KA     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller$JOB_TYPE r1 = com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller.JOB_TYPE.CREATE_JOB__WITH_DOCUMENTS_AND_PROGRESS2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaServiceCaller.C79941.<clinit>():void");
        }
    }

    /* renamed from: a */
    private String m3946a(JOB_TYPE job_type) {
        int i = C79941.f3776KA[job_type.ordinal()];
        if (i == 1) {
            return this.f3775Jy.getServerUrl().concat("JobService.svc/json/CreateJobSyncWithDocuments");
        }
        if (i == 2) {
            return this.f3775Jy.getServerUrl().concat("JobService.svc/json/CreateJobWithDocumentsAndProgress2");
        }
        throw new IllegalArgumentException("Unknown JOB Type");
    }

    /* renamed from: a */
    private String m3947a(JOB_TYPE job_type, String str, String str2, List<String> list, OkHttpClient okHttpClient) throws JSONException, IOException {
        int i = C79941.f3776KA[job_type.ordinal()];
        if (i == 1) {
            return mo54369a(okHttpClient, m3948a(mo54371am(str), m3949a(m3957d(str2, list))));
        }
        if (i == 2) {
            return mo54369a(okHttpClient, m3948a(mo54371am(str), m3949a(m3958e(str2, list))));
        }
        throw new IllegalArgumentException("Unknown JOB Type");
    }

    /* renamed from: a */
    private RequestBody m3949a(JSONObject jSONObject) {
        return RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
    }

    /* renamed from: a */
    private Request m3948a(HttpUrl httpUrl, RequestBody requestBody) {
        return new Request.Builder().url(httpUrl).addHeader("Content-Type", " application/json").addHeader("Accept", " application/json").post(requestBody).build();
    }

    /* renamed from: a */
    private JSONObject m3951a(String str, List<String> list, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f3758Kj, JSONObject.NULL);
        jSONObject.put(DATA, JSONObject.NULL);
        jSONObject.put(f3760Kl, m3956d(JSONObject.NULL));
        jSONObject.put(f3761Km, getObject(f3761Km));
        jSONObject.put(f3762Kn, getObject(f3762Kn));
        jSONObject.put(f3763Ko, JSONObject.NULL);
        jSONObject.put(f3764Kp, getObject(f3764Kp));
        jSONObject.put(f3765Kq, getObject(f3765Kq));
        jSONObject.put(f3766Kr, getObject(f3766Kr));
        jSONObject.put(MIME_TYPE, str);
        JSONArray jSONArray = new JSONArray();
        for (String next : list) {
            if (next != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(DATA, JSONObject.NULL);
                jSONObject2.put(f3758Kj, next);
                jSONObject2.put(MIME_TYPE, str);
                jSONObject2.put(f3767Ks, new JSONObject());
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put(f3768Kt, jSONArray);
        jSONObject.put(f3770Kv, JSONObject.NULL);
        jSONObject.put(f3769Ku, z);
        jSONObject.put(f3767Ks, JSONObject.NULL);
        return jSONObject;
    }

    /* renamed from: d */
    private JSONObject m3956d(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f3741ID, JSONObject.NULL);
        jSONObject.put("Name", obj);
        jSONObject.put(VERSION, 0);
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m3952a(String str, JSONObject jSONObject, Map<String, String> map) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(START_DATE, getObject(START_DATE));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        jSONObject2.put(str, jSONArray);
        jSONObject2.put(f3756Kh, m3955c(map));
        return jSONObject2;
    }

    /* renamed from: c */
    private JSONArray m3955c(Map<String, String> map) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (m3954ap(str)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(f3741ID, str);
                    jSONObject.put("Value", next.getValue() == null ? JSONObject.NULL : next.getValue());
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m3950a(Object obj, Object obj2, Object obj3, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f3753Ke, obj3);
        jSONObject2.put(f3754Kf, obj);
        jSONObject2.put(f3755Kg, m3956d(obj2));
        jSONObject2.put(f3757Ki, jSONObject);
        return jSONObject2;
    }

    /* renamed from: u */
    private JSONObject m3960u(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f3744JV, str);
        jSONObject2.put(PASSWORD, str2);
        jSONObject2.put(f3745JW, 7);
        jSONObject2.put(f3746JX, true);
        jSONObject.put(f3747JY, jSONObject2);
        return jSONObject;
    }

    /* renamed from: d */
    private JSONObject m3957d(String str, List<String> list) throws JSONException {
        JSONObject a = m3951a(str, list, true);
        a.put(f3773Ky, m3953ao(f3773Ky));
        JSONObject a2 = m3952a(f3771Kw, a, (Map<String, String>) this.f3775Jy.getParameters());
        a2.put(f3774Kz, m3953ao(f3774Kz));
        return m3950a(getObject(f3754Kf), getObject(f3751Kc), getObject(f3753Ke), a2);
    }

    /* renamed from: e */
    private JSONObject m3958e(String str, List<String> list) throws JSONException {
        JSONObject a = m3951a(str, list, true);
        a.put(f3759Kk, m3953ao(f3759Kk));
        return m3950a(getObject(f3754Kf), getObject(f3751Kc), getObject(f3753Ke), m3952a(f3772Kx, a, (Map<String, String>) this.f3775Jy.getParameters()));
    }

    /* renamed from: ao */
    private String m3953ao(String str) {
        return (this.f3775Jy.getParameters() == null || !this.f3775Jy.getParameters().containsKey(str)) ? "false" : this.f3775Jy.getParameters().get(str);
    }

    private Object getObject(String str) throws JSONException {
        if (str.equalsIgnoreCase(f3753Ke)) {
            if (this.f3775Jy.getParameters() == null || !this.f3775Jy.getParameters().containsKey(str)) {
                return new JSONArray();
            }
            return new JSONArray(this.f3775Jy.getParameters().get(str));
        } else if (this.f3775Jy.getParameters() == null || !this.f3775Jy.getParameters().containsKey(str)) {
            return JSONObject.NULL;
        } else {
            return this.f3775Jy.getParameters().get(str);
        }
    }

    /* renamed from: ap */
    private boolean m3954ap(String str) {
        return !str.equalsIgnoreCase(f3753Ke) && !str.equalsIgnoreCase(f3754Kf) && !str.equalsIgnoreCase(f3751Kc) && !str.equalsIgnoreCase(f3774Kz) && !str.equalsIgnoreCase(START_DATE) && !str.equalsIgnoreCase(f3773Ky) && !str.equalsIgnoreCase(f3766Kr) && !str.equalsIgnoreCase(f3765Kq) && !str.equalsIgnoreCase(f3764Kp) && !str.equalsIgnoreCase(f3762Kn) && !str.equalsIgnoreCase(f3761Km) && !str.equalsIgnoreCase(f3759Kk) && !str.equalsIgnoreCase(f3752Kd);
    }

    /* renamed from: mG */
    private JOB_TYPE m3959mG() {
        if (this.f3775Jy.getParameters() == null || !this.f3775Jy.getParameters().containsKey(f3752Kd) || Boolean.valueOf(this.f3775Jy.getParameters().get(f3752Kd)).booleanValue()) {
            return JOB_TYPE.CREATE_JOB_SYNC_WITH_DOCUMENTS;
        }
        return JOB_TYPE.CREATE_JOB__WITH_DOCUMENTS_AND_PROGRESS2;
    }
}
