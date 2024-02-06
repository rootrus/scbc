package p040o;

import p040o.access$2300;
import p040o.setJobId;
import p040o.writeUInt64NoTag;
import p040o.zzfy;

/* renamed from: o.setJobId$MediaBrowserCompat$ItemReceiver */
public final class setJobId$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfy.zze> {
    final /* synthetic */ setJobId IconCompatParcelizer;

    /* renamed from: o.setJobId$MediaBrowserCompat$ItemReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C6980x2ace65f3> {
        private /* synthetic */ setJobId$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

        write(setJobId$MediaBrowserCompat$ItemReceiver setjobid_mediabrowsercompat_itemreceiver) {
            this.IconCompatParcelizer = setjobid_mediabrowsercompat_itemreceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C6980x2ace65f3 passportCaptureModule_GetOnDeviceExceptionResponseDeserializerFactory = (C6980x2ace65f3) obj;
            passportCaptureModule_GetOnDeviceExceptionResponseDeserializerFactory.read(this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
            if (this.IconCompatParcelizer.IconCompatParcelizer.write.equals(setJobId.write.NEW_VERIFICATION_CODE)) {
                passportCaptureModule_GetOnDeviceExceptionResponseDeserializerFactory.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public setJobId$MediaBrowserCompat$ItemReceiver(setJobId setjobid) {
        this.IconCompatParcelizer = setjobid;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onNext(java.lang.Object r5) {
        /*
            r4 = this;
            o.zzfy$zze r5 = (p040o.zzfy.zze) r5
            java.lang.String r0 = "otp"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            super.onNext(r5)
            o.setJobId r0 = r4.IconCompatParcelizer
            java.lang.String r1 = r5.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0013
            r1 = r2
        L_0x0013:
            r0.MediaBrowserCompat$SearchResultReceiver = r1
            o.setJobId r0 = r4.IconCompatParcelizer
            java.lang.String r1 = r5.read
            if (r1 != 0) goto L_0x001d
            r1 = r2
        L_0x001d:
            r0.MediaBrowserCompat$MediaItem = r1
            o.setJobId r0 = r4.IconCompatParcelizer
            java.lang.String r5 = r5.write
            if (r5 == 0) goto L_0x0027
            r2 = r5
        L_0x0027:
            r0.MediaMetadataCompat = r2
            o.setJobId r5 = r4.IconCompatParcelizer
            java.lang.String r5 = r5.MediaBrowserCompat$MediaItem
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x003c
            r5 = r0
            goto L_0x003d
        L_0x003c:
            r5 = r1
        L_0x003d:
            if (r5 == 0) goto L_0x005a
            o.setJobId r5 = r4.IconCompatParcelizer
            java.lang.String r5 = r5.MediaMetadataCompat
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 != 0) goto L_0x004f
            r5 = r0
            goto L_0x0050
        L_0x004f:
            r5 = r1
        L_0x0050:
            if (r5 == 0) goto L_0x005a
            o.setJobId r5 = r4.IconCompatParcelizer
            o.setJobId$write r2 = p040o.setJobId.write.NEW_VERIFICATION_CODE
            r5.write = r2
            goto L_0x0061
        L_0x005a:
            o.setJobId r5 = r4.IconCompatParcelizer
            o.setJobId$write r2 = p040o.setJobId.write.ENTER_VERIFICATION_CODE
            r5.write = r2
        L_0x0061:
            o.setJobId r5 = r4.IconCompatParcelizer
            p040o.setJobId.MediaBrowserCompat$SearchResultReceiver(r5)
            o.setJobId r5 = r4.IconCompatParcelizer
            o.setJobId$MediaBrowserCompat$ItemReceiver$write r2 = new o.setJobId$MediaBrowserCompat$ItemReceiver$write
            r2.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r3 = r5.RatingCompat
            if (r3 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r0 = r1
        L_0x0075:
            if (r0 == 0) goto L_0x007c
            T r5 = r5.RatingCompat
            r2.IconCompatParcelizer(r5)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setJobId$MediaBrowserCompat$ItemReceiver.onNext(java.lang.Object):void");
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
