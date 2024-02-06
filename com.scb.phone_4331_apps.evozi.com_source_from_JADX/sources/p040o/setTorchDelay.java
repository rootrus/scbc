package p040o;

import android.text.TextUtils;
import p040o.injectRttiCheckDeserializer;

/* renamed from: o.setTorchDelay */
public class setTorchDelay extends writeUInt64NoTag<injectRttiCheckDeserializer.read> {
    public String IconCompatParcelizer;
    public final C10847jointType MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public boolean write;

    @HmlPinActivity
    public setTorchDelay(RegularImmutableBiMap regularImmutableBiMap, C10847jointType jointtype) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = jointtype;
    }

    public final void write() {
        boolean z = true;
        if (TextUtils.isEmpty(this.IconCompatParcelizer) || !this.write) {
            barCodeFound barcodefound = barCodeFound.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                barcodefound.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        BarCodeFoundEvent barCodeFoundEvent = BarCodeFoundEvent.read;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            barCodeFoundEvent.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public void onDestroy() {
        C10847jointType jointtype = this.MediaBrowserCompat$ItemReceiver;
        if (!jointtype.MediaBrowserCompat$MediaItem.isDisposed()) {
            jointtype.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setTorchDelay settorchdelay) {
        if (settorchdelay.RatingCompat != null) {
            settorchdelay.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setTorchDelay settorchdelay) {
        if (settorchdelay.RatingCompat != null) {
            settorchdelay.RatingCompat.aj_();
        }
    }
}
