package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.zoomControlsEnabled */
public final class zoomControlsEnabled extends getScrollGesturesEnabled {
    public final String MediaBrowserCompat$MediaItem;
    public final OffsetDateTime RatingCompat;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zoomControlsEnabled(OffsetDateTime offsetDateTime, String str) {
        super((byte) 0);
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        this.RatingCompat = offsetDateTime;
        this.MediaBrowserCompat$MediaItem = str;
    }
}
