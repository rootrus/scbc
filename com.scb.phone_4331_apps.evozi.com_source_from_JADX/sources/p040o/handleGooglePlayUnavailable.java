package p040o;

import p040o.FragmentBuilder_BindRegistrationLandingFragment;

/* renamed from: o.handleGooglePlayUnavailable */
public final /* synthetic */ class handleGooglePlayUnavailable implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindRegistrationLandingFragment.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ handleGooglePlayUnavailable(FragmentBuilder_BindRegistrationLandingFragment.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object write(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            o.FragmentBuilder_BindRegistrationLandingFragment$read r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r2 = r21
            com.scb.phone.data.entity.transfer.SingleDataEntity r2 = (com.scb.phone.data.entity.transfer.SingleDataEntity) r2
            o.onBtnSendEmailVerificationClicked r1 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "entity"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r1)
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            java.lang.String r4 = r1.MediaDescriptionCompat
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            java.lang.String r5 = r1.MediaMetadataCompat
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            java.lang.String r6 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            java.lang.String r7 = r1.IconCompatParcelizer
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            java.lang.String r8 = r1.write
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            java.lang.String r9 = r1.read
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            java.lang.String r10 = r1.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r1 = r2.getData()
            o.setPaint r1 = (p040o.setPaint) r1
            o.setOnChartGestureListener r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x00cf
            java.lang.String r3 = r1.write
            o.setMarker r11 = r1.MediaBrowserCompat$ItemReceiver
            if (r11 == 0) goto L_0x0073
            java.lang.String r13 = r11.IconCompatParcelizer
            java.lang.String r14 = r11.read
            java.lang.String r15 = r11.write
            java.lang.String r12 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r11.MediaDescriptionCompat
            java.lang.String r11 = r11.MediaBrowserCompat$ItemReceiver
            o.GoogleMap$OnPolylineClickListener r19 = new o.GoogleMap$OnPolylineClickListener
            r16 = r12
            r12 = r19
            r17 = r2
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2 = r19
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            java.util.List<o.setNoDataTextColor> r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x00c7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            java.lang.String r13 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r13)
            boolean r13 = r1 instanceof java.util.Collection
            if (r13 == 0) goto L_0x008e
            r12 = r1
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
        L_0x008e:
            r11.<init>(r12)
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.Iterator r1 = r1.iterator()
        L_0x0097:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x00c3
            java.lang.Object r12 = r1.next()
            o.setNoDataTextColor r12 = (p040o.setNoDataTextColor) r12
            java.lang.String r14 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r15 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r13 = r12.IconCompatParcelizer
            java.lang.String r0 = r12.write
            java.lang.String r12 = r12.read
            r21 = r1
            o.onPolylineClick r1 = new o.onPolylineClick
            r16 = r13
            r13 = r1
            r17 = r0
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            r11.add(r1)
            r0 = r20
            r1 = r21
            goto L_0x0097
        L_0x00c3:
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            o.onSnapshotReady r1 = new o.onSnapshotReady
            r1.<init>(r3, r2, r0)
            r11 = r1
            goto L_0x00d0
        L_0x00cf:
            r11 = 0
        L_0x00d0:
            o.GoogleMap$SnapshotReadyCallback r0 = new o.GoogleMap$SnapshotReadyCallback
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            o.BScanCNotificationDeepLinkActivity r0 = p040o.BScanCNotificationDeepLinkActivity.read(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.handleGooglePlayUnavailable.write(java.lang.Object):java.lang.Object");
    }
}
