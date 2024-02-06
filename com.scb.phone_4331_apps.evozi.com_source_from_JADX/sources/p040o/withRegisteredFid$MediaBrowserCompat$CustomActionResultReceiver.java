package p040o;

/* renamed from: o.withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver */
final class withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
    final /* synthetic */ withRegisteredFid MediaBrowserCompat$CustomActionResultReceiver;
    private final String write;

    /* synthetic */ withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver(withRegisteredFid withregisteredfid, String str, byte b) {
        this(withregisteredfid, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onNext(java.lang.Object r7) {
        /*
            r6 = this;
            o.setBoundsBias r7 = (p040o.setBoundsBias) r7
            java.lang.String r0 = r6.write
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 78694(0x13366, float:1.10274E-40)
            if (r1 == r5) goto L_0x002e
            r5 = 81906(0x13ff2, float:1.14775E-40)
            if (r1 == r5) goto L_0x0024
            r5 = 75532016(0x48086f0, float:3.0216576E-36)
            if (r1 != r5) goto L_0x0038
            java.lang.String r1 = "OTHER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "SCB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = r4
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "OWN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = r3
            goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            if (r0 == 0) goto L_0x0071
            if (r0 == r4) goto L_0x0058
            if (r0 != r2) goto L_0x0089
            o.withRegisteredFid r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.MediaBrowserCompat$MediaItem = r7
            o.withRegisteredFid r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.doNetworkCall r1 = new o.doNetworkCall
            r1.<init>(r6, r7)
            T r7 = r0.RatingCompat
            if (r7 == 0) goto L_0x0050
            r3 = r4
        L_0x0050:
            if (r3 == 0) goto L_0x0057
            T r7 = r0.RatingCompat
            r1.IconCompatParcelizer(r7)
        L_0x0057:
            return
        L_0x0058:
            o.withRegisteredFid r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.ParcelableVolumeInfo = r7
            o.withRegisteredFid r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.doRegistrationInternal r1 = new o.doRegistrationInternal
            r1.<init>(r6, r7)
            T r7 = r0.RatingCompat
            if (r7 == 0) goto L_0x0069
            r3 = r4
        L_0x0069:
            if (r3 == 0) goto L_0x0070
            T r7 = r0.RatingCompat
            r1.IconCompatParcelizer(r7)
        L_0x0070:
            return
        L_0x0071:
            o.withRegisteredFid r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r0.MediaSessionCompat$Token = r7
            o.withRegisteredFid r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.doGetId r1 = new o.doGetId
            r1.<init>(r6, r7)
            T r7 = r0.RatingCompat
            if (r7 == 0) goto L_0x0082
            r3 = r4
        L_0x0082:
            if (r3 == 0) goto L_0x0089
            T r7 = r0.RatingCompat
            r1.IconCompatParcelizer(r7)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver.onNext(java.lang.Object):void");
    }

    private withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver(withRegisteredFid withregisteredfid, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = withregisteredfid;
        this.write = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r6) {
        /*
            r5 = this;
            java.lang.String r6 = r5.write
            int r0 = r6.hashCode()
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 78694(0x13366, float:1.10274E-40)
            if (r0 == r4) goto L_0x002c
            r4 = 81906(0x13ff2, float:1.14775E-40)
            if (r0 == r4) goto L_0x0022
            r4 = 75532016(0x48086f0, float:3.0216576E-36)
            if (r0 != r4) goto L_0x0036
            java.lang.String r0 = "OTHER"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0036
            r6 = r1
            goto L_0x0037
        L_0x0022:
            java.lang.String r0 = "SCB"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0036
            r6 = r3
            goto L_0x0037
        L_0x002c:
            java.lang.String r0 = "OWN"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0036
            r6 = r2
            goto L_0x0037
        L_0x0036:
            r6 = -1
        L_0x0037:
            if (r6 == 0) goto L_0x005f
            if (r6 == r3) goto L_0x004e
            if (r6 != r1) goto L_0x006f
            o.withRegisteredFid r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.setRefreshToken r0 = p040o.setRefreshToken.read
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x0046
            r2 = r3
        L_0x0046:
            if (r2 == 0) goto L_0x004d
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
        L_0x004d:
            return
        L_0x004e:
            o.withRegisteredFid r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.setTokenCreationEpochInSecs r0 = p040o.setTokenCreationEpochInSecs.IconCompatParcelizer
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x0057
            r2 = r3
        L_0x0057:
            if (r2 == 0) goto L_0x005e
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
        L_0x005e:
            return
        L_0x005f:
            o.withRegisteredFid r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.FirebaseInstanceIdReceiver r0 = p040o.FirebaseInstanceIdReceiver.IconCompatParcelizer
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x0068
            r2 = r3
        L_0x0068:
            if (r2 == 0) goto L_0x006f
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver.onError(java.lang.Throwable):void");
    }
}
