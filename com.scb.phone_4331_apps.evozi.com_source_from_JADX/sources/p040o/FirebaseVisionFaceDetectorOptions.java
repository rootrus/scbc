package p040o;

import p040o.KotlinDetector;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionFaceDetectorOptions */
public final /* synthetic */ class FirebaseVisionFaceDetectorOptions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ detectVersion write;

    /* renamed from: o.FirebaseVisionFaceDetectorOptions$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ access$2200 read;

        public /* synthetic */ Builder(access$2200 access_2200) {
            this.read = access_2200;
        }

        public final void IconCompatParcelizer(Object obj) {
            KotlinDetector.write.MediaBrowserCompat$ItemReceiver(this.read, (getAddress5) obj);
        }
    }

    public /* synthetic */ FirebaseVisionFaceDetectorOptions(detectVersion detectversion, Throwable th) {
        this.write = detectversion;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.Object r5) {
        /*
            r4 = this;
            o.detectVersion r0 = r4.write
            java.lang.Throwable r1 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.getAddress4 r5 = (p040o.getAddress4) r5
            r5.aj_()
            boolean r2 = r1 instanceof com.scb.phone.domain.errors.RetrofitException
            if (r2 == 0) goto L_0x0047
            if (r2 == 0) goto L_0x0023
            r2 = r1
            com.scb.phone.domain.errors.RetrofitException r2 = (com.scb.phone.domain.errors.RetrofitException) r2
            o.ILocationSourceDelegate r3 = r2.IconCompatParcelizer
            if (r3 == 0) goto L_0x0023
            o.ILocationSourceDelegate r3 = r2.IconCompatParcelizer
            o.ILocationSourceDelegate$zza r3 = r3.write
            if (r3 == 0) goto L_0x0023
            o.ILocationSourceDelegate r2 = r2.IconCompatParcelizer
            o.ILocationSourceDelegate$zza r2 = r2.write
            java.lang.String r2 = r2.IconCompatParcelizer
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            java.lang.String r3 = "1035"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0038
            o.RegularImmutableBiMap r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.access$2300$write r2 = p040o.access$2300.write.JUST_DISMISS
            o.access$2200 r0 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (p040o.access$2300.write) r2)
            r5.mo13729b_(r0)
            return
        L_0x0038:
            o.RegularImmutableBiMap r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.FirebaseVisionText$TextBlock r2 = new o.FirebaseVisionText$TextBlock
            r2.<init>(r5)
            o.access$2200 r0 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2)
            r5.write((p040o.access$2200) r0)
            return
        L_0x0047:
            o.RegularImmutableBiMap r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.FirebaseVisionText$TextBlock r2 = new o.FirebaseVisionText$TextBlock
            r2.<init>(r5)
            o.access$2200 r0 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2)
            r5.write((p040o.access$2200) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FirebaseVisionFaceDetectorOptions.IconCompatParcelizer(java.lang.Object):void");
    }
}
