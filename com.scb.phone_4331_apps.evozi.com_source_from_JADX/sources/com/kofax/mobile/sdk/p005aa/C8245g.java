package com.kofax.mobile.sdk.p005aa;

import com.kofax.kmc.kut.utilities.LicensingVolume;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;

/* renamed from: com.kofax.mobile.sdk.aa.g */
class C8245g implements Callable<LicensingVolume.LicenseResults> {
    private static final String TAG = C8245g.class.getSimpleName();

    /* renamed from: Tw */
    C8242b f4376Tw;

    /* renamed from: Tx */
    String f4377Tx;
    String url;

    C8245g() {
    }

    /* renamed from: qP */
    public LicensingVolume.LicenseResults call() throws Exception {
        return m4552a(this.url, this.f4376Tw, this.f4377Tx);
    }

    /* renamed from: a */
    private static LicensingVolume.LicenseResults m4552a(String str, C8242b bVar, String str2) {
        LicensingVolume.LicenseResults licenseResults = new LicensingVolume.LicenseResults(ErrorInfo.KMC_SUCCESS);
        String str3 = null;
        try {
            HttpURLConnection a = m4554a(str, bVar, str2, C8244f.certificateValidatorListener);
            a.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append(" ");
            }
            str3 = sb.toString();
            bufferedReader.close();
        } catch (IOException e) {
            ErrorInfo errorInfo = ErrorInfo.KMC_UT_LICENSING_NETWORK_EXCEPTION;
            errorInfo.setErrCause(e.getMessage());
            licenseResults.errorInfo = errorInfo;
        }
        licenseResults.result = str3;
        return licenseResults;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056 A[SYNTHETIC, Splitter:B:14:0x0056] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.HttpURLConnection m4554a(java.lang.String r4, com.kofax.mobile.sdk.p005aa.C8242b r5, java.lang.String r6, com.kofax.kmc.kut.utilities.CertificateValidatorListener r7) throws java.io.IOException {
        /*
            java.net.URL r0 = new java.net.URL
            r0.<init>(r4)
            java.net.HttpURLConnection r4 = com.kofax.mobile.sdk.p015ak.C8284d.m4660a((java.net.URL) r0, (com.kofax.kmc.kut.utilities.CertificateValidatorListener) r7)     // Catch:{ all -> 0x0052 }
            r4.setRequestMethod(r6)     // Catch:{ all -> 0x0052 }
            r6 = 1
            r4.setDoInput(r6)     // Catch:{ all -> 0x0052 }
            java.lang.String r7 = "Content-Type"
            java.lang.String r0 = "application/json"
            r4.setRequestProperty(r7, r0)     // Catch:{ all -> 0x0052 }
            r7 = 30000(0x7530, float:4.2039E-41)
            r4.setConnectTimeout(r7)     // Catch:{ all -> 0x0052 }
            r4.setReadTimeout(r7)     // Catch:{ all -> 0x0052 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0052 }
            java.io.OutputStream r0 = r4.getOutputStream()     // Catch:{ all -> 0x0052 }
            r7.<init>(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = m4553a(r5)     // Catch:{ all -> 0x0050 }
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0050 }
            r2 = 0
            java.lang.String r3 = r5.f4358SU     // Catch:{ all -> 0x0050 }
            r1[r2] = r3     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = r5.f4359SV     // Catch:{ all -> 0x0050 }
            r1[r6] = r5     // Catch:{ all -> 0x0050 }
            r5 = 2
            r1[r5] = r0     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "{\"Key1\":\"%s\",\"Key2\":\"%s\", \"Licenses\": [%s]}"
            java.lang.String r5 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x0050 }
            r7.write(r5)     // Catch:{ all -> 0x0050 }
            r7.flush()     // Catch:{ all -> 0x0050 }
            r7.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r5 = move-exception
            com.kofax.mobile.sdk._internal.C0767k.m1817d(r5)
        L_0x004f:
            return r4
        L_0x0050:
            r4 = move-exception
            goto L_0x0054
        L_0x0052:
            r4 = move-exception
            r7 = 0
        L_0x0054:
            if (r7 == 0) goto L_0x005e
            r7.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r5 = move-exception
            com.kofax.mobile.sdk._internal.C0767k.m1817d(r5)
        L_0x005e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p005aa.C8245g.m4554a(java.lang.String, com.kofax.mobile.sdk.aa.b, java.lang.String, com.kofax.kmc.kut.utilities.CertificateValidatorListener):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private static String m4553a(C8242b bVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (C8241a next : bVar.f4357ST) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(String.format("{\"Id\":\"%d\",\"Count\":\"%d\"}", new Object[]{Integer.valueOf(next.f4355SR), Integer.valueOf(next.f4356SS)}));
            i++;
        }
        return sb.toString();
    }
}
