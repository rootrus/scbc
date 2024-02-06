package p040o;

import com.kony.sdk.client.KonyLogger;
import com.kony.sdk.common.KonyException;
import p040o.CHPR;

/* renamed from: o.CTPSV */
final class CTPSV implements CHPR.read {
    static String write = "ReportingServiceImpl";
    private CHPR.read MediaBrowserCompat$CustomActionResultReceiver = this;

    public CTPSV() throws KonyException {
        if (FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$SearchResultReceiver != null) {
            return;
        }
        if (FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver == null) {
            throw new KonyException("Call Init First");
        }
        throw new KonyException(FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050 A[SYNTHETIC, Splitter:B:16:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(boolean r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x001c
            o.CHPR r0 = p040o.CSYR2K.read
            if (r0 == 0) goto L_0x0019
            o.CHPR r0 = p040o.CSYR2K.read
            java.util.List<o.CHPR$read> r0 = r0.MediaBrowserCompat$ItemReceiver
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0019
            o.CHPR r0 = p040o.CSYR2K.read
            o.CHPR$read r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.util.List<o.CHPR$read> r0 = r0.MediaBrowserCompat$ItemReceiver
            r0.add(r1)
        L_0x0019:
            p040o.CTBSV.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x001c:
            o.IdExtractActivity r0 = p040o.CSYR2K.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "konyLastAccessTime"
            java.lang.Object r0 = r0.read(r1)
            r2 = 1
            if (r0 == 0) goto L_0x004d
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            o.IdExtractActivity r3 = p040o.CSYR2K.MediaBrowserCompat$ItemReceiver
            java.lang.Object r3 = r3.read(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r4 = r0.getTime()
            long r6 = r3.longValue()
            long r4 = r4 - r6
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            if (r9 != 0) goto L_0x0048
            r9 = 0
            goto L_0x004e
        L_0x0048:
            o.IdExtractActivity r9 = p040o.CSYR2K.MediaBrowserCompat$ItemReceiver
            r9.IconCompatParcelizer(r1)
        L_0x004d:
            r9 = r2
        L_0x004e:
            if (r9 == 0) goto L_0x00a9
            java.util.Map<java.lang.String, java.lang.String> r9 = p040o.FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$SearchResultReceiver     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r0 = "sessionurl"
            java.lang.Object r9 = r9.get(r0)     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ KonyException -> 0x00a5 }
            o.CTPMV r0 = new o.CTPMV     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r1 = "POST"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            o.CTPSV$3 r4 = new o.CTPSV$3     // Catch:{ KonyException -> 0x00a5 }
            r4.<init>()     // Catch:{ KonyException -> 0x00a5 }
            r0.<init>(r9, r1, r3, r4)     // Catch:{ KonyException -> 0x00a5 }
            r9 = 0
            java.lang.String r1 = p040o.CTPMV.read     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r3 = "setHeaders Started"
            com.kony.sdk.client.KonyLogger.MediaBrowserCompat$ItemReceiver((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ KonyException -> 0x00a5 }
            o.PreregistrationLandingActivity r1 = r0.write     // Catch:{ KonyException -> 0x00a5 }
            o.PrepaidRequestMarketConductActivity[] r9 = p040o.CTPMV.MediaBrowserCompat$CustomActionResultReceiver(r2, r9)     // Catch:{ KonyException -> 0x00a5 }
            r1.IconCompatParcelizer((p040o.PrepaidRequestMarketConductActivity[]) r9)     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r9 = p040o.CTPMV.read     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r1 = "setHeaders Ended"
            com.kony.sdk.client.KonyLogger.MediaBrowserCompat$ItemReceiver((java.lang.String) r9, (java.lang.String) r1)     // Catch:{ KonyException -> 0x00a5 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ KonyException -> 0x00a5 }
            r9.<init>()     // Catch:{ KonyException -> 0x00a5 }
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r1 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r3 = "konyreportingparams"
            org.json.JSONObject r2 = p040o.CTBSV.MediaBrowserCompat$ItemReceiver(r2)     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r2 = r2.toString()     // Catch:{ KonyException -> 0x00a5 }
            r1.<init>(r3, r2)     // Catch:{ KonyException -> 0x00a5 }
            r9.add(r1)     // Catch:{ KonyException -> 0x00a5 }
            r0.write((java.lang.Object) r9)     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r9 = p040o.CTPMV.read     // Catch:{ KonyException -> 0x00a5 }
            java.lang.String r1 = "executeAsync() Started"
            com.kony.sdk.client.KonyLogger.MediaBrowserCompat$ItemReceiver((java.lang.String) r9, (java.lang.String) r1)     // Catch:{ KonyException -> 0x00a5 }
            r0.start()     // Catch:{ KonyException -> 0x00a5 }
            return
        L_0x00a5:
            r9 = move-exception
            com.kony.sdk.client.KonyLogger.read(r9)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CTPSV.write(boolean):void");
    }

    public final void write() {
        KonyLogger.MediaBrowserCompat$ItemReceiver(write, "inbackground");
        CTBSV.write();
    }

    public final void read() {
        KonyLogger.MediaBrowserCompat$ItemReceiver(write, "inForeground");
        write(false);
    }
}
