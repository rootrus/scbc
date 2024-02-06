package p040o;

import p040o.C4880ju;

/* renamed from: o.getIdNumberFieldName */
public final /* synthetic */ class getIdNumberFieldName implements findFragmentByWho {
    private final /* synthetic */ C4880ju.C48815 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getIdNumberFieldName(C4880ju.C48815 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d1 A[LOOP:0: B:15:0x00cb->B:17:0x00d1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object IconCompatParcelizer(java.lang.Object r12) {
        /*
            r11 = this;
            o.ju$5 r0 = r11.MediaBrowserCompat$CustomActionResultReceiver
            o.addCircle r12 = (p040o.addCircle) r12
            o.ju r0 = p040o.C4880ju.this
            o.readUnsignedShort r0 = r0.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r1 = "channel"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r1)
            o.writeChars r1 = r0.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r3 = "channelId"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)
            int r3 = r2.hashCode()
            r4 = 2467610(0x25a71a, float:3.457858E-39)
            if (r3 == r4) goto L_0x005b
            r4 = 66081660(0x3f0537c, float:1.4125099E-36)
            if (r3 != r4) goto L_0x0090
            java.lang.String r3 = "EMAIL"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0090
            int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.manage_notifications_email_group_title
            android.content.res.Resources r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r3 = "getString(R.string.manag…ations_email_group_title)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.manage_notifications_email_main_checkbox_title
            android.content.res.Resources r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r4.getString(r3)
            java.lang.String r4 = "getString(R.string.manag…mail_main_checkbox_title)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.manage_notifications_email_main_checkbox_subtitle
            android.content.res.Resources r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = "getString(R.string.manag…l_main_checkbox_subtitle)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)
            o.setGmpAppId r4 = new o.setGmpAppId
            r4.<init>(r2, r3, r1)
            goto L_0x0097
        L_0x005b:
            java.lang.String r3 = "PUSH"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0090
            int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.manage_notifications_push_group_title
            android.content.res.Resources r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r3 = "getString(R.string.manag…cations_push_group_title)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
            int r3 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.manage_notifications_push_main_checkbox_title
            android.content.res.Resources r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r4.getString(r3)
            java.lang.String r4 = "getString(R.string.manag…push_main_checkbox_title)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.manage_notifications_push_main_checkbox_subtitle
            android.content.res.Resources r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = "getString(R.string.manag…h_main_checkbox_subtitle)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)
            o.setGmpAppId r4 = new o.setGmpAppId
            r4.<init>(r2, r3, r1)
            goto L_0x0097
        L_0x0090:
            o.setGmpAppId r4 = new o.setGmpAppId
            java.lang.String r1 = ""
            r4.<init>(r2, r2, r1)
        L_0x0097:
            java.lang.String r1 = r4.IconCompatParcelizer
            java.lang.String r6 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r8 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r9 = r4.write
            boolean r10 = r12.MediaBrowserCompat$CustomActionResultReceiver
            o.EventBus$$Lambda$1 r2 = new o.EventBus$$Lambda$1
            r7 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.List<o.addMarker> r12 = r12.write
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            o.ByteArrayDataOutput r0 = r0.write
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            java.lang.String r5 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r5)
            boolean r5 = r12 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00c2
            r4 = r12
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
        L_0x00c2:
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r12 = r12.iterator()
        L_0x00cb:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x00df
            java.lang.Object r4 = r12.next()
            o.addMarker r4 = (p040o.addMarker) r4
            o.EventBus$$Lambda$1 r4 = r0.read(r4)
            r3.add(r4)
            goto L_0x00cb
        L_0x00df:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            o.readUnsignedShort$write r12 = new o.readUnsignedShort$write
            r12.<init>()
            java.util.Comparator r12 = (java.util.Comparator) r12
            java.util.List r12 = p040o.HmlNTBBusinessURLInformationActivity.write(r3, r12)
            o.lambda$publish$0 r0 = new o.lambda$publish$0
            r0.<init>(r1, r2, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getIdNumberFieldName.IconCompatParcelizer(java.lang.Object):java.lang.Object");
    }
}
