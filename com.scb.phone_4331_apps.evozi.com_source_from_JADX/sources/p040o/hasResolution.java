package p040o;

/* renamed from: o.hasResolution */
public final class hasResolution extends FragmentBuilder_BindSummaryFragment {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p040o.getAddress> MediaBrowserCompat$CustomActionResultReceiver(java.util.List<p040o.getParentId> r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 1
            r3 = 2
            switch(r0) {
                case -1953474717: goto L_0x0029;
                case 72712: goto L_0x001f;
                case 82406: goto L_0x0015;
                case 995076963: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "PURCHASED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0033
            r6 = 0
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "SSF"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0033
            r6 = r1
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "IPO"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0033
            r6 = r2
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "OTHERS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0033
            r6 = r3
            goto L_0x0034
        L_0x0033:
            r6 = -1
        L_0x0034:
            if (r6 == 0) goto L_0x00fc
            if (r6 == r2) goto L_0x00be
            if (r6 == r3) goto L_0x0080
            if (r6 == r1) goto L_0x0042
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        L_0x0042:
            o.show r6 = new o.show
            r6.<init>(r5)
            o.onServiceDisconnected r5 = p040o.onServiceDisconnected.write
            o.show r0 = new o.show
            o.AppCompatSeekBar r1 = r6.write
            o.getNextTransition r2 = new o.getNextTransition
            java.util.Iterator<? extends T> r6 = r6.IconCompatParcelizer
            r2.<init>(r6, r5)
            r0.<init>(r1, r2)
            o.nonNull$read r5 = new o.nonNull$read
            r5.<init>(r4)
            o.show r6 = new o.show
            o.AppCompatSeekBar r1 = r0.write
            o.getSharedElementEnterTransition r2 = new o.getSharedElementEnterTransition
            java.util.Iterator<? extends T> r0 = r0.IconCompatParcelizer
            r2.<init>(r0, r5)
            r6.<init>(r1, r2)
            o.setupDialog$IconCompatParcelizer r5 = new o.setupDialog$IconCompatParcelizer
            o.setupDialog$1 r0 = new o.setupDialog$1
            r0.<init>()
            o.setupDialog$8 r1 = new o.setupDialog$8
            r1.<init>()
            r5.<init>(r0, r1)
            java.lang.Object r5 = r6.write(r5)
            java.util.List r5 = (java.util.List) r5
            return r5
        L_0x0080:
            o.show r6 = new o.show
            r6.<init>(r5)
            o.getService r5 = p040o.getService.write
            o.show r0 = new o.show
            o.AppCompatSeekBar r1 = r6.write
            o.getNextTransition r2 = new o.getNextTransition
            java.util.Iterator<? extends T> r6 = r6.IconCompatParcelizer
            r2.<init>(r6, r5)
            r0.<init>(r1, r2)
            o.nonNull$read r5 = new o.nonNull$read
            r5.<init>(r4)
            o.show r6 = new o.show
            o.AppCompatSeekBar r1 = r0.write
            o.getSharedElementEnterTransition r2 = new o.getSharedElementEnterTransition
            java.util.Iterator<? extends T> r0 = r0.IconCompatParcelizer
            r2.<init>(r0, r5)
            r6.<init>(r1, r2)
            o.setupDialog$IconCompatParcelizer r5 = new o.setupDialog$IconCompatParcelizer
            o.setupDialog$1 r0 = new o.setupDialog$1
            r0.<init>()
            o.setupDialog$8 r1 = new o.setupDialog$8
            r1.<init>()
            r5.<init>(r0, r1)
            java.lang.Object r5 = r6.write(r5)
            java.util.List r5 = (java.util.List) r5
            return r5
        L_0x00be:
            o.show r6 = new o.show
            r6.<init>(r5)
            o.getServiceWithTimeout r5 = p040o.getServiceWithTimeout.MediaBrowserCompat$CustomActionResultReceiver
            o.show r0 = new o.show
            o.AppCompatSeekBar r1 = r6.write
            o.getNextTransition r2 = new o.getNextTransition
            java.util.Iterator<? extends T> r6 = r6.IconCompatParcelizer
            r2.<init>(r6, r5)
            r0.<init>(r1, r2)
            o.nonNull$read r5 = new o.nonNull$read
            r5.<init>(r4)
            o.show r6 = new o.show
            o.AppCompatSeekBar r1 = r0.write
            o.getSharedElementEnterTransition r2 = new o.getSharedElementEnterTransition
            java.util.Iterator<? extends T> r0 = r0.IconCompatParcelizer
            r2.<init>(r0, r5)
            r6.<init>(r1, r2)
            o.setupDialog$IconCompatParcelizer r5 = new o.setupDialog$IconCompatParcelizer
            o.setupDialog$1 r0 = new o.setupDialog$1
            r0.<init>()
            o.setupDialog$8 r1 = new o.setupDialog$8
            r1.<init>()
            r5.<init>(r0, r1)
            java.lang.Object r5 = r6.write(r5)
            java.util.List r5 = (java.util.List) r5
            return r5
        L_0x00fc:
            o.show r6 = new o.show
            r6.<init>(r5)
            o.ConnectionResult r5 = p040o.ConnectionResult.MediaBrowserCompat$ItemReceiver
            o.show r0 = new o.show
            o.AppCompatSeekBar r1 = r6.write
            o.getNextTransition r2 = new o.getNextTransition
            java.util.Iterator<? extends T> r6 = r6.IconCompatParcelizer
            r2.<init>(r6, r5)
            r0.<init>(r1, r2)
            o.nonNull$read r5 = new o.nonNull$read
            r5.<init>(r4)
            o.show r6 = new o.show
            o.AppCompatSeekBar r1 = r0.write
            o.getSharedElementEnterTransition r2 = new o.getSharedElementEnterTransition
            java.util.Iterator<? extends T> r0 = r0.IconCompatParcelizer
            r2.<init>(r0, r5)
            r6.<init>(r1, r2)
            o.setupDialog$IconCompatParcelizer r5 = new o.setupDialog$IconCompatParcelizer
            o.setupDialog$1 r0 = new o.setupDialog$1
            r0.<init>()
            o.setupDialog$8 r1 = new o.setupDialog$8
            r1.<init>()
            r5.<init>(r0, r1)
            java.lang.Object r5 = r6.write(r5)
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.hasResolution.MediaBrowserCompat$CustomActionResultReceiver(java.util.List, java.lang.String):java.util.List");
    }

    public static getAddress MediaBrowserCompat$CustomActionResultReceiver(getParentId getparentid) {
        String str;
        String str2;
        getAddress MediaBrowserCompat$CustomActionResultReceiver = getAddress.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = getparentid.MediaSessionCompat$QueueItem;
        String str3 = "-";
        if (getparentid.IconCompatParcelizer != null) {
            str = getparentid.IconCompatParcelizer.write();
        } else {
            str = str3;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        if (getparentid.IconCompatParcelizer != null) {
            str2 = getparentid.IconCompatParcelizer.IconCompatParcelizer();
        } else {
            str2 = str3;
        }
        MediaBrowserCompat$CustomActionResultReceiver.read = str2;
        if (getparentid.write != null) {
            str3 = getparentid.write;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str3;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = getparentid.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = getparentid.MediaMetadataCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = getparentid.RatingCompat;
        MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = getparentid.f2847x50fd9e4a;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = getparentid.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = getparentid.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = getparentid.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = getparentid.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.write = getparentid.read;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
