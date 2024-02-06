package p040o;

import p040o.CaptureActivity;
import p040o.access$2300;

/* renamed from: o.setExtract */
public class setExtract extends writeUInt64NoTag<getCompressedFrontImageSize> {
    public final draggable IconCompatParcelizer;
    public parseEventExecution MediaBrowserCompat$ItemReceiver;
    public boolean read = false;

    @HmlPinActivity
    public setExtract(draggable draggable, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = draggable;
    }

    /* renamed from: o.setExtract$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        public /* synthetic */ write(setExtract setextract, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                setExtract setextract = setExtract.this;
                CaptureActivity.C3146a aVar = CaptureActivity.C3146a.IconCompatParcelizer;
                if (setextract.RatingCompat != null) {
                    aVar.IconCompatParcelizer(setextract.RatingCompat);
                }
            }
            setExtract.IconCompatParcelizer(setExtract.this);
        }

        public final void onError(Throwable th) {
            setExtract.write(setExtract.this);
            setExtract.this.MediaBrowserCompat$ItemReceiver(setExtract.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void write(setExtract setextract) {
        if (setextract.RatingCompat != null) {
            setextract.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setExtract setextract) {
        if (setextract.RatingCompat != null) {
            setextract.RatingCompat.aj_();
        }
    }
}
