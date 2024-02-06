package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.access$2300;

/* renamed from: o.setPosY */
public class setPosY extends writeUInt64NoTag<C1352hA> {
    public int IconCompatParcelizer = 0;
    public asMap MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public setPosY(RegularImmutableBiMap regularImmutableBiMap, asMap asmap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = asmap;
    }

    public void onDestroy() {
        asMap asmap = this.MediaBrowserCompat$ItemReceiver;
        if (!asmap.MediaBrowserCompat$MediaItem.isDisposed()) {
            asmap.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.setPosY$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<toScreenLocation> {
        private read() {
        }

        public /* synthetic */ read(setPosY setposy, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            toScreenLocation toscreenlocation = (toScreenLocation) obj;
            super.onNext(toscreenlocation);
            setPosY.IconCompatParcelizer(setPosY.this);
            setPosY setposy = setPosY.this;
            CaptureExperienceData captureExperienceData = new CaptureExperienceData(toscreenlocation);
            if (setposy.RatingCompat != null) {
                captureExperienceData.IconCompatParcelizer(setposy.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            if (!(th instanceof RetrofitException) || !((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer.equals("3010")) {
                setPosY.this.MediaBrowserCompat$ItemReceiver(setPosY.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            } else {
                setPosY.this.MediaBrowserCompat$ItemReceiver(setPosY.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new setRollThresholdEnabled(this)));
            }
        }

        static /* synthetic */ void write(toScreenLocation toscreenlocation, C1352hA hAVar) {
            if (toscreenlocation.read) {
                hAVar.MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                hAVar.write();
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setPosY setposy) {
        if (setposy.RatingCompat != null) {
            setposy.RatingCompat.aj_();
        }
    }
}
