package p040o;

import java.util.List;
import p040o.access$2300;
import p040o.injectRttiCheckDeserializer;

/* renamed from: o.takePictureForCaptureExperience */
public class takePictureForCaptureExperience extends writeUInt64NoTag<injectRttiCheckDeserializer.MediaDescriptionCompat> {
    public List<IdManager> IconCompatParcelizer;
    public final PolylineOptions read;
    /* access modifiers changed from: private */
    public final StandardRowSortedTable write;

    @HmlPinActivity
    public takePictureForCaptureExperience(RegularImmutableBiMap regularImmutableBiMap, StandardRowSortedTable standardRowSortedTable, PolylineOptions polylineOptions) {
        super(regularImmutableBiMap);
        this.write = standardRowSortedTable;
        this.read = polylineOptions;
    }

    public void onDestroy() {
        PolylineOptions polylineOptions = this.read;
        if (!polylineOptions.MediaBrowserCompat$MediaItem.isDisposed()) {
            polylineOptions.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.takePictureForCaptureExperience$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
        public write() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzuk zzuk = (zzuk) obj;
            takePictureForCaptureExperience.MediaBrowserCompat$SearchResultReceiver(takePictureForCaptureExperience.this);
            if (zzuk != null) {
                takePictureForCaptureExperience takepictureforcaptureexperience = takePictureForCaptureExperience.this;
                setDeviceDeclinationPitch setdevicedeclinationpitch = setDeviceDeclinationPitch.read;
                if (takepictureforcaptureexperience.RatingCompat != null) {
                    setdevicedeclinationpitch.IconCompatParcelizer(takepictureforcaptureexperience.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            takePictureForCaptureExperience.MediaMetadataCompat(takePictureForCaptureExperience.this);
            takePictureForCaptureExperience.this.MediaBrowserCompat$ItemReceiver(takePictureForCaptureExperience.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void IconCompatParcelizer(takePictureForCaptureExperience takepictureforcaptureexperience) {
        if (takepictureforcaptureexperience.RatingCompat != null) {
            takepictureforcaptureexperience.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(takePictureForCaptureExperience takepictureforcaptureexperience) {
        if (takepictureforcaptureexperience.RatingCompat != null) {
            takepictureforcaptureexperience.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(takePictureForCaptureExperience takepictureforcaptureexperience) {
        if (takepictureforcaptureexperience.RatingCompat != null) {
            takepictureforcaptureexperience.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(takePictureForCaptureExperience takepictureforcaptureexperience) {
        if (takepictureforcaptureexperience.RatingCompat != null) {
            takepictureforcaptureexperience.RatingCompat.aj_();
        }
    }
}
