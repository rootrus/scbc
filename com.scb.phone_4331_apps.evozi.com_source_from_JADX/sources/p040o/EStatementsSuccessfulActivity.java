package p040o;

import com.thunderhead.trackoption.TrackOptionActivity;

/* renamed from: o.EStatementsSuccessfulActivity */
public final /* synthetic */ class EStatementsSuccessfulActivity implements onAccountSummaryClick$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ TrackOptionActivity.C62741 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ EStatementsSuccessfulActivity(TrackOptionActivity.C62741 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TrackOptionActivity.C62741 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        TrackOptionActivity.this.setResult(-1, TrackOptionActivity.MediaBrowserCompat$MediaItem());
        TrackOptionActivity.this.finish();
    }
}
