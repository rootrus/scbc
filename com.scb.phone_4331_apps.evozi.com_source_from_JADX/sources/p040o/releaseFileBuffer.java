package p040o;

import p040o.CreditCard;
import p040o.RegularImmutableMap;
import p040o.zzca;

/* renamed from: o.releaseFileBuffer */
public class releaseFileBuffer extends writeUInt64NoTag<CreditCard.C11681> {
    public final detectFacesImageByteBufferJni IconCompatParcelizer;
    /* access modifiers changed from: package-private */
    public final RegularImmutableMap.Values MediaBrowserCompat$ItemReceiver;
    public int MediaDescriptionCompat;
    public finalizePreviousNativeSession read;
    public final PolygonOptions write;

    @HmlPinActivity
    public releaseFileBuffer(RegularImmutableBiMap regularImmutableBiMap, PolygonOptions polygonOptions, detectFacesImageByteBufferJni detectfacesimagebytebufferjni, RegularImmutableMap.Values values) {
        super(regularImmutableBiMap);
        this.write = polygonOptions;
        this.IconCompatParcelizer = detectfacesimagebytebufferjni;
        this.MediaBrowserCompat$ItemReceiver = values;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(boolean z, CreditCard.C11681 r1) {
        if (z) {
            r1.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            r1.read();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(finalizePreviousNativeSession finalizepreviousnativesession) {
        this.read = finalizepreviousnativesession;
        boolean z = true;
        if (finalizepreviousnativesession == null || !finalizepreviousnativesession.IconCompatParcelizer) {
            nativeCreateImage nativecreateimage = nativeCreateImage.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nativecreateimage.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        nativeCreateImageFromRaw nativecreateimagefromraw = new nativeCreateImageFromRaw(this, finalizepreviousnativesession);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nativecreateimagefromraw.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CreditCard.C11681 r0) {
        r0.MediaBrowserCompat$ItemReceiver();
        r0.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* renamed from: o.releaseFileBuffer$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzca.zzd> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(releaseFileBuffer releasefilebuffer, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzca.zzd zzd = (zzca.zzd) obj;
            super.onNext(zzd);
            releaseFileBuffer releasefilebuffer = releaseFileBuffer.this;
            RegularImmutableMap.Values unused = releasefilebuffer.MediaBrowserCompat$ItemReceiver;
            finalizePreviousNativeSession unused2 = releasefilebuffer.read = RegularImmutableMap.Values.MediaBrowserCompat$ItemReceiver(zzd);
            releaseFileBuffer releasefilebuffer2 = releaseFileBuffer.this;
            releasefilebuffer2.MediaBrowserCompat$ItemReceiver(releasefilebuffer2.read);
            releaseFileBuffer releasefilebuffer3 = releaseFileBuffer.this;
            nativeReleaseImage nativereleaseimage = nativeReleaseImage.IconCompatParcelizer;
            if (releasefilebuffer3.RatingCompat != null) {
                nativereleaseimage.IconCompatParcelizer(releasefilebuffer3.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            releaseFileBuffer releasefilebuffer = releaseFileBuffer.this;
            createImage createimage = new createImage(this, th);
            if (releasefilebuffer.RatingCompat != null) {
                createimage.IconCompatParcelizer(releasefilebuffer.RatingCompat);
            }
        }
    }

    /* renamed from: o.releaseFileBuffer$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzca.zzd> {
        private read() {
        }

        public /* synthetic */ read(releaseFileBuffer releasefilebuffer, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzca.zzd zzd = (zzca.zzd) obj;
            super.onNext(zzd);
            releaseFileBuffer releasefilebuffer = releaseFileBuffer.this;
            nativeInitImage nativeinitimage = new nativeInitImage(this, zzd);
            if (releasefilebuffer.RatingCompat != null) {
                nativeinitimage.IconCompatParcelizer(releasefilebuffer.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            releaseFileBuffer releasefilebuffer = releaseFileBuffer.this;
            nativeCancelProcessing nativecancelprocessing = new nativeCancelProcessing(this, th);
            if (releasefilebuffer.RatingCompat != null) {
                nativecancelprocessing.IconCompatParcelizer(releasefilebuffer.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        PolygonOptions polygonOptions = this.write;
        if (!polygonOptions.MediaBrowserCompat$MediaItem.isDisposed()) {
            polygonOptions.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void write(finalizePreviousNativeSession finalizepreviousnativesession, CreditCard.C11681 r2) {
        if (finalizepreviousnativesession == null || !finalizepreviousnativesession.IconCompatParcelizer) {
            r2.write();
        } else {
            r2.write(finalizepreviousnativesession);
        }
    }
}
