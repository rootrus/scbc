package p040o;

import com.thunderhead.trackoption.TrackOptionActivity;

/* renamed from: o.onAboutClick */
public final /* synthetic */ class onAboutClick implements onAccountSummaryClick$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ TrackOptionActivity.C62795 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ onAboutClick(TrackOptionActivity.C62795 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TrackOptionActivity.C62795 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        TrackOptionActivity.this.setResult(-1, TrackOptionActivity.MediaBrowserCompat$MediaItem());
        TrackOptionActivity.this.finish();
    }
}
