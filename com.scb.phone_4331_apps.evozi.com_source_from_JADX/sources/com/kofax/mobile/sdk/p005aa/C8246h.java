package com.kofax.mobile.sdk.p005aa;

import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.LicensingVolume;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;

/* renamed from: com.kofax.mobile.sdk.aa.h */
class C8246h implements TaskRunner.TaskCompletedListener {

    /* renamed from: TA */
    private static final String f4378TA = "unitsConsumed";
    private static final String TAG = C8246h.class.getSimpleName();

    /* renamed from: TB */
    private static final String f4379TB = "unitsRequested";

    /* renamed from: TC */
    private static final String f4380TC = "licenseToken";

    /* renamed from: TD */
    private static final int f4381TD = -1;

    /* renamed from: Ty */
    private static final String f4382Ty = "licenseResultArray";

    /* renamed from: Tz */
    private static final String f4383Tz = "licenseID";

    /* renamed from: TF */
    private final C8245g f4384TF;

    /* renamed from: TG */
    public String f4385TG;
    public Licensing.LicenseType licenseType;

    public C8246h(C8245g gVar) {
        this.f4384TF = gVar;
    }

    public void onTaskCompleted(TaskRunner.TaskCompletedEvent taskCompletedEvent) {
        C8244f.f4374aZ.removeOnTaskCompletedListener(this, this.f4384TF);
        long taskID = taskCompletedEvent.getTaskID();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Task ");
        sb.append(taskID);
        sb.append(" completed.");
        C0767k.m1807c(str, sb.toString());
        ErrorInfo taskError = taskCompletedEvent.getTaskError();
        if (taskError == ErrorInfo.KMC_SUCCESS) {
            C0767k.m1807c(TAG, "No Task Error. Good.");
            if (C8244f.f4375bb != taskID) {
                String str2 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected: Task ");
                sb2.append(C8244f.f4375bb);
                sb2.append(" was running.");
                C0767k.m1807c(str2, sb2.toString());
            }
        } else {
            String str3 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Task Error: ");
            sb3.append(taskError.toString());
            C0767k.m1807c(str3, sb3.toString());
        }
        C8244f.f4375bb = 0;
        LicensingVolume.LicenseResults licenseResults = (LicensingVolume.LicenseResults) taskCompletedEvent.getTaskReturnValue();
        if (licenseResults.errorInfo != ErrorInfo.KMC_SUCCESS) {
            C8244f.m4542a(licenseResults.errorInfo, 0, this.licenseType);
        } else {
            m4557a(licenseResults, this.f4385TG, this.licenseType);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4557a(com.kofax.kmc.kut.utilities.LicensingVolume.LicenseResults r17, java.lang.String r18, com.kofax.kmc.kut.utilities.Licensing.LicenseType r19) {
        /*
            r16 = this;
            r1 = r19
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            r5 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0075 }
            r6 = r17
            java.lang.String r6 = r6.result     // Catch:{ JSONException -> 0x0075 }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x0075 }
            java.lang.String r6 = "licenseToken"
            java.lang.String r4 = r0.getString(r6)     // Catch:{ JSONException -> 0x0075 }
            java.lang.String r6 = "licenseResultArray"
            org.json.JSONArray r0 = r0.getJSONArray(r6)     // Catch:{ JSONException -> 0x0075 }
            r6 = r5
            r7 = r6
        L_0x0022:
            int r8 = r0.length()     // Catch:{ JSONException -> 0x0070 }
            if (r7 >= r8) goto L_0x0083
            org.json.JSONObject r8 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r9 = "licenseID"
            java.lang.String r9 = r8.getString(r9)     // Catch:{ JSONException -> 0x0070 }
            r3.append(r9)     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r10 = "unitsConsumed"
            java.lang.String r10 = r8.getString(r10)     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r11 = "unitsRequested"
            java.lang.String r8 = r8.getString(r11)     // Catch:{ JSONException -> 0x0070 }
            r3.append(r8)     // Catch:{ JSONException -> 0x0070 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ JSONException -> 0x0070 }
            r11 = -1
            if (r10 != r11) goto L_0x0066
            java.lang.String r12 = TAG     // Catch:{ JSONException -> 0x0070 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0070 }
            r13.<init>()     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r14 = "license ID "
            r13.append(r14)     // Catch:{ JSONException -> 0x0070 }
            r13.append(r9)     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r9 = " not found"
            r13.append(r9)     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r9 = r13.toString()     // Catch:{ JSONException -> 0x0070 }
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r12, (java.lang.String) r9)     // Catch:{ JSONException -> 0x0070 }
        L_0x0066:
            int r6 = java.lang.Integer.parseInt(r8)     // Catch:{ JSONException -> 0x0070 }
            if (r5 == r11) goto L_0x006d
            r5 = r10
        L_0x006d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0070:
            r0 = move-exception
            r15 = r6
            r6 = r5
            r5 = r15
            goto L_0x0077
        L_0x0075:
            r0 = move-exception
            r6 = r5
        L_0x0077:
            java.lang.String r7 = TAG
            java.lang.String r0 = r0.getMessage()
            com.kofax.mobile.sdk._internal.C0767k.m1820e((java.lang.String) r7, (java.lang.String) r0)
            r15 = r6
            r6 = r5
            r5 = r15
        L_0x0083:
            java.lang.String r0 = r3.toString()
            r3 = r16
            r7 = r18
            java.lang.String r0 = r3.m4556H(r0, r7)
            if (r4 == 0) goto L_0x009c
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x009c
            if (r5 == r6) goto L_0x00a5
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_UT_OUT_OF_VOLUME_LICENSE
            goto L_0x00a5
        L_0x009c:
            java.lang.String r0 = TAG
            java.lang.String r2 = "license token does not match"
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r0, (java.lang.String) r2)
            com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_UT_LICENSING_INVALID_SERVER_RESPONSE
        L_0x00a5:
            if (r5 <= 0) goto L_0x00aa
            com.kofax.mobile.sdk.p005aa.C8244f.m4541a(r1, r5)
        L_0x00aa:
            com.kofax.mobile.sdk.p005aa.C8244f.m4542a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r2, (int) r5, (com.kofax.kmc.kut.utilities.Licensing.LicenseType) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p005aa.C8246h.m4557a(com.kofax.kmc.kut.utilities.LicensingVolume$LicenseResults, java.lang.String, com.kofax.kmc.kut.utilities.Licensing$LicenseType):void");
    }

    /* renamed from: H */
    private String m4556H(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String aE = C0781e.m1859aE(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aE);
        sb2.append("CA10BF68-FD0D-4217-AF1D-8A0711ED39D7");
        return C0781e.m1859aE(sb2.toString());
    }
}
