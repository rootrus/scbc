package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.hmlSetupResult */
public final /* synthetic */ class hmlSetupResult implements getAllowEnterTransitionOverlap {
    private final /* synthetic */ OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ hmlSetupResult(OffsetDateTime offsetDateTime) {
        this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
    }

    public final Object read(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.minusMonths((long) i);
    }
}
