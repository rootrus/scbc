package p040o;

/* renamed from: o.zzjb */
public final /* synthetic */ class zzjb implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setTimeoutMillis write;

    public /* synthetic */ zzjb(setTimeoutMillis settimeoutmillis) {
        this.write = settimeoutmillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object write(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r25
            o.getKeyframes r0 = (p040o.getKeyframes) r0
            java.lang.String r1 = "entity"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r3 = r0.read
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r1.PlaybackStateCompat$CustomAction
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r5 = r1.f2762x50fd9e4a
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r6 = r1.ParcelableVolumeInfo
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r7 = r1.write
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = r1.RatingCompat
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r9 = r1.MediaSessionCompat$ResultReceiverWrapper
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
            r2 = 0
            if (r1 == 0) goto L_0x0030
            org.threeten.bp.OffsetDateTime r1 = p040o.FragmentBuilder_BindSummaryFragment.write((java.lang.String) r1, (org.threeten.p041bp.OffsetDateTime) r2)
            r10 = r1
            goto L_0x0031
        L_0x0030:
            r10 = r2
        L_0x0031:
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r11 = r1.read
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.MediaBrowserCompat$MediaItem
            if (r1 == 0) goto L_0x0045
            double r12 = java.lang.Double.parseDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r12)
            r12 = r1
            goto L_0x0046
        L_0x0045:
            r12 = r2
        L_0x0046:
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.PolystarContent r1 = r1.MediaMetadataCompat
            if (r1 == 0) goto L_0x0052
            o.setContentDescription r1 = p040o.FragmentBuilder_ContributePromptPayManagementLandingFragment.read(r1)
            r13 = r1
            goto L_0x0053
        L_0x0052:
            r13 = r2
        L_0x0053:
            o.MutablePair r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.MediaSessionCompat$QueueItem
            java.lang.String r14 = "1"
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r14)
            o.MutablePair r14 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.PolystarContent r14 = r14.MediaDescriptionCompat
            if (r14 == 0) goto L_0x0069
            o.setContentDescription r14 = p040o.FragmentBuilder_ContributePromptPayManagementLandingFragment.read(r14)
            r15 = r14
            goto L_0x006a
        L_0x0069:
            r15 = r2
        L_0x006a:
            o.MutablePair r14 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.setVertex r14 = r14.MediaBrowserCompat$SearchResultReceiver
            if (r14 == 0) goto L_0x0073
            java.lang.String r14 = r14.MediaBrowserCompat$ItemReceiver
            goto L_0x0074
        L_0x0073:
            r14 = r2
        L_0x0074:
            o.MutablePair r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.setVertex r2 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r2 == 0) goto L_0x007f
            java.lang.String r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r16 = r15
            goto L_0x0082
        L_0x007f:
            r16 = r15
            r2 = 0
        L_0x0082:
            o.zzjx$zzc r15 = new o.zzjx$zzc
            r15.<init>(r14, r2)
            o.MutablePair r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.setVertex r2 = r2.MediaSessionCompat$Token
            if (r2 == 0) goto L_0x0090
            java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            o.MutablePair r14 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.setVertex r14 = r14.MediaSessionCompat$Token
            if (r14 == 0) goto L_0x009c
            java.lang.String r14 = r14.MediaBrowserCompat$CustomActionResultReceiver
            r17 = r15
            goto L_0x009f
        L_0x009c:
            r17 = r15
            r14 = 0
        L_0x009f:
            o.zzjx$zzc r15 = new o.zzjx$zzc
            r15.<init>(r2, r14)
            o.MutablePair r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.setVertex r2 = r2.IconCompatParcelizer
            if (r2 == 0) goto L_0x00ad
            java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x00ae
        L_0x00ad:
            r2 = 0
        L_0x00ae:
            o.MutablePair r14 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.setVertex r14 = r14.IconCompatParcelizer
            if (r14 == 0) goto L_0x00b9
            java.lang.String r14 = r14.MediaBrowserCompat$CustomActionResultReceiver
            r18 = r15
            goto L_0x00bc
        L_0x00b9:
            r18 = r15
            r14 = 0
        L_0x00bc:
            o.zzjx$zzc r15 = new o.zzjx$zzc
            r15.<init>(r2, r14)
            o.MutablePair r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.objectsEqual r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x00ca
            java.lang.String r14 = r2.read
            goto L_0x00cb
        L_0x00ca:
            r14 = 0
        L_0x00cb:
            if (r2 == 0) goto L_0x00d2
            r21 = r15
            java.lang.String r15 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x00d5
        L_0x00d2:
            r21 = r15
            r15 = 0
        L_0x00d5:
            if (r2 == 0) goto L_0x00e5
            r22 = r13
            java.lang.String r13 = r2.write
            r23 = r12
            r12 = 0
            if (r13 == 0) goto L_0x00ea
            org.threeten.bp.OffsetDateTime r13 = p040o.FragmentBuilder_BindSummaryFragment.write((java.lang.String) r13, (org.threeten.p041bp.OffsetDateTime) r12)
            goto L_0x00eb
        L_0x00e5:
            r23 = r12
            r22 = r13
            r12 = 0
        L_0x00ea:
            r13 = r12
        L_0x00eb:
            if (r2 == 0) goto L_0x00f6
            java.lang.String r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x00f6
            org.threeten.bp.OffsetDateTime r2 = p040o.FragmentBuilder_BindSummaryFragment.write((java.lang.String) r2, (org.threeten.p041bp.OffsetDateTime) r12)
            goto L_0x00f7
        L_0x00f6:
            r2 = r12
        L_0x00f7:
            o.getMostProbableActivity r12 = new o.getMostProbableActivity
            r19 = r12
            r12.<init>(r14, r15, r13, r2)
            int r0 = r0.IconCompatParcelizer
            r20 = r0
            o.getProbableActivities r0 = new o.getProbableActivities
            r2 = r0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            r12 = r23
            r13 = r22
            r1 = r17
            r17 = r18
            r18 = r21
            r15 = r16
            r16 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.zzjb.write(java.lang.Object):java.lang.Object");
    }
}
