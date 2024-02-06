package p040o;

import p040o.RegularImmutableMap;
import p040o.zzca;

/* renamed from: o.nativeWriteJpegImage */
public class nativeWriteJpegImage extends writeUInt64NoTag<setExpirationMonth> {
    /* access modifiers changed from: private */
    public final RegularImmutableMap.Values MediaBrowserCompat$ItemReceiver;
    public final detectFacesImageByteBufferJni read;

    @HmlPinActivity
    public nativeWriteJpegImage(RegularImmutableBiMap regularImmutableBiMap, detectFacesImageByteBufferJni detectfacesimagebytebufferjni, RegularImmutableMap.Values values) {
        super(regularImmutableBiMap);
        this.read = detectfacesimagebytebufferjni;
        this.MediaBrowserCompat$ItemReceiver = values;
    }

    /* renamed from: o.nativeWriteJpegImage$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzca.zzd> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(nativeWriteJpegImage nativewritejpegimage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzca.zzd zzd = (zzca.zzd) obj;
            super.onNext(zzd);
            nativeWriteJpegImage nativewritejpegimage = nativeWriteJpegImage.this;
            IpFileBuffer ipFileBuffer = new IpFileBuffer(this, zzd);
            if (nativewritejpegimage.RatingCompat != null) {
                ipFileBuffer.IconCompatParcelizer(nativewritejpegimage.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            if (!nativeWriteJpegImage.this.MediaBrowserCompat$CustomActionResultReceiver(th, true)) {
                nativeWriteJpegImage nativewritejpegimage = nativeWriteJpegImage.this;
                getDpiX getdpix = new getDpiX(this, th);
                if (nativewritejpegimage.RatingCompat != null) {
                    getdpix.IconCompatParcelizer(nativewritejpegimage.RatingCompat);
                }
            }
        }
    }
}
