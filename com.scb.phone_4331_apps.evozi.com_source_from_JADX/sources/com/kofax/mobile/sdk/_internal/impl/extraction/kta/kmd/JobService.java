package com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040o.LendingIssuerAdapter$IssuerViewHolder;

public class JobService extends C8017f {
    private static final String DATA = "Data";

    /* renamed from: ID */
    private static final String f3809ID = "Id";

    /* renamed from: KP */
    private static final String f3810KP = "CreateJobSyncWithDocuments";

    /* renamed from: KQ */
    private static final String f3811KQ = "ProcessImage";

    /* renamed from: KR */
    private static final String f3812KR = "ReturnFullTextOcr";

    /* renamed from: Ke */
    private static final String f3813Ke = "variablesToReturn";

    /* renamed from: Kf */
    private static final String f3814Kf = "sessionId";

    /* renamed from: Kg */
    private static final String f3815Kg = "processIdentity";

    /* renamed from: Kh */
    private static final String f3816Kh = "InputVariables";

    /* renamed from: Ki */
    private static final String f3817Ki = "jobWithDocsInitialization";

    /* renamed from: Kj */
    private static final String f3818Kj = "Base64Data";

    /* renamed from: Kk */
    private static final String f3819Kk = "DeleteDocument";

    /* renamed from: Kl */
    private static final String f3820Kl = "DocumentGroup";

    /* renamed from: Km */
    private static final String f3821Km = "DocumentName";

    /* renamed from: Kn */
    private static final String f3822Kn = "DocumentTypeId";

    /* renamed from: Ko */
    private static final String f3823Ko = "FieldsToReturn";

    /* renamed from: Kp */
    private static final String f3824Kp = "FilePath";

    /* renamed from: Kq */
    private static final String f3825Kq = "FolderId";

    /* renamed from: Kr */
    private static final String f3826Kr = "FolderTypeId";

    /* renamed from: Ks */
    private static final String f3827Ks = "RuntimeFields";

    /* renamed from: Kt */
    private static final String f3828Kt = "PageDataList";

    /* renamed from: Ku */
    private static final String f3829Ku = "ReturnAllFields";

    /* renamed from: Kv */
    private static final String f3830Kv = "PageImageDataCollection";

    /* renamed from: Kw */
    private static final String f3831Kw = "Documents";

    /* renamed from: Kz */
    private static final String f3832Kz = "StoreFolderAndDocuments";
    private static final String MIME_TYPE = "MimeType";
    private static final String NAME = "Name";
    private static final String SERVICE_NAME = "JobService.svc";
    private static final String START_DATE = "StartDate";
    private static final String VALUE = "Value";
    private static final String VERSION = "Version";

    /* renamed from: KS */
    private JSONObject f3833KS;

    public JobService(String str, CertificateValidatorListener certificateValidatorListener) {
        super(str, certificateValidatorListener);
    }

    public void createJobWithJsonDocuments(String str, String str2, String str3, byte[] bArr, byte[] bArr2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LendingIssuerAdapter$IssuerViewHolder.MediaBrowserCompat$ItemReceiver(bArr));
        arrayList.add(bArr2 != null ? LendingIssuerAdapter$IssuerViewHolder.MediaBrowserCompat$ItemReceiver(bArr2) : null);
        HashMap hashMap = new HashMap();
        hashMap.put(f3811KQ, "false");
        this.f3833KS = m3995a(str, str2, m3996a(f3831Kw, m3994a(str3, (String) null, arrayList, false, false, true), hashMap, true));
    }

    public void updateJsonDocuments(String str, String str2) {
        try {
            JSONArray jSONArray = this.f3833KS.getJSONObject(f3817Ki).getJSONArray(f3816Kh);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f3809ID, str);
            Object obj = str2;
            if (str2 == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("Value", obj);
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String progressJsonDocuments() throws JSONException, IOException, C7899a {
        return execute("JobService.svc/json/CreateJobSyncWithDocuments", this.f3833KS);
    }

    /* renamed from: a */
    private JSONObject m3994a(String str, String str2, List<String> list, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f3818Kj, JSONObject.NULL);
        jSONObject.put(DATA, JSONObject.NULL);
        jSONObject.put(f3819Kk, z2);
        jSONObject.put(f3820Kl, m3998d(JSONObject.NULL));
        jSONObject.put(f3821Km, JSONObject.NULL);
        jSONObject.put(f3822Kn, JSONObject.NULL);
        jSONObject.put(f3823Ko, JSONObject.NULL);
        jSONObject.put(f3824Kp, JSONObject.NULL);
        jSONObject.put(f3825Kq, JSONObject.NULL);
        Object obj = str2;
        if (str2 == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(f3826Kr, obj);
        jSONObject.put(MIME_TYPE, str);
        jSONObject.put(f3812KR, z);
        JSONArray jSONArray = new JSONArray();
        for (String next : list) {
            if (next != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(DATA, JSONObject.NULL);
                jSONObject2.put(f3818Kj, next);
                jSONObject2.put(MIME_TYPE, str);
                jSONObject2.put(f3827Ks, new JSONObject());
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put(f3828Kt, jSONArray);
        jSONObject.put(f3830Kv, JSONObject.NULL);
        jSONObject.put(f3829Ku, z3);
        jSONObject.put(f3827Ks, JSONObject.NULL);
        return jSONObject;
    }

    /* renamed from: d */
    private JSONObject m3998d(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f3809ID, JSONObject.NULL);
        jSONObject.put("Name", obj);
        jSONObject.put(VERSION, 0);
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m3996a(String str, JSONObject jSONObject, Map<String, String> map, boolean z) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(START_DATE, JSONObject.NULL);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        jSONObject2.put(str, jSONArray);
        jSONObject2.put(f3816Kh, m3997c(map));
        jSONObject2.put(f3832Kz, z);
        return jSONObject2;
    }

    /* renamed from: c */
    private JSONArray m3997c(Map<String, String> map) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f3809ID, next.getKey());
                jSONObject.put("Value", next.getValue() == null ? JSONObject.NULL : next.getValue());
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m3995a(String str, String str2, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f3813Ke, new JSONObject());
        jSONObject2.put(f3814Kf, str);
        jSONObject2.put(f3815Kg, m3998d(str2));
        jSONObject2.put(f3817Ki, jSONObject);
        return jSONObject2;
    }
}
