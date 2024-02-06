package p040o;

import java.math.BigDecimal;
import p040o.CrashlyticsReport;
import p040o.RegularImmutableMap;
import p040o.zzca;

/* renamed from: o.nativeWriteTiffImageWithMetaData */
public class nativeWriteTiffImageWithMetaData extends writeUInt64NoTag<FieldLocation> {
    public final detectFacesImageByteBufferJni IconCompatParcelizer;
    public CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final RegularImmutableMap.Values MediaBrowserCompat$SearchResultReceiver;
    public double read;
    public finalizePreviousNativeSession write;

    @HmlPinActivity
    public nativeWriteTiffImageWithMetaData(RegularImmutableBiMap regularImmutableBiMap, detectFacesImageByteBufferJni detectfacesimagebytebufferjni, RegularImmutableMap.Values values) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = detectfacesimagebytebufferjni;
        this.MediaBrowserCompat$SearchResultReceiver = values;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.write;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r3 = this;
            o.CrashlyticsReport$FilesPayload$File$Builder r0 = r3.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0012
            o.finalizePreviousNativeSession r0 = r3.write
            if (r0 == 0) goto L_0x0012
            double r1 = r3.read
            boolean r0 = MediaBrowserCompat$ItemReceiver((p040o.finalizePreviousNativeSession) r0, (double) r1)
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nativeWriteTiffImageWithMetaData.MediaBrowserCompat$CustomActionResultReceiver():boolean");
    }

    static boolean MediaBrowserCompat$ItemReceiver(finalizePreviousNativeSession finalizepreviousnativesession, double d) {
        return BigDecimal.valueOf(d).compareTo(BigDecimal.valueOf(finalizepreviousnativesession.RatingCompat)) >= 0 && BigDecimal.valueOf(d).compareTo(BigDecimal.valueOf(finalizepreviousnativesession.MediaBrowserCompat$MediaItem)) <= 0;
    }

    /* renamed from: o.nativeWriteTiffImageWithMetaData$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzca.zzd> {
        recordLockedRead read;

        public final /* synthetic */ void onNext(Object obj) {
            zzca.zzd zzd = (zzca.zzd) obj;
            super.onNext(zzd);
            nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = nativeWriteTiffImageWithMetaData.this;
            getDpiY getdpiy = new getDpiY(this, zzd);
            if (nativewritetiffimagewithmetadata.RatingCompat != null) {
                getdpiy.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
            }
        }

        public write(recordLockedRead recordlockedread) {
            this.read = recordlockedread;
        }

        public final void onError(Throwable th) {
            super.onError(th);
            nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = nativeWriteTiffImageWithMetaData.this;
            getBitDepth getbitdepth = new getBitDepth(this, th);
            if (nativewritetiffimagewithmetadata.RatingCompat != null) {
                getbitdepth.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
            }
        }
    }
}
