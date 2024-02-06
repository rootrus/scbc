package p040o;

import p040o.FirebaseVisionText;

/* renamed from: o.checkContentProviderAuthority$MediaBrowserCompat$CustomActionResultReceiver */
public class C9880x49974ce extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isPowerSaveMode> {
    final /* synthetic */ checkContentProviderAuthority read;

    private C9880x49974ce(checkContentProviderAuthority checkcontentproviderauthority) {
        this.read = checkcontentproviderauthority;
    }

    public /* synthetic */ C9880x49974ce(checkContentProviderAuthority checkcontentproviderauthority, byte b) {
        this(checkcontentproviderauthority);
    }

    public final /* synthetic */ void onNext(Object obj) {
        checkContentProviderAuthority checkcontentproviderauthority = this.read;
        FirebaseVisionText.Line line = new FirebaseVisionText.Line(this, (isPowerSaveMode) obj);
        if (checkcontentproviderauthority.RatingCompat != null) {
            line.IconCompatParcelizer(checkcontentproviderauthority.RatingCompat);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r6) {
        /*
            r5 = this;
            o.checkContentProviderAuthority r0 = r5.read
            o.AutoValue_LibraryVersion r1 = p040o.AutoValue_LibraryVersion.IconCompatParcelizer
            T r2 = r0.RatingCompat
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            goto L_0x000d
        L_0x000c:
            r2 = r4
        L_0x000d:
            if (r2 == 0) goto L_0x0014
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0014:
            boolean r0 = r6 instanceof com.scb.phone.domain.errors.RetrofitException
            if (r0 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x002e
            r0 = r6
            com.scb.phone.domain.errors.RetrofitException r0 = (com.scb.phone.domain.errors.RetrofitException) r0
            o.ILocationSourceDelegate r1 = r0.IconCompatParcelizer
            if (r1 == 0) goto L_0x002e
            o.ILocationSourceDelegate r1 = r0.IconCompatParcelizer
            o.ILocationSourceDelegate$zza r1 = r1.write
            if (r1 == 0) goto L_0x002e
            o.ILocationSourceDelegate r0 = r0.IconCompatParcelizer
            o.ILocationSourceDelegate$zza r0 = r0.write
            java.lang.String r0 = r0.IconCompatParcelizer
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.lang.String r1 = "1035"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            o.checkContentProviderAuthority r0 = r5.read
            o.getRecognizedLanguages r1 = new o.getRecognizedLanguages
            r1.<init>(r5, r6)
            T r6 = r0.RatingCompat
            if (r6 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = r4
        L_0x0044:
            if (r3 == 0) goto L_0x004b
            T r6 = r0.RatingCompat
            r1.IconCompatParcelizer(r6)
        L_0x004b:
            return
        L_0x004c:
            o.checkContentProviderAuthority r0 = r5.read
            o.FirebaseVisionText$Element r1 = new o.FirebaseVisionText$Element
            r1.<init>(r5, r6)
            T r6 = r0.RatingCompat
            if (r6 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r3 = r4
        L_0x0059:
            if (r3 == 0) goto L_0x0060
            T r6 = r0.RatingCompat
            r1.IconCompatParcelizer(r6)
        L_0x0060:
            return
        L_0x0061:
            o.checkContentProviderAuthority r0 = r5.read
            o.FirebaseVisionText r1 = new o.FirebaseVisionText
            r1.<init>(r5, r6)
            T r6 = r0.RatingCompat
            if (r6 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r3 = r4
        L_0x006e:
            if (r3 == 0) goto L_0x0075
            T r6 = r0.RatingCompat
            r1.IconCompatParcelizer(r6)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C9880x49974ce.onError(java.lang.Throwable):void");
    }

    public final void onComplete() {
        checkContentProviderAuthority.MediaBrowserCompat$ItemReceiver(this.read);
    }
}
