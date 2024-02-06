package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Onboarding;
import p040o.doQuickAnalysis;
import p040o.writeUInt64NoTag;

/* renamed from: o.doQuickAnalysis$write$MediaBrowserCompat$CustomActionResultReceiver */
final class C4292x83ddb9a6<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.setHasDecor> {
    private /* synthetic */ doQuickAnalysis.write MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ Onboarding.C37171 MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ getLegacySharedPrefs write;

    C4292x83ddb9a6(doQuickAnalysis.write write2, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        this.write = getlegacysharedprefs;
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r0.equals("HOME_TOP_UP") != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r0.equals("MHMC") != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        r3.write(r2.write, r2.MediaBrowserCompat$ItemReceiver);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        p040o.doQuickAnalysis.write(r2.MediaBrowserCompat$CustomActionResultReceiver.read, new java.lang.Throwable());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r3) {
        /*
            r2 = this;
            o.CheckExtractActivity_MembersInjector$setHasDecor r3 = (p040o.CheckExtractActivity_MembersInjector.setHasDecor) r3
            o.getLegacySharedPrefs r0 = r2.write
            java.lang.String r0 = r0.MediaDescriptionCompat
            r3.read(r0)
            o.getLegacySharedPrefs r0 = r2.write
            java.lang.String r0 = r0.MediaDescriptionCompat
            int r1 = r0.hashCode()
            switch(r1) {
                case -771079065: goto L_0x008f;
                case 2360748: goto L_0x007f;
                case 2365553: goto L_0x006f;
                case 159567045: goto L_0x005f;
                case 277399877: goto L_0x0056;
                case 1033734720: goto L_0x0046;
                case 1034015741: goto L_0x0036;
                case 1878720662: goto L_0x0026;
                case 2090361232: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x009f
        L_0x0016:
            java.lang.String r1 = "PURPOSEFUL_LOAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.MediaBrowserCompat$SearchResultReceiver(r0, r1)
            return
        L_0x0026:
            java.lang.String r1 = "CREDIT_CARD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.read(r0, r1)
            return
        L_0x0036:
            java.lang.String r1 = "SPEEDY_LOAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.MediaMetadataCompat(r0, r1)
            return
        L_0x0046:
            java.lang.String r1 = "SPEEDY_CASH"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)
            return
        L_0x0056:
            java.lang.String r1 = "HOME_TOP_UP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            goto L_0x0077
        L_0x005f:
            java.lang.String r1 = "COMMERCIAL_LOAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.IconCompatParcelizer(r0, r1)
            return
        L_0x006f:
            java.lang.String r1 = "MHMC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
        L_0x0077:
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.write(r0, r1)
            return
        L_0x007f:
            java.lang.String r1 = "MCMC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.MediaBrowserCompat$ItemReceiver(r0, r1)
            return
        L_0x008f:
            java.lang.String r1 = "SPEEDY_LOAN_TOP_UP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009f
            o.getLegacySharedPrefs r0 = r2.write
            o.Onboarding$1 r1 = r2.MediaBrowserCompat$ItemReceiver
            r3.RatingCompat(r0, r1)
            return
        L_0x009f:
            o.doQuickAnalysis$write r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
            o.doQuickAnalysis r3 = r3.read
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r3.MediaBrowserCompat$ItemReceiver(r3.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r0, p040o.access$2300.write.JUST_DISMISS))
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C4292x83ddb9a6.IconCompatParcelizer(java.lang.Object):void");
    }
}
