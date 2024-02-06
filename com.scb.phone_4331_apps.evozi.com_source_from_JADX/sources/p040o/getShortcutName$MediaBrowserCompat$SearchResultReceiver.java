package p040o;

import p040o.CrashlyticsController;

/* renamed from: o.getShortcutName$MediaBrowserCompat$SearchResultReceiver */
public final class getShortcutName$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<CrashlyticsController.C32378.C32381.C32391, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getShortcutName IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getShortcutName$MediaBrowserCompat$SearchResultReceiver(getShortcutName getshortcutname) {
        super(1);
        this.IconCompatParcelizer = getshortcutname;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: o.CrashlyticsController$6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            o.CrashlyticsController$8$1$1 r6 = (p040o.CrashlyticsController.C32378.C32381.C32391) r6
            java.lang.String r0 = "display"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            o.getShortcutName r0 = r5.IconCompatParcelizer
            java.util.List<o.CrashlyticsController$6> r1 = r6.read
            java.lang.String r2 = "<set-?>"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            r0.MediaBrowserCompat$ItemReceiver = r1
            o.getShortcutName r0 = r5.IconCompatParcelizer
            java.util.List<o.CrashlyticsController$6> r1 = r0.MediaBrowserCompat$ItemReceiver
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0023:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r1.next()
            r4 = r3
            o.CrashlyticsController$6 r4 = (p040o.CrashlyticsController.C32346) r4
            boolean r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 == 0) goto L_0x0023
            r2.add(r3)
            goto L_0x0023
        L_0x0038:
            java.util.List r2 = (java.util.List) r2
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            r4 = 0
            if (r1 != 0) goto L_0x0047
            r2 = r4
        L_0x0047:
            if (r2 == 0) goto L_0x0050
            java.lang.Object r1 = p040o.HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(r2)
            r4 = r1
            o.CrashlyticsController$6 r4 = (p040o.CrashlyticsController.C32346) r4
        L_0x0050:
            r0.write = r4
            o.getShortcutName r0 = r5.IconCompatParcelizer
            o.getShortcutName$MediaBrowserCompat$SearchResultReceiver$2 r1 = new o.getShortcutName$MediaBrowserCompat$SearchResultReceiver$2
            r1.<init>(r5)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r0.RatingCompat
            r4 = 0
            if (r2 == 0) goto L_0x0063
            r2 = r3
            goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            if (r2 == 0) goto L_0x006b
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x006b:
            o.getShortcutName r0 = r5.IconCompatParcelizer
            p040o.getShortcutName.MediaBrowserCompat$ItemReceiver(r0)
            java.lang.Boolean r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e5
            java.util.List<o.CrashlyticsController$6> r6 = r6.read
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r6 = r6.iterator()
        L_0x0089:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x009e
            java.lang.Object r1 = r6.next()
            r2 = r1
            o.CrashlyticsController$6 r2 = (p040o.CrashlyticsController.C32346) r2
            boolean r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x0089
            r0.add(r1)
            goto L_0x0089
        L_0x009e:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r6 = r0.iterator()
        L_0x00a6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r6.next()
            o.CrashlyticsController$6 r0 = (p040o.CrashlyticsController.C32346) r0
            o.getShortcutName r1 = r5.IconCompatParcelizer
            java.lang.String r2 = "item"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            r1.write = r0
            o.getShortcutName$write r0 = p040o.getShortcutName.write.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r1.RatingCompat
            if (r2 == 0) goto L_0x00c5
            r2 = r3
            goto L_0x00c6
        L_0x00c5:
            r2 = r4
        L_0x00c6:
            if (r2 == 0) goto L_0x00a6
            T r1 = r1.RatingCompat
            r0.IconCompatParcelizer(r1)
            goto L_0x00a6
        L_0x00ce:
            o.getShortcutName r6 = r5.IconCompatParcelizer
            o.getShortcutName$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.getShortcutName$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>(r5)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r3 = r4
        L_0x00dd:
            if (r3 == 0) goto L_0x00f8
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
            goto L_0x00f8
        L_0x00e5:
            o.getShortcutName r6 = r5.IconCompatParcelizer
            o.getShortcutName$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver r0 = p040o.C4664xe2cb2c71.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r3 = r4
        L_0x00f1:
            if (r3 == 0) goto L_0x00f8
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
        L_0x00f8:
            o.HmlVerifyPhoneValidateOtpActivity r6 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getShortcutName$MediaBrowserCompat$SearchResultReceiver.invoke(java.lang.Object):java.lang.Object");
    }
}
