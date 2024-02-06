package p040o;

import java.util.List;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.getIExtractionServerRtti */
public class getIExtractionServerRtti extends writeUInt64NoTag<getTopLeftCornerWidth.setShortcut> {
    public final getAppIdOrigin IconCompatParcelizer;
    public List<setZoomControlsEnabled> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public onInfoWindowLongClick MediaBrowserCompat$MediaItem;
    public List<parseEventSignal> read;
    public final AbstractService write;

    @HmlPinActivity
    public getIExtractionServerRtti(AbstractService abstractService, getAppIdOrigin getappidorigin, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = abstractService;
        this.IconCompatParcelizer = getappidorigin;
        this.MediaBrowserCompat$MediaItem = getappidorigin.IconCompatParcelizer.write();
    }

    static /* synthetic */ void IconCompatParcelizer(getIExtractionServerRtti getiextractionserverrtti) {
        if (getiextractionserverrtti.RatingCompat != null) {
            getiextractionserverrtti.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getIExtractionServerRtti getiextractionserverrtti) {
        if (getiextractionserverrtti.RatingCompat != null) {
            getiextractionserverrtti.RatingCompat.ay_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        this.IconCompatParcelizer.read();
        this.IconCompatParcelizer.IconCompatParcelizer(new getIExtractionServerRtti$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }
}
