package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: o.addI16 */
public final class addI16 extends createFromArray<addI64> implements subFloat2 {
    public float MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
    private float MediaBrowserCompat$MediaItem = 0.3f;
    private float MediaBrowserCompat$SearchResultReceiver = 0.4f;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private write f2570x50fd9e4a = write.INSIDE_SLICE;
    private float MediaDescriptionCompat = 75.0f;
    private int MediaMetadataCompat = -16777216;
    private float MediaSessionCompat$QueueItem = 1.0f;
    private write ParcelableVolumeInfo = write.INSIDE_SLICE;
    private boolean RatingCompat = true;
    public float write = 18.0f;

    /* renamed from: o.addI16$write */
    public enum write {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void IconCompatParcelizer(addI8 addi8) {
        addI64 addi64 = (addI64) addi8;
        if (addi64 != null) {
            read(addi64);
        }
    }

    public addI16(List<addI64> list, String str) {
        super(list, str);
    }

    public final float AppCompatDelegateImpl$ListMenuDecorView() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final float setBackgroundResource() {
        return this.write;
    }

    public final write AppCompatViewInflater() {
        return this.f2570x50fd9e4a;
    }

    public final write setExpandedFormat() {
        return this.ParcelableVolumeInfo;
    }

    public final int AppCompatDialogFragment() {
        return this.MediaMetadataCompat;
    }

    public final float ActionMenuItemView() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final float setContentView() {
        return this.MediaDescriptionCompat;
    }

    public final float AppCompatActivity() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final float setChecked() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final boolean setCheckable() {
        return this.RatingCompat;
    }
}
