package p040o;

import com.kony.sdk.client.KonyLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.getTile$MediaBrowserCompat$CustomActionResultReceiver */
public final class getTile$MediaBrowserCompat$CustomActionResultReceiver implements IdCaptureModule_GetUriKtaFactory {
    private static String MediaBrowserCompat$CustomActionResultReceiver = "ServiceResponseImpl";
    private String IconCompatParcelizer;
    private ScbPrivacyPolicyActivity read;

    private getTile$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getTile$MediaBrowserCompat$CustomActionResultReceiver(p040o.ScbPrivacyPolicyActivity r5) throws java.lang.IllegalStateException, java.io.IOException {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.read = r5     // Catch:{ all -> 0x004b }
            r4.IconCompatParcelizer = r0     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x003d
            o.PrepaidResetOtpActivity r5 = r5.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x004b }
            java.io.InputStream r5 = r5.write()     // Catch:{ all -> 0x004b }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0038 }
            r1.<init>(r5)     // Catch:{ all -> 0x0038 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0038 }
            r2.<init>(r1)     // Catch:{ all -> 0x0038 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0033 }
            r0.<init>()     // Catch:{ all -> 0x0033 }
        L_0x0021:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002b
            r0.append(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0021
        L_0x002b:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0033 }
            r4.IconCompatParcelizer = r0     // Catch:{ all -> 0x0033 }
            r0 = r5
            goto L_0x0040
        L_0x0033:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x004d
        L_0x0038:
            r1 = move-exception
            r2 = r0
            r0 = r5
            r5 = r1
            goto L_0x004d
        L_0x003d:
            r4.IconCompatParcelizer = r0     // Catch:{ all -> 0x004b }
            r2 = r0
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r2.close()
        L_0x004a:
            return
        L_0x004b:
            r5 = move-exception
            r2 = r0
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            r2.close()
        L_0x0057:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getTile$MediaBrowserCompat$CustomActionResultReceiver.<init>(o.ScbPrivacyPolicyActivity):void");
    }

    public final JSONObject MediaBrowserCompat$ItemReceiver() {
        String str = MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("The Service Response: ");
        sb.append(this.IconCompatParcelizer);
        KonyLogger.MediaBrowserCompat$ItemReceiver(str, sb.toString());
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            try {
                if (str2.equals("")) {
                    this.IconCompatParcelizer = "{}";
                }
                return new JSONObject(this.IconCompatParcelizer);
            } catch (JSONException unused) {
                KonyLogger.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, "Invalid JSON Format");
            }
        }
        return null;
    }

    public final VerifyIdentityActivity write() {
        return this.read.IconCompatParcelizer();
    }
}
