package p040o;

/* renamed from: o.getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver */
public class getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    final /* synthetic */ getFirstPassTexelWidthUniform read;

    private getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver(getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform) {
        this.read = getfirstpasstexelwidthuniform;
    }

    public /* synthetic */ getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver(getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform, byte b) {
        this(getfirstpasstexelwidthuniform);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            o.getFirstPassTexelWidthUniform r0 = r2.read
            p040o.getFirstPassTexelWidthUniform.MediaBrowserCompat$MediaItem(r0)
            boolean r0 = r3 instanceof com.scb.phone.domain.errors.RetrofitException
            if (r0 == 0) goto L_0x0017
            r0 = r3
            com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
            o.ILocationSourceDelegate r1 = r0.IconCompatParcelizer
            if (r1 == 0) goto L_0x0017
            o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
            o.ILocationSourceDelegate$zza r0 = r0.write
            java.lang.String r0 = r0.IconCompatParcelizer
            goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            java.lang.String r1 = "3005"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "3006"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "3008"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "3010"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "3011"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "5009"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005f
            o.getFirstPassTexelWidthUniform r0 = r2.read
            o.ContrastFactor r1 = new o.ContrastFactor
            r1.<init>(r2, r3)
            T r3 = r0.RatingCompat
            if (r3 == 0) goto L_0x0056
            r3 = 1
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x0096
            T r3 = r0.RatingCompat
            r1.IconCompatParcelizer(r3)
            goto L_0x0096
        L_0x005f:
            o.getFirstPassTexelWidthUniform r1 = r2.read
            java.util.List r1 = r1.write
            if (r1 == 0) goto L_0x0086
            o.getFirstPassTexelWidthUniform r1 = r2.read
            o.CheckUsabilityData$write r1 = r1.read
            if (r1 == 0) goto L_0x0086
            o.getFirstPassTexelWidthUniform r1 = r2.read
            java.util.List r1 = r1.write
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0086
            o.getFirstPassTexelWidthUniform r0 = r2.read
            o.DetectBounds r1 = new o.DetectBounds
            r1.<init>(r2)
            r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (java.lang.Runnable) r1))
            goto L_0x0096
        L_0x0086:
            o.getFirstPassTexelWidthUniform r0 = r2.read
            r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, p040o.access$2300.write.JUST_DISMISS))
            goto L_0x0096
        L_0x008c:
            o.getFirstPassTexelWidthUniform r0 = r2.read
            o.GPUSettings r1 = new o.GPUSettings
            r1.<init>(r2)
            r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r3, (java.lang.Runnable) r1))
        L_0x0096:
            o.getFirstPassTexelWidthUniform r3 = r2.read
            boolean unused = r3.MediaMetadataCompat = false
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver.onError(java.lang.Throwable):void");
    }

    public final void onComplete() {
        getFirstPassTexelWidthUniform.read(this.read);
        getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform = this.read;
        C9772K k = C9772K.read;
        if (getfirstpasstexelwidthuniform.RatingCompat != null) {
            k.IconCompatParcelizer(getfirstpasstexelwidthuniform.RatingCompat);
        }
        boolean unused = this.read.MediaMetadataCompat = false;
    }
}
