package p040o;

/* renamed from: o.hn$MediaBrowserCompat$CustomActionResultReceiver */
public final class hn$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C4776hn MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hn$MediaBrowserCompat$CustomActionResultReceiver(C4776hn hnVar) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = hnVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0.equals("9001") != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0.equals("3018") != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0.equals("3017") != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(r2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(r3, p040o.access$2300.write.NAVIGATE_BACK));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r0.equals("3014") != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r0.equals("3013") != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(r2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(r3, (java.lang.Runnable) new p040o.hn$MediaBrowserCompat$CustomActionResultReceiver.C100144(r2)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r0 = "throwable"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            boolean r0 = r3 instanceof com.scb.phone.domain.errors.RetrofitException
            if (r0 == 0) goto L_0x0071
            r0 = r3
            com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
            o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x0019
            o.ILocationSourceDelegate$zza r0 = r0.write
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.IconCompatParcelizer
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0064
            int r1 = r0.hashCode()
            switch(r1) {
                case 1567039: goto L_0x004f;
                case 1567040: goto L_0x0046;
                case 1567043: goto L_0x0036;
                case 1567044: goto L_0x002d;
                case 1745752: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0064
        L_0x0024:
            java.lang.String r1 = "9001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            goto L_0x0057
        L_0x002d:
            java.lang.String r1 = "3018"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            goto L_0x003e
        L_0x0036:
            java.lang.String r1 = "3017"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
        L_0x003e:
            o.hn r0 = r2.MediaBrowserCompat$ItemReceiver
            o.access$2300$write r1 = p040o.access$2300.write.NAVIGATE_BACK
            r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (p040o.access$2300.write) r1))
            goto L_0x007d
        L_0x0046:
            java.lang.String r1 = "3014"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            goto L_0x0057
        L_0x004f:
            java.lang.String r1 = "3013"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
        L_0x0057:
            o.hn r0 = r2.MediaBrowserCompat$ItemReceiver
            o.hn$MediaBrowserCompat$CustomActionResultReceiver$4 r1 = new o.hn$MediaBrowserCompat$CustomActionResultReceiver$4
            r1.<init>(r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (java.lang.Runnable) r1))
            goto L_0x007d
        L_0x0064:
            o.hn r0 = r2.MediaBrowserCompat$ItemReceiver
            o.hn$MediaBrowserCompat$CustomActionResultReceiver$1 r1 = new o.hn$MediaBrowserCompat$CustomActionResultReceiver$1
            r1.<init>(r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (java.lang.Runnable) r1))
            goto L_0x007d
        L_0x0071:
            o.hn r0 = r2.MediaBrowserCompat$ItemReceiver
            o.hn$MediaBrowserCompat$CustomActionResultReceiver$3 r1 = new o.hn$MediaBrowserCompat$CustomActionResultReceiver$3
            r1.<init>(r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (java.lang.Runnable) r1))
        L_0x007d:
            o.HmlVerifyPhoneValidateOtpActivity r3 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.hn$MediaBrowserCompat$CustomActionResultReceiver.invoke(java.lang.Object):java.lang.Object");
    }
}
