package p040o;

import p040o.access$2300;
import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImageCaptureView */
public final /* synthetic */ class ImageCaptureView implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ ImageCaptureView MediaBrowserCompat$ItemReceiver = new ImageCaptureView();

    private /* synthetic */ ImageCaptureView() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).read(true);
    }

    /* renamed from: o.ImageCaptureView$a */
    public class C3469a extends writeUInt64NoTag<injectRttiCheckDeserializer$MediaBrowserCompat$ItemReceiver> {
        public getCrashlyticsInstallId MediaBrowserCompat$ItemReceiver;
        public final color read;

        @HmlPinActivity
        public C3469a(RegularImmutableBiMap regularImmutableBiMap, color color) {
            super(regularImmutableBiMap);
            this.read = color;
        }

        public void onDestroy() {
            color color = this.read;
            if (!color.MediaBrowserCompat$MediaItem.isDisposed()) {
                color.MediaBrowserCompat$MediaItem.dispose();
            }
            super.onDestroy();
        }

        /* renamed from: o.ImageCaptureView$a$IconCompatParcelizer */
        public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
            public IconCompatParcelizer() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                zzuk zzuk = (zzuk) obj;
                C3469a.MediaBrowserCompat$CustomActionResultReceiver(C3469a.this);
                if (zzuk != null) {
                    C3469a aVar = C3469a.this;
                    removePreviewCallbackListener removepreviewcallbacklistener = removePreviewCallbackListener.MediaBrowserCompat$ItemReceiver;
                    if (aVar.RatingCompat != null) {
                        removepreviewcallbacklistener.IconCompatParcelizer(aVar.RatingCompat);
                    }
                }
            }

            public final void onError(Throwable th) {
                C3469a.write(C3469a.this);
                C3469a.this.MediaBrowserCompat$ItemReceiver(C3469a.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }

        static /* synthetic */ void write(C3469a aVar) {
            if (aVar.RatingCompat != null) {
                aVar.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C3469a aVar) {
            if (aVar.RatingCompat != null) {
                aVar.RatingCompat.aj_();
            }
        }
    }
}
