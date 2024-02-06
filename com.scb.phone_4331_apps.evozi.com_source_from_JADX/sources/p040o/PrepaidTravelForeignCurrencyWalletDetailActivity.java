package p040o;

import java.net.URL;
import java.security.PrivilegedAction;

/* renamed from: o.PrepaidTravelForeignCurrencyWalletDetailActivity */
final class PrepaidTravelForeignCurrencyWalletDetailActivity implements PrivilegedAction {
    private final /* synthetic */ URL MediaBrowserCompat$CustomActionResultReceiver;

    PrepaidTravelForeignCurrencyWalletDetailActivity(URL url) {
        this.MediaBrowserCompat$CustomActionResultReceiver = url;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|(1:20)|(2:22|23)) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver() != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r3 = new java.lang.StringBuffer();
        r3.append("Unable to read URL ");
        r3.append(r6.MediaBrowserCompat$CustomActionResultReceiver);
        p040o.PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r2 = new java.lang.StringBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        r5 = r2;
        r2 = r1;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
        r1 = new java.lang.StringBuffer();
        r1.append("Unable to close stream for URL ");
        r1.append(r6.MediaBrowserCompat$CustomActionResultReceiver);
        p040o.PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(r1.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A[SYNTHETIC, Splitter:B:33:0x0077] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object run() {
        /*
            r6 = this;
            java.lang.String r0 = "Unable to close stream for URL "
            r1 = 0
            java.net.URL r2 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            r3 = 0
            r2.setUseCaches(r3)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            if (r2 == 0) goto L_0x001f
            java.util.Properties r3 = new java.util.Properties     // Catch:{ IOException -> 0x0034 }
            r3.<init>()     // Catch:{ IOException -> 0x0034 }
            r3.load(r2)     // Catch:{ IOException -> 0x0034 }
            r2.close()     // Catch:{ IOException -> 0x0034 }
            return r3
        L_0x001f:
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0070
        L_0x0025:
            boolean r2 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()
            if (r2 == 0) goto L_0x0070
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            goto L_0x0061
        L_0x0031:
            r2 = move-exception
            goto L_0x0075
        L_0x0033:
            r2 = r1
        L_0x0034:
            boolean r3 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x0050
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0071 }
            r3.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "Unable to read URL "
            r3.append(r4)     // Catch:{ all -> 0x0071 }
            java.net.URL r4 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0071 }
            r3.append(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0071 }
            p040o.PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r3)     // Catch:{ all -> 0x0071 }
        L_0x0050:
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0070
        L_0x0056:
            boolean r2 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()
            if (r2 == 0) goto L_0x0070
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L_0x0061:
            r2.append(r0)
            java.net.URL r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p040o.PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r0)
        L_0x0070:
            return r1
        L_0x0071:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0075:
            if (r1 == 0) goto L_0x0095
            r1.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x0095
        L_0x007b:
            boolean r1 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()
            if (r1 == 0) goto L_0x0095
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r0)
            java.net.URL r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p040o.PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r0)
        L_0x0095:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidTravelForeignCurrencyWalletDetailActivity.run():java.lang.Object");
    }
}
